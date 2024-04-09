package com.microsoft.graph.serviceprincipals.item.synchronization.templates.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SynchronizationTemplate;
import com.microsoft.graph.serviceprincipals.item.synchronization.templates.item.schema.SchemaRequestBuilder;
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
 * Provides operations to manage the templates property of the microsoft.graph.synchronization entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SynchronizationTemplateItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the schema property of the microsoft.graph.synchronizationTemplate entity.
     * @return a {@link SchemaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link SynchronizationTemplateItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SynchronizationTemplateItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/synchronization/templates/{synchronizationTemplate%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link SynchronizationTemplateItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SynchronizationTemplateItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/servicePrincipals/{servicePrincipal%2Did}/synchronization/templates/{synchronizationTemplate%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property templates for servicePrincipals
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property templates for servicePrincipals
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Preconfigured synchronization settings for a particular application.
     * @return a {@link SynchronizationTemplate}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SynchronizationTemplate get() {
        return get(null);
    }
    /**
     * Preconfigured synchronization settings for a particular application.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SynchronizationTemplate}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public SynchronizationTemplate get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SynchronizationTemplate::createFromDiscriminatorValue);
    }
    /**
     * Update (override) the synchronization template associated with a given application.
     * @param body The request body
     * @return a {@link SynchronizationTemplate}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronizationtemplate-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationTemplate patch(@jakarta.annotation.Nonnull final SynchronizationTemplate body) {
        return patch(body, null);
    }
    /**
     * Update (override) the synchronization template associated with a given application.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SynchronizationTemplate}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/synchronization-synchronizationtemplate-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SynchronizationTemplate patch(@jakarta.annotation.Nonnull final SynchronizationTemplate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SynchronizationTemplate::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property templates for servicePrincipals
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property templates for servicePrincipals
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Preconfigured synchronization settings for a particular application.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Preconfigured synchronization settings for a particular application.
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
     * Update (override) the synchronization template associated with a given application.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SynchronizationTemplate body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update (override) the synchronization template associated with a given application.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SynchronizationTemplate body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SynchronizationTemplateItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SynchronizationTemplateItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SynchronizationTemplateItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Preconfigured synchronization settings for a particular application.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
