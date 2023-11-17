// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Virtual Event Attendee Registration Status.
*/
public enum VirtualEventAttendeeRegistrationStatus
{
    /**
    * registered
    */
    REGISTERED,
    /**
    * canceled
    */
    CANCELED,
    /**
    * waitlisted
    */
    WAITLISTED,
    /**
    * pending Approval
    */
    PENDING_APPROVAL,
    /**
    * rejected By Organizer
    */
    REJECTED_BY_ORGANIZER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For VirtualEventAttendeeRegistrationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
