// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Meeting Message Type.
*/
public enum MeetingMessageType
{
    /**
    * none
    */
    NONE,
    /**
    * meeting Request
    */
    MEETING_REQUEST,
    /**
    * meeting Cancelled
    */
    MEETING_CANCELLED,
    /**
    * meeting Accepted
    */
    MEETING_ACCEPTED,
    /**
    * meeting Tenatively Accepted
    */
    MEETING_TENATIVELY_ACCEPTED,
    /**
    * meeting Declined
    */
    MEETING_DECLINED,
    /**
    * For MeetingMessageType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
