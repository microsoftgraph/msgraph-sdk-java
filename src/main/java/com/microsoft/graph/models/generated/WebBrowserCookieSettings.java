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
 * The Enum Web Browser Cookie Settings.
*/
public enum WebBrowserCookieSettings
{
    /**
    * browser Default
    */
    BROWSER_DEFAULT,
    /**
    * block Always
    */
    BLOCK_ALWAYS,
    /**
    * allow Current Web Site
    */
    ALLOW_CURRENT_WEB_SITE,
    /**
    * allow From Websites Visited
    */
    ALLOW_FROM_WEBSITES_VISITED,
    /**
    * allow Always
    */
    ALLOW_ALWAYS,
    /**
    * For WebBrowserCookieSettings values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
