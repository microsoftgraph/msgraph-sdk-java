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
 * The Enum Onenote Patch Insert Position.
*/
public enum OnenotePatchInsertPosition
{
    /**
    * After
    */
    AFTER,
    /**
    * Before
    */
    BEFORE,
    /**
    * For OnenotePatchInsertPosition values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
