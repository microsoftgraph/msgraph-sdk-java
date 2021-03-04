// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Chat Type.
*/
public enum ChatType
{
    /**
    * one On One
    */
    ONE_ON_ONE,
    /**
    * group
    */
    GROUP,
    /**
    * meeting
    */
    MEETING,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ChatType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
