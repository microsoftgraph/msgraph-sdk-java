// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Retention Trigger.
*/
public enum RetentionTrigger
{
    /**
    * date Labeled
    */
    DATE_LABELED,
    /**
    * date Created
    */
    DATE_CREATED,
    /**
    * date Modified
    */
    DATE_MODIFIED,
    /**
    * date Of Event
    */
    DATE_OF_EVENT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RetentionTrigger values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
