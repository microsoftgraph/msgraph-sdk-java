package com.microsoft.graph.users.item.datasecurityandgovernance.sensitivitylabels;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SensitivityLabel;
import com.microsoft.graph.models.SensitivityLabelCollectionResponse;
import com.microsoft.graph.users.item.datasecurityandgovernance.sensitivitylabels.computeinheritancewithlabelidswithlocalewithcontentformats.ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder;
import com.microsoft.graph.users.item.datasecurityandgovernance.sensitivitylabels.computerightsandinheritance.ComputeRightsAndInheritanceRequestBuilder;
import com.microsoft.graph.users.item.datasecurityandgovernance.sensitivitylabels.count.CountRequestBuilder;
import com.microsoft.graph.users.item.datasecurityandgovernance.sensitivitylabels.item.SensitivityLabelItemRequestBuilder;
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
 * Provides operations to manage the sensitivityLabels property of the microsoft.graph.dataSecurityAndGovernance entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensitivityLabelsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the computeRightsAndInheritance method.
     * @return a {@link ComputeRightsAndInheritanceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComputeRightsAndInheritanceRequestBuilder computeRightsAndInheritance() {
        return new ComputeRightsAndInheritanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sensitivityLabels property of the microsoft.graph.dataSecurityAndGovernance entity.
     * @param sensitivityLabelId The unique identifier of sensitivityLabel
     * @return a {@link SensitivityLabelItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SensitivityLabelItemRequestBuilder bySensitivityLabelId(@jakarta.annotation.Nonnull final String sensitivityLabelId) {
        Objects.requireNonNull(sensitivityLabelId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sensitivityLabel%2Did", sensitivityLabelId);
        return new SensitivityLabelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the computeInheritance method.
     * @param contentFormats Usage: contentFormats={contentFormats}
     * @param labelIds Usage: labelIds={labelIds}
     * @param locale Usage: locale=&apos;{locale}&apos;
     * @return a {@link ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder computeInheritanceWithLabelIdsWithLocaleWithContentFormats(@jakarta.annotation.Nonnull final String contentFormats, @jakarta.annotation.Nonnull final String labelIds, @jakarta.annotation.Nonnull final String locale) {
        Objects.requireNonNull(contentFormats);
        Objects.requireNonNull(labelIds);
        Objects.requireNonNull(locale);
        return new ComputeInheritanceWithLabelIdsWithLocaleWithContentFormatsRequestBuilder(pathParameters, requestAdapter, contentFormats, labelIds, locale);
    }
    /**
     * Instantiates a new {@link SensitivityLabelsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SensitivityLabelsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/dataSecurityAndGovernance/sensitivityLabels{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link SensitivityLabelsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SensitivityLabelsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/dataSecurityAndGovernance/sensitivityLabels{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * Get sensitivityLabels from users
     * @return a {@link SensitivityLabelCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SensitivityLabelCollectionResponse get() {
        return get(null);
    }
    /**
     * Get sensitivityLabels from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SensitivityLabelCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SensitivityLabelCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SensitivityLabelCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Create new navigation property to sensitivityLabels for users
     * @param body The request body
     * @return a {@link SensitivityLabel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SensitivityLabel post(@jakarta.annotation.Nonnull final SensitivityLabel body) {
        return post(body, null);
    }
    /**
     * Create new navigation property to sensitivityLabels for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SensitivityLabel}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SensitivityLabel post(@jakarta.annotation.Nonnull final SensitivityLabel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SensitivityLabel::createFromDiscriminatorValue);
    }
    /**
     * Get sensitivityLabels from users
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get sensitivityLabels from users
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
     * Create new navigation property to sensitivityLabels for users
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SensitivityLabel body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create new navigation property to sensitivityLabels for users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SensitivityLabel body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link SensitivityLabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SensitivityLabelsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SensitivityLabelsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get sensitivityLabels from users
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
