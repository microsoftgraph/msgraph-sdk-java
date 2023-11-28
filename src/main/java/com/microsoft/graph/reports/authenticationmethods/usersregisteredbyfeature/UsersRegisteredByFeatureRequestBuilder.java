package com.microsoft.graph.reports.authenticationmethods.usersregisteredbyfeature;

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
public class UsersRegisteredByFeatureRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UsersRegisteredByFeatureRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRegisteredByFeatureRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/authenticationMethods/usersRegisteredByFeature()", pathParameters);
    }
    /**
     * Instantiates a new UsersRegisteredByFeatureRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UsersRegisteredByFeatureRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reports/authenticationMethods/usersRegisteredByFeature()", rawUrl);
    }
    /**
     * Invoke function usersRegisteredByFeature
     * @return a UserRegistrationFeatureSummary
     */
    @jakarta.annotation.Nullable
    public UserRegistrationFeatureSummary get() {
        return get(null);
    }
    /**
     * Invoke function usersRegisteredByFeature
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a UserRegistrationFeatureSummary
     */
    @jakarta.annotation.Nullable
    public UserRegistrationFeatureSummary get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, UserRegistrationFeatureSummary::createFromDiscriminatorValue);
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
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a UsersRegisteredByFeatureRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UsersRegisteredByFeatureRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UsersRegisteredByFeatureRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
