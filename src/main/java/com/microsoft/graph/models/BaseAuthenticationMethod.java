// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Base Authentication Method.
*/
public enum BaseAuthenticationMethod
{
    /**
    * password
    */
    PASSWORD,
    /**
    * voice
    */
    VOICE,
    /**
    * hardware Oath
    */
    HARDWARE_OATH,
    /**
    * software Oath
    */
    SOFTWARE_OATH,
    /**
    * sms
    */
    SMS,
    /**
    * fido2
    */
    FIDO2,
    /**
    * windows Hello For Business
    */
    WINDOWS_HELLO_FOR_BUSINESS,
    /**
    * microsoft Authenticator
    */
    MICROSOFT_AUTHENTICATOR,
    /**
    * temporary Access Pass
    */
    TEMPORARY_ACCESS_PASS,
    /**
    * email
    */
    EMAIL,
    /**
    * x509Certificate
    */
    X509_CERTIFICATE,
    /**
    * federation
    */
    FEDERATION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For BaseAuthenticationMethod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
