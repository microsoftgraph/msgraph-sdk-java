// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum User Experience Analytics Health State.
*/
public enum UserExperienceAnalyticsHealthState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * insufficient Data
    */
    INSUFFICIENT_DATA,
    /**
    * needs Attention
    */
    NEEDS_ATTENTION,
    /**
    * meeting Goals
    */
    MEETING_GOALS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UserExperienceAnalyticsHealthState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
