// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Teamwork Application Identity Type.
*/
public enum TeamworkApplicationIdentityType
{
    /**
    * aad Application
    */
    AAD_APPLICATION,
    /**
    * bot
    */
    BOT,
    /**
    * tenant Bot
    */
    TENANT_BOT,
    /**
    * office365Connector
    */
    OFFICE365_CONNECTOR,
    /**
    * outgoing Webhook
    */
    OUTGOING_WEBHOOK,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TeamworkApplicationIdentityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
