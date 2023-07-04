// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Sensitivity Label Assignment Method.
*/
public enum SensitivityLabelAssignmentMethod
{
    /**
    * standard
    */
    STANDARD,
    /**
    * privileged
    */
    PRIVILEGED,
    /**
    * auto
    */
    AUTO,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SensitivityLabelAssignmentMethod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
