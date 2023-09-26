// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Delegated Admin Relationship Request Action.
*/
public enum DelegatedAdminRelationshipRequestAction
{
    /**
    * lock For Approval
    */
    LOCK_FOR_APPROVAL,
    /**
    * approve
    */
    APPROVE,
    /**
    * terminate
    */
    TERMINATE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * reject
    */
    REJECT,
    /**
    * For DelegatedAdminRelationshipRequestAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
