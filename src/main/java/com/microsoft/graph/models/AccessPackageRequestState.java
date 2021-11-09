// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Access Package Request State.
*/
public enum AccessPackageRequestState
{
    /**
    * submitted
    */
    SUBMITTED,
    /**
    * pending Approval
    */
    PENDING_APPROVAL,
    /**
    * delivering
    */
    DELIVERING,
    /**
    * delivered
    */
    DELIVERED,
    /**
    * delivery Failed
    */
    DELIVERY_FAILED,
    /**
    * denied
    */
    DENIED,
    /**
    * scheduled
    */
    SCHEDULED,
    /**
    * canceled
    */
    CANCELED,
    /**
    * partially Delivered
    */
    PARTIALLY_DELIVERED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AccessPackageRequestState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
