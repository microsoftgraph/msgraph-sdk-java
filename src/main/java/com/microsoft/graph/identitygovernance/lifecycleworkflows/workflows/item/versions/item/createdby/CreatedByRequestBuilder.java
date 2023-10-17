package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.item.createdby;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.item.createdby.mailboxsettings.MailboxSettingsRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.versions.item.createdby.serviceprovisioningerrors.ServiceProvisioningErrorsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.User;
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
 * Provides operations to manage the createdBy property of the microsoft.graph.identityGovernance.workflowBase entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreatedByRequestBuilder extends BaseRequestBuilder {
    /**
     * The mailboxSettings property
     */
    @jakarta.annotation.Nonnull
    public MailboxSettingsRequestBuilder mailboxSettings() {
        return new MailboxSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The serviceProvisioningErrors property
     */
    @jakarta.annotation.Nonnull
    public ServiceProvisioningErrorsRequestBuilder serviceProvisioningErrors() {
        return new ServiceProvisioningErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new CreatedByRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreatedByRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/versions/{workflowVersion%2DversionNumber}/createdBy{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new CreatedByRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreatedByRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/versions/{workflowVersion%2DversionNumber}/createdBy{?%24select,%24expand}", rawUrl);
    }
    /**
     * The user who created the workflow.
     * @return a CompletableFuture of User
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> get() {
        return get(null);
    }
    /**
     * The user who created the workflow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of User
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * The user who created the workflow.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * The user who created the workflow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a CreatedByRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public CreatedByRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreatedByRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * The user who created the workflow.
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
}
