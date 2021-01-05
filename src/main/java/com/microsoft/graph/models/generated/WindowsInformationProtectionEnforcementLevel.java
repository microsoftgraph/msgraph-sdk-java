// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Windows Information Protection Enforcement Level.
*/
public enum WindowsInformationProtectionEnforcementLevel
{
    /**
    * no Protection
    */
    NO_PROTECTION,
    /**
    * encrypt And Audit Only
    */
    ENCRYPT_AND_AUDIT_ONLY,
    /**
    * encrypt Audit And Prompt
    */
    ENCRYPT_AUDIT_AND_PROMPT,
    /**
    * encrypt Audit And Block
    */
    ENCRYPT_AUDIT_AND_BLOCK,
    /**
    * For WindowsInformationProtectionEnforcementLevel values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
