// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows Device Health State.
*/
public enum WindowsDeviceHealthState
{
    /**
    * clean
    */
    CLEAN,
    /**
    * full Scan Pending
    */
    FULL_SCAN_PENDING,
    /**
    * reboot Pending
    */
    REBOOT_PENDING,
    /**
    * manual Steps Pending
    */
    MANUAL_STEPS_PENDING,
    /**
    * offline Scan Pending
    */
    OFFLINE_SCAN_PENDING,
    /**
    * critical
    */
    CRITICAL,
    /**
    * For WindowsDeviceHealthState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
