// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Event Type.
*/
public enum EventType
{
    /**
    * single Instance
    */
    SINGLE_INSTANCE,
    /**
    * occurrence
    */
    OCCURRENCE,
    /**
    * exception
    */
    EXCEPTION,
    /**
    * series Master
    */
    SERIES_MASTER,
    /**
    * For EventType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
