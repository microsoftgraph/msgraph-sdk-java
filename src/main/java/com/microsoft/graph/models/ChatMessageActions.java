// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Chat Message Actions.
*/
public enum ChatMessageActions
{
    /**
    * reaction Added
    */
    REACTION_ADDED,
    /**
    * reaction Removed
    */
    REACTION_REMOVED,
    /**
    * action Undefined
    */
    ACTION_UNDEFINED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ChatMessageActions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
