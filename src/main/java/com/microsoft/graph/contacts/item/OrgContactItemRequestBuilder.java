package com.microsoft.graph.contacts.item;

import com.microsoft.graph.contacts.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.contacts.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.contacts.item.directreports.DirectReportsRequestBuilder;
import com.microsoft.graph.contacts.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.contacts.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.contacts.item.manager.ManagerRequestBuilder;
import com.microsoft.graph.contacts.item.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.contacts.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.contacts.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OrgContact;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of orgContact entities.
 */
public class OrgContactItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the checkMemberGroups method.
     */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberObjects method.
     */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directReports property of the microsoft.graph.orgContact entity.
     */
    @javax.annotation.Nonnull
    public DirectReportsRequestBuilder directReports() {
        return new DirectReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberGroups method.
     */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberObjects method.
     */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the manager property of the microsoft.graph.orgContact entity.
     */
    @javax.annotation.Nonnull
    public ManagerRequestBuilder manager() {
        return new ManagerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.orgContact entity.
     */
    @javax.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.orgContact entity.
     */
    @javax.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new OrgContactItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrgContactItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/contacts/{orgContact%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new OrgContactItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public OrgContactItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/contacts/{orgContact%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete entity from contacts
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete entity from contacts
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the properties and relationships of an organizational contact.
     * @return a CompletableFuture of orgContact
     * @see <a href="https://docs.microsoft.com/graph/api/orgcontact-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrgContact::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrgContact> executionException = new java.util.concurrent.CompletableFuture<OrgContact>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the properties and relationships of an organizational contact.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of orgContact
     * @see <a href="https://docs.microsoft.com/graph/api/orgcontact-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrgContact::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrgContact> executionException = new java.util.concurrent.CompletableFuture<OrgContact>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update entity in contacts
     * @param body The request body
     * @return a CompletableFuture of orgContact
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> patch(@javax.annotation.Nonnull final OrgContact body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrgContact::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrgContact> executionException = new java.util.concurrent.CompletableFuture<OrgContact>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update entity in contacts
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of orgContact
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<OrgContact> patch(@javax.annotation.Nonnull final OrgContact body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, OrgContact::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<OrgContact> executionException = new java.util.concurrent.CompletableFuture<OrgContact>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete entity from contacts
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete entity from contacts
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the properties and relationships of an organizational contact.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of an organizational contact.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update entity in contacts
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OrgContact body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update entity in contacts
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final OrgContact body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the properties and relationships of an organizational contact.
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
