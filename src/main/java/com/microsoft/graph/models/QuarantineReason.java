// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Quarantine Reason.
*/
public enum QuarantineReason
{
    /**
    * Encountered Base Escrow Threshold
    */
    ENCOUNTERED_BASE_ESCROW_THRESHOLD,
    /**
    * Encountered Total Escrow Threshold
    */
    ENCOUNTERED_TOTAL_ESCROW_THRESHOLD,
    /**
    * Encountered Escrow Proportion Threshold
    */
    ENCOUNTERED_ESCROW_PROPORTION_THRESHOLD,
    /**
    * Encountered Quarantine Exception
    */
    ENCOUNTERED_QUARANTINE_EXCEPTION,
    /**
    * Unknown
    */
    UNKNOWN,
    /**
    * Quarantined On Demand
    */
    QUARANTINED_ON_DEMAND,
    /**
    * Too Many Deletes
    */
    TOO_MANY_DELETES,
    /**
    * Ingestion Interrupted
    */
    INGESTION_INTERRUPTED,
    /**
    * For QuarantineReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
