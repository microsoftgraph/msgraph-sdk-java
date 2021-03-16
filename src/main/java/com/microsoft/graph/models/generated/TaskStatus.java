// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Task Status.
*/
public enum TaskStatus
{
    /**
    * not Started
    */
    NOT_STARTED,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * waiting On Others
    */
    WAITING_ON_OTHERS,
    /**
    * deferred
    */
    DEFERRED,
    /**
    * For TaskStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
