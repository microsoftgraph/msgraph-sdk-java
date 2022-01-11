// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Token Issuer Type.
*/
public enum TokenIssuerType
{
    /**
    * Azure AD
    */
    AZURE_AD,
    /**
    * ADFederation Services
    */
    AD_FEDERATION_SERVICES,
    /**
    * Unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * Azure ADBackup Auth
    */
    AZURE_AD_BACKUP_AUTH,
    /**
    * ADFederation Services MFAAdapter
    */
    AD_FEDERATION_SERVICES_MFA_ADAPTER,
    /**
    * NPSExtension
    */
    NPS_EXTENSION,
    /**
    * For TokenIssuerType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
