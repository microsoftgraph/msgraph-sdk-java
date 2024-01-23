// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Service Principal Type.
*/
public enum ServicePrincipalType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * application
    */
    APPLICATION,
    /**
    * managed Identity
    */
    MANAGED_IDENTITY,
    /**
    * legacy
    */
    LEGACY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ServicePrincipalType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
