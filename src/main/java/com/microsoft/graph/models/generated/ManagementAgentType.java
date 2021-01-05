// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Management Agent Type.
*/
public enum ManagementAgentType
{
    /**
    * eas
    */
    EAS,
    /**
    * mdm
    */
    MDM,
    /**
    * eas Mdm
    */
    EAS_MDM,
    /**
    * intune Client
    */
    INTUNE_CLIENT,
    /**
    * eas Intune Client
    */
    EAS_INTUNE_CLIENT,
    /**
    * configuration Manager Client
    */
    CONFIGURATION_MANAGER_CLIENT,
    /**
    * configuration Manager Client Mdm
    */
    CONFIGURATION_MANAGER_CLIENT_MDM,
    /**
    * configuration Manager Client Mdm Eas
    */
    CONFIGURATION_MANAGER_CLIENT_MDM_EAS,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * jamf
    */
    JAMF,
    /**
    * google Cloud Device Policy Controller
    */
    GOOGLE_CLOUD_DEVICE_POLICY_CONTROLLER,
    /**
    * For ManagementAgentType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
