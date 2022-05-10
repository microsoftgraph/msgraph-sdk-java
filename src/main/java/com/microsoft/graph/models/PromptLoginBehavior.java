// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Prompt Login Behavior.
*/
public enum PromptLoginBehavior
{
    /**
    * translate To Fresh Password Authentication
    */
    TRANSLATE_TO_FRESH_PASSWORD_AUTHENTICATION,
    /**
    * native Support
    */
    NATIVE_SUPPORT,
    /**
    * disabled
    */
    DISABLED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PromptLoginBehavior values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
