package com.microsoft.graph.users.item.presence;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Presence;
import com.microsoft.graph.users.item.presence.clearpresence.ClearPresenceRequestBuilder;
import com.microsoft.graph.users.item.presence.clearuserpreferredpresence.ClearUserPreferredPresenceRequestBuilder;
import com.microsoft.graph.users.item.presence.setpresence.SetPresenceRequestBuilder;
import com.microsoft.graph.users.item.presence.setstatusmessage.SetStatusMessageRequestBuilder;
import com.microsoft.graph.users.item.presence.setuserpreferredpresence.SetUserPreferredPresenceRequestBuilder;
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
 * Provides operations to manage the presence property of the microsoft.graph.user entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PresenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the clearPresence method.
     */
    @jakarta.annotation.Nonnull
    public ClearPresenceRequestBuilder clearPresence() {
        return new ClearPresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the clearUserPreferredPresence method.
     */
    @jakarta.annotation.Nonnull
    public ClearUserPreferredPresenceRequestBuilder clearUserPreferredPresence() {
        return new ClearUserPreferredPresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setPresence method.
     */
    @jakarta.annotation.Nonnull
    public SetPresenceRequestBuilder setPresence() {
        return new SetPresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setStatusMessage method.
     */
    @jakarta.annotation.Nonnull
    public SetStatusMessageRequestBuilder setStatusMessage() {
        return new SetStatusMessageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the setUserPreferredPresence method.
     */
    @jakarta.annotation.Nonnull
    public SetUserPreferredPresenceRequestBuilder setUserPreferredPresence() {
        return new SetUserPreferredPresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PresenceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PresenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/presence{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new PresenceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PresenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/presence{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property presence for users
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property presence for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Set a presence status message for a user. An optional expiration date and time can be supplied.
     * @return a Presence
     * @see <a href="https://learn.microsoft.com/graph/api/presence-setstatusmessage?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Presence get() {
        return get(null);
    }
    /**
     * Set a presence status message for a user. An optional expiration date and time can be supplied.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Presence
     * @see <a href="https://learn.microsoft.com/graph/api/presence-setstatusmessage?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Presence get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Presence::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property presence in users
     * @param body The request body
     * @return a Presence
     */
    @jakarta.annotation.Nullable
    public Presence patch(@jakarta.annotation.Nonnull final Presence body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property presence in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Presence
     */
    @jakarta.annotation.Nullable
    public Presence patch(@jakarta.annotation.Nonnull final Presence body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Presence::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property presence for users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property presence for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Set a presence status message for a user. An optional expiration date and time can be supplied.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Set a presence status message for a user. An optional expiration date and time can be supplied.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property presence in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Presence body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property presence in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Presence body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a PresenceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PresenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PresenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Set a presence status message for a user. An optional expiration date and time can be supplied.
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
