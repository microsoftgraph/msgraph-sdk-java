// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Entry Sync Operation.
*/
public enum EntrySyncOperation
{
    /**
    * None
    */
    NONE,
    /**
    * Add
    */
    ADD,
    /**
    * Delete
    */
    DELETE,
    /**
    * Update
    */
    UPDATE,
    /**
    * For EntrySyncOperation values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
