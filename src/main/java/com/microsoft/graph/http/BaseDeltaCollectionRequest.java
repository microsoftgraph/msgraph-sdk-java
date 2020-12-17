// ------------------------------------------------------------------------------
// Copyright (c) 2020 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.http;

import java.net.URL;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.ICollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

/**
 * A request against a collection bound function
 *
 * @param <T> the type of the object in the collection
 * @param <T2> the response collection type
 * @param <T3> the collection page type
 */
public abstract class BaseDeltaCollectionRequest<T, T2 extends ICollectionResponse<T>,
                                            T3 extends BaseCollectionPage<T, ? extends BaseRequestBuilder<T>>> extends BaseFunctionCollectionRequest<T, T2, T3> {


    /**
     * Create the collection request
     *
     * @param requestUrl          the URL to make the request against
     * @param client              the client which can issue the request
     * @param options             the options for this request
     * @param responseCollectionClass       the class for the response collection
     * @param collectionPageClass the class for the collection page
     * @param collectionRequestBuilderClass the class for the collection request builder
     */
    public BaseDeltaCollectionRequest(@Nonnull final String requestUrl,
                                 @Nonnull final IBaseClient client,
                                 @Nullable final List<? extends Option> options,
                                 @Nonnull final Class<T2> responseCollectionClass,
                                 @Nonnull final Class<T3> collectionPageClass,
                                 @Nonnull final Class<? extends BaseCollectionRequestBuilder<T, ? extends BaseRequestBuilder<T>, T2, T3, ? extends BaseCollectionRequest<T, T2, T3>>> collectionRequestBuilderClass) {
        super(requestUrl, client, options, responseCollectionClass, collectionPageClass, collectionRequestBuilderClass);
    }

    /**
     * Adds the delta token query string value for the request
     * @param value - The token
     * @param optionKey - the key to use for the query string parameter
     */
    protected void addDeltaTokenOption(@Nonnull final String value, @Nonnull final String optionKey) {
        addQueryOption(new QueryOption(optionKey, value));
    }

    /**
     * Matches 3 formats of delta links
     * ?$deltatoken=thetoken (most services)
     * ?token=thetoken (onedrive)
     * delta(token='thetoken') (formal OData function usage)
     */
    private static Pattern pattern = Pattern.compile("(?i)(?>\\$?delta)?token=['\"]?([\\w-\\.]+)");
    /**
     * Gets the delta token from the delta link provided by the previous response
     * @param deltaLink the delta link provided by the previous request
     * @return the delta token
     */
    @Nonnull
    protected String getDeltaTokenFromLink(@Nonnull final String deltaLink) {
        if(deltaLink != null) {
            final Matcher matcher = pattern.matcher(deltaLink);
            if(matcher.matches()) {
                return matcher.group(1);
            }
        }
        return  "";
    }
}
