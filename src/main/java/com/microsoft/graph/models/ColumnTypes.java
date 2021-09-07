// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Column Types.
*/
public enum ColumnTypes
{
    /**
    * note
    */
    NOTE,
    /**
    * text
    */
    TEXT,
    /**
    * choice
    */
    CHOICE,
    /**
    * multichoice
    */
    MULTICHOICE,
    /**
    * number
    */
    NUMBER,
    /**
    * currency
    */
    CURRENCY,
    /**
    * date Time
    */
    DATE_TIME,
    /**
    * lookup
    */
    LOOKUP,
    /**
    * boolean
    */
    BOOLEAN,
    /**
    * user
    */
    USER,
    /**
    * url
    */
    URL,
    /**
    * calculated
    */
    CALCULATED,
    /**
    * location
    */
    LOCATION,
    /**
    * geolocation
    */
    GEOLOCATION,
    /**
    * term
    */
    TERM,
    /**
    * multiterm
    */
    MULTITERM,
    /**
    * thumbnail
    */
    THUMBNAIL,
    /**
    * approval Status
    */
    APPROVAL_STATUS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ColumnTypes values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
