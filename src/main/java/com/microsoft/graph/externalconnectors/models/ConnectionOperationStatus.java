// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum Connection Operation Status.
*/
public enum ConnectionOperationStatus
{
    /**
    * unspecified
    */
    UNSPECIFIED,
    /**
    * inprogress
    */
    INPROGRESS,
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
    * For ConnectionOperationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
