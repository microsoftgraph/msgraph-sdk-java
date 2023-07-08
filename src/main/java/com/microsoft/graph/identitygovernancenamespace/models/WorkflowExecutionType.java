// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;


/**
 * The Enum Workflow Execution Type.
*/
public enum WorkflowExecutionType
{
    /**
    * scheduled
    */
    SCHEDULED,
    /**
    * on Demand
    */
    ON_DEMAND,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For WorkflowExecutionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
