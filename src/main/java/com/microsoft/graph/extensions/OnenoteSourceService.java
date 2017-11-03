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
 * The Enum Onenote Source Service.
*/
public enum OnenoteSourceService
{
    /**
    * Unknown
    */
    UNKNOWN,
    /**
    * One Drive
    */
    ONEDRIVE,
    /**
    * One Drive For Business
    */
    ONEDRIVEFORBUSINESS,
    /**
    * On Prem One Drive For Business
    */
    ONPREMONEDRIVEFORBUSINESS,
    /**
    * For OnenoteSourceService values that were not expected from the service
    */
    unexpectedValue
}
