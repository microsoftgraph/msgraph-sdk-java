// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Mutability.
*/
public enum Mutability
{
    /**
    * Read Write
    */
    READ_WRITE,
    /**
    * Read Only
    */
    READ_ONLY,
    /**
    * Immutable
    */
    IMMUTABLE,
    /**
    * Write Only
    */
    WRITE_ONLY,
    /**
    * For Mutability values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
