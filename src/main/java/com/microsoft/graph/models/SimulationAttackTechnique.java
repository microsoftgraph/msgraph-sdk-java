// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Simulation Attack Technique.
*/
public enum SimulationAttackTechnique
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * credential Harvesting
    */
    CREDENTIAL_HARVESTING,
    /**
    * attachment Malware
    */
    ATTACHMENT_MALWARE,
    /**
    * drive By Url
    */
    DRIVE_BY_URL,
    /**
    * link In Attachment
    */
    LINK_IN_ATTACHMENT,
    /**
    * link To Malware File
    */
    LINK_TO_MALWARE_FILE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SimulationAttackTechnique values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
