// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Teamwork Call Event Type.
*/
public enum TeamworkCallEventType
{
    /**
    * call
    */
    CALL,
    /**
    * meeting
    */
    MEETING,
    /**
    * screen Share
    */
    SCREEN_SHARE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TeamworkCallEventType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
