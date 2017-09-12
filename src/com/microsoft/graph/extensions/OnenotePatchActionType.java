// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

/**
 * The Enum Onenote Patch Action Type.
*/
public enum OnenotePatchActionType
{
    /**
    * Replace
    */
    Replace,
    /**
    * Append
    */
    Append,
    /**
    * Delete
    */
    Delete,
    /**
    * Insert
    */
    Insert,
    /**
    * Prepend
    */
    Prepend,
    /**
    * For OnenotePatchActionType values that were not expected from the service
    */
    unexpectedValue
}
