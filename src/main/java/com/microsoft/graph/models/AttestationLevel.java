// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Attestation Level.
*/
public enum AttestationLevel
{
    /**
    * attested
    */
    ATTESTED,
    /**
    * not Attested
    */
    NOT_ATTESTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AttestationLevel values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
