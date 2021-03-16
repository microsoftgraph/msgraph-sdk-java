// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Device Compliance Action Type.
*/
public enum DeviceComplianceActionType
{
    /**
    * no Action
    */
    NO_ACTION,
    /**
    * notification
    */
    NOTIFICATION,
    /**
    * block
    */
    BLOCK,
    /**
    * retire
    */
    RETIRE,
    /**
    * wipe
    */
    WIPE,
    /**
    * remove Resource Access Profiles
    */
    REMOVE_RESOURCE_ACCESS_PROFILES,
    /**
    * push Notification
    */
    PUSH_NOTIFICATION,
    /**
    * For DeviceComplianceActionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
