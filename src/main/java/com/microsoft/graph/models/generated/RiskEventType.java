// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Risk Event Type.
*/
public enum RiskEventType
{
    /**
    * unlikely Travel
    */
    UNLIKELY_TRAVEL,
    /**
    * anonymized IPAddress
    */
    ANONYMIZED_IP_ADDRESS,
    /**
    * malicious IPAddress
    */
    MALICIOUS_IP_ADDRESS,
    /**
    * unfamiliar Features
    */
    UNFAMILIAR_FEATURES,
    /**
    * malware Infected IPAddress
    */
    MALWARE_INFECTED_IP_ADDRESS,
    /**
    * suspicious IPAddress
    */
    SUSPICIOUS_IP_ADDRESS,
    /**
    * leaked Credentials
    */
    LEAKED_CREDENTIALS,
    /**
    * investigations Threat Intelligence
    */
    INVESTIGATIONS_THREAT_INTELLIGENCE,
    /**
    * generic
    */
    GENERIC,
    /**
    * admin Confirmed User Compromised
    */
    ADMIN_CONFIRMED_USER_COMPROMISED,
    /**
    * mcas Impossible Travel
    */
    MCAS_IMPOSSIBLE_TRAVEL,
    /**
    * mcas Suspicious Inbox Manipulation Rules
    */
    MCAS_SUSPICIOUS_INBOX_MANIPULATION_RULES,
    /**
    * investigations Threat Intelligence Signin Linked
    */
    INVESTIGATIONS_THREAT_INTELLIGENCE_SIGNIN_LINKED,
    /**
    * malicious IPAddress Valid Credentials Blocked IP
    */
    MALICIOUS_IP_ADDRESS_VALID_CREDENTIALS_BLOCKED_IP,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RiskEventType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
