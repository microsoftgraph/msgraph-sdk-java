// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Coachmark Location Type.
*/
public enum CoachmarkLocationType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * from Email
    */
    FROM_EMAIL,
    /**
    * subject
    */
    SUBJECT,
    /**
    * external Tag
    */
    EXTERNAL_TAG,
    /**
    * display Name
    */
    DISPLAY_NAME,
    /**
    * message Body
    */
    MESSAGE_BODY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CoachmarkLocationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
