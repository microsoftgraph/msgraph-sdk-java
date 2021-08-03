// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Service Update Severity.
*/
public enum ServiceUpdateSeverity
{
    /**
    * normal
    */
    NORMAL,
    /**
    * high
    */
    HIGH,
    /**
    * critical
    */
    CRITICAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ServiceUpdateSeverity values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
