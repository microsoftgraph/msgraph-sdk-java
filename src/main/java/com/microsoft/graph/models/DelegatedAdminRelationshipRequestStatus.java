// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Delegated Admin Relationship Request Status.
*/
public enum DelegatedAdminRelationshipRequestStatus
{
    /**
    * created
    */
    CREATED,
    /**
    * pending
    */
    PENDING,
    /**
    * succeeded
    */
    SUCCEEDED,
    /**
    * failed
    */
    FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DelegatedAdminRelationshipRequestStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
