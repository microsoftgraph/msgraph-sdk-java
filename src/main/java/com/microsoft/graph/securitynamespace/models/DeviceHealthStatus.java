// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Device Health Status.
*/
public enum DeviceHealthStatus
{
    /**
    * active
    */
    ACTIVE,
    /**
    * inactive
    */
    INACTIVE,
    /**
    * impaired Communication
    */
    IMPAIRED_COMMUNICATION,
    /**
    * no Sensor Data
    */
    NO_SENSOR_DATA,
    /**
    * no Sensor Data Impaired Communication
    */
    NO_SENSOR_DATA_IMPAIRED_COMMUNICATION,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceHealthStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
