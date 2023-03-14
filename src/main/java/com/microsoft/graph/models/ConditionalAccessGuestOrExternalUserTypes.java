// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Conditional Access Guest Or External User Types.
*/
public enum ConditionalAccessGuestOrExternalUserTypes
{
    /**
    * none
    */
    NONE,
    /**
    * internal Guest
    */
    INTERNAL_GUEST,
    /**
    * b2b Collaboration Guest
    */
    B2B_COLLABORATION_GUEST,
    /**
    * b2b Collaboration Member
    */
    B2B_COLLABORATION_MEMBER,
    /**
    * b2b Direct Connect User
    */
    B2B_DIRECT_CONNECT_USER,
    /**
    * other External User
    */
    OTHER_EXTERNAL_USER,
    /**
    * service Provider
    */
    SERVICE_PROVIDER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ConditionalAccessGuestOrExternalUserTypes values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
