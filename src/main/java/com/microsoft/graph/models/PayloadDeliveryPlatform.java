// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Payload Delivery Platform.
*/
public enum PayloadDeliveryPlatform
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * sms
    */
    SMS,
    /**
    * email
    */
    EMAIL,
    /**
    * teams
    */
    TEAMS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PayloadDeliveryPlatform values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
