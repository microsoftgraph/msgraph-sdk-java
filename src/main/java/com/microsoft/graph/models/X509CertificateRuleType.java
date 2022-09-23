// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum X509Certificate Rule Type.
*/
public enum X509CertificateRuleType
{
    /**
    * issuer Subject
    */
    ISSUER_SUBJECT,
    /**
    * policy OID
    */
    POLICY_OID,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For X509CertificateRuleType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
