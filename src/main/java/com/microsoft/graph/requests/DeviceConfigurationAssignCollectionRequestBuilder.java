// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DeviceConfigurationAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationAssignCollectionRequest;
import com.microsoft.graph.requests.DeviceConfigurationAssignCollectionResponse;
import com.microsoft.graph.models.DeviceConfigurationAssignParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Assign Collection Request Builder.
 */
public class DeviceConfigurationAssignCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<DeviceConfigurationAssignment, DeviceConfigurationAssignCollectionRequestBuilder, DeviceConfigurationAssignCollectionResponse, DeviceConfigurationAssignCollectionPage, DeviceConfigurationAssignCollectionRequest> {

    private DeviceConfigurationAssignParameterSet body;
    /**
     * The request builder for this collection of DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceConfigurationAssignCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceConfigurationAssignParameterSet parameters) {
        super(requestUrl, client, requestOptions, DeviceConfigurationAssignCollectionRequestBuilder.class, DeviceConfigurationAssignCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceConfigurationAssignCollectionRequest instance
     */
    @Override
    @Nonnull
    public DeviceConfigurationAssignCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceConfigurationAssignCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}