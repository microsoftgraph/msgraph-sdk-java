// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Training Assigned To.
*/
public enum TrainingAssignedTo
{
    /**
    * none
    */
    NONE,
    /**
    * all Users
    */
    ALL_USERS,
    /**
    * clicked Payload
    */
    CLICKED_PAYLOAD,
    /**
    * compromised
    */
    COMPROMISED,
    /**
    * reported Phish
    */
    REPORTED_PHISH,
    /**
    * read But Not Clicked
    */
    READ_BUT_NOT_CLICKED,
    /**
    * did Nothing
    */
    DID_NOTHING,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TrainingAssignedTo values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
