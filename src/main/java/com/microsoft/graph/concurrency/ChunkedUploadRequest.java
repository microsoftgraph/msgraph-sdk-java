// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.concurrency;

import java.util.List;
import java.util.Locale;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.concurrency.ChunkedUploadResponseHandler;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IGraphServiceClient;
import com.microsoft.graph.options.Option;

/**
 * The chunk upload request.
 * @param <UploadType>    The upload item type.
 */
public class ChunkedUploadRequest<UploadType> {

    /**
     * Content Range header name.
     */
    private static final String CONTENT_RANGE_HEADER_NAME = "Content-Range";

    /**
     * Content Range value format.
     */
    private static final String CONTENT_RANGE_FORMAT = "bytes %1$d-%2$d/%3$d";

    /**
     * The chunk data sent to the server.
     */
    private final byte[] data;

    /**
     * The base request.
     */
    private final BaseRequest<ChunkedUploadResult<UploadType>> baseRequest;

    /**
     * Construct the ChunkedUploadRequest
     *
     * @param requestUrl The upload URL.
     * @param client     The Graph client.
     * @param options    The query options.
     * @param chunk      The chunk byte array.
     * @param chunkSize  The chunk array size.
     * @param beginIndex The begin index of this chunk in the input stream.
     * @param totalLength The total length of the input stream.
     */
    @SuppressWarnings("unchecked")
    public ChunkedUploadRequest(@Nonnull final String requestUrl,
                                @Nonnull final IGraphServiceClient client,
                                @Nullable final List<? extends Option> options,
                                @Nonnull final byte[] chunk,
                                final int chunkSize,
                                final long beginIndex,
                                final long totalLength) {
        this.data = new byte[chunkSize];
        System.arraycopy(chunk, 0, this.data, 0, chunkSize);
        this.baseRequest = new BaseRequest<ChunkedUploadResult<UploadType>>(requestUrl, client, options, (Class<? extends ChunkedUploadResult<UploadType>>)(new ChunkedUploadResult<UploadType>((UploadType)null)).getClass()) {
        };
        this.baseRequest.setHttpMethod(HttpMethod.PUT);
        this.baseRequest.addHeader(CONTENT_RANGE_HEADER_NAME,
                String.format(Locale.ROOT,
                        CONTENT_RANGE_FORMAT,
                        beginIndex,
                        beginIndex + chunkSize - 1,
                        totalLength));
    }

    /**
     * Upload a chunk with tries.
     *
     * @param responseHandler The handler to handle the HTTP response.
     * @return The upload result.
     */
    @SuppressWarnings("unchecked")
    @Nonnull
    public ChunkedUploadResult<UploadType> upload(
            @Nonnull final ChunkedUploadResponseHandler<UploadType> responseHandler) {
        ChunkedUploadResult<UploadType> result = null;

        try {
            result = this.baseRequest
                    .getClient()
                    .getHttpProvider()
                    .send(baseRequest, (Class<ChunkedUploadResult<UploadType>>)(Class<?>) ChunkedUploadResult.class, this.data, responseHandler);
        } catch (final ClientException e) {
            throw new ClientException("Request failed with error, retry if necessary.", e);
        }

        if (result != null && result.chunkCompleted()) {
            return result;
        } else 
            return new ChunkedUploadResult<UploadType>(
                new ClientException("Upload session failed.", null));
    }
}