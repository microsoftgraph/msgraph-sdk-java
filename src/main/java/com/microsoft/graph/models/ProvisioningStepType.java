// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Provisioning Step Type.
*/
public enum ProvisioningStepType
{
    /**
    * import
    */
    IMPORT,
    /**
    * scoping
    */
    SCOPING,
    /**
    * matching
    */
    MATCHING,
    /**
    * processing
    */
    PROCESSING,
    /**
    * reference Resolution
    */
    REFERENCE_RESOLUTION,
    /**
    * export
    */
    EXPORT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ProvisioningStepType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
