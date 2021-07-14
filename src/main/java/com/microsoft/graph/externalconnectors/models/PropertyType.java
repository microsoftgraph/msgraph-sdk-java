// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum Property Type.
*/
public enum PropertyType
{
    /**
    * string
    */
    STRING,
    /**
    * int64
    */
    INT64,
    /**
    * double
    */
    DOUBLE,
    /**
    * date Time
    */
    DATE_TIME,
    /**
    * boolean
    */
    BOOLEAN,
    /**
    * string Collection
    */
    STRING_COLLECTION,
    /**
    * int64Collection
    */
    INT64_COLLECTION,
    /**
    * double Collection
    */
    DOUBLE_COLLECTION,
    /**
    * date Time Collection
    */
    DATE_TIME_COLLECTION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PropertyType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
