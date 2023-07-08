// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Detected App Platform Type.
*/
public enum DetectedAppPlatformType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * windows
    */
    WINDOWS,
    /**
    * windows Mobile
    */
    WINDOWS_MOBILE,
    /**
    * windows Holographic
    */
    WINDOWS_HOLOGRAPHIC,
    /**
    * ios
    */
    IOS,
    /**
    * mac OS
    */
    MAC_OS,
    /**
    * chrome OS
    */
    CHROME_OS,
    /**
    * android OSP
    */
    ANDROID_OSP,
    /**
    * android Device Administrator
    */
    ANDROID_DEVICE_ADMINISTRATOR,
    /**
    * android Work Profile
    */
    ANDROID_WORK_PROFILE,
    /**
    * android Dedicated And Fully Managed
    */
    ANDROID_DEDICATED_AND_FULLY_MANAGED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DetectedAppPlatformType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
