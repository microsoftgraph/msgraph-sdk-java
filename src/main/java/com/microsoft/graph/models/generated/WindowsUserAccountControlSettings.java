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
 * The Enum Windows User Account Control Settings.
*/
public enum WindowsUserAccountControlSettings
{
    /**
    * user Defined
    */
    USER_DEFINED,
    /**
    * always Notify
    */
    ALWAYS_NOTIFY,
    /**
    * notify On App Changes
    */
    NOTIFY_ON_APP_CHANGES,
    /**
    * notify On App Changes Without Dimming
    */
    NOTIFY_ON_APP_CHANGES_WITHOUT_DIMMING,
    /**
    * never Notify
    */
    NEVER_NOTIFY,
    /**
    * For WindowsUserAccountControlSettings values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
