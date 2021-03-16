// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Managed App Data Encryption Type.
*/
public enum ManagedAppDataEncryptionType
{
    /**
    * use Device Settings
    */
    USE_DEVICE_SETTINGS,
    /**
    * after Device Restart
    */
    AFTER_DEVICE_RESTART,
    /**
    * when Device Locked Except Open Files
    */
    WHEN_DEVICE_LOCKED_EXCEPT_OPEN_FILES,
    /**
    * when Device Locked
    */
    WHEN_DEVICE_LOCKED,
    /**
    * For ManagedAppDataEncryptionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
