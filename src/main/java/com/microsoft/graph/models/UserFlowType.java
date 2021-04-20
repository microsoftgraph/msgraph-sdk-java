// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum User Flow Type.
*/
public enum UserFlowType
{
    /**
    * sign Up
    */
    SIGN_UP,
    /**
    * sign In
    */
    SIGN_IN,
    /**
    * sign Up Or Sign In
    */
    SIGN_UP_OR_SIGN_IN,
    /**
    * password Reset
    */
    PASSWORD_RESET,
    /**
    * profile Update
    */
    PROFILE_UPDATE,
    /**
    * resource Owner
    */
    RESOURCE_OWNER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UserFlowType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
