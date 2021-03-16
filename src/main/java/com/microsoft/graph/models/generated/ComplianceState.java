// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Compliance State.
*/
public enum ComplianceState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * compliant
    */
    COMPLIANT,
    /**
    * noncompliant
    */
    NONCOMPLIANT,
    /**
    * conflict
    */
    CONFLICT,
    /**
    * error
    */
    ERROR,
    /**
    * in Grace Period
    */
    IN_GRACE_PERIOD,
    /**
    * config Manager
    */
    CONFIG_MANAGER,
    /**
    * For ComplianceState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
