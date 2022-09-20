// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum X509Certificate Authentication Mode.
*/
public enum X509CertificateAuthenticationMode
{
    /**
    * x509Certificate Single Factor
    */
    X509_CERTIFICATE_SINGLE_FACTOR,
    /**
    * x509Certificate Multi Factor
    */
    X509_CERTIFICATE_MULTI_FACTOR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For X509CertificateAuthenticationMode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
