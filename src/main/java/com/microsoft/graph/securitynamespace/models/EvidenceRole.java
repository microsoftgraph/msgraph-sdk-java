// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Evidence Role.
*/
public enum EvidenceRole
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * contextual
    */
    CONTEXTUAL,
    /**
    * scanned
    */
    SCANNED,
    /**
    * source
    */
    SOURCE,
    /**
    * destination
    */
    DESTINATION,
    /**
    * created
    */
    CREATED,
    /**
    * added
    */
    ADDED,
    /**
    * compromised
    */
    COMPROMISED,
    /**
    * edited
    */
    EDITED,
    /**
    * attacked
    */
    ATTACKED,
    /**
    * attacker
    */
    ATTACKER,
    /**
    * command And Control
    */
    COMMAND_AND_CONTROL,
    /**
    * loaded
    */
    LOADED,
    /**
    * suspicious
    */
    SUSPICIOUS,
    /**
    * policy Violator
    */
    POLICY_VIOLATOR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For EvidenceRole values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
