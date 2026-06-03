package com.microsoft.graph.devicemanagement.applepushnotificationcertificate.downloadapplepushnotificationcertificatesigningrequest;

import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the downloadApplePushNotificationCertificateSigningRequest method. Original name: DownloadApplePushNotificationCertificateSigningRequestRequestBuilder
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DownloadApplePushNotificationCertificateSigningRequestR_030b19cc extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DownloadApplePushNotificationCertificateSigningRequestR_030b19cc} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DownloadApplePushNotificationCertificateSigningRequestR_030b19cc(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/applePushNotificationCertificate/downloadApplePushNotificationCertificateSigningRequest()", pathParameters);
    }
    /**
     * Instantiates a new {@link DownloadApplePushNotificationCertificateSigningRequestR_030b19cc} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DownloadApplePushNotificationCertificateSigningRequestR_030b19cc(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceManagement/applePushNotificationCertificate/downloadApplePushNotificationCertificateSigningRequest()", rawUrl);
    }
    /**
     * Download Apple push notification certificate signing request
     * @return a {@link DownloadApplePushNotificationCertificateSigningRequestG_4112f3ea}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DownloadApplePushNotificationCertificateSigningRequestG_4112f3ea get() {
        return get(null);
    }
    /**
     * Download Apple push notification certificate signing request
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DownloadApplePushNotificationCertificateSigningRequestG_4112f3ea}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public DownloadApplePushNotificationCertificateSigningRequestG_4112f3ea get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DownloadApplePushNotificationCertificateSigningRequestG_4112f3ea::createFromDiscriminatorValue);
    }
    /**
     * Download Apple push notification certificate signing request
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Download Apple push notification certificate signing request
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
     * @return a {@link DownloadApplePushNotificationCertificateSigningRequestR_030b19cc}
     */
    @jakarta.annotation.Nonnull
    public DownloadApplePushNotificationCertificateSigningRequestR_030b19cc withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DownloadApplePushNotificationCertificateSigningRequestR_030b19cc(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
