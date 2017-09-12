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
