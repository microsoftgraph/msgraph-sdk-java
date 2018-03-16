// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

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
    * For DeviceEnrollmentFailureReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
