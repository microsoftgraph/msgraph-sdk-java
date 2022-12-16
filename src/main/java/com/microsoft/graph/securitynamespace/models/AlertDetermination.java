// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Alert Determination.
*/
public enum AlertDetermination
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * apt
    */
    APT,
    /**
    * malware
    */
    MALWARE,
    /**
    * security Personnel
    */
    SECURITY_PERSONNEL,
    /**
    * security Testing
    */
    SECURITY_TESTING,
    /**
    * unwanted Software
    */
    UNWANTED_SOFTWARE,
    /**
    * other
    */
    OTHER,
    /**
    * multi Staged Attack
    */
    MULTI_STAGED_ATTACK,
    /**
    * compromised Account
    */
    COMPROMISED_ACCOUNT,
    /**
    * phishing
    */
    PHISHING,
    /**
    * malicious User Activity
    */
    MALICIOUS_USER_ACTIVITY,
    /**
    * not Malicious
    */
    NOT_MALICIOUS,
    /**
    * not Enough Data To Validate
    */
    NOT_ENOUGH_DATA_TO_VALIDATE,
    /**
    * confirmed Activity
    */
    CONFIRMED_ACTIVITY,
    /**
    * line Of Business Application
    */
    LINE_OF_BUSINESS_APPLICATION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AlertDetermination values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
