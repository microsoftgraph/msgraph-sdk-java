// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Kubernetes Platform.
*/
public enum KubernetesPlatform
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * aks
    */
    AKS,
    /**
    * eks
    */
    EKS,
    /**
    * gke
    */
    GKE,
    /**
    * arc
    */
    ARC,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For KubernetesPlatform values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
