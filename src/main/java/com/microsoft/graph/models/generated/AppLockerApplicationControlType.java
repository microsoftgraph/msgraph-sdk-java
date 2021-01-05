// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


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
