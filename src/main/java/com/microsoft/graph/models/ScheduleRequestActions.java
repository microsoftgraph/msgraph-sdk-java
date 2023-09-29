// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Schedule Request Actions.
*/
public enum ScheduleRequestActions
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
    * For ScheduleRequestActions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
