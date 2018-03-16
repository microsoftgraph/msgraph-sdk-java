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
 * The Enum Device Management Partner App Type.
*/
public enum DeviceManagementPartnerAppType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * single Tenant App
    */
    SINGLE_TENANT_APP,
    /**
    * multi Tenant App
    */
    MULTI_TENANT_APP,
    /**
    * For DeviceManagementPartnerAppType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
