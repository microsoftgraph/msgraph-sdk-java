// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Risk Detail.
*/
public enum RiskDetail
{
    /**
    * none
    */
    NONE,
    /**
    * admin Generated Temporary Password
    */
    ADMIN_GENERATED_TEMPORARY_PASSWORD,
    /**
    * user Performed Secured Password Change
    */
    USER_PERFORMED_SECURED_PASSWORD_CHANGE,
    /**
    * user Performed Secured Password Reset
    */
    USER_PERFORMED_SECURED_PASSWORD_RESET,
    /**
    * admin Confirmed Signin Safe
    */
    ADMIN_CONFIRMED_SIGNIN_SAFE,
    /**
    * ai Confirmed Signin Safe
    */
    AI_CONFIRMED_SIGNIN_SAFE,
    /**
    * user Passed MFADriven By Risk Based Policy
    */
    USER_PASSED_MFA_DRIVEN_BY_RISK_BASED_POLICY,
    /**
    * admin Dismissed All Risk For User
    */
    ADMIN_DISMISSED_ALL_RISK_FOR_USER,
    /**
    * admin Confirmed Signin Compromised
    */
    ADMIN_CONFIRMED_SIGNIN_COMPROMISED,
    /**
    * hidden
    */
    HIDDEN,
    /**
    * admin Confirmed User Compromised
    */
    ADMIN_CONFIRMED_USER_COMPROMISED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RiskDetail values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
