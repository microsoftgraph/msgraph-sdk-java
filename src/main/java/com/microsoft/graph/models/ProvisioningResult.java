// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Provisioning Result.
*/
public enum ProvisioningResult
{
    /**
    * success
    */
    SUCCESS,
    /**
    * failure
    */
    FAILURE,
    /**
    * skipped
    */
    SKIPPED,
    /**
    * warning
    */
    WARNING,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ProvisioningResult values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
