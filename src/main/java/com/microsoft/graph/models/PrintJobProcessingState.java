// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Print Job Processing State.
*/
public enum PrintJobProcessingState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * pending
    */
    PENDING,
    /**
    * processing
    */
    PROCESSING,
    /**
    * paused
    */
    PAUSED,
    /**
    * stopped
    */
    STOPPED,
    /**
    * completed
    */
    COMPLETED,
    /**
    * canceled
    */
    CANCELED,
    /**
    * aborted
    */
    ABORTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PrintJobProcessingState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
