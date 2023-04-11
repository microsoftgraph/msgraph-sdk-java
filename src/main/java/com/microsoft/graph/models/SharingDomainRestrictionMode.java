// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Sharing Domain Restriction Mode.
*/
public enum SharingDomainRestrictionMode
{
    /**
    * none
    */
    NONE,
    /**
    * allow List
    */
    ALLOW_LIST,
    /**
    * block List
    */
    BLOCK_LIST,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SharingDomainRestrictionMode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
