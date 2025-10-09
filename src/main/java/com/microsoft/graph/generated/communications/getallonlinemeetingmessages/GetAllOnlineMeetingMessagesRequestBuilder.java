package com.microsoft.graph.communications.getallonlinemeetingmessages;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to call the getAllOnlineMeetingMessages method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAllOnlineMeetingMessagesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetAllOnlineMeetingMessagesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAllOnlineMeetingMessagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/getAllOnlineMeetingMessages(){?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetAllOnlineMeetingMessagesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAllOnlineMeetingMessagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/communications/getAllOnlineMeetingMessages(){?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get all Teams question and answer (Q&amp;A) conversation messages in a tenant. This function returns a snapshot of all Q&amp;A activity in JSON format. The export includes:- The original question or discussion text- The user who posted the message- All replies and responders- Vote counts- Moderation status (pending or dismissed)- Private replies- The meeting ID and organizer ID that are used for mapping to meeting metadata.
     * @return a {@link GetAllOnlineMeetingMessagesGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudcommunications-getallonlinemeetingmessages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetAllOnlineMeetingMessagesGetResponse get() {
        return get(null);
    }
    /**
     * Get all Teams question and answer (Q&amp;A) conversation messages in a tenant. This function returns a snapshot of all Q&amp;A activity in JSON format. The export includes:- The original question or discussion text- The user who posted the message- All replies and responders- Vote counts- Moderation status (pending or dismissed)- Private replies- The meeting ID and organizer ID that are used for mapping to meeting metadata.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetAllOnlineMeetingMessagesGetResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/cloudcommunications-getallonlinemeetingmessages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public GetAllOnlineMeetingMessagesGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetAllOnlineMeetingMessagesGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Get all Teams question and answer (Q&amp;A) conversation messages in a tenant. This function returns a snapshot of all Q&amp;A activity in JSON format. The export includes:- The original question or discussion text- The user who posted the message- All replies and responders- Vote counts- Moderation status (pending or dismissed)- Private replies- The meeting ID and organizer ID that are used for mapping to meeting metadata.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get all Teams question and answer (Q&amp;A) conversation messages in a tenant. This function returns a snapshot of all Q&amp;A activity in JSON format. The export includes:- The original question or discussion text- The user who posted the message- All replies and responders- Vote counts- Moderation status (pending or dismissed)- Private replies- The meeting ID and organizer ID that are used for mapping to meeting metadata.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetAllOnlineMeetingMessagesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAllOnlineMeetingMessagesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetAllOnlineMeetingMessagesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get all Teams question and answer (Q&amp;A) conversation messages in a tenant. This function returns a snapshot of all Q&amp;A activity in JSON format. The export includes:- The original question or discussion text- The user who posted the message- All replies and responders- Vote counts- Moderation status (pending or dismissed)- Private replies- The meeting ID and organizer ID that are used for mapping to meeting metadata.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
