// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Attribute Type.
*/
public enum AttributeType
{
    /**
    * String
    */
    STRING,
    /**
    * Integer
    */
    INTEGER,
    /**
    * Reference
    */
    REFERENCE,
    /**
    * Binary
    */
    BINARY,
    /**
    * Boolean
    */
    BOOLEAN,
    /**
    * Date Time
    */
    DATE_TIME,
    /**
    * For AttributeType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
