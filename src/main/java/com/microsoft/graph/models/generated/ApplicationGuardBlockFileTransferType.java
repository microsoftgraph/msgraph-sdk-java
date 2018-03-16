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
 * The Enum Application Guard Block File Transfer Type.
*/
public enum ApplicationGuardBlockFileTransferType
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * block Image And Text File
    */
    BLOCK_IMAGE_AND_TEXT_FILE,
    /**
    * block Image File
    */
    BLOCK_IMAGE_FILE,
    /**
    * block None
    */
    BLOCK_NONE,
    /**
    * block Text File
    */
    BLOCK_TEXT_FILE,
    /**
    * For ApplicationGuardBlockFileTransferType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
