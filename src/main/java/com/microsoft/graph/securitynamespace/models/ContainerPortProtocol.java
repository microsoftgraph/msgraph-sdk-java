// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Container Port Protocol.
*/
public enum ContainerPortProtocol
{
    /**
    * udp
    */
    UDP,
    /**
    * tcp
    */
    TCP,
    /**
    * sctp
    */
    SCTP,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ContainerPortProtocol values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
