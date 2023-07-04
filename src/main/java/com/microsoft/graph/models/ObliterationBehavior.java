// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Obliteration Behavior.
*/
public enum ObliterationBehavior
{
    /**
    * default
    */
    DEFAULT,
    /**
    * do Not Obliterate
    */
    DO_NOT_OBLITERATE,
    /**
    * obliterate With Warning
    */
    OBLITERATE_WITH_WARNING,
    /**
    * always
    */
    ALWAYS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ObliterationBehavior values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
