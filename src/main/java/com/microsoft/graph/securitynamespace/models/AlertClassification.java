// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Alert Classification.
*/
public enum AlertClassification
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * false Positive
    */
    FALSE_POSITIVE,
    /**
    * true Positive
    */
    TRUE_POSITIVE,
    /**
    * informational Expected Activity
    */
    INFORMATIONAL_EXPECTED_ACTIVITY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AlertClassification values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
