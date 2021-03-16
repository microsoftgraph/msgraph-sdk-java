// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Bit Locker Encryption Method.
*/
public enum BitLockerEncryptionMethod
{
    /**
    * aes Cbc128
    */
    AES_CBC128,
    /**
    * aes Cbc256
    */
    AES_CBC256,
    /**
    * xts Aes128
    */
    XTS_AES128,
    /**
    * xts Aes256
    */
    XTS_AES256,
    /**
    * For BitLockerEncryptionMethod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
