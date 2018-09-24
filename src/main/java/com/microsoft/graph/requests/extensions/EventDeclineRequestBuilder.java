// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseEventDeclineRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Event Decline Request Builder.
 */
public class EventDeclineRequestBuilder extends BaseEventDeclineRequestBuilder implements IEventDeclineRequestBuilder {

    /**
     * The request builder for this EventDecline
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     * @param sendResponse the sendResponse
     */
    public EventDeclineRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String comment, final Boolean sendResponse) {
        super(requestUrl, client, requestOptions, comment, sendResponse);
    }
}
