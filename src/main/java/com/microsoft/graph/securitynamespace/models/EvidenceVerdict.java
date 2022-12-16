// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Evidence Verdict.
*/
public enum EvidenceVerdict
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * suspicious
    */
    SUSPICIOUS,
    /**
    * malicious
    */
    MALICIOUS,
    /**
    * no Threats Found
    */
    NO_THREATS_FOUND,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For EvidenceVerdict values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
