// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Service Health Origin.
*/
public enum ServiceHealthOrigin
{
    /**
    * microsoft
    */
    MICROSOFT,
    /**
    * third Party
    */
    THIRD_PARTY,
    /**
    * customer
    */
    CUSTOMER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ServiceHealthOrigin values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
