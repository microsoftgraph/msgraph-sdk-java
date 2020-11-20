// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.concurrency;

import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.GraphServiceException;
import com.microsoft.graph.models.extensions.UploadSession;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * Wrapper class for different upload response from server.
 */
public class ChunkedUploadResult<UploadType> {
    /**
     * The uploaded item response.
     */
    private final UploadType uploadedItem;

    /**
     * The next session response.
     */
    private final UploadSession session;

    /**
     * The error happened during upload.
     */
    private final ClientException error;

    /**
     * Construct result with item created.
     *
     * @param uploaded The created item.
     */
    public ChunkedUploadResult(@Nullable final UploadType uploaded) {
        this.uploadedItem = uploaded;
        this.session = null;
        this.error = null;
    }

    /**
     * Construct result with next session.
     *
     * @param session The next session.
     */
    public ChunkedUploadResult(@Nullable final UploadSession session) {
        this.session = session;
        this.uploadedItem = null;
        this.error = null;
    }

    /**
     * Construct result with error.
     *
     * @param error The error occurred during uploading.
     */
    public ChunkedUploadResult(@Nullable final ClientException error) {
        this.error = error;
        this.uploadedItem = null;
        this.session = null;
    }

    /**
     * Construct result with server exception.
     *
     * @param exception The exception received from server.
     */
    public ChunkedUploadResult(@Nonnull final GraphServiceException exception) {
        this(new ClientException(exception.getMessage(/* verbose */ true), exception));
    }

    /**
     * Checks the chunk upload is completed.
     *
     * @return true if current chunk upload is completed.
     */
    public boolean chunkCompleted() {
        return this.uploadedItem != null || this.session != null;
    }

    /**
     * Checks the whole upload is completed.
     *
     * @return true if the response is an item.
     */
    public boolean uploadCompleted() {
        return this.uploadedItem != null;
    }

    /**
     * Checks if an error happened.
     *
     * @return true if current request has error.
     */
    public boolean hasError() {
        return this.error != null;
    }

    /**
     * Get the uploaded item.
     *
     * @return The item.
     */
    @Nullable
    public UploadType getItem() {
        return this.uploadedItem;
    }

    /**
     * Get the next session.
     *
     * @return The next session for uploading.
     */
    @Nullable
    public UploadSession getSession() {
        return this.session;
    }

    /**
     * Get the error.
     *
     * @return The error.
     */
    @Nullable
    public ClientException getError() {
        return this.error;
    }
}