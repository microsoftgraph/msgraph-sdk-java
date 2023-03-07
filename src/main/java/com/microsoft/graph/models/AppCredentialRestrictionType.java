// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum App Credential Restriction Type.
*/
public enum AppCredentialRestrictionType
{
    /**
    * password Addition
    */
    PASSWORD_ADDITION,
    /**
    * password Lifetime
    */
    PASSWORD_LIFETIME,
    /**
    * symmetric Key Addition
    */
    SYMMETRIC_KEY_ADDITION,
    /**
    * symmetric Key Lifetime
    */
    SYMMETRIC_KEY_LIFETIME,
    /**
    * custom Password Addition
    */
    CUSTOM_PASSWORD_ADDITION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AppCredentialRestrictionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
