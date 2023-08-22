package com.microsoft.graph.directory;

import com.microsoft.graph.directory.administrativeunits.AdministrativeUnitsRequestBuilder;
import com.microsoft.graph.directory.attributesets.AttributeSetsRequestBuilder;
import com.microsoft.graph.directory.customsecurityattributedefinitions.CustomSecurityAttributeDefinitionsRequestBuilder;
import com.microsoft.graph.directory.deleteditems.DeletedItemsRequestBuilder;
import com.microsoft.graph.directory.federationconfigurations.FederationConfigurationsRequestBuilder;
import com.microsoft.graph.directory.onpremisessynchronization.OnPremisesSynchronizationRequestBuilder;
import com.microsoft.graph.models.Directory;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the directory singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the administrativeUnits property of the microsoft.graph.directory entity.
     */
    @jakarta.annotation.Nonnull
    public AdministrativeUnitsRequestBuilder administrativeUnits() {
        return new AdministrativeUnitsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the attributeSets property of the microsoft.graph.directory entity.
     */
    @jakarta.annotation.Nonnull
    public AttributeSetsRequestBuilder attributeSets() {
        return new AttributeSetsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the customSecurityAttributeDefinitions property of the microsoft.graph.directory entity.
     */
    @jakarta.annotation.Nonnull
    public CustomSecurityAttributeDefinitionsRequestBuilder customSecurityAttributeDefinitions() {
        return new CustomSecurityAttributeDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deletedItems property of the microsoft.graph.directory entity.
     */
    @jakarta.annotation.Nonnull
    public DeletedItemsRequestBuilder deletedItems() {
        return new DeletedItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the federationConfigurations property of the microsoft.graph.directory entity.
     */
    @jakarta.annotation.Nonnull
    public FederationConfigurationsRequestBuilder federationConfigurations() {
        return new FederationConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onPremisesSynchronization property of the microsoft.graph.directory entity.
     */
    @jakarta.annotation.Nonnull
    public OnPremisesSynchronizationRequestBuilder onPremisesSynchronization() {
        return new OnPremisesSynchronizationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new DirectoryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directory{?%24select,%24expand}", rawUrl);
    }
    /**
     * Get directory
     * @return a CompletableFuture of directory
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> get() {
        return get(null);
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directory
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update directory
     * @param body The request body
     * @return a CompletableFuture of directory
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> patch(@jakarta.annotation.Nonnull final Directory body) {
        return patch(body, null);
    }
    /**
     * Update directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directory
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Directory> patch(@jakarta.annotation.Nonnull final Directory body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, Directory::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Get directory
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get directory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update directory
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Directory body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update directory
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Directory body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get directory
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
