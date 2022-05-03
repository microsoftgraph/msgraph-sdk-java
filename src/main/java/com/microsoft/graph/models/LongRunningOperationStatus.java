// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Long Running Operation Status.
*/
public enum LongRunningOperationStatus
{
    /**
    * not Started
    */
    NOT_STARTED,
    /**
    * running
    */
    RUNNING,
    /**
    * succeeded
    */
    SUCCEEDED,
    /**
    * failed
    */
    FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For LongRunningOperationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
