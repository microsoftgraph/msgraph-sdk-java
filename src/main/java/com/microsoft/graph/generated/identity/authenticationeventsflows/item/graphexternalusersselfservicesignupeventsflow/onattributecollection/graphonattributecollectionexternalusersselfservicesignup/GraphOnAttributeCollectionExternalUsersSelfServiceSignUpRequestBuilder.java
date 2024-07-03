package com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onattributecollection.graphonattributecollectionexternalusersselfservicesignup;

import com.microsoft.graph.identity.authenticationeventsflows.item.graphexternalusersselfservicesignupeventsflow.onattributecollection.graphonattributecollectionexternalusersselfservicesignup.attributes.AttributesRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.OnAttributeCollectionExternalUsersSelfServiceSignUp;
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
 * Casts the previous resource to onAttributeCollectionExternalUsersSelfServiceSignUp.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GraphOnAttributeCollectionExternalUsersSelfServiceSignUpRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the attributes property of the microsoft.graph.onAttributeCollectionExternalUsersSelfServiceSignUp entity.
     * @return a {@link AttributesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AttributesRequestBuilder attributes() {
        return new AttributesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link GraphOnAttributeCollectionExternalUsersSelfServiceSignUpRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphOnAttributeCollectionExternalUsersSelfServiceSignUpRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/onAttributeCollection/graph.onAttributeCollectionExternalUsersSelfServiceSignUp", pathParameters);
    }
    /**
     * Instantiates a new {@link GraphOnAttributeCollectionExternalUsersSelfServiceSignUpRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphOnAttributeCollectionExternalUsersSelfServiceSignUpRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identity/authenticationEventsFlows/{authenticationEventsFlow%2Did}/graph.externalUsersSelfServiceSignUpEventsFlow/onAttributeCollection/graph.onAttributeCollectionExternalUsersSelfServiceSignUp", rawUrl);
    }
    /**
     * Get the item of type microsoft.graph.onAttributeCollectionHandler as microsoft.graph.onAttributeCollectionExternalUsersSelfServiceSignUp
     * @return a {@link OnAttributeCollectionExternalUsersSelfServiceSignUp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnAttributeCollectionExternalUsersSelfServiceSignUp get() {
        return get(null);
    }
    /**
     * Get the item of type microsoft.graph.onAttributeCollectionHandler as microsoft.graph.onAttributeCollectionExternalUsersSelfServiceSignUp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link OnAttributeCollectionExternalUsersSelfServiceSignUp}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public OnAttributeCollectionExternalUsersSelfServiceSignUp get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OnAttributeCollectionExternalUsersSelfServiceSignUp::createFromDiscriminatorValue);
    }
    /**
     * Get the item of type microsoft.graph.onAttributeCollectionHandler as microsoft.graph.onAttributeCollectionExternalUsersSelfServiceSignUp
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the item of type microsoft.graph.onAttributeCollectionHandler as microsoft.graph.onAttributeCollectionExternalUsersSelfServiceSignUp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
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
     * @return a {@link GraphOnAttributeCollectionExternalUsersSelfServiceSignUpRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GraphOnAttributeCollectionExternalUsersSelfServiceSignUpRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GraphOnAttributeCollectionExternalUsersSelfServiceSignUpRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
