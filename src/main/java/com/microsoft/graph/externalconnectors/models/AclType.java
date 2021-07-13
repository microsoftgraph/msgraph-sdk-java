// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum Acl Type.
*/
public enum AclType
{
    /**
    * user
    */
    USER,
    /**
    * group
    */
    GROUP,
    /**
    * everyone
    */
    EVERYONE,
    /**
    * everyone Except Guests
    */
    EVERYONE_EXCEPT_GUESTS,
    /**
    * external Group
    */
    EXTERNAL_GROUP,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AclType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
