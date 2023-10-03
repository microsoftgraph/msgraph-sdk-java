// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Whois Domain Status.
*/
public enum WhoisDomainStatus
{
    /**
    * client Delete Prohibited
    */
    CLIENT_DELETE_PROHIBITED,
    /**
    * client Hold
    */
    CLIENT_HOLD,
    /**
    * client Renew Prohibited
    */
    CLIENT_RENEW_PROHIBITED,
    /**
    * client Transfer Prohibited
    */
    CLIENT_TRANSFER_PROHIBITED,
    /**
    * client Update Prohibited
    */
    CLIENT_UPDATE_PROHIBITED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For WhoisDomainStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
