// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;


/**
 * The Enum Lifecycle Workflow Processing Status.
*/
public enum LifecycleWorkflowProcessingStatus
{
    /**
    * queued
    */
    QUEUED,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * completed With Errors
    */
    COMPLETED_WITH_ERRORS,
    /**
    * canceled
    */
    CANCELED,
    /**
    * failed
    */
    FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For LifecycleWorkflowProcessingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
