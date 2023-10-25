// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Service Source.
*/
public enum ServiceSource
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
    * microsoft Defender For Identity
    */
    MICROSOFT_DEFENDER_FOR_IDENTITY,
    /**
    * microsoft Defender For Cloud Apps
    */
    MICROSOFT_DEFENDER_FOR_CLOUD_APPS,
    /**
    * microsoft Defender For Office365
    */
    MICROSOFT_DEFENDER_FOR_OFFICE365,
    /**
    * microsoft365Defender
    */
    MICROSOFT365_DEFENDER,
    /**
    * azure Ad Identity Protection
    */
    AZURE_AD_IDENTITY_PROTECTION,
    /**
    * microsoft App Governance
    */
    MICROSOFT_APP_GOVERNANCE,
    /**
    * data Loss Prevention
    */
    DATA_LOSS_PREVENTION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * microsoft Defender For Cloud
    */
    MICROSOFT_DEFENDER_FOR_CLOUD,
    /**
    * microsoft Sentinel
    */
    MICROSOFT_SENTINEL,
    /**
    * For ServiceSource values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
