// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Call Recording Status.
*/
public enum CallRecordingStatus
{
    /**
    * success
    */
    SUCCESS,
    /**
    * failure
    */
    FAILURE,
    /**
    * initial
    */
    INITIAL,
    /**
    * chunk Finished
    */
    CHUNK_FINISHED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CallRecordingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
