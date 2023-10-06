// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Training Setting Type.
*/
public enum TrainingSettingType
{
    /**
    * microsoft Custom
    */
    MICROSOFT_CUSTOM,
    /**
    * microsoft Managed
    */
    MICROSOFT_MANAGED,
    /**
    * no Training
    */
    NO_TRAINING,
    /**
    * custom
    */
    CUSTOM,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TrainingSettingType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
