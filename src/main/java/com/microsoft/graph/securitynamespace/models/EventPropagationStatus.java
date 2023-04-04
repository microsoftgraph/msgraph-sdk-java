// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Event Propagation Status.
*/
public enum EventPropagationStatus
{
    /**
    * none
    */
    NONE,
    /**
    * in Processing
    */
    IN_PROCESSING,
    /**
    * failed
    */
    FAILED,
    /**
    * success
    */
    SUCCESS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For EventPropagationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
