// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum Rule Operation.
*/
public enum RuleOperation
{
    /**
    * null
    */
    NULL,
    /**
    * equals
    */
    EQUALS,
    /**
    * not Equals
    */
    NOT_EQUALS,
    /**
    * contains
    */
    CONTAINS,
    /**
    * not Contains
    */
    NOT_CONTAINS,
    /**
    * less Than
    */
    LESS_THAN,
    /**
    * greater Than
    */
    GREATER_THAN,
    /**
    * starts With
    */
    STARTS_WITH,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RuleOperation values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
