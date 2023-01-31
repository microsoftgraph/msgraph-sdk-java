// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Incident Status.
*/
public enum IncidentStatus
{
    /**
    * active
    */
    ACTIVE,
    /**
    * resolved
    */
    RESOLVED,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * redirected
    */
    REDIRECTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IncidentStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
