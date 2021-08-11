// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Management Report Status.
*/
public enum DeviceManagementReportStatus
{
    /**
    * unknown
    */
    UNKNOWN,
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
    * failed
    */
    FAILED,
    /**
    * For DeviceManagementReportStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
