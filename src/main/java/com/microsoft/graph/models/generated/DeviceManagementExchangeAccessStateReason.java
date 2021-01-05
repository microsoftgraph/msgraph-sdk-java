// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Device Management Exchange Access State Reason.
*/
public enum DeviceManagementExchangeAccessStateReason
{
    /**
    * none
    */
    NONE,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * exchange Global Rule
    */
    EXCHANGE_GLOBAL_RULE,
    /**
    * exchange Individual Rule
    */
    EXCHANGE_INDIVIDUAL_RULE,
    /**
    * exchange Device Rule
    */
    EXCHANGE_DEVICE_RULE,
    /**
    * exchange Upgrade
    */
    EXCHANGE_UPGRADE,
    /**
    * exchange Mailbox Policy
    */
    EXCHANGE_MAILBOX_POLICY,
    /**
    * other
    */
    OTHER,
    /**
    * compliant
    */
    COMPLIANT,
    /**
    * not Compliant
    */
    NOT_COMPLIANT,
    /**
    * not Enrolled
    */
    NOT_ENROLLED,
    /**
    * unknown Location
    */
    UNKNOWN_LOCATION,
    /**
    * mfa Required
    */
    MFA_REQUIRED,
    /**
    * azure ADBlock Due To Access Policy
    */
    AZURE_AD_BLOCK_DUE_TO_ACCESS_POLICY,
    /**
    * compromised Password
    */
    COMPROMISED_PASSWORD,
    /**
    * device Not Known With Managed App
    */
    DEVICE_NOT_KNOWN_WITH_MANAGED_APP,
    /**
    * For DeviceManagementExchangeAccessStateReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
