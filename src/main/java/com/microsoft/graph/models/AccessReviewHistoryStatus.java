// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Access Review History Status.
*/
public enum AccessReviewHistoryStatus
{
    /**
    * done
    */
    DONE,
    /**
    * inprogress
    */
    INPROGRESS,
    /**
    * error
    */
    ERROR,
    /**
    * requested
    */
    REQUESTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AccessReviewHistoryStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
