package com.microsoft.graph.identitygovernance.catalogs.item.resources.item.roles.item.resource.uploadsessions.item.uploadfile;

import com.microsoft.graph.models.CustomDataProvidedResourceUploadSession;
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
 * Provides operations to call the uploadFile method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadFileRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UploadFileRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadFileRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/catalogs/{accessPackageCatalog%2Did}/resources/{accessPackageResource%2Did}/roles/{accessPackageResourceRole%2Did}/resource/uploadSessions/{customDataProvidedResourceUploadSession%2Did}/uploadFile", pathParameters);
    }
    /**
     * Instantiates a new {@link UploadFileRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadFileRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/catalogs/{accessPackageCatalog%2Did}/resources/{accessPackageResource%2Did}/roles/{accessPackageResourceRole%2Did}/resource/uploadSessions/{customDataProvidedResourceUploadSession%2Did}/uploadFile", rawUrl);
    }
    /**
     * Upload a file in a customDataProvidedResourceUploadSession created for an accessPackageResource.
     * @return a {@link CustomDataProvidedResourceUploadSession}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/customdataprovidedresourceuploadsession-uploadfile?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CustomDataProvidedResourceUploadSession post() {
        return post(null);
    }
    /**
     * Upload a file in a customDataProvidedResourceUploadSession created for an accessPackageResource.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CustomDataProvidedResourceUploadSession}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/customdataprovidedresourceuploadsession-uploadfile?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public CustomDataProvidedResourceUploadSession post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CustomDataProvidedResourceUploadSession::createFromDiscriminatorValue);
    }
    /**
     * Upload a file in a customDataProvidedResourceUploadSession created for an accessPackageResource.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Upload a file in a customDataProvidedResourceUploadSession created for an accessPackageResource.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UploadFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadFileRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UploadFileRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
