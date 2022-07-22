// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Bookings Availability Status.
*/
public enum BookingsAvailabilityStatus
{
    /**
    * available
    */
    AVAILABLE,
    /**
    * busy
    */
    BUSY,
    /**
    * slots Available
    */
    SLOTS_AVAILABLE,
    /**
    * out Of Office
    */
    OUT_OF_OFFICE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For BookingsAvailabilityStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
