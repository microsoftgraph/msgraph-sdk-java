// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum User Experience Analytics Operating System Restart Category.
*/
public enum UserExperienceAnalyticsOperatingSystemRestartCategory
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * restart With Update
    */
    RESTART_WITH_UPDATE,
    /**
    * restart Without Update
    */
    RESTART_WITHOUT_UPDATE,
    /**
    * blue Screen
    */
    BLUE_SCREEN,
    /**
    * shutdown With Update
    */
    SHUTDOWN_WITH_UPDATE,
    /**
    * shutdown Without Update
    */
    SHUTDOWN_WITHOUT_UPDATE,
    /**
    * long Power Button Press
    */
    LONG_POWER_BUTTON_PRESS,
    /**
    * boot Error
    */
    BOOT_ERROR,
    /**
    * update
    */
    UPDATE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UserExperienceAnalyticsOperatingSystemRestartCategory values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
