// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.GraphErrorCodes;
import com.microsoft.graph.http.GraphServiceException;

/**
 * Wrapper class for different upload response from server.
 */
public class ChunkedUploadResult<UploadType> {
    /**
     * The uploaded item response.
     */
    private final UploadType mUploadedItem;

    /**
     * The next session response.
     */
    private final UploadSession mSession;

    /**
     * The error happened during upload.
     */
    private final ClientException mError;

    /**
     * Construct result with item created.
     *
     * @param uploaded The created item.
     */
    public ChunkedUploadResult(UploadType uploaded) {
        this.mUploadedItem = uploaded;
        this.mSession = null;
        this.mError = null;
    }

    /**
     * Construct result with next session.
     *
     * @param session The next session.
     */
    public ChunkedUploadResult(UploadSession session) {
        this.mSession = session;
        this.mUploadedItem = null;
        this.mError = null;
    }

    /**
     * Construct result with error.
     *
     * @param error The error occurred during uploading.
     */
    public ChunkedUploadResult(ClientException error) {
        this.mError = error;
        this.mUploadedItem = null;
        this.mSession = null;
    }

    /**
     * Construct result with server exception.
     *
     * @param exception The exception received from server.
     */
    public ChunkedUploadResult(GraphServiceException exception) {
        this(new ClientException(exception.getMessage(/* verbose */ true), exception, GraphErrorCodes.UploadSessionFailed));
    }

    /**
     * Checks the chunk upload is completed.
     *
     * @return true if current chunk upload is completed.
     */
    public boolean chunkCompleted() {
        return this.mUploadedItem != null || this.mSession != null;
    }

    /**
     * Checks the whole upload is completed.
     *
     * @return true if the response is a an item.
     */
    public boolean uploadCompleted() {
        return this.mUploadedItem != null;
    }

    /**
     * Checks if error happened.
     *
     * @return true if current request has error.
     */
    public boolean hasError() {
        return this.mError != null;
    }

    /**
     * Get the uploaded item.
     *
     * @return The item.
     */
    public UploadType getItem() {
        return this.mUploadedItem;
    }

    /**
     * Get the next session.
     *
     * @return The next session for uploading.
     */
    public UploadSession getSession() {
        return this.mSession;
    }

    /**
     * Get the error.
     *
     * @return The error.
     */
    public ClientException getError() {
        return this.mError;
    }
}