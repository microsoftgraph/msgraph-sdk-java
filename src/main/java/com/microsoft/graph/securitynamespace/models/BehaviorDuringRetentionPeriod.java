// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Behavior During Retention Period.
*/
public enum BehaviorDuringRetentionPeriod
{
    /**
    * do Not Retain
    */
    DO_NOT_RETAIN,
    /**
    * retain
    */
    RETAIN,
    /**
    * retain As Record
    */
    RETAIN_AS_RECORD,
    /**
    * retain As Regulatory Record
    */
    RETAIN_AS_REGULATORY_RECORD,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For BehaviorDuringRetentionPeriod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
