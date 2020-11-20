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

package com.microsoft.graph.core;

/**
 * The common Graph error codes
 * @see <a href="https://docs.microsoft.com/en-us/graph/errors">https://docs.microsoft.com/en-us/graph/errors</a>
 */
public enum GraphErrorCodes {
    // Standard error codes.
    /** The collar doesn't have permission to perform the action */
    ACCESS_DENIED,
    /** The app or user has been throttled */
    ACTIVITY_LIMIT_REACHED,
    /** No description available */
    ASYNC_TASK_FAILED,
    /** No description available */
    ASYNC_TASK_NOT_COMPLETED,
    /** No description available */
    AUTHENTICATION_CANCELLED,
    /** No description available */
    AUTHENTICATION_FAILURE,
    /** An unspecified error has occurred. */
    GENERAL_EXCEPTION,
    /**	The specified byte range is invalid or unavailable. */
    INVALID_RANGE,
    /** The request is malformed or incorrect. */
    INVALID_REQUEST,
    /** The resource could not be found. */
    ITEM_NOT_FOUND,
    /** Malware was detected in the requested resource. */
    MALWARE_DETECTED,
    /** The specified item name already exists. */
    NAME_ALREADY_EXISTS,
    /** The action is not allowed by the system. */
    NOT_ALLOWED,
    /** The request is not supported by the system. */
    NOT_SUPPORTED,
    /** The user has reached their quota limit. */
    QUOTA_LIMIT_REACHED,
    /** The resource being updated has changed since the caller last read it, usually an eTag mismatch. */
    RESOURCE_MODIFIED,
    /** The delta token is no longer valid, and the app must reset the sync state. */
    RESYNC_REQUIRED,
    /** The service is not available. Try the request again after a delay. There may be a Retry-After header. */
    SERVICE_NOT_AVAILABLE,
    /** The application is sending too many requests to the service. Try the request again after a delay. There may be a Retry-After header. */
    TOO_MANY_REDIRECTS,
    /** The caller is not authenticated. */
    UNAUTHENTICATED,

    // Extend error codes.
    /** No description available */
    ACCESS_RESTRICTED,
    /** Access restricted to the item's owner. */
    AUTHORIZATION_REQUEST_DENIED,
    /** Failed to get a consistent delta snapshot. Try again later. */
    CANNOT_SNAPSHOT_TREE,
    /** Max limit on the number of child items was reached. */
    CHILD_ITEM_COUNT_EXCEEDED,
    /** No description available */
    ERROR_INVALID_ID_MALFORMED,
    /** No description available */
    ERROR_INVALID_USER,
    /** ETag does not match the current item's value. */
    ENTITY_TAG_DOES_NOT_MATCH,
    /** Declared total size for this fragment is different from that of the upload session. */
    FRAGMENT_LENGTH_MISMATCH,
    /** Uploaded fragment is out of order. */
    FRAGMENT_OUT_OF_ORDER,
    /** Uploaded fragment overlaps with existing data. */
    FRAGMENT_OVERLAP,
    /** Invalid accept type. */
    INVALID_ACCEPT_TYPE,
    /** Invalid parameter format. */
    INVALID_PARAMETER_FORMAT,
    /** Name contains invalid characters. */
    INVALID_PATH,
    /** Invalid query option. */
    INVALID_QUERY_OPTION,
    /** Invalid start index. */
    INVALID_START_INDEX,
    /** Lock token does not match existing lock. */
    LOCK_MISMATCH,
    /** There is currently no unexpired lock on the item. */
    LOCK_NOT_FOUND_OR_ALREADY_EXPIRED,
    /** Lock Owner ID does not match provided ID. */
    LOCK_OWNER_MISMATCH,
    /** ETag header is malformed. ETags must be quoted strings. */
    MALFORMED_ENTITY_TAG,
    /** Max limit on number of Documents is reached. */
    MAX_DOCUMENT_COUNT_EXCEEDED,
    /** Max file size exceeded. */
    MAX_FILE_SIZE_EXCEEDED,
    /** Max limit on number of Folders is reached. */
    MAX_FOLDER_COUNT_EXCEEDED,
    /** Max file size exceeded. */
    MAX_FRAGMENT_LENGTH_EXCEEDED,
    /** Max limit on number of Items is reached. */
    MAX_ITEM_COUNT_EXCEEDED,
    /** Max query length exceeded. */
    MAX_QUERY_LENGTH_EXCEEDED,
    /** Maximum stream size exceeded. */
    MAX_STREAM_SIZE_EXCEEDED,
    /** Parameter Exceeds Maximum Length. */
    PARAMETER_IS_TOO_LONG,
    /** Parameter is smaller then minimum value. */
    PARAMETER_IS_TOO_SMALL,
    /** Path exceeds maximum length. */
    PATH_IS_TOO_LONG,
    /** Folder hierarchy depth limit reached. */
    PATH_TOO_DEEP,
    /** Property not updateable. */
    PROPERTY_NOT_UPDATEABLE,
    /** Resync required. Replace any local items with the server's version (including deletes) if you're sure that the service was up to date with your local changes when you last sync'd. Upload any local changes that the server doesn't know about. */
    RESYNC_APPLY_DIFFERENCES,
    /** Resync required. Upload any local items that the service did not return, and upload any files that differ from the server's version (keeping both copies if you're not sure which one is more up-to-date). */
    RESYNC_UPLOAD_DIFFERENCES,
    /** Resource is temporarily read-only. */
    SERVICE_READ_ONLY,
    /** Too many requests. */
    THROTTLED_REQUEST,
    /** Too many results requested. */
    TOO_MANY_RESULTS_REQUESTED,
    /** Too many terms in the query. */
    TOO_MANY_TERMS_IN_QUERY,
    /** Operation is not allowed because the number of affected items exceeds threshold. */
    TOTAL_AFFECTED_ITEM_COUNT_EXCEEDED,
    /** Data truncation is not allowed. */
    TRUNCATION_NOT_ALLOWED,
    /** Upload session failed. */
    UPLOAD_SESSION_FAILED,
    /** Upload session incomplete. */
    UPLOAD_SESSION_INCOMPLETE,
    /** Upload session not found. */
    UPLOAD_SESSION_NOT_FOUND,
    /** This document is suspicious and may have a virus. */
    VIRUS_SUSPICIOUS,
    /** Zero or fewer results requested. */
    ZERO_OR_FEWER_RESULTS_REQUESTED,
}
