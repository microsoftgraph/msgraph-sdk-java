// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Custom Extension Callout Instance Status.
*/
public enum CustomExtensionCalloutInstanceStatus
{
    /**
    * callout Sent
    */
    CALLOUT_SENT,
    /**
    * callback Received
    */
    CALLBACK_RECEIVED,
    /**
    * callout Failed
    */
    CALLOUT_FAILED,
    /**
    * callback Timed Out
    */
    CALLBACK_TIMED_OUT,
    /**
    * waiting For Callback
    */
    WAITING_FOR_CALLBACK,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CustomExtensionCalloutInstanceStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
