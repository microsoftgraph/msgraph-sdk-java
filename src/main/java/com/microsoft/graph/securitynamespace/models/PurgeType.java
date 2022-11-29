// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Purge Type.
*/
public enum PurgeType
{
    /**
    * recoverable
    */
    RECOVERABLE,
    /**
    * permanently Deleted
    */
    PERMANENTLY_DELETED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PurgeType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
