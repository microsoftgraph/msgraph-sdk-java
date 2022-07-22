// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Method Sign In State.
*/
public enum AuthenticationMethodSignInState
{
    /**
    * not Supported
    */
    NOT_SUPPORTED,
    /**
    * not Allowed By Policy
    */
    NOT_ALLOWED_BY_POLICY,
    /**
    * not Enabled
    */
    NOT_ENABLED,
    /**
    * phone Number Not Unique
    */
    PHONE_NUMBER_NOT_UNIQUE,
    /**
    * ready
    */
    READY,
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationMethodSignInState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
