// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Course Status.
*/
public enum CourseStatus
{
    /**
    * not Started
    */
    NOT_STARTED,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CourseStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
