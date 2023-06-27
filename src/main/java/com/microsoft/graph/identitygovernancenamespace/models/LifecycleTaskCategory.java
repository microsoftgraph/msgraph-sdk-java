// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;


/**
 * The Enum Lifecycle Task Category.
*/
public enum LifecycleTaskCategory
{
    /**
    * joiner
    */
    JOINER,
    /**
    * leaver
    */
    LEAVER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * mover
    */
    MOVER,
    /**
    * For LifecycleTaskCategory values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
