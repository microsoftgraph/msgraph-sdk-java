// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Strength Requirements.
*/
public enum AuthenticationStrengthRequirements
{
    /**
    * none
    */
    NONE,
    /**
    * mfa
    */
    MFA,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationStrengthRequirements values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
