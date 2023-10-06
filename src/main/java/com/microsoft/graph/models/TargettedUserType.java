// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Targetted User Type.
*/
public enum TargettedUserType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * clicked
    */
    CLICKED,
    /**
    * compromised
    */
    COMPROMISED,
    /**
    * all Users
    */
    ALL_USERS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TargettedUserType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
