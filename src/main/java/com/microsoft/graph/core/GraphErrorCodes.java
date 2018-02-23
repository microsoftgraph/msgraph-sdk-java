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
 * See http://graph.microsoft.io/GraphDocuments/en-us/overview/errors.htm for more details.
 */
public enum GraphErrorCodes {
    // Standard error codes.
    ACCESS_DENIED,
    ACTIVITY_LIMIT_REACHED,
    ASYNC_TASK_FAILED,
    ASYNC_TASK_NOT_COMPLETED,
    AUTHENTICATION_CANCELLED,
    AUTHENTICATION_FAILURE,
    GENERAL_EXCEPTION,
    INVALID_RANGE,
    INVALID_REQUEST,
    ITEM_NOT_FOUND,
    MALWARE_DETECTED,
    NAME_ALREADY_EXISTS,
    NOT_ALLOWED,
    NOT_SUPPORTED,
    QUOTA_LIMIT_REACHED,
    RESOURCE_MODIFIED,
    RESYNC_REQUIRED,
    SERVICE_NOT_AVAILABLE,
    TOO_MANY_REDIRECTS,
    UNAUTHENTICATED,

    // Extend error codes.
    ACCESS_RESTRICTED,
    AUTHORIZATION_REQUEST_DENIED,
    CANNOT_SNAPSHOT_TREE,
    CHILD_ITEM_COUNT_EXCEEDED,
    ERROR_INVALID_ID_MALFORMED,
    ERROR_INVALID_USER,
    ENTITY_TAG_DOES_NOT_MATCH,
    FRAGMENT_LENGTH_MISMATCH,
    FRAGMENT_OUT_OF_ORDER,
    FRAGMENT_OVERLAP,
    INVALID_ACCEPT_TYPE,
    INVALID_PARAMETER_FORMAT,
    INVALID_PATH,
    INVALID_QUERY_OPTION,
    INVALID_START_INDEX,
    LOCK_MISMATCH,
    LOCK_NOT_FOUND_OR_ALREADY_EXPIRED,
    LOCK_OWNER_MISMATCH,
    MALFORMED_ENTITY_TAG,
    MAX_DOCUMENT_COUNT_EXCEEDED,
    MAX_FILE_SIZE_EXCEEDED,
    MAX_FOLDER_COUNT_EXCEEDED,
    MAX_FRAGMENT_LENGTH_EXCEEDED,
    MAX_ITEM_COUNT_EXCEEDED,
    MAX_QUERY_LENGTH_EXCEEDED,
    MAX_STREAM_SIZE_EXCEEDED,
    PARAMETER_IS_TOO_LONG,
    PARAMETER_IS_TOO_SMALL,
    PATH_IS_TOO_LONG,
    PATH_TOO_DEEP,
    PROPERTY_NOT_UPDATEABLE,
    RESYNC_APPLY_DIFFERENCES,
    RESYNC_UPLOAD_DIFFERENCES,
    SERVICE_READ_ONLY,
    THROTTLED_REQUEST,
    TOO_MANY_RESULTS_REQUESTED,
    TOO_MANY_TERMS_IN_QUERY,
    TOTAL_AFFECTED_ITEM_COUNT_EXCEEDED,
    TRUNCATION_NOT_ALLOWED,
    UPLOAD_SESSION_FAILED,
    UPLOAD_SESSION_INCOMPLETE,
    UPLOAD_SESSION_NOT_FOUND,
    VIRUS_SUSPICIOUS,
    ZERO_OR_FEWER_RESULTS_REQUESTED,
}
