package com.microsoft.graph.auditlogs;

import com.microsoft.graph.auditlogs.directoryaudits.DirectoryAuditsRequestBuilder;
import com.microsoft.graph.auditlogs.directoryaudits.item.DirectoryAuditItemRequestBuilder;
import com.microsoft.graph.auditlogs.provisioning.item.ProvisioningObjectSummaryItemRequestBuilder;
import com.microsoft.graph.auditlogs.provisioning.ProvisioningRequestBuilder;
import com.microsoft.graph.auditlogs.signins.item.SignInItemRequestBuilder;
import com.microsoft.graph.auditlogs.signins.SignInsRequestBuilder;
import com.microsoft.graph.models.AuditLogRoot;
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
/** Provides operations to manage the auditLogRoot singleton. */
public class AuditLogsRequestBuilder {
    /** Provides operations to manage the directoryAudits property of the microsoft.graph.auditLogRoot entity. */
    @javax.annotation.Nonnull
    public DirectoryAuditsRequestBuilder directoryAudits() {
        return new DirectoryAuditsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the provisioning property of the microsoft.graph.auditLogRoot entity. */
    @javax.annotation.Nonnull
    public ProvisioningRequestBuilder provisioning() {
        return new ProvisioningRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to manage the signIns property of the microsoft.graph.auditLogRoot entity. */
    @javax.annotation.Nonnull
    public SignInsRequestBuilder signIns() {
        return new SignInsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new AuditLogsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditLogsRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/auditLogs{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new AuditLogsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditLogsRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/auditLogs{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get auditLogs
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get auditLogs
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<AuditLogsRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final AuditLogsRequestBuilderGetRequestConfiguration requestConfig = new AuditLogsRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update auditLogs
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final AuditLogRoot body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update auditLogs
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final AuditLogRoot body, @javax.annotation.Nullable final java.util.function.Consumer<AuditLogsRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final AuditLogsRequestBuilderPatchRequestConfiguration requestConfig = new AuditLogsRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the directoryAudits property of the microsoft.graph.auditLogRoot entity.
     * @param id Unique identifier of the item
     * @return a DirectoryAuditItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryAuditItemRequestBuilder directoryAudits(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryAudit%2Did", id);
        return new DirectoryAuditItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get auditLogs
     * @return a CompletableFuture of auditLogRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AuditLogRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<AuditLogRoot>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get auditLogs
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of auditLogRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> get(@javax.annotation.Nullable final java.util.function.Consumer<AuditLogsRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AuditLogRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<AuditLogRoot>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update auditLogs
     * @param body 
     * @return a CompletableFuture of auditLogRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> patch(@javax.annotation.Nonnull final AuditLogRoot body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AuditLogRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<AuditLogRoot>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update auditLogs
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of auditLogRoot
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> patch(@javax.annotation.Nonnull final AuditLogRoot body, @javax.annotation.Nullable final java.util.function.Consumer<AuditLogsRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, AuditLogRoot::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<AuditLogRoot>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to manage the provisioning property of the microsoft.graph.auditLogRoot entity.
     * @param id Unique identifier of the item
     * @return a ProvisioningObjectSummaryItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProvisioningObjectSummaryItemRequestBuilder provisioning(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("provisioningObjectSummary%2Did", id);
        return new ProvisioningObjectSummaryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the signIns property of the microsoft.graph.auditLogRoot entity.
     * @param id Unique identifier of the item
     * @return a SignInItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SignInItemRequestBuilder signIns(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("signIn%2Did", id);
        return new SignInItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Get auditLogs */
    public class AuditLogsRequestBuilderGetQueryParameters {
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
    public class AuditLogsRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public AuditLogsRequestBuilderGetQueryParameters queryParameters = new AuditLogsRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new auditLogsRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public AuditLogsRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class AuditLogsRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new auditLogsRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public AuditLogsRequestBuilderPatchRequestConfiguration() {
        }
    }
}
