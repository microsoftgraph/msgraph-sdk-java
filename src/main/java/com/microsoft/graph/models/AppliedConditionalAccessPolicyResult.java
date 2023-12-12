// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Applied Conditional Access Policy Result.
*/
public enum AppliedConditionalAccessPolicyResult
{
    /**
    * success
    */
    SUCCESS,
    /**
    * failure
    */
    FAILURE,
    /**
    * not Applied
    */
    NOT_APPLIED,
    /**
    * not Enabled
    */
    NOT_ENABLED,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * report Only Success
    */
    REPORT_ONLY_SUCCESS,
    /**
    * report Only Failure
    */
    REPORT_ONLY_FAILURE,
    /**
    * report Only Not Applied
    */
    REPORT_ONLY_NOT_APPLIED,
    /**
    * report Only Interrupted
    */
    REPORT_ONLY_INTERRUPTED,
    /**
    * For AppliedConditionalAccessPolicyResult values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
