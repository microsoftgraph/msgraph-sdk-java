// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Booking Staff Role.
*/
public enum BookingStaffRole
{
    /**
    * guest
    */
    GUEST,
    /**
    * administrator
    */
    ADMINISTRATOR,
    /**
    * viewer
    */
    VIEWER,
    /**
    * external Guest
    */
    EXTERNAL_GUEST,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * scheduler
    */
    SCHEDULER,
    /**
    * team Member
    */
    TEAM_MEMBER,
    /**
    * For BookingStaffRole values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
