// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Send Dtmf Completion Reason.
*/
public enum SendDtmfCompletionReason
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * completed Successfully
    */
    COMPLETED_SUCCESSFULLY,
    /**
    * media Operation Canceled
    */
    MEDIA_OPERATION_CANCELED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SendDtmfCompletionReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
