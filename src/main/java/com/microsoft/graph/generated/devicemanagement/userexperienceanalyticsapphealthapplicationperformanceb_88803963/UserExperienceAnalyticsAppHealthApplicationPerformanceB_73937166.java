package com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformanceb_88803963;

import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformanceb_88803963.count.CountRequestBuilder;
import com.microsoft.graph.devicemanagement.userexperienceanalyticsapphealthapplicationperformanceb_88803963.item.UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_e69cea9d;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_47d72806;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522;
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
 * Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property of the microsoft.graph.deviceManagement entity. Original name: UserExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetailsRequestBuilder
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAppHealthApplicationPerformanceB_73937166 extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails property of the microsoft.graph.deviceManagement entity.
     * @param userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsId The unique identifier of userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails
     * @return a {@link UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_e69cea9d}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_e69cea9d byUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsId(@jakarta.annotation.Nonnull final String userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsId) {
        Objects.requireNonNull(userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails%2Did", userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetailsId);
        return new UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_e69cea9d(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link UserExperienceAnalyticsAppHealthApplicationPerformanceB_73937166} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserExperienceAnalyticsAppHealthApplicationPerformanceB_73937166(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link UserExperienceAnalyticsAppHealthApplicationPerformanceB_73937166} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserExperienceAnalyticsAppHealthApplicationPerformanceB_73937166(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * User experience analytics appHealth Application Performance by App Version details
     * @return a {@link UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_47d72806}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_47d72806 get() {
        return get(null);
    }
    /**
     * User experience analytics appHealth Application Performance by App Version details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_47d72806}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_47d72806 get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_47d72806::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails for deviceManagement
     * @param body The request body
     * @return a {@link UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522 post(@jakarta.annotation.Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522 body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522 post(@jakarta.annotation.Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522 body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522::createFromDiscriminatorValue);
    }
    /**
     * User experience analytics appHealth Application Performance by App Version details
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * User experience analytics appHealth Application Performance by App Version details
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
     * Create new navigation property to userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails for deviceManagement
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522 body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails for deviceManagement
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVers_ba5b7522 body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UserExperienceAnalyticsAppHealthApplicationPerformanceB_73937166}
     */
    @jakarta.annotation.Nonnull
    public UserExperienceAnalyticsAppHealthApplicationPerformanceB_73937166 withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserExperienceAnalyticsAppHealthApplicationPerformanceB_73937166(rawUrl, requestAdapter);
    }
    /**
     * User experience analytics appHealth Application Performance by App Version details
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
