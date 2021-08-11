// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum Identity Type.
*/
public enum IdentityType
{
    /**
    * user
    */
    USER,
    /**
    * group
    */
    GROUP,
    /**
    * external Group
    */
    EXTERNAL_GROUP,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IdentityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
