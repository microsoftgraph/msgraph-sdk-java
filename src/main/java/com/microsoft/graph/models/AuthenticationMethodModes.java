// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Method Modes.
*/
public enum AuthenticationMethodModes
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
    * microsoft Authenticator Push
    */
    MICROSOFT_AUTHENTICATOR_PUSH,
    /**
    * device Based Push
    */
    DEVICE_BASED_PUSH,
    /**
    * temporary Access Pass One Time
    */
    TEMPORARY_ACCESS_PASS_ONE_TIME,
    /**
    * temporary Access Pass Multi Use
    */
    TEMPORARY_ACCESS_PASS_MULTI_USE,
    /**
    * email
    */
    EMAIL,
    /**
    * x509Certificate Single Factor
    */
    X509_CERTIFICATE_SINGLE_FACTOR,
    /**
    * x509Certificate Multi Factor
    */
    X509_CERTIFICATE_MULTI_FACTOR,
    /**
    * federated Single Factor
    */
    FEDERATED_SINGLE_FACTOR,
    /**
    * federated Multi Factor
    */
    FEDERATED_MULTI_FACTOR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationMethodModes values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
