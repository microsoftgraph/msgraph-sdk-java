// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Targeted Managed App Group Type.
*/
public enum TargetedManagedAppGroupType
{
    /**
    * selected Public Apps
    */
    SELECTED_PUBLIC_APPS,
    /**
    * all Core Microsoft Apps
    */
    ALL_CORE_MICROSOFT_APPS,
    /**
    * all Microsoft Apps
    */
    ALL_MICROSOFT_APPS,
    /**
    * all Apps
    */
    ALL_APPS,
    /**
    * For TargetedManagedAppGroupType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
