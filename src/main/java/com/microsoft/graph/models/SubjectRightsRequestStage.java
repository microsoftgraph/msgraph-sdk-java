// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Subject Rights Request Stage.
*/
public enum SubjectRightsRequestStage
{
    /**
    * content Retrieval
    */
    CONTENT_RETRIEVAL,
    /**
    * content Review
    */
    CONTENT_REVIEW,
    /**
    * generate Report
    */
    GENERATE_REPORT,
    /**
    * content Deletion
    */
    CONTENT_DELETION,
    /**
    * case Resolved
    */
    CASE_RESOLVED,
    /**
    * content Estimate
    */
    CONTENT_ESTIMATE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SubjectRightsRequestStage values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
