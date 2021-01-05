// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Meeting Request Type.
*/
public enum MeetingRequestType
{
    /**
    * none
    */
    NONE,
    /**
    * new Meeting Request
    */
    NEW_MEETING_REQUEST,
    /**
    * full Update
    */
    FULL_UPDATE,
    /**
    * informational Update
    */
    INFORMATIONAL_UPDATE,
    /**
    * silent Update
    */
    SILENT_UPDATE,
    /**
    * outdated
    */
    OUTDATED,
    /**
    * principal Wants Copy
    */
    PRINCIPAL_WANTS_COPY,
    /**
    * For MeetingRequestType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
