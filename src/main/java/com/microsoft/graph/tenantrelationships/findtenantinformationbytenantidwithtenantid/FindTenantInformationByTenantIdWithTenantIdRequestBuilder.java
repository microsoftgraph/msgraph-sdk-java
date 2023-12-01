package com.microsoft.graph.tenantrelationships.findtenantinformationbytenantidwithtenantid;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.TenantInformation;
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
 * Provides operations to call the findTenantInformationByTenantId method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FindTenantInformationByTenantIdWithTenantIdRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new FindTenantInformationByTenantIdWithTenantIdRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @param tenantId Usage: tenantId='{tenantId}'
     */
    public FindTenantInformationByTenantIdWithTenantIdRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final String tenantId) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/findTenantInformationByTenantId(tenantId='{tenantId}')", pathParameters);
        this.pathParameters.put("tenantId", tenantId);
    }
    /**
     * Instantiates a new FindTenantInformationByTenantIdWithTenantIdRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FindTenantInformationByTenantIdWithTenantIdRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/tenantRelationships/findTenantInformationByTenantId(tenantId='{tenantId}')", rawUrl);
    }
    /**
     * Invoke function findTenantInformationByTenantId
     * @return a TenantInformation
     */
    @jakarta.annotation.Nullable
    public TenantInformation get() {
        return get(null);
    }
    /**
     * Invoke function findTenantInformationByTenantId
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a TenantInformation
     */
    @jakarta.annotation.Nullable
    public TenantInformation get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, TenantInformation::createFromDiscriminatorValue);
    }
    /**
     * Invoke function findTenantInformationByTenantId
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Invoke function findTenantInformationByTenantId
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
     * @return a FindTenantInformationByTenantIdWithTenantIdRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public FindTenantInformationByTenantIdWithTenantIdRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FindTenantInformationByTenantIdWithTenantIdRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
