// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum App Log Upload State.
*/
public enum AppLogUploadState
{
    /**
    * pending
    */
    PENDING,
    /**
    * completed
    */
    COMPLETED,
    /**
    * failed
    */
    FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AppLogUploadState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
