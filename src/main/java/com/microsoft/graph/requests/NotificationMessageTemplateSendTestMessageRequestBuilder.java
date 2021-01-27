// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.NotificationMessageTemplateSendTestMessageRequest;
import com.microsoft.graph.models.NotificationMessageTemplate;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Message Template Send Test Message Request Builder.
 */
public class NotificationMessageTemplateSendTestMessageRequestBuilder extends BaseActionRequestBuilder<NotificationMessageTemplate> {

    /**
     * The request builder for this NotificationMessageTemplateSendTestMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotificationMessageTemplateSendTestMessageRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the NotificationMessageTemplateSendTestMessageRequest
     *
     * @param requestOptions the options for the request
     * @return the NotificationMessageTemplateSendTestMessageRequest instance
     */
    @Nonnull
    public NotificationMessageTemplateSendTestMessageRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the NotificationMessageTemplateSendTestMessageRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the NotificationMessageTemplateSendTestMessageRequest instance
     */
    @Nonnull
    public NotificationMessageTemplateSendTestMessageRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        NotificationMessageTemplateSendTestMessageRequest request = new NotificationMessageTemplateSendTestMessageRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}