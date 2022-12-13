// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Onboarding Status.
*/
public enum OnboardingStatus
{
    /**
    * insufficient Info
    */
    INSUFFICIENT_INFO,
    /**
    * onboarded
    */
    ONBOARDED,
    /**
    * can Be Onboarded
    */
    CAN_BE_ONBOARDED,
    /**
    * unsupported
    */
    UNSUPPORTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For OnboardingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
