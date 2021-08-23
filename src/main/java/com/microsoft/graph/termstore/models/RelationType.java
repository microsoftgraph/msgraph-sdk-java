// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.models;


/**
 * The Enum Relation Type.
*/
public enum RelationType
{
    /**
    * pin
    */
    PIN,
    /**
    * reuse
    */
    REUSE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RelationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
