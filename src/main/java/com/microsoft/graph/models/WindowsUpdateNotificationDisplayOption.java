// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows Update Notification Display Option.
*/
public enum WindowsUpdateNotificationDisplayOption
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * default Notifications
    */
    DEFAULT_NOTIFICATIONS,
    /**
    * restart Warnings Only
    */
    RESTART_WARNINGS_ONLY,
    /**
    * disable All Notifications
    */
    DISABLE_ALL_NOTIFICATIONS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For WindowsUpdateNotificationDisplayOption values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
