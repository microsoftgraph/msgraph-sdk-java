// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cross Tenant Access Policy Target Type.
*/
public enum CrossTenantAccessPolicyTargetType
{
    /**
    * user
    */
    USER,
    /**
    * group
    */
    GROUP,
    /**
    * application
    */
    APPLICATION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CrossTenantAccessPolicyTargetType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
