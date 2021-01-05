// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Device Registration State.
*/
public enum DeviceRegistrationState
{
    /**
    * not Registered
    */
    NOT_REGISTERED,
    /**
    * registered
    */
    REGISTERED,
    /**
    * revoked
    */
    REVOKED,
    /**
    * key Conflict
    */
    KEY_CONFLICT,
    /**
    * approval Pending
    */
    APPROVAL_PENDING,
    /**
    * certificate Reset
    */
    CERTIFICATE_RESET,
    /**
    * not Registered Pending Enrollment
    */
    NOT_REGISTERED_PENDING_ENROLLMENT,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * For DeviceRegistrationState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
