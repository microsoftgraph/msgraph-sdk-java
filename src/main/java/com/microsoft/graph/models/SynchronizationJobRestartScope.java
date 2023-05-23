// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Synchronization Job Restart Scope.
*/
public enum SynchronizationJobRestartScope
{
    /**
    * None
    */
    NONE,
    /**
    * Connector Data Store
    */
    CONNECTOR_DATA_STORE,
    /**
    * Escrows
    */
    ESCROWS,
    /**
    * Watermark
    */
    WATERMARK,
    /**
    * Quarantine State
    */
    QUARANTINE_STATE,
    /**
    * Full
    */
    FULL,
    /**
    * Force Deletes
    */
    FORCE_DELETES,
    /**
    * For SynchronizationJobRestartScope values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
