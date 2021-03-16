// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Risk State.
*/
public enum RiskState
{
    /**
    * none
    */
    NONE,
    /**
    * confirmed Safe
    */
    CONFIRMED_SAFE,
    /**
    * remediated
    */
    REMEDIATED,
    /**
    * dismissed
    */
    DISMISSED,
    /**
    * at Risk
    */
    AT_RISK,
    /**
    * confirmed Compromised
    */
    CONFIRMED_COMPROMISED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RiskState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
