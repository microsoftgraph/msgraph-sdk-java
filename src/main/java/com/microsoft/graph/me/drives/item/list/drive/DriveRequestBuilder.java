package com.microsoft.graph.me.drives.item.list.drive;

import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the drive property of the microsoft.graph.list entity. */
public class DriveRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new DriveRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/drives/{drive%2Did}/list/drive{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DriveRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/drives/{drive%2Did}/list/drive{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DriveRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DriveRequestBuilderGetRequestConfiguration requestConfig = new DriveRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     * @return a CompletableFuture of drive
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Drive>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of drive
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Drive> get(@javax.annotation.Nullable final java.util.function.Consumer<DriveRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Drive::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Drive>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem]. */
    public class DriveRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DriveRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DriveRequestBuilderGetQueryParameters queryParameters = new DriveRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new driveRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DriveRequestBuilderGetRequestConfiguration() {
        }
    }
}
