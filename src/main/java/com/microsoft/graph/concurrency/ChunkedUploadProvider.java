// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.concurrency;

import com.microsoft.graph.concurrency.ChunkedUploadResponseHandler;
import com.microsoft.graph.concurrency.ChunkedUploadRequest;
import com.microsoft.graph.concurrency.ChunkedUploadResult;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IGraphServiceClient;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.options.Option;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * ChunkedUpload service provider
 *
 * @param <UploadType> the upload item type
 */
public class ChunkedUploadProvider<UploadType> {

    /**
     * The default chunk size for upload. Currently set to 5 MiB.
     */
    private static final int DEFAULT_CHUNK_SIZE = 5 * 1024 * 1024;

    /**
     * The required chunk size increment by OneDrive service, which is 320 KiB
     */
    private static final int REQUIRED_CHUNK_SIZE_INCREMENT = 320 * 1024;

    /**
     * The maximum chunk size for a single upload allowed by OneDrive service.
     * Currently the value is 60 MiB.
     */
    private static final int MAXIMUM_CHUNK_SIZE = 60 * 1024 * 1024;

    /**
     * The client
     */
    private final IGraphServiceClient client;

    /**
     * The input stream
     */
    private final InputStream inputStream;

    /**
     * The upload session URL
     */
    private final String uploadUrl;

    /**
     * The stream size
     */
    private final long streamSize;

    /**
     * The upload response handler
     */
    private final ChunkedUploadResponseHandler<UploadType> responseHandler;

    /**
     * The counter for how many bytes have been read from input stream
     */
    private long readSoFar;

    /**
     * Creates the ChunkedUploadProvider
     *
     * @param uploadSession   the initial upload session
     * @param client          the Graph client
     * @param inputStream     the input stream
     * @param streamSize      the stream size
     * @param uploadTypeClass the upload type class
     */
    public ChunkedUploadProvider(@Nonnull final UploadSession uploadSession,
                                 @Nonnull final IGraphServiceClient client,
                                 @Nonnull final InputStream inputStream,
                                 final long streamSize,
                                 @Nonnull final Class<UploadType> uploadTypeClass) {
        if (uploadSession == null) {
            throw new InvalidParameterException("Upload session is null.");
        }

        if (client == null) {
            throw new InvalidParameterException("OneDrive client is null.");
        }

        if (inputStream == null) {
            throw new InvalidParameterException("Input stream is null.");
        }

        if (streamSize <= 0) {
            throw new InvalidParameterException("Stream size should larger than 0.");
        }

        this.client = client;
        this.readSoFar = 0;
        this.inputStream = inputStream;
        this.streamSize = streamSize;
        this.uploadUrl = uploadSession.uploadUrl;
        this.responseHandler = new ChunkedUploadResponseHandler<UploadType>(uploadTypeClass);
    }

