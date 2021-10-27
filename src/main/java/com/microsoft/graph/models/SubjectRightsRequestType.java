// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Subject Rights Request Type.
*/
public enum SubjectRightsRequestType
{
    /**
    * export
    */
    EXPORT,
    /**
    * delete
    */
    DELETE,
    /**
    * access
    */
    ACCESS,
    /**
    * tag For Action
    */
    TAG_FOR_ACTION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SubjectRightsRequestType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
