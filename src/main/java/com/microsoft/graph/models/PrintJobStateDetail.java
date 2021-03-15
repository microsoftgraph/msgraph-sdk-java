// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Print Job State Detail.
*/
public enum PrintJobStateDetail
{
    /**
    * upload Pending
    */
    UPLOAD_PENDING,
    /**
    * transforming
    */
    TRANSFORMING,
    /**
    * completed Successfully
    */
    COMPLETED_SUCCESSFULLY,
    /**
    * completed With Warnings
    */
    COMPLETED_WITH_WARNINGS,
    /**
    * completed With Errors
    */
    COMPLETED_WITH_ERRORS,
    /**
    * release Wait
    */
    RELEASE_WAIT,
    /**
    * interpreting
    */
    INTERPRETING,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PrintJobStateDetail values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
