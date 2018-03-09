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
 * The Enum Windows Delivery Optimization Mode.
*/
public enum WindowsDeliveryOptimizationMode
{
    /**
    * user Defined
    */
    USER_DEFINED,
    /**
    * http Only
    */
    HTTP_ONLY,
    /**
    * http With Peering Nat
    */
    HTTP_WITH_PEERING_NAT,
    /**
    * http With Peering Private Group
    */
    HTTP_WITH_PEERING_PRIVATE_GROUP,
    /**
    * http With Internet Peering
    */
    HTTP_WITH_INTERNET_PEERING,
    /**
    * simple Download
    */
    SIMPLE_DOWNLOAD,
    /**
    * bypass Mode
    */
    BYPASS_MODE,
    /**
    * For WindowsDeliveryOptimizationMode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
