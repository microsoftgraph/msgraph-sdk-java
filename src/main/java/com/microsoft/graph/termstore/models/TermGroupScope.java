// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.models;


/**
 * The Enum Term Group Scope.
*/
public enum TermGroupScope
{
    /**
    * global
    */
    GLOBAL,
    /**
    * system
    */
    SYSTEM,
    /**
    * site Collection
    */
    SITE_COLLECTION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TermGroupScope values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
