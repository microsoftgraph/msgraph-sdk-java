// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum OAuth App Scope.
*/
public enum OAuthAppScope
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * read Calendar
    */
    READ_CALENDAR,
    /**
    * read Contact
    */
    READ_CONTACT,
    /**
    * read Mail
    */
    READ_MAIL,
    /**
    * read All Chat
    */
    READ_ALL_CHAT,
    /**
    * read All File
    */
    READ_ALL_FILE,
    /**
    * read And Write Mail
    */
    READ_AND_WRITE_MAIL,
    /**
    * send Mail
    */
    SEND_MAIL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For OAuthAppScope values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
