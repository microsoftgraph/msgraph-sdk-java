// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Indicator Source.
*/
public enum IndicatorSource
{
    /**
    * microsoft
    */
    MICROSOFT,
    /**
    * osint
    */
    OSINT,
    /**
    * public
    */
    PUBLIC,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IndicatorSource values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
