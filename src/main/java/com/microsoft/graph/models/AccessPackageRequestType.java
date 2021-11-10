// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Access Package Request Type.
*/
public enum AccessPackageRequestType
{
    /**
    * not Specified
    */
    NOT_SPECIFIED,
    /**
    * user Add
    */
    USER_ADD,
    /**
    * user Update
    */
    USER_UPDATE,
    /**
    * user Remove
    */
    USER_REMOVE,
    /**
    * admin Add
    */
    ADMIN_ADD,
    /**
    * admin Update
    */
    ADMIN_UPDATE,
    /**
    * admin Remove
    */
    ADMIN_REMOVE,
    /**
    * system Add
    */
    SYSTEM_ADD,
    /**
    * system Update
    */
    SYSTEM_UPDATE,
    /**
    * system Remove
    */
    SYSTEM_REMOVE,
    /**
    * on Behalf Add
    */
    ON_BEHALF_ADD,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AccessPackageRequestType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
