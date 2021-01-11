// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

/**
 * The base method request builder class used for POST actions
 */
public class BaseActionRequestBuilder<T> extends BaseRequestBuilder<T> {
    /**
     * Constructs a new {@link BaseActionRequestBuilder}
     *
     * @param requestUrl the URL for the request
     * @param client     the {@link IBaseClient} for handling requests
     * @param options    {@link List} of {@link Option}s to add to this request
     */
    public BaseActionRequestBuilder(
            @Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final List<? extends Option> options
    ) {
        super(requestUrl, client, options);
    }
}
