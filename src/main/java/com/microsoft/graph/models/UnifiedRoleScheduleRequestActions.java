// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Unified Role Schedule Request Actions.
*/
public enum UnifiedRoleScheduleRequestActions
{
    /**
    * admin Assign
    */
    ADMIN_ASSIGN,
    /**
    * admin Update
    */
    ADMIN_UPDATE,
    /**
    * admin Remove
    */
    ADMIN_REMOVE,
    /**
    * self Activate
    */
    SELF_ACTIVATE,
    /**
    * self Deactivate
    */
    SELF_DEACTIVATE,
    /**
    * admin Extend
    */
    ADMIN_EXTEND,
    /**
    * admin Renew
    */
    ADMIN_RENEW,
    /**
    * self Extend
    */
    SELF_EXTEND,
    /**
    * self Renew
    */
    SELF_RENEW,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UnifiedRoleScheduleRequestActions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
