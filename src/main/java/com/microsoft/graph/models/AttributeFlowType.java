// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Attribute Flow Type.
*/
public enum AttributeFlowType
{
    /**
    * Always
    */
    ALWAYS,
    /**
    * Object Add Only
    */
    OBJECT_ADD_ONLY,
    /**
    * Multi Value Add Only
    */
    MULTI_VALUE_ADD_ONLY,
    /**
    * Value Add Only
    */
    VALUE_ADD_ONLY,
    /**
    * Attribute Add Only
    */
    ATTRIBUTE_ADD_ONLY,
    /**
    * For AttributeFlowType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
