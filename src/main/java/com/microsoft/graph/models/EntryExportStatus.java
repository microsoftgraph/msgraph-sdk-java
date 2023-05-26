// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Entry Export Status.
*/
public enum EntryExportStatus
{
    /**
    * Noop
    */
    NOOP,
    /**
    * Success
    */
    SUCCESS,
    /**
    * Retryable Error
    */
    RETRYABLE_ERROR,
    /**
    * Permanent Error
    */
    PERMANENT_ERROR,
    /**
    * Error
    */
    ERROR,
    /**
    * For EntryExportStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
