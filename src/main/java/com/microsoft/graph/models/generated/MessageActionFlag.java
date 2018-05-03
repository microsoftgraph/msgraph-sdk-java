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
 * The Enum Message Action Flag.
*/
public enum MessageActionFlag
{
    /**
    * any
    */
    ANY,
    /**
    * call
    */
    CALL,
    /**
    * do Not Forward
    */
    DO_NOT_FORWARD,
    /**
    * follow Up
    */
    FOLLOW_UP,
    /**
    * fyi
    */
    FYI,
    /**
    * forward
    */
    FORWARD,
    /**
    * no Response Necessary
    */
    NO_RESPONSE_NECESSARY,
    /**
    * read
    */
    READ,
    /**
    * reply
    */
    REPLY,
    /**
    * reply To All
    */
    REPLY_TO_ALL,
    /**
    * review
    */
    REVIEW,
    /**
    * For MessageActionFlag values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
