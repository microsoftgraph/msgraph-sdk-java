// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Data Source Hold Status.
*/
public enum DataSourceHoldStatus
{
    /**
    * not Applied
    */
    NOT_APPLIED,
    /**
    * applied
    */
    APPLIED,
    /**
    * applying
    */
    APPLYING,
    /**
    * removing
    */
    REMOVING,
    /**
    * partial
    */
    PARTIAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DataSourceHoldStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
