package com.microsoft.graph.applications.item;

import com.microsoft.graph.applications.item.addkey.AddKeyRequestBuilder;
import com.microsoft.graph.applications.item.addpassword.AddPasswordRequestBuilder;
import com.microsoft.graph.applications.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.applications.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.applications.item.createdonbehalfof.CreatedOnBehalfOfRequestBuilder;
import com.microsoft.graph.applications.item.extensionproperties.ExtensionPropertiesRequestBuilder;
import com.microsoft.graph.applications.item.extensionproperties.item.ExtensionPropertyItemRequestBuilder;
import com.microsoft.graph.applications.item.federatedidentitycredentials.FederatedIdentityCredentialsRequestBuilder;
import com.microsoft.graph.applications.item.federatedidentitycredentials.item.FederatedIdentityCredentialItemRequestBuilder;
import com.microsoft.graph.applications.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.applications.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.applications.item.homerealmdiscoverypolicies.HomeRealmDiscoveryPoliciesRequestBuilder;
import com.microsoft.graph.applications.item.homerealmdiscoverypolicies.item.HomeRealmDiscoveryPolicyItemRequestBuilder;
import com.microsoft.graph.applications.item.logo.LogoRequestBuilder;
import com.microsoft.graph.applications.item.owners.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.applications.item.owners.OwnersRequestBuilder;
import com.microsoft.graph.applications.item.removekey.RemoveKeyRequestBuilder;
import com.microsoft.graph.applications.item.removepassword.RemovePasswordRequestBuilder;
import com.microsoft.graph.applications.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.applications.item.setverifiedpublisher.SetVerifiedPublisherRequestBuilder;
import com.microsoft.graph.applications.item.tokenissuancepolicies.item.TokenIssuancePolicyItemRequestBuilder;
import com.microsoft.graph.applications.item.tokenissuancepolicies.TokenIssuancePoliciesRequestBuilder;
import com.microsoft.graph.applications.item.tokenlifetimepolicies.item.TokenLifetimePolicyItemRequestBuilder;
import com.microsoft.graph.applications.item.tokenlifetimepolicies.TokenLifetimePoliciesRequestBuilder;
import com.microsoft.graph.applications.item.unsetverifiedpublisher.UnsetVerifiedPublisherRequestBuilder;
import com.microsoft.graph.models.Application;
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
/** Provides operations to manage the collection of application entities. */
public class ApplicationItemRequestBuilder {
    /** Provides operations to call the addKey method. */
    @javax.annotation.Nonnull
    public AddKeyRequestBuilder addKey() {
        return new AddKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the addPassword method. */
    @javax.annotation.Nonnull
    public AddPasswordRequestBuilder addPassword() {
        return new AddPasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the checkMemberGroups method. */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the checkMemberObjects method. */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the createdOnBehalfOf property of the microsoft.graph.application entity. */
    @javax.annotation.Nonnull
    public CreatedOnBehalfOfRequestBuilder createdOnBehalfOf() {
        return new CreatedOnBehalfOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the extensionProperties property of the microsoft.graph.application entity. */
    @javax.annotation.Nonnull
    public ExtensionPropertiesRequestBuilder extensionProperties() {
        return new ExtensionPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the federatedIdentityCredentials property of the microsoft.graph.application entity. */
    @javax.annotation.Nonnull
    public FederatedIdentityCredentialsRequestBuilder federatedIdentityCredentials() {
        return new FederatedIdentityCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMemberGroups method. */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMemberObjects method. */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the homeRealmDiscoveryPolicies property of the microsoft.graph.application entity. */
    @javax.annotation.Nonnull
    public HomeRealmDiscoveryPoliciesRequestBuilder homeRealmDiscoveryPolicies() {
        return new HomeRealmDiscoveryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the media for the application entity. */
    @javax.annotation.Nonnull
    public LogoRequestBuilder logo() {
        return new LogoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the owners property of the microsoft.graph.application entity. */
    @javax.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to call the removeKey method. */
    @javax.annotation.Nonnull
    public RemoveKeyRequestBuilder removeKey() {
        return new RemoveKeyRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the removePassword method. */
    @javax.annotation.Nonnull
    public RemovePasswordRequestBuilder removePassword() {
        return new RemovePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the restore method. */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the setVerifiedPublisher method. */
    @javax.annotation.Nonnull
    public SetVerifiedPublisherRequestBuilder setVerifiedPublisher() {
        return new SetVerifiedPublisherRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tokenIssuancePolicies property of the microsoft.graph.application entity. */
    @javax.annotation.Nonnull
    public TokenIssuancePoliciesRequestBuilder tokenIssuancePolicies() {
        return new TokenIssuancePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the tokenLifetimePolicies property of the microsoft.graph.application entity. */
    @javax.annotation.Nonnull
    public TokenLifetimePoliciesRequestBuilder tokenLifetimePolicies() {
        return new TokenLifetimePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the unsetVerifiedPublisher method. */
    @javax.annotation.Nonnull
    public UnsetVerifiedPublisherRequestBuilder unsetVerifiedPublisher() {
        return new UnsetVerifiedPublisherRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new ApplicationItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplicationItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/applications/{application%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ApplicationItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ApplicationItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/applications/{application%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete an application object. When deleted, apps are moved to a temporary container and can be restored within 30 days. After that time, they are permanently deleted.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete an application object. When deleted, apps are moved to a temporary container and can be restored within 30 days. After that time, they are permanently deleted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the properties and relationships of an application object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of an application object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the properties of an application object.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Application body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of an application object.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final Application body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete an application object. When deleted, apps are moved to a temporary container and can be restored within 30 days. After that time, they are permanently deleted.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete an application object. When deleted, apps are moved to a temporary container and can be restored within 30 days. After that time, they are permanently deleted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the extensionProperties property of the microsoft.graph.application entity.
     * @param id Unique identifier of the item
     * @return a ExtensionPropertyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExtensionPropertyItemRequestBuilder extensionProperties(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("extensionProperty%2Did", id);
        return new ExtensionPropertyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the federatedIdentityCredentials property of the microsoft.graph.application entity.
     * @param id Unique identifier of the item
     * @return a FederatedIdentityCredentialItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public FederatedIdentityCredentialItemRequestBuilder federatedIdentityCredentials(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("federatedIdentityCredential%2Did", id);
        return new FederatedIdentityCredentialItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get the properties and relationships of an application object.
     * @return a CompletableFuture of application
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Application> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Application::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Application> executionException = new java.util.concurrent.CompletableFuture<Application>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the properties and relationships of an application object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of application
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Application> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Application::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Application> executionException = new java.util.concurrent.CompletableFuture<Application>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the homeRealmDiscoveryPolicies property of the microsoft.graph.application entity.
     * @param id Unique identifier of the item
     * @return a HomeRealmDiscoveryPolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public HomeRealmDiscoveryPolicyItemRequestBuilder homeRealmDiscoveryPolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("homeRealmDiscoveryPolicy%2Did", id);
        return new HomeRealmDiscoveryPolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.applications.item.owners.item collection
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DirectoryObjectItemRequestBuilder owners(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the properties of an application object.
     * @param body 
     * @return a CompletableFuture of application
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Application> patch(@javax.annotation.Nonnull final Application body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Application::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Application> executionException = new java.util.concurrent.CompletableFuture<Application>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of an application object.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of application
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Application> patch(@javax.annotation.Nonnull final Application body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Application::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Application> executionException = new java.util.concurrent.CompletableFuture<Application>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.applications.item.tokenIssuancePolicies.item collection
     * @param id Unique identifier of the item
     * @return a TokenIssuancePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TokenIssuancePolicyItemRequestBuilder tokenIssuancePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenIssuancePolicy%2Did", id);
        return new TokenIssuancePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.applications.item.tokenLifetimePolicies.item collection
     * @param id Unique identifier of the item
     * @return a TokenLifetimePolicyItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TokenLifetimePolicyItemRequestBuilder tokenLifetimePolicies(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("tokenLifetimePolicy%2Did", id);
        return new TokenLifetimePolicyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /** Get the properties and relationships of an application object. */
    public class GetQueryParameters {
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
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
