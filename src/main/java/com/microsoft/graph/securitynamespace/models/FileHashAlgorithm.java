// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum File Hash Algorithm.
*/
public enum FileHashAlgorithm
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * md5
    */
    MD5,
    /**
    * sha1
    */
    SHA1,
    /**
    * sha256
    */
    SHA256,
    /**
    * sha256ac
    */
    SHA256AC,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For FileHashAlgorithm values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
