package com.microsoft.graph.reports.authenticationmethods.usersregisteredbyfeaturewithincludedusertypeswithincludeduserroles;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.UserRegistrationFeatureSummary;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the usersRegisteredByFeature method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder and sets the default values.
     * @param includedUserRoles Usage: includedUserRoles='{includedUserRoles}'
     * @param includedUserTypes Usage: includedUserTypes='{includedUserTypes}'
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String includedUserRoles, @jakarta.annotation.Nullable final String includedUserTypes) {
        super(requestAdapter, "{+baseurl}/reports/authenticationMethods/usersRegisteredByFeature(includedUserTypes='{includedUserTypes}',includedUserRoles='{includedUserRoles}')", pathParameters);
        this.pathParameters.put("includedUserRoles", includedUserRoles);
        this.pathParameters.put("includedUserTypes", includedUserTypes);
    }
    /**
     * Instantiates a new UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/authenticationMethods/usersRegisteredByFeature(includedUserTypes='{includedUserTypes}',includedUserRoles='{includedUserRoles}')", rawUrl);
    }
    /**
     * Invoke function usersRegisteredByFeature
     * @return a CompletableFuture of userRegistrationFeatureSummary
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserRegistrationFeatureSummary> get() {
        return get(null);
    }
    /**
     * Invoke function usersRegisteredByFeature
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userRegistrationFeatureSummary
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserRegistrationFeatureSummary> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UserRegistrationFeatureSummary::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Invoke function usersRegisteredByFeature
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function usersRegisteredByFeature
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
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a usersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UsersRegisteredByFeatureWithIncludedUserTypesWithIncludedUserRolesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
