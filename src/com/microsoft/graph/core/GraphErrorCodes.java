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

package com.microsoft.graph.core;

/**
 * The common Graph error codes.
 * See http://graph.microsoft.io/GraphDocuments/en-us/overview/errors.htm for more details.
 */
public enum GraphErrorCodes {
    // Standard error codes.
    AccessDenied,
    ActivityLimitReached,
    AsyncTaskFailed,
    AsyncTaskNotCompleted,
    AuthenticationCancelled,
    AuthenticationFailure,
    GeneralException,
    InvalidRange,
    InvalidRequest,
    ItemNotFound,
    MalwareDetected,
    NameAlreadyExists,
    NotAllowed,
    NotSupported,
    QuotaLimitReached,
    ResourceModified,
    ResyncRequired,
    ServiceNotAvailable,
    TooManyRedirects,
    Unauthenticated,

    // Extend error codes.
    AccessRestricted,
    Authorization_RequestDenied,
    CannotSnapshotTree,
    ChildItemCountExceeded,
    ErrorInvalidIdMalformed,
    ErrorInvalidUser,
    EntityTagDoesNotMatch,
    FragmentLengthMismatch,
    FragmentOutOfOrder,
    FragmentOverlap,
    InvalidAcceptType,
    InvalidParameterFormat,
    InvalidPath,
    InvalidQueryOption,
    InvalidStartIndex,
    LockMismatch,
    LockNotFoundOrAlreadyExpired,
    LockOwnerMismatch,
    MalformedEntityTag,
    MaxDocumentCountExceeded,
    MaxFileSizeExceeded,
    MaxFolderCountExceeded,
    MaxFragmentLengthExceeded,
    MaxItemCountExceeded,
    MaxQueryLengthExceeded,
    MaxStreamSizeExceeded,
    ParameterIsTooLong,
    ParameterIsTooSmall,
    PathIsTooLong,
    PathTooDeep,
    PropertyNotUpdateable,
    ResyncApplyDifferences,
    ResyncUploadDifferences,
    ServiceReadOnly,
    ThrottledRequest,
    TooManyResultsRequested,
    TooManyTermsInQuery,
    TotalAffectedItemCountExceeded,
    TruncationNotAllowed,
    UploadSessionFailed,
    UploadSessionIncomplete,
    UploadSessionNotFound,
    VirusSuspicious,
    ZeroOrFewerResultsRequested,
}
