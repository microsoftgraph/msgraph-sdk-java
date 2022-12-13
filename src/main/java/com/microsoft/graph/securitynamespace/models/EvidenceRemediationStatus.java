// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Evidence Remediation Status.
*/
public enum EvidenceRemediationStatus
{
    /**
    * none
    */
    NONE,
    /**
    * remediated
    */
    REMEDIATED,
    /**
    * prevented
    */
    PREVENTED,
    /**
    * blocked
    */
    BLOCKED,
    /**
    * not Found
    */
    NOT_FOUND,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For EvidenceRemediationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
