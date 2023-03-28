// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Methods Policy Migration State.
*/
public enum AuthenticationMethodsPolicyMigrationState
{
    /**
    * pre Migration
    */
    PRE_MIGRATION,
    /**
    * migration In Progress
    */
    MIGRATION_IN_PROGRESS,
    /**
    * migration Complete
    */
    MIGRATION_COMPLETE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationMethodsPolicyMigrationState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
