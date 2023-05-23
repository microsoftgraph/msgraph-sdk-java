// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Synchronization Task Execution Result.
*/
public enum SynchronizationTaskExecutionResult
{
    /**
    * Succeeded
    */
    SUCCEEDED,
    /**
    * Failed
    */
    FAILED,
    /**
    * Entry Level Errors
    */
    ENTRY_LEVEL_ERRORS,
    /**
    * For SynchronizationTaskExecutionResult values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
