// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Delegated Admin Access Assignment Status.
*/
public enum DelegatedAdminAccessAssignmentStatus
{
    /**
    * pending
    */
    PENDING,
    /**
    * active
    */
    ACTIVE,
    /**
    * deleting
    */
    DELETING,
    /**
    * deleted
    */
    DELETED,
    /**
    * error
    */
    ERROR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DelegatedAdminAccessAssignmentStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
