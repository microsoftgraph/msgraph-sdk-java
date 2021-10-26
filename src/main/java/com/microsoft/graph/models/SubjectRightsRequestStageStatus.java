// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Subject Rights Request Stage Status.
*/
public enum SubjectRightsRequestStageStatus
{
    /**
    * not Started
    */
    NOT_STARTED,
    /**
    * current
    */
    CURRENT,
    /**
    * completed
    */
    COMPLETED,
    /**
    * failed
    */
    FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SubjectRightsRequestStageStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
