// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Access Review Expiration Behavior.
*/
public enum AccessReviewExpirationBehavior
{
    /**
    * keep Access
    */
    KEEP_ACCESS,
    /**
    * remove Access
    */
    REMOVE_ACCESS,
    /**
    * accept Access Recommendation
    */
    ACCEPT_ACCESS_RECOMMENDATION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AccessReviewExpirationBehavior values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
