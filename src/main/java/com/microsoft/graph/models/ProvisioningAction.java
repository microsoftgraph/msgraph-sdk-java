// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Provisioning Action.
*/
public enum ProvisioningAction
{
    /**
    * other
    */
    OTHER,
    /**
    * create
    */
    CREATE,
    /**
    * delete
    */
    DELETE,
    /**
    * disable
    */
    DISABLE,
    /**
    * update
    */
    UPDATE,
    /**
    * staged Delete
    */
    STAGED_DELETE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ProvisioningAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
