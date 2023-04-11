// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Browser Site Status.
*/
public enum BrowserSiteStatus
{
    /**
    * published
    */
    PUBLISHED,
    /**
    * pending Add
    */
    PENDING_ADD,
    /**
    * pending Edit
    */
    PENDING_EDIT,
    /**
    * pending Delete
    */
    PENDING_DELETE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For BrowserSiteStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
