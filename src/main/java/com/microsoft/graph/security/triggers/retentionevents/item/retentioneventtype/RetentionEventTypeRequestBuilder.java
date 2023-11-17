package com.microsoft.graph.security.triggers.retentionevents.item.retentioneventtype;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.security.RetentionEventType;
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
 * Provides operations to manage the retentionEventType property of the microsoft.graph.security.retentionEvent entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetentionEventTypeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new RetentionEventTypeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetentionEventTypeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/triggers/retentionEvents/{retentionEvent%2Did}/retentionEventType{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new RetentionEventTypeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RetentionEventTypeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security/triggers/retentionEvents/{retentionEvent%2Did}/retentionEventType{?%24select,%24expand}", rawUrl);
    }
    /**
     * Specifies the event that will start the retention period for labels that use this event type when an event is created.
     * @return a RetentionEventType
     */
    @jakarta.annotation.Nullable
    public RetentionEventType get() {
        return get(null);
    }
    /**
     * Specifies the event that will start the retention period for labels that use this event type when an event is created.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RetentionEventType
     */
    @jakarta.annotation.Nullable
    public RetentionEventType get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, RetentionEventType::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Specifies the event that will start the retention period for labels that use this event type when an event is created.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Specifies the event that will start the retention period for labels that use this event type when an event is created.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a RetentionEventTypeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RetentionEventTypeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RetentionEventTypeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Specifies the event that will start the retention period for labels that use this event type when an event is created.
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
}
