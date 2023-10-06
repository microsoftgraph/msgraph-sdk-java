// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Notification Delivery Preference.
*/
public enum NotificationDeliveryPreference
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * deliver Immedietly
    */
    DELIVER_IMMEDIETLY,
    /**
    * deliver After Campaign End
    */
    DELIVER_AFTER_CAMPAIGN_END,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For NotificationDeliveryPreference values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
