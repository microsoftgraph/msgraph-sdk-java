// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Training Availability Status.
*/
public enum TrainingAvailabilityStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * not Available
    */
    NOT_AVAILABLE,
    /**
    * available
    */
    AVAILABLE,
    /**
    * archive
    */
    ARCHIVE,
    /**
    * delete
    */
    DELETE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TrainingAvailabilityStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
