// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Partner Tenant Type.
*/
public enum PartnerTenantType
{
    /**
    * microsoft Support
    */
    MICROSOFT_SUPPORT,
    /**
    * syndicate Partner
    */
    SYNDICATE_PARTNER,
    /**
    * breadth Partner
    */
    BREADTH_PARTNER,
    /**
    * breadth Partner Delegated Admin
    */
    BREADTH_PARTNER_DELEGATED_ADMIN,
    /**
    * reseller Partner Delegated Admin
    */
    RESELLER_PARTNER_DELEGATED_ADMIN,
    /**
    * value Added Reseller Partner Delegated Admin
    */
    VALUE_ADDED_RESELLER_PARTNER_DELEGATED_ADMIN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PartnerTenantType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
