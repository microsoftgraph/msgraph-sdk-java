// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Country Lookup Method Type.
*/
public enum CountryLookupMethodType
{
    /**
    * client Ip Address
    */
    CLIENT_IP_ADDRESS,
    /**
    * authenticator App Gps
    */
    AUTHENTICATOR_APP_GPS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CountryLookupMethodType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
