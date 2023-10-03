// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum End User Notification Type.
*/
public enum EndUserNotificationType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * positive Reinforcement
    */
    POSITIVE_REINFORCEMENT,
    /**
    * no Training
    */
    NO_TRAINING,
    /**
    * training Assignment
    */
    TRAINING_ASSIGNMENT,
    /**
    * training Reminder
    */
    TRAINING_REMINDER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For EndUserNotificationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
