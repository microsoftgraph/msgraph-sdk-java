// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Sign In Frequency Authentication Type.
*/
public enum SignInFrequencyAuthenticationType
{
    /**
    * primary And Secondary Authentication
    */
    PRIMARY_AND_SECONDARY_AUTHENTICATION,
    /**
    * secondary Authentication
    */
    SECONDARY_AUTHENTICATION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SignInFrequencyAuthenticationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
