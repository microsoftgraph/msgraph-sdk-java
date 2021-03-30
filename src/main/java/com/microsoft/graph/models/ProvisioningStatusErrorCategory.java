// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Provisioning Status Error Category.
*/
public enum ProvisioningStatusErrorCategory
{
    /**
    * failure
    */
    FAILURE,
    /**
    * non Service Failure
    */
    NON_SERVICE_FAILURE,
    /**
    * success
    */
    SUCCESS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ProvisioningStatusErrorCategory values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
