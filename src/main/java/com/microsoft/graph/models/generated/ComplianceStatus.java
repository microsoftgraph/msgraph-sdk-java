// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Compliance Status.
*/
public enum ComplianceStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * not Applicable
    */
    NOT_APPLICABLE,
    /**
    * compliant
    */
    COMPLIANT,
    /**
    * remediated
    */
    REMEDIATED,
    /**
    * non Compliant
    */
    NON_COMPLIANT,
    /**
    * error
    */
    ERROR,
    /**
    * conflict
    */
    CONFLICT,
    /**
    * not Assigned
    */
    NOT_ASSIGNED,
    /**
    * For ComplianceStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
