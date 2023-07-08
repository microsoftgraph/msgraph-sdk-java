// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Content Format.
*/
public enum ContentFormat
{
    /**
    * text
    */
    TEXT,
    /**
    * html
    */
    HTML,
    /**
    * markdown
    */
    MARKDOWN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ContentFormat values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
