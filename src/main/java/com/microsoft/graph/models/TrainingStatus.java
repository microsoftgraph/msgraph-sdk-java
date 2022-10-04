// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Training Status.
*/
public enum TrainingStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * assigned
    */
    ASSIGNED,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * overdue
    */
    OVERDUE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TrainingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
