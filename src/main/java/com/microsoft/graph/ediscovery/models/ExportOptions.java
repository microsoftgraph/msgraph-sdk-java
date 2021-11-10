// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;


/**
 * The Enum Export Options.
*/
public enum ExportOptions
{
    /**
    * original Files
    */
    ORIGINAL_FILES,
    /**
    * text
    */
    TEXT,
    /**
    * pdf Replacement
    */
    PDF_REPLACEMENT,
    /**
    * file Info
    */
    FILE_INFO,
    /**
    * tags
    */
    TAGS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ExportOptions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
