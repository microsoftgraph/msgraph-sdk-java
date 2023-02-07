// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Delegated Admin Relationship Status.
*/
public enum DelegatedAdminRelationshipStatus
{
    /**
    * activating
    */
    ACTIVATING,
    /**
    * active
    */
    ACTIVE,
    /**
    * approval Pending
    */
    APPROVAL_PENDING,
    /**
    * approved
    */
    APPROVED,
    /**
    * created
    */
    CREATED,
    /**
    * expired
    */
    EXPIRED,
    /**
    * expiring
    */
    EXPIRING,
    /**
    * terminated
    */
    TERMINATED,
    /**
    * terminating
    */
    TERMINATING,
    /**
    * termination Requested
    */
    TERMINATION_REQUESTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DelegatedAdminRelationshipStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
