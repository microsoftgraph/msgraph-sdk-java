// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Method Feature.
*/
public enum AuthenticationMethodFeature
{
    /**
    * sspr Registered
    */
    SSPR_REGISTERED,
    /**
    * sspr Enabled
    */
    SSPR_ENABLED,
    /**
    * sspr Capable
    */
    SSPR_CAPABLE,
    /**
    * passwordless Capable
    */
    PASSWORDLESS_CAPABLE,
    /**
    * mfa Capable
    */
    MFA_CAPABLE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationMethodFeature values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
