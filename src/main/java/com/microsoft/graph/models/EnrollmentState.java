// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Enrollment State.
*/
public enum EnrollmentState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * enrolled
    */
    ENROLLED,
    /**
    * pending Reset
    */
    PENDING_RESET,
    /**
    * failed
    */
    FAILED,
    /**
    * not Contacted
    */
    NOT_CONTACTED,
    /**
    * For EnrollmentState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
