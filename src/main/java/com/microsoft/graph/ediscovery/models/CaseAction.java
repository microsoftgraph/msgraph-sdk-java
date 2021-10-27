// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;


/**
 * The Enum Case Action.
*/
public enum CaseAction
{
    /**
    * content Export
    */
    CONTENT_EXPORT,
    /**
    * apply Tags
    */
    APPLY_TAGS,
    /**
    * convert To Pdf
    */
    CONVERT_TO_PDF,
    /**
    * index
    */
    INDEX,
    /**
    * estimate Statistics
    */
    ESTIMATE_STATISTICS,
    /**
    * add To Review Set
    */
    ADD_TO_REVIEW_SET,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CaseAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
