package com.microsoft.graph.print;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Print;
import com.microsoft.graph.print.connectors.ConnectorsRequestBuilder;
import com.microsoft.graph.print.operations.OperationsRequestBuilder;
import com.microsoft.graph.print.printers.PrintersRequestBuilder;
import com.microsoft.graph.print.services.ServicesRequestBuilder;
import com.microsoft.graph.print.shares.SharesRequestBuilder;
import com.microsoft.graph.print.taskdefinitions.TaskDefinitionsRequestBuilder;
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
 * Provides operations to manage the print singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrintRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the connectors property of the microsoft.graph.print entity.
     * @return a {@link ConnectorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConnectorsRequestBuilder connectors() {
        return new ConnectorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the operations property of the microsoft.graph.print entity.
     * @return a {@link OperationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the printers property of the microsoft.graph.print entity.
     * @return a {@link PrintersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrintersRequestBuilder printers() {
        return new PrintersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the services property of the microsoft.graph.print entity.
     * @return a {@link ServicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServicesRequestBuilder services() {
        return new ServicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the shares property of the microsoft.graph.print entity.
     * @return a {@link SharesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SharesRequestBuilder shares() {
        return new SharesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the taskDefinitions property of the microsoft.graph.print entity.
     * @return a {@link TaskDefinitionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TaskDefinitionsRequestBuilder taskDefinitions() {
        return new TaskDefinitionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PrintRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrintRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link PrintRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrintRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/print{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get print
     * @return a {@link Print}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Print get() {
        return get(null);
    }
    /**
     * Get print
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Print}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Print get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Print::createFromDiscriminatorValue);
    }
    /**
     * Update print
     * @param body The request body
     * @return a {@link Print}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Print patch(@jakarta.annotation.Nonnull final Print body) {
        return patch(body, null);
    }
    /**
     * Update print
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Print}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Print patch(@jakarta.annotation.Nonnull final Print body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Print::createFromDiscriminatorValue);
    }
    /**
     * Get print
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get print
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
     * Update print
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Print body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update print
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Print body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a {@link PrintRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PrintRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrintRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get print
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
