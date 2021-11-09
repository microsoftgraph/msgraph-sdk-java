// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Expiration Pattern Type.
*/
public enum ExpirationPatternType
{
    /**
    * not Specified
    */
    NOT_SPECIFIED,
    /**
    * no Expiration
    */
    NO_EXPIRATION,
    /**
    * after Date Time
    */
    AFTER_DATE_TIME,
    /**
    * after Duration
    */
    AFTER_DURATION,
    /**
    * For ExpirationPatternType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
