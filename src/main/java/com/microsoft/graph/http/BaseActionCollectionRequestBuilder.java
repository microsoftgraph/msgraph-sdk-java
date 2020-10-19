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

/**
 * The base method request builder class used for POST actions
 */
public class BaseActionCollectionRequestBuilder<T, T2 extends BaseRequestBuilder<T>,
                                                T3 extends ICollectionResponse<T>,
                                                T4 extends BaseCollectionPage<T>,
                                                T5 extends BaseCollectionRequest<T, T3, T4>> extends BaseCollectionRequestBuilder<T, T2, T3, T4, T5> {

    /**
     * The body parameters to add to this request
     */
    protected Map<String, Object> bodyParams = new HashMap<>();

    /**
     * Constructs a new {@link BaseActionCollectionRequestBuilder}
     *
     * @param requestUrl the URL for the request
     * @param client     the {@link IBaseClient} for handling requests
     * @param options    {@link List} of {@link Option}s to add to this request
     * @param requestBuilderClass the class for the request builder
     * @param responseCollectionClass the class for the response collection
     * @param collectionPageClass the class for the collection page
     * @param collectionRequestClass the class for the collection request
     */
    public BaseActionCollectionRequestBuilder(
            final String requestUrl,
            final IBaseClient client,
            final List<? extends Option> options,
            final Class<T2> requestBuilderClass,
            final Class<T3> responseCollectionClass,
            final Class<T4> collectionPageClass,
            final Class<T5> collectionRequestClass
    ) {
        super(requestUrl, client, options, requestBuilderClass, responseCollectionClass, collectionPageClass, collectionRequestClass);
    }

    /**
     * Checks if the parameter map contains a object accessible by the supplied key
     *
     * @param name the key used to access the stored body parameter
     * @return true, if {@link BaseActionCollectionRequestBuilder#bodyParams} contains the key, otherwise false
     */
    protected boolean hasParameter(final String name) {
        return bodyParams.containsKey(name);
    }

    /**
     * Gets the requested parameter if present, otherwise null
     *
     * @param name the named object to retrieve
     * @param <T1>  the type to which this object should be cast
     * @return the stored instance of T, otherwise null
     */
    @SuppressWarnings("unchecked")
    protected <T1> T1 getParameter(final String name) {
        return (T1) bodyParams.get(name);
    }
}
