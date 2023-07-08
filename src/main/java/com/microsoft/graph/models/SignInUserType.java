// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Sign In User Type.
*/
public enum SignInUserType
{
    /**
    * member
    */
    MEMBER,
    /**
    * guest
    */
    GUEST,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SignInUserType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
