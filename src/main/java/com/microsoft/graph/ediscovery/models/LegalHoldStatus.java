// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;


/**
 * The Enum Legal Hold Status.
*/
public enum LegalHoldStatus
{
    /**
    * Pending
    */
    PENDING,
    /**
    * Error
    */
    ERROR,
    /**
    * Success
    */
    SUCCESS,
    /**
    * Unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For LegalHoldStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
