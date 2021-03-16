// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum File Hash Type.
*/
public enum FileHashType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * sha1
    */
    SHA1,
    /**
    * sha256
    */
    SHA256,
    /**
    * md5
    */
    MD5,
    /**
    * authenticode Hash256
    */
    AUTHENTICODE_HASH256,
    /**
    * ls Hash
    */
    LS_HASH,
    /**
    * ctph
    */
    CTPH,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For FileHashType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
