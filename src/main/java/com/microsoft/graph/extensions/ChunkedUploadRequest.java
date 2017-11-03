// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
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
    private final byte[] data;

    /**
     * The base request.
     */
    private final BaseRequest baseRequest;

    /**
     * The max retry for single request.
     */
    private final int maxRetry;

    /**
     * The retry counter.
     */
    private int retryCount;

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
        this.data = new byte[chunkSize];
        System.arraycopy(chunk, 0, this.data, 0, chunkSize);
        this.retryCount = 0;
        this.maxRetry = maxRetry;
        this.baseRequest = new BaseRequest(requestUrl, client, options, ChunkedUploadResult.class) {
        };
        this.baseRequest.setHttpMethod(HttpMethod.PUT);
        this.baseRequest.addHeader(CONTENT_RANGE_HEADER_NAME,
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
        while (this.retryCount < this.maxRetry) {
            try {
                Thread.sleep(RETRY_DELAY * this.retryCount * this.retryCount);
            } catch (final InterruptedException e) {
                this.baseRequest.getClient().getLogger().logError("Exception while waiting upload file retry", e);
            }

            ChunkedUploadResult result = null;

            try {
                result = this.baseRequest
                        .getClient()
                        .getHttpProvider()
                        .send(baseRequest, ChunkedUploadResult.class, this.data, responseHandler);
            } catch (final ClientException e) {
                this.baseRequest.getClient().getLogger().logDebug("Request failed with, retry if necessary.");
            }

            if (result != null && result.chunkCompleted()) {
                return result;
            }

            this.retryCount++;
        }

        return new ChunkedUploadResult(
                new ClientException("Upload session failed to many times.", null,
                        GraphErrorCodes.UPLOAD_SESSION_INCOMPLETE));
    }
}