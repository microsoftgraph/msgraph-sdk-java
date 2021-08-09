// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Service Health Status.
*/
public enum ServiceHealthStatus
{
    /**
    * service Operational
    */
    SERVICE_OPERATIONAL,
    /**
    * investigating
    */
    INVESTIGATING,
    /**
    * restoring Service
    */
    RESTORING_SERVICE,
    /**
    * verifying Service
    */
    VERIFYING_SERVICE,
    /**
    * service Restored
    */
    SERVICE_RESTORED,
    /**
    * post Incident Review Published
    */
    POST_INCIDENT_REVIEW_PUBLISHED,
    /**
    * service Degradation
    */
    SERVICE_DEGRADATION,
    /**
    * service Interruption
    */
    SERVICE_INTERRUPTION,
    /**
    * extended Recovery
    */
    EXTENDED_RECOVERY,
    /**
    * false Positive
    */
    FALSE_POSITIVE,
    /**
    * investigation Suspended
    */
    INVESTIGATION_SUSPENDED,
    /**
    * resolved
    */
    RESOLVED,
    /**
    * mitigated External
    */
    MITIGATED_EXTERNAL,
    /**
    * mitigated
    */
    MITIGATED,
    /**
    * resolved External
    */
    RESOLVED_EXTERNAL,
    /**
    * confirmed
    */
    CONFIRMED,
    /**
    * reported
    */
    REPORTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ServiceHealthStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
