// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseUserSendMailRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Send Mail Request Builder.
 */
public class UserSendMailRequestBuilder extends BaseUserSendMailRequestBuilder implements IUserSendMailRequestBuilder {

    /**
     * The request builder for this UserSendMail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param message the message
     * @param saveToSentItems the saveToSentItems
     */
    public UserSendMailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Message message, final Boolean saveToSentItems) {
        super(requestUrl, client, requestOptions, message, saveToSentItems);
    }
}
