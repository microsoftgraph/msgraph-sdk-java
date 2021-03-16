// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Registry Value Type.
*/
public enum RegistryValueType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * binary
    */
    BINARY,
    /**
    * dword
    */
    DWORD,
    /**
    * dword Little Endian
    */
    DWORD_LITTLE_ENDIAN,
    /**
    * dword Big Endian
    */
    DWORD_BIG_ENDIAN,
    /**
    * expand Sz
    */
    EXPAND_SZ,
    /**
    * link
    */
    LINK,
    /**
    * multi Sz
    */
    MULTI_SZ,
    /**
    * none
    */
    NONE,
    /**
    * qword
    */
    QWORD,
    /**
    * qwordlittle Endian
    */
    QWORDLITTLE_ENDIAN,
    /**
    * sz
    */
    SZ,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RegistryValueType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
