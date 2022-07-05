// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Child Selectability.
*/
public enum ChildSelectability
{
    /**
    * One
    */
    ONE,
    /**
    * Many
    */
    MANY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ChildSelectability values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
