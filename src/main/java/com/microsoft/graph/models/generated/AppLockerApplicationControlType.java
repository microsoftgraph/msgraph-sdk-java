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
 * The Enum App Locker Application Control Type.
*/
public enum AppLockerApplicationControlType
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * enforce Components And Store Apps
    */
    ENFORCE_COMPONENTS_AND_STORE_APPS,
    /**
    * audit Components And Store Apps
    */
    AUDIT_COMPONENTS_AND_STORE_APPS,
    /**
    * enforce Components Store Apps And Smartlocker
    */
    ENFORCE_COMPONENTS_STORE_APPS_AND_SMARTLOCKER,
    /**
    * audit Components Store Apps And Smartlocker
    */
    AUDIT_COMPONENTS_STORE_APPS_AND_SMARTLOCKER,
    /**
    * For AppLockerApplicationControlType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
