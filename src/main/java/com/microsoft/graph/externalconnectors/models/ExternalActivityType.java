// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum External Activity Type.
*/
public enum ExternalActivityType
{
    /**
    * viewed
    */
    VIEWED,
    /**
    * modified
    */
    MODIFIED,
    /**
    * created
    */
    CREATED,
    /**
    * commented
    */
    COMMENTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ExternalActivityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
