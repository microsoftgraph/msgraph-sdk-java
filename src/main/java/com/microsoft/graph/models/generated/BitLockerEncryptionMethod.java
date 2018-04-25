// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

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
