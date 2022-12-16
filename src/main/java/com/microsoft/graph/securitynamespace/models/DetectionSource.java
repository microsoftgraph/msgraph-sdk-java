// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Detection Source.
*/
public enum DetectionSource
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * microsoft Defender For Endpoint
    */
    MICROSOFT_DEFENDER_FOR_ENDPOINT,
    /**
    * antivirus
    */
    ANTIVIRUS,
    /**
    * smart Screen
    */
    SMART_SCREEN,
    /**
    * custom Ti
    */
    CUSTOM_TI,
    /**
    * microsoft Defender For Office365
    */
    MICROSOFT_DEFENDER_FOR_OFFICE365,
    /**
    * automated Investigation
    */
    AUTOMATED_INVESTIGATION,
    /**
    * microsoft Threat Experts
    */
    MICROSOFT_THREAT_EXPERTS,
    /**
    * custom Detection
    */
    CUSTOM_DETECTION,
    /**
    * microsoft Defender For Identity
    */
    MICROSOFT_DEFENDER_FOR_IDENTITY,
    /**
    * cloud App Security
    */
    CLOUD_APP_SECURITY,
    /**
    * microsoft365Defender
    */
    MICROSOFT365_DEFENDER,
    /**
    * azure Ad Identity Protection
    */
    AZURE_AD_IDENTITY_PROTECTION,
    /**
    * manual
    */
    MANUAL,
    /**
    * microsoft Data Loss Prevention
    */
    MICROSOFT_DATA_LOSS_PREVENTION,
    /**
    * app Governance Policy
    */
    APP_GOVERNANCE_POLICY,
    /**
    * app Governance Detection
    */
    APP_GOVERNANCE_DETECTION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DetectionSource values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
