// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Call State.
*/
public enum CallState
{
    /**
    * incoming
    */
    INCOMING,
    /**
    * establishing
    */
    ESTABLISHING,
    /**
    * established
    */
    ESTABLISHED,
    /**
    * hold
    */
    HOLD,
    /**
    * transferring
    */
    TRANSFERRING,
    /**
    * transfer Accepted
    */
    TRANSFER_ACCEPTED,
    /**
    * redirecting
    */
    REDIRECTING,
    /**
    * terminating
    */
    TERMINATING,
    /**
    * terminated
    */
    TERMINATED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CallState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
