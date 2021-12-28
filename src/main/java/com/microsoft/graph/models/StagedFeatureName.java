// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Staged Feature Name.
*/
public enum StagedFeatureName
{
    /**
    * passthrough Authentication
    */
    PASSTHROUGH_AUTHENTICATION,
    /**
    * seamless Sso
    */
    SEAMLESS_SSO,
    /**
    * password Hash Sync
    */
    PASSWORD_HASH_SYNC,
    /**
    * email As Alternate Id
    */
    EMAIL_AS_ALTERNATE_ID,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * certificate Based Authentication
    */
    CERTIFICATE_BASED_AUTHENTICATION,
    /**
    * For StagedFeatureName values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
