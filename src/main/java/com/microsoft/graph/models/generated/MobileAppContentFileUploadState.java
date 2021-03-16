// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Mobile App Content File Upload State.
*/
public enum MobileAppContentFileUploadState
{
    /**
    * success
    */
    SUCCESS,
    /**
    * transient Error
    */
    TRANSIENT_ERROR,
    /**
    * error
    */
    ERROR,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * azure Storage Uri Request Success
    */
    AZURE_STORAGE_URI_REQUEST_SUCCESS,
    /**
    * azure Storage Uri Request Pending
    */
    AZURE_STORAGE_URI_REQUEST_PENDING,
    /**
    * azure Storage Uri Request Failed
    */
    AZURE_STORAGE_URI_REQUEST_FAILED,
    /**
    * azure Storage Uri Request Timed Out
    */
    AZURE_STORAGE_URI_REQUEST_TIMED_OUT,
    /**
    * azure Storage Uri Renewal Success
    */
    AZURE_STORAGE_URI_RENEWAL_SUCCESS,
    /**
    * azure Storage Uri Renewal Pending
    */
    AZURE_STORAGE_URI_RENEWAL_PENDING,
    /**
    * azure Storage Uri Renewal Failed
    */
    AZURE_STORAGE_URI_RENEWAL_FAILED,
    /**
    * azure Storage Uri Renewal Timed Out
    */
    AZURE_STORAGE_URI_RENEWAL_TIMED_OUT,
    /**
    * commit File Success
    */
    COMMIT_FILE_SUCCESS,
    /**
    * commit File Pending
    */
    COMMIT_FILE_PENDING,
    /**
    * commit File Failed
    */
    COMMIT_FILE_FAILED,
    /**
    * commit File Timed Out
    */
    COMMIT_FILE_TIMED_OUT,
    /**
    * For MobileAppContentFileUploadState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
