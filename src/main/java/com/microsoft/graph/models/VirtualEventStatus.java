// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Virtual Event Status.
*/
public enum VirtualEventStatus
{
    /**
    * draft
    */
    DRAFT,
    /**
    * published
    */
    PUBLISHED,
    /**
    * canceled
    */
    CANCELED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For VirtualEventStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
