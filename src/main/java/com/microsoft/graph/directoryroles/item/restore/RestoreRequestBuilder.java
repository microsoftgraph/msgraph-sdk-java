package com.microsoft.graph.directoryroles.item.restore;

import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the restore method.
 */
public class RestoreRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new RestoreRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RestoreRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directoryRoles/{directoryRole%2Did}/restore", pathParameters);
    }
    /**
     * Instantiates a new RestoreRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RestoreRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directoryRoles/{directoryRole%2Did}/restore", rawUrl);
    }
    /**
     * Restore a recently deleted application, group, servicePrincipal, administrative unit, or user object from deleted items. If an item was accidentally deleted, you can fully restore the item. This is not applicable to security groups, which are deleted permanently. A recently deleted item will remain available for up to 30 days. After 30 days, the item is permanently deleted.
     * @return a CompletableFuture of directoryObject
     * @see <a href="https://docs.microsoft.com/graph/api/directory-deleteditems-restore?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryObject> post() {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DirectoryObject::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DirectoryObject> executionException = new java.util.concurrent.CompletableFuture<DirectoryObject>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Restore a recently deleted application, group, servicePrincipal, administrative unit, or user object from deleted items. If an item was accidentally deleted, you can fully restore the item. This is not applicable to security groups, which are deleted permanently. A recently deleted item will remain available for up to 30 days. After 30 days, the item is permanently deleted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of directoryObject
     * @see <a href="https://docs.microsoft.com/graph/api/directory-deleteditems-restore?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryObject> post(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, DirectoryObject::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<DirectoryObject> executionException = new java.util.concurrent.CompletableFuture<DirectoryObject>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Restore a recently deleted application, group, servicePrincipal, administrative unit, or user object from deleted items. If an item was accidentally deleted, you can fully restore the item. This is not applicable to security groups, which are deleted permanently. A recently deleted item will remain available for up to 30 days. After 30 days, the item is permanently deleted.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation() throws URISyntaxException {
        return toPostRequestInformation(null);
    }
    /**
     * Restore a recently deleted application, group, servicePrincipal, administrative unit, or user object from deleted items. If an item was accidentally deleted, you can fully restore the item. This is not applicable to security groups, which are deleted permanently. A recently deleted item will remain available for up to 30 days. After 30 days, the item is permanently deleted.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
