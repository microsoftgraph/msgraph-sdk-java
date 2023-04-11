// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Sharing Capabilities.
*/
public enum SharingCapabilities
{
    /**
    * disabled
    */
    DISABLED,
    /**
    * external User Sharing Only
    */
    EXTERNAL_USER_SHARING_ONLY,
    /**
    * external User And Guest Sharing
    */
    EXTERNAL_USER_AND_GUEST_SHARING,
    /**
    * existing External User Sharing Only
    */
    EXISTING_EXTERNAL_USER_SHARING_ONLY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SharingCapabilities values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
