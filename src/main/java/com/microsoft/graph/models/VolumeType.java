// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Volume Type.
*/
public enum VolumeType
{
    /**
    * operating System Volume
    */
    OPERATING_SYSTEM_VOLUME,
    /**
    * fixed Data Volume
    */
    FIXED_DATA_VOLUME,
    /**
    * removable Data Volume
    */
    REMOVABLE_DATA_VOLUME,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For VolumeType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
