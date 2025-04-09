package com.microsoft.graph.reports.authenticationmethods;

import com.microsoft.graph.models.AuthenticationMethodsRoot;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.reports.authenticationmethods.userregistrationdetails.UserRegistrationDetailsRequestBuilder;
import com.microsoft.graph.reports.authenticationmethods.usersregisteredbyfeature.UsersRegisteredByFeatureRequestBuilder;
import com.microsoft.graph.reports.authenticationmethods.usersregisteredbyfeaturewithincludedusertypeswithincludeduserroles.UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder;
import com.microsoft.graph.reports.authenticationmethods.usersregisteredbymethod.UsersRegisteredByMethodRequestBuilder;
import com.microsoft.graph.reports.authenticationmethods.usersregisteredbymethodwithincludedusertypeswithincludeduserroles.UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder;
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
 * Provides operations to manage the authenticationMethods property of the microsoft.graph.reportRoot entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the userRegistrationDetails property of the microsoft.graph.authenticationMethodsRoot entity.
     * @return a {@link UserRegistrationDetailsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UserRegistrationDetailsRequestBuilder userRegistrationDetails() {
        return new UserRegistrationDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usersRegisteredByFeature method.
     * @return a {@link UsersRegisteredByFeatureRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByFeatureRequestBuilder usersRegisteredByFeature() {
        return new UsersRegisteredByFeatureRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usersRegisteredByMethod method.
     * @return a {@link UsersRegisteredByMethodRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByMethodRequestBuilder usersRegisteredByMethod() {
        return new UsersRegisteredByMethodRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link AuthenticationMethodsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationMethodsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/authenticationMethods{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link AuthenticationMethodsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthenticationMethodsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/authenticationMethods{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property authenticationMethods for reports
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property authenticationMethods for reports
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
     * Container for navigation properties for Microsoft Entra authentication methods resources.
     * @return a {@link AuthenticationMethodsRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsRoot get() {
        return get(null);
    }
    /**
     * Container for navigation properties for Microsoft Entra authentication methods resources.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuthenticationMethodsRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsRoot get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuthenticationMethodsRoot::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property authenticationMethods in reports
     * @param body The request body
     * @return a {@link AuthenticationMethodsRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsRoot patch(@jakarta.annotation.Nonnull final AuthenticationMethodsRoot body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property authenticationMethods in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AuthenticationMethodsRoot}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsRoot patch(@jakarta.annotation.Nonnull final AuthenticationMethodsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AuthenticationMethodsRoot::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property authenticationMethods for reports
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property authenticationMethods for reports
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        return requestInfo;
    }
    /**
     * Container for navigation properties for Microsoft Entra authentication methods resources.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Container for navigation properties for Microsoft Entra authentication methods resources.
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
     * Update the navigation property authenticationMethods in reports
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AuthenticationMethodsRoot body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property authenticationMethods in reports
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final AuthenticationMethodsRoot body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Provides operations to call the usersRegisteredByFeature method.
     * @param includedUserRoles Usage: includedUserRoles=&apos;{includedUserRoles}&apos;
     * @param includedUserTypes Usage: includedUserTypes=&apos;{includedUserTypes}&apos;
     * @return a {@link UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder usersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRoles(@jakarta.annotation.Nonnull final String includedUserRoles, @jakarta.annotation.Nonnull final String includedUserTypes) {
        Objects.requireNonNull(includedUserRoles);
        Objects.requireNonNull(includedUserTypes);
        return new UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(pathParameters, requestAdapter, includedUserRoles, includedUserTypes);
    }
    /**
     * Provides operations to call the usersRegisteredByMethod method.
     * @param includedUserRoles Usage: includedUserRoles=&apos;{includedUserRoles}&apos;
     * @param includedUserTypes Usage: includedUserTypes=&apos;{includedUserTypes}&apos;
     * @return a {@link UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder usersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRoles(@jakarta.annotation.Nonnull final String includedUserRoles, @jakarta.annotation.Nonnull final String includedUserTypes) {
        Objects.requireNonNull(includedUserRoles);
        Objects.requireNonNull(includedUserTypes);
        return new UsersRegisteredByMethodWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(pathParameters, requestAdapter, includedUserRoles, includedUserTypes);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link AuthenticationMethodsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AuthenticationMethodsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AuthenticationMethodsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Container for navigation properties for Microsoft Entra authentication methods resources.
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
