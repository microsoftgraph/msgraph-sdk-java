// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Synchronization Disposition.
*/
public enum SynchronizationDisposition
{
    /**
    * Normal
    */
    NORMAL,
    /**
    * Discard
    */
    DISCARD,
    /**
    * Escrow
    */
    ESCROW,
    /**
    * For SynchronizationDisposition values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
