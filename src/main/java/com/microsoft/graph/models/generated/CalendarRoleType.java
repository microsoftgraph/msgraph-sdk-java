// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Calendar Role Type.
*/
public enum CalendarRoleType
{
    /**
    * none
    */
    NONE,
    /**
    * free Busy Read
    */
    FREE_BUSY_READ,
    /**
    * limited Read
    */
    LIMITED_READ,
    /**
    * read
    */
    READ,
    /**
    * write
    */
    WRITE,
    /**
    * delegate Without Private Event Access
    */
    DELEGATE_WITHOUT_PRIVATE_EVENT_ACCESS,
    /**
    * delegate With Private Event Access
    */
    DELEGATE_WITH_PRIVATE_EVENT_ACCESS,
    /**
    * custom
    */
    CUSTOM,
    /**
    * For CalendarRoleType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
