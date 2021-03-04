// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Print Task Processing State.
*/
public enum PrintTaskProcessingState
{
    /**
    * pending
    */
    PENDING,
    /**
    * processing
    */
    PROCESSING,
    /**
    * completed
    */
    COMPLETED,
    /**
    * aborted
    */
    ABORTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PrintTaskProcessingState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
