// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum User Purpose.
*/
public enum UserPurpose
{
    /**
    * user
    */
    USER,
    /**
    * linked
    */
    LINKED,
    /**
    * shared
    */
    SHARED,
    /**
    * room
    */
    ROOM,
    /**
    * equipment
    */
    EQUIPMENT,
    /**
    * others
    */
    OTHERS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UserPurpose values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
