// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Allowed Target Scope.
*/
public enum AllowedTargetScope
{
    /**
    * not Specified
    */
    NOT_SPECIFIED,
    /**
    * specific Directory Users
    */
    SPECIFIC_DIRECTORY_USERS,
    /**
    * specific Connected Organization Users
    */
    SPECIFIC_CONNECTED_ORGANIZATION_USERS,
    /**
    * specific Directory Service Principals
    */
    SPECIFIC_DIRECTORY_SERVICE_PRINCIPALS,
    /**
    * all Member Users
    */
    ALL_MEMBER_USERS,
    /**
    * all Directory Users
    */
    ALL_DIRECTORY_USERS,
    /**
    * all Directory Service Principals
    */
    ALL_DIRECTORY_SERVICE_PRINCIPALS,
    /**
    * all Configured Connected Organization Users
    */
    ALL_CONFIGURED_CONNECTED_ORGANIZATION_USERS,
    /**
    * all External Users
    */
    ALL_EXTERNAL_USERS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AllowedTargetScope values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
