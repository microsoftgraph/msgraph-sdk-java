// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
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

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.ChunkedUploadResponseHandler;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;

import java.util.List;

/**
 * The chunk upload request.
 */
public class ChunkedUploadRequest {

    /**
     * Content Range header name.
     */
    private static final String CONTENT_RANGE_HEADER_NAME = "Content-Range";

    /**
     * Content Range value format.
     */
    private static final String CONTENT_RANGE_FORMAT = "bytes %1$d-%2$d/%3$d";

    /**
     * The seconds for retry delay.
     */
    private static final int RETRY_DELAY = 2 * 1000;

    /**
     * The chunk data sent to the server.
     */
    private final byte[] mData;

    /**
     * The base request.
     */
    private final BaseRequest mBaseRequest;

    /**
     * The max retry for single request.
     */
    private final int mMaxRetry;

    /**
     * The retry counter.
     */
    private int mRetryCount;

    /**
     * Construct the ChunkedUploadRequest
     *
     * @param requestUrl The upload url.
     * @param client     The OneDrive client.
     * @param options    The query options.
     * @param chunk      The chunk byte array.
     * @param chunkSize  The chunk array size.
     * @param maxRetry   The limit on retry.
     * @param beginIndex The begin index of this chunk in the input stream.
     * @param totalLength The total length of the input stream.
     */
    public ChunkedUploadRequest(final String requestUrl,
                                final IGraphServiceClient client,
                                final List<Option> options,
                                final byte[] chunk,
                                final int chunkSize,
                                final int maxRetry,
                                final int beginIndex,
                                final int totalLength) {
        this.mData = new byte[chunkSize];
        System.arraycopy(chunk, 0, this.mData, 0, chunkSize);
        this.mRetryCount = 0;
        this.mMaxRetry = maxRetry;
        this.mBaseRequest = new BaseRequest(requestUrl, client, options, ChunkedUploadResult.class) {
        };
        this.mBaseRequest.setHttpMethod(HttpMethod.PUT);
        this.mBaseRequest.addHeader(CONTENT_RANGE_HEADER_NAME,
                String.format(
                        CONTENT_RANGE_FORMAT,
                        beginIndex,
                        beginIndex + chunkSize - 1,
                        totalLength));
    }

    /**
     * Upload a chunk with tries.
     *
     * @param responseHandler The handler handle http response.
     * @param <UploadType>    The upload item type.
     * @return The upload result.
     */
    public <UploadType> ChunkedUploadResult upload(
            final ChunkedUploadResponseHandler<UploadType> responseHandler) {
        while (this.mRetryCount < this.mMaxRetry) {
            try {
                Thread.sleep(RETRY_DELAY * this.mRetryCount * this.mRetryCount);
            } catch (final InterruptedException e) {
                this.mBaseRequest.getClient().getLogger().logError("Exception while waiting upload file retry", e);
            }

            ChunkedUploadResult result = null;

            try {
                result = this.mBaseRequest
                        .getClient()
                        .getHttpProvider()
                        .send(mBaseRequest, ChunkedUploadResult.class, this.mData, responseHandler);
            } catch (final ClientException e) {
                this.mBaseRequest.getClient().getLogger().logDebug("Request failed with, retry if necessary.");
            }

            if (result != null && result.chunkCompleted()) {
                return result;
            }

            this.mRetryCount++;
        }

        return new ChunkedUploadResult(
                new ClientException("Upload session failed to many times.", null,
                        GraphErrorCodes.UploadSessionIncomplete));
    }
}
