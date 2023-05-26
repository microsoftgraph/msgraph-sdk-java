// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Synchronization Status Code.
*/
public enum SynchronizationStatusCode
{
    /**
    * Not Configured
    */
    NOT_CONFIGURED,
    /**
    * Not Run
    */
    NOT_RUN,
    /**
    * Active
    */
    ACTIVE,
    /**
    * Paused
    */
    PAUSED,
    /**
    * Quarantine
    */
    QUARANTINE,
    /**
    * For SynchronizationStatusCode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
