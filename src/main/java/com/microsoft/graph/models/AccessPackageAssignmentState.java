// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Access Package Assignment State.
*/
public enum AccessPackageAssignmentState
{
    /**
    * delivering
    */
    DELIVERING,
    /**
    * partially Delivered
    */
    PARTIALLY_DELIVERED,
    /**
    * delivered
    */
    DELIVERED,
    /**
    * expired
    */
    EXPIRED,
    /**
    * delivery Failed
    */
    DELIVERY_FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AccessPackageAssignmentState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