    /**
     * Uploads content to remote upload session based on the input stream
     *
     * @param options  the upload options
     * @param chunkSize the customized chunk size
     * @param progressCallback the callback for upload progress
     * @return a future with the result
     * @throws IOException the IO exception that occurred during upload
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UploadType> futureUpload(@Nullable final int chunkSize, @Nullable final List<Option> options, @Nullable final IProgressCallback progressCallback)
            throws IOException {

        int internalChunkSize = chunkSize;
        if (internalChunkSize == 0) {
            internalChunkSize = DEFAULT_CHUNK_SIZE;
        }

        if (internalChunkSize % REQUIRED_CHUNK_SIZE_INCREMENT != 0) {
            throw new IllegalArgumentException("Chunk size must be a multiple of 320 KiB");
        }

        if (internalChunkSize > MAXIMUM_CHUNK_SIZE) {
            throw new IllegalArgumentException("Please set chunk size smaller than 60 MiB");
        }

        byte[] buffer = new byte[internalChunkSize];

        while (this.readSoFar < this.streamSize) {
            int buffRead = 0;

            // inner loop is to work-around the case where read buffer size is limited to less than chunk size by a global setting
            while (buffRead < internalChunkSize) {
                int read = 0;
                read = this.inputStream.read(buffer, buffRead, internalChunkSize - buffRead);
                if (read == -1) {
                    break;
                }
                buffRead += read;
            }

            final ChunkedUploadRequest<UploadType> request =
                    new ChunkedUploadRequest<UploadType>(this.uploadUrl, this.client, options, buffer, buffRead,
                            this.readSoFar, this.streamSize);
            final ChunkedUploadResult<UploadType> result = request.upload(this.responseHandler);
            // TODO: upload should return a future, use sendfuture instead and the futures should be chained with completableFuture.then apply

            if (result.uploadCompleted()) {
                if(progressCallback != null) {
                    progressCallback.progress(this.streamSize, this.streamSize);
                }
                return completedFuture(result.getItem());
            } else if (result.chunkCompleted()) {
                if(progressCallback != null) {
                    progressCallback.progress(this.readSoFar, this.streamSize);
                }
            } else if (result.hasError()) {
                return failedFuture(result.getError());
            }

            this.readSoFar += buffRead;
        }
        return failedFuture(new ClientException("Upload did not complete", null));
    }
    private CompletableFuture<UploadType> completedFuture(final UploadType result) { // CompletableFuture.completedFuture(result.getItem()); missing on android
        final CompletableFuture<UploadType> fut = new CompletableFuture<UploadType>();
        fut.complete(result);
        return fut;
    }
    private CompletableFuture<UploadType> failedFuture(ClientException ex) { // CompletableFuture.failedFuture not available on android
        final CompletableFuture<UploadType> fut = new CompletableFuture<UploadType>();
        fut.completeExceptionally(ex);
        return fut;
    }

    /**
     * Uploads content to remote upload session based on the input stream
     *
     * @return a future with the result
     * @throws IOException the IO exception that occurred during upload
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UploadType> futureUpload()
    				throws IOException {
    	return futureUpload(0);
    }
    /**
     * Uploads content to remote upload session based on the input stream
     *
     * @param chunkSize the customized chunk size
     * @return a future with the result
     * @throws IOException the IO exception that occurred during upload
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UploadType> futureUpload(@Nullable final int chunkSize)
    				throws IOException {
    	return futureUpload(chunkSize, null);
    }
    /**
     * Uploads content to remote upload session based on the input stream
     *
     * @param chunkSize the customized chunk size
     * @param options  the upload options
     * @return a future with the result
     * @throws IOException the IO exception that occurred during upload
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UploadType> futureUpload(@Nullable final int chunkSize, @Nullable final List<Option> options)
    				throws IOException {
    	return futureUpload(chunkSize, options, null);
    }

    /**
     * Uploads content to remote upload session based on the input stream
     *
     * @param options  the upload options
     * @param chunkSize the customized chunk size
     * @param progressCallback the callback for upload progress
     * @return the result
     * @throws IOException the IO exception that occurred during upload
     */
    @Nonnull
    public UploadType upload(@Nullable final int chunkSize, @Nullable final List<Option> options, @Nullable final IProgressCallback progressCallback)
            throws IOException {
        try {
            return futureUpload(chunkSize, options, progressCallback).get();
        } catch (InterruptedException ex) {
            throw new ClientException("The request was interrupted", ex);
        } catch (ExecutionException ex) {
            throw new ClientException("Error while executing the request", ex);
        }
    }
    /**
     * Uploads content to remote upload session based on the input stream
     *
     * @param options  the upload options
     * @param chunkSize the customized chunk size
     * @return the result
     * @throws IOException the IO exception that occurred during upload
     */
    @Nonnull
    public UploadType upload(@Nullable final int chunkSize, @Nullable final List<Option> options)
            throws IOException {
        return upload(chunkSize, options, null);
    }
    /**
     * Uploads content to remote upload session based on the input stream
     *
     * @param chunkSize the customized chunk size
     * @return the result
     * @throws IOException the IO exception that occurred during upload
     */
    @Nonnull
    public UploadType upload(@Nullable final int chunkSize)
            throws IOException {
        return upload(chunkSize, null);
    }
    /**
     * Uploads content to remote upload session based on the input stream
     *
     * @return the result
     * @throws IOException the IO exception that occurred during upload
     */
    @Nonnull
    public UploadType upload()
            throws IOException {
        return upload(0);
    }
}
