// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum User Default Authentication Method.
*/
public enum UserDefaultAuthenticationMethod
{
    /**
    * push
    */
    PUSH,
    /**
    * oath
    */
    OATH,
    /**
    * voice Mobile
    */
    VOICE_MOBILE,
    /**
    * voice Alternate Mobile
    */
    VOICE_ALTERNATE_MOBILE,
    /**
    * voice Office
    */
    VOICE_OFFICE,
    /**
    * sms
    */
    SMS,
    /**
    * none
    */
    NONE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UserDefaultAuthenticationMethod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
