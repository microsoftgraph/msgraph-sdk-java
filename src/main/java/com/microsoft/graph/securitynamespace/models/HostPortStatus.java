// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Host Port Status.
*/
public enum HostPortStatus
{
    /**
    * open
    */
    OPEN,
    /**
    * filtered
    */
    FILTERED,
    /**
    * closed
    */
    CLOSED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For HostPortStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
