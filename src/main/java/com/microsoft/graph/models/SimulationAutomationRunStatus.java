// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Simulation Automation Run Status.
*/
public enum SimulationAutomationRunStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * running
    */
    RUNNING,
    /**
    * succeeded
    */
    SUCCEEDED,
    /**
    * failed
    */
    FAILED,
    /**
    * skipped
    */
    SKIPPED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SimulationAutomationRunStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
