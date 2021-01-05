// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Device Enrollment Failure Reason.
*/
public enum DeviceEnrollmentFailureReason
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * authentication
    */
    AUTHENTICATION,
    /**
    * authorization
    */
    AUTHORIZATION,
    /**
    * account Validation
    */
    ACCOUNT_VALIDATION,
    /**
    * user Validation
    */
    USER_VALIDATION,
    /**
    * device Not Supported
    */
    DEVICE_NOT_SUPPORTED,
    /**
    * in Maintenance
    */
    IN_MAINTENANCE,
    /**
    * bad Request
    */
    BAD_REQUEST,
    /**
    * feature Not Supported
    */
    FEATURE_NOT_SUPPORTED,
    /**
    * enrollment Restrictions Enforced
    */
    ENROLLMENT_RESTRICTIONS_ENFORCED,
    /**
    * client Disconnected
    */
    CLIENT_DISCONNECTED,
    /**
    * user Abandonment
    */
    USER_ABANDONMENT,
    /**
    * For DeviceEnrollmentFailureReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
