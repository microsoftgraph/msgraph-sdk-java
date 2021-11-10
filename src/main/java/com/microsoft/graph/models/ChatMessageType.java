// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Chat Message Type.
*/
public enum ChatMessageType
{
    /**
    * message
    */
    MESSAGE,
    /**
    * chat Event
    */
    CHAT_EVENT,
    /**
    * typing
    */
    TYPING,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * system Event Message
    */
    SYSTEM_EVENT_MESSAGE,
    /**
    * For ChatMessageType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
