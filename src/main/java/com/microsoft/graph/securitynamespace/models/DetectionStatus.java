// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Detection Status.
*/
public enum DetectionStatus
{
    /**
    * detected
    */
    DETECTED,
    /**
    * blocked
    */
    BLOCKED,
    /**
    * prevented
    */
    PREVENTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DetectionStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
