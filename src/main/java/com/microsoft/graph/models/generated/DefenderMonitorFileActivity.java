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
 * The Enum Defender Monitor File Activity.
*/
public enum DefenderMonitorFileActivity
{
    /**
    * user Defined
    */
    USER_DEFINED,
    /**
    * disable
    */
    DISABLE,
    /**
    * monitor All Files
    */
    MONITOR_ALL_FILES,
    /**
    * monitor Incoming Files Only
    */
    MONITOR_INCOMING_FILES_ONLY,
    /**
    * monitor Outgoing Files Only
    */
    MONITOR_OUTGOING_FILES_ONLY,
    /**
    * For DefenderMonitorFileActivity values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
