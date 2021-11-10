// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Routing Mode.
*/
public enum RoutingMode
{
    /**
    * one To One
    */
    ONE_TO_ONE,
    /**
    * multicast
    */
    MULTICAST,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RoutingMode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
