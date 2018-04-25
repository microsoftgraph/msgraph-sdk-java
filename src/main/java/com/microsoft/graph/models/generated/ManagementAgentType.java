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
