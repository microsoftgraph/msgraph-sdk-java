// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Kubernetes Service Type.
*/
public enum KubernetesServiceType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * cluster IP
    */
    CLUSTER_IP,
    /**
    * external Name
    */
    EXTERNAL_NAME,
    /**
    * node Port
    */
    NODE_PORT,
    /**
    * load Balancer
    */
    LOAD_BALANCER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For KubernetesServiceType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
