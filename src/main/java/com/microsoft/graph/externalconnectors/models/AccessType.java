// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum Access Type.
*/
public enum AccessType
{
    /**
    * grant
    */
    GRANT,
    /**
    * deny
    */
    DENY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AccessType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
