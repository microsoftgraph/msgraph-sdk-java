package com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduledactionsforrule.item;

import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduledactionsforrule.item.scheduledactionconfigurations.item.DeviceComplianceActionItemItemRequestBuilder;
import com.microsoft.graph.devicemanagement.devicecompliancepolicies.item.scheduledactionsforrule.item.scheduledactionconfigurations.ScheduledActionConfigurationsRequestBuilder;
import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the scheduledActionsForRule property of the microsoft.graph.deviceCompliancePolicy entity. */
public class DeviceComplianceScheduledActionForRuleItemRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The scheduledActionConfigurations property */
    @javax.annotation.Nonnull
    public ScheduledActionConfigurationsRequestBuilder scheduledActionConfigurations() {
        return new ScheduledActionConfigurationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new DeviceComplianceScheduledActionForRuleItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceScheduledActionForRuleItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicy%2Did}/scheduledActionsForRule/{deviceComplianceScheduledActionForRule%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DeviceComplianceScheduledActionForRuleItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceComplianceScheduledActionForRuleItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicy%2Did}/scheduledActionsForRule/{deviceComplianceScheduledActionForRule%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property scheduledActionsForRule for deviceManagement
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property scheduledActionsForRule for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceComplianceScheduledActionForRuleItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeviceComplianceScheduledActionForRuleItemRequestBuilderDeleteRequestConfiguration requestConfig = new DeviceComplianceScheduledActionForRuleItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * The list of scheduled action per rule for this compliance policy. This is a required property when creating any individual per-platform compliance policies.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * The list of scheduled action per rule for this compliance policy. This is a required property when creating any individual per-platform compliance policies.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeviceComplianceScheduledActionForRuleItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DeviceComplianceScheduledActionForRuleItemRequestBuilderGetRequestConfiguration requestConfig = new DeviceComplianceScheduledActionForRuleItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property scheduledActionsForRule in deviceManagement
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceComplianceScheduledActionForRule body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property scheduledActionsForRule in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DeviceComplianceScheduledActionForRule body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceComplianceScheduledActionForRuleItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DeviceComplianceScheduledActionForRuleItemRequestBuilderPatchRequestConfiguration requestConfig = new DeviceComplianceScheduledActionForRuleItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property scheduledActionsForRule for deviceManagement
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete navigation property scheduledActionsForRule for deviceManagement
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeviceComplianceScheduledActionForRuleItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The list of scheduled action per rule for this compliance policy. This is a required property when creating any individual per-platform compliance policies.
     * @return a CompletableFuture of deviceComplianceScheduledActionForRule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScheduledActionForRule> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceComplianceScheduledActionForRule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceComplianceScheduledActionForRule>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * The list of scheduled action per rule for this compliance policy. This is a required property when creating any individual per-platform compliance policies.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceComplianceScheduledActionForRule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScheduledActionForRule> get(@javax.annotation.Nullable final java.util.function.Consumer<DeviceComplianceScheduledActionForRuleItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceComplianceScheduledActionForRule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceComplianceScheduledActionForRule>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property scheduledActionsForRule in deviceManagement
     * @param body 
     * @return a CompletableFuture of deviceComplianceScheduledActionForRule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScheduledActionForRule> patch(@javax.annotation.Nonnull final DeviceComplianceScheduledActionForRule body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceComplianceScheduledActionForRule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceComplianceScheduledActionForRule>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property scheduledActionsForRule in deviceManagement
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of deviceComplianceScheduledActionForRule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DeviceComplianceScheduledActionForRule> patch(@javax.annotation.Nonnull final DeviceComplianceScheduledActionForRule body, @javax.annotation.Nullable final java.util.function.Consumer<DeviceComplianceScheduledActionForRuleItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DeviceComplianceScheduledActionForRule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DeviceComplianceScheduledActionForRule>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.deviceManagement.deviceCompliancePolicies.item.scheduledActionsForRule.item.scheduledActionConfigurations.item collection
     * @param id Unique identifier of the item
     * @return a DeviceComplianceActionItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceComplianceActionItemItemRequestBuilder scheduledActionConfigurations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceComplianceActionItem%2Did", id);
        return new DeviceComplianceActionItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceComplianceScheduledActionForRuleItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeviceComplianceScheduledActionForRuleItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeviceComplianceScheduledActionForRuleItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** The list of scheduled action per rule for this compliance policy. This is a required property when creating any individual per-platform compliance policies. */
    public class DeviceComplianceScheduledActionForRuleItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceComplianceScheduledActionForRuleItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DeviceComplianceScheduledActionForRuleItemRequestBuilderGetQueryParameters queryParameters = new DeviceComplianceScheduledActionForRuleItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new DeviceComplianceScheduledActionForRuleItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeviceComplianceScheduledActionForRuleItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeviceComplianceScheduledActionForRuleItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeviceComplianceScheduledActionForRuleItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeviceComplianceScheduledActionForRuleItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
