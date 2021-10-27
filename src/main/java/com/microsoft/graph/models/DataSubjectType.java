// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Data Subject Type.
*/
public enum DataSubjectType
{
    /**
    * customer
    */
    CUSTOMER,
    /**
    * current Employee
    */
    CURRENT_EMPLOYEE,
    /**
    * former Employee
    */
    FORMER_EMPLOYEE,
    /**
    * prospective Employee
    */
    PROSPECTIVE_EMPLOYEE,
    /**
    * student
    */
    STUDENT,
    /**
    * teacher
    */
    TEACHER,
    /**
    * faculty
    */
    FACULTY,
    /**
    * other
    */
    OTHER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DataSubjectType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
