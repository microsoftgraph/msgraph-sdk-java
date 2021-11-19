// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Contact Relationship.
*/
public enum ContactRelationship
{
    /**
    * parent
    */
    PARENT,
    /**
    * relative
    */
    RELATIVE,
    /**
    * aide
    */
    AIDE,
    /**
    * doctor
    */
    DOCTOR,
    /**
    * guardian
    */
    GUARDIAN,
    /**
    * child
    */
    CHILD,
    /**
    * other
    */
    OTHER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ContactRelationship values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
