// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Federated Idp Mfa Behavior.
*/
public enum FederatedIdpMfaBehavior
{
    /**
    * accept If Mfa Done By Federated Idp
    */
    ACCEPT_IF_MFA_DONE_BY_FEDERATED_IDP,
    /**
    * enforce Mfa By Federated Idp
    */
    ENFORCE_MFA_BY_FEDERATED_IDP,
    /**
    * reject Mfa By Federated Idp
    */
    REJECT_MFA_BY_FEDERATED_IDP,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For FederatedIdpMfaBehavior values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
