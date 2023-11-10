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
    * microsoft Defender For Cloud
    */
    MICROSOFT_DEFENDER_FOR_CLOUD,
    /**
    * microsoft Defender For Io T
    */
    MICROSOFT_DEFENDER_FOR_IO_T,
    /**
    * microsoft Defender For Servers
    */
    MICROSOFT_DEFENDER_FOR_SERVERS,
    /**
    * microsoft Defender For Storage
    */
    MICROSOFT_DEFENDER_FOR_STORAGE,
    /**
    * microsoft Defender For DNS
    */
    MICROSOFT_DEFENDER_FOR_DNS,
    /**
    * microsoft Defender For Databases
    */
    MICROSOFT_DEFENDER_FOR_DATABASES,
    /**
    * microsoft Defender For Containers
    */
    MICROSOFT_DEFENDER_FOR_CONTAINERS,
    /**
    * microsoft Defender For Network
    */
    MICROSOFT_DEFENDER_FOR_NETWORK,
    /**
    * microsoft Defender For App Service
    */
    MICROSOFT_DEFENDER_FOR_APP_SERVICE,
    /**
    * microsoft Defender For Key Vault
    */
    MICROSOFT_DEFENDER_FOR_KEY_VAULT,
    /**
    * microsoft Defender For Resource Manager
    */
    MICROSOFT_DEFENDER_FOR_RESOURCE_MANAGER,
    /**
    * microsoft Defender For Api Management
    */
    MICROSOFT_DEFENDER_FOR_API_MANAGEMENT,
    /**
    * nrt Alerts
    */
    NRT_ALERTS,
    /**
    * scheduled Alerts
    */
    SCHEDULED_ALERTS,
    /**
    * microsoft Defender Threat Intelligence Analytics
    */
    MICROSOFT_DEFENDER_THREAT_INTELLIGENCE_ANALYTICS,
    /**
    * built In Ml
    */
    BUILT_IN_ML,
    /**
    * microsoft Sentinel
    */
    MICROSOFT_SENTINEL,
    /**
    * For DetectionSource values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
