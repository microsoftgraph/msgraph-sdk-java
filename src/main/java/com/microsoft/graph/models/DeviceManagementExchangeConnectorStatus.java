// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Management Exchange Connector Status.
*/
public enum DeviceManagementExchangeConnectorStatus
{
    /**
    * none
    */
    NONE,
    /**
    * connection Pending
    */
    CONNECTION_PENDING,
    /**
    * connected
    */
    CONNECTED,
    /**
    * disconnected
    */
    DISCONNECTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceManagementExchangeConnectorStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
