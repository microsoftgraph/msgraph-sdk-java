// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Enrollment Type.
*/
public enum DeviceEnrollmentType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * user Enrollment
    */
    USER_ENROLLMENT,
    /**
    * device Enrollment Manager
    */
    DEVICE_ENROLLMENT_MANAGER,
    /**
    * apple Bulk With User
    */
    APPLE_BULK_WITH_USER,
    /**
    * apple Bulk Without User
    */
    APPLE_BULK_WITHOUT_USER,
    /**
    * windows Azure ADJoin
    */
    WINDOWS_AZURE_AD_JOIN,
    /**
    * windows Bulk Userless
    */
    WINDOWS_BULK_USERLESS,
    /**
    * windows Auto Enrollment
    */
    WINDOWS_AUTO_ENROLLMENT,
    /**
    * windows Bulk Azure Domain Join
    */
    WINDOWS_BULK_AZURE_DOMAIN_JOIN,
    /**
    * windows Co Management
    */
    WINDOWS_CO_MANAGEMENT,
    /**
    * windows Azure ADJoin Using Device Auth
    */
    WINDOWS_AZURE_AD_JOIN_USING_DEVICE_AUTH,
    /**
    * apple User Enrollment
    */
    APPLE_USER_ENROLLMENT,
    /**
    * apple User Enrollment With Service Account
    */
    APPLE_USER_ENROLLMENT_WITH_SERVICE_ACCOUNT,
    /**
    * For DeviceEnrollmentType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
