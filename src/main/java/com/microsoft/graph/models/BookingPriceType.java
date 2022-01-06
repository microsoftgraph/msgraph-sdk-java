// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Booking Price Type.
*/
public enum BookingPriceType
{
    /**
    * undefined
    */
    UNDEFINED,
    /**
    * fixed Price
    */
    FIXED_PRICE,
    /**
    * starting At
    */
    STARTING_AT,
    /**
    * hourly
    */
    HOURLY,
    /**
    * free
    */
    FREE,
    /**
    * price Varies
    */
    PRICE_VARIES,
    /**
    * call Us
    */
    CALL_US,
    /**
    * not Set
    */
    NOT_SET,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For BookingPriceType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
