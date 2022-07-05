// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Data Source Scopes.
*/
public enum DataSourceScopes
{
    /**
    * none
    */
    NONE,
    /**
    * all Tenant Mailboxes
    */
    ALL_TENANT_MAILBOXES,
    /**
    * all Tenant Sites
    */
    ALL_TENANT_SITES,
    /**
    * all Case Custodians
    */
    ALL_CASE_CUSTODIANS,
    /**
    * all Case Noncustodial Data Sources
    */
    ALL_CASE_NONCUSTODIAL_DATA_SOURCES,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DataSourceScopes values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
