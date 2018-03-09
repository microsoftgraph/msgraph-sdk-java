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
 * The Enum Ios Updates Install Status.
*/
public enum IosUpdatesInstallStatus
{
    /**
    * success
    */
    SUCCESS,
    /**
    * available
    */
    AVAILABLE,
    /**
    * idle
    */
    IDLE,
    /**
    * downloading
    */
    DOWNLOADING,
    /**
    * download Failed
    */
    DOWNLOAD_FAILED,
    /**
    * download Requires Computer
    */
    DOWNLOAD_REQUIRES_COMPUTER,
    /**
    * download Insufficient Space
    */
    DOWNLOAD_INSUFFICIENT_SPACE,
    /**
    * download Insufficient Power
    */
    DOWNLOAD_INSUFFICIENT_POWER,
    /**
    * download Insufficient Network
    */
    DOWNLOAD_INSUFFICIENT_NETWORK,
    /**
    * installing
    */
    INSTALLING,
    /**
    * install Insufficient Space
    */
    INSTALL_INSUFFICIENT_SPACE,
    /**
    * install Insufficient Power
    */
    INSTALL_INSUFFICIENT_POWER,
    /**
    * install Phone Call In Progress
    */
    INSTALL_PHONE_CALL_IN_PROGRESS,
    /**
    * install Failed
    */
    INSTALL_FAILED,
    /**
    * not Supported Operation
    */
    NOT_SUPPORTED_OPERATION,
    /**
    * shared Device User Logged In Error
    */
    SHARED_DEVICE_USER_LOGGED_IN_ERROR,
    /**
    * For IosUpdatesInstallStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
