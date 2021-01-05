// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


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
    * For DeviceEnrollmentType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
