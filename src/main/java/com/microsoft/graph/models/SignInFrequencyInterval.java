// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Sign In Frequency Interval.
*/
public enum SignInFrequencyInterval
{
    /**
    * time Based
    */
    TIME_BASED,
    /**
    * every Time
    */
    EVERY_TIME,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SignInFrequencyInterval values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
