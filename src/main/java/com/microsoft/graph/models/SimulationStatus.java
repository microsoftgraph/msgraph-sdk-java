// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Simulation Status.
*/
public enum SimulationStatus
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
    * running
    */
    RUNNING,
    /**
    * scheduled
    */
    SCHEDULED,
    /**
    * succeeded
    */
    SUCCEEDED,
    /**
    * failed
    */
    FAILED,
    /**
    * cancelled
    */
    CANCELLED,
    /**
    * excluded
    */
    EXCLUDED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SimulationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
