// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Simulation Automation Status.
*/
public enum SimulationAutomationStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * draft
    */
    DRAFT,
    /**
    * not Running
    */
    NOT_RUNNING,
    /**
    * running
    */
    RUNNING,
    /**
    * completed
    */
    COMPLETED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SimulationAutomationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
