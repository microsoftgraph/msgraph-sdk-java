// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;


/**
 * The Enum Case Operation Status.
*/
public enum CaseOperationStatus
{
    /**
    * not Started
    */
    NOT_STARTED,
    /**
    * submission Failed
    */
    SUBMISSION_FAILED,
    /**
    * running
    */
    RUNNING,
    /**
    * succeeded
    */
    SUCCEEDED,
    /**
    * partially Succeeded
    */
    PARTIALLY_SUCCEEDED,
    /**
    * failed
    */
    FAILED,
    /**
    * For CaseOperationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
