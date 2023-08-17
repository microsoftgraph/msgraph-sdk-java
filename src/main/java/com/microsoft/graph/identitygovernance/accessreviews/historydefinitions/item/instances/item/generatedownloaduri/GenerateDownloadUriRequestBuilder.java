package com.microsoft.graph.identitygovernance.accessreviews.historydefinitions.item.instances.item.generatedownloaduri;

import com.microsoft.graph.models.AccessReviewHistoryInstance;
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
 * Provides operations to call the generateDownloadUri method.
 */
public class GenerateDownloadUriRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new GenerateDownloadUriRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GenerateDownloadUriRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/accessReviews/historyDefinitions/{accessReviewHistoryDefinition%2Did}/instances/{accessReviewHistoryInstance%2Did}/generateDownloadUri", pathParameters);
    }
    /**
     * Instantiates a new GenerateDownloadUriRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GenerateDownloadUriRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/accessReviews/historyDefinitions/{accessReviewHistoryDefinition%2Did}/instances/{accessReviewHistoryInstance%2Did}/generateDownloadUri", rawUrl);
    }
    /**
     * Generates a URI for an accessReviewHistoryInstance object the status for which is done. Each URI can be used to retrieve the instance's review history data. Each URI is valid for 24 hours and can be retrieved by fetching the downloadUri property from the accessReviewHistoryInstance object.
     * @return a CompletableFuture of accessReviewHistoryInstance
     * @see <a href="https://learn.microsoft.com/graph/api/accessreviewhistoryinstance-generatedownloaduri?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewHistoryInstance> post() {
        return post(null);
    }
    /**
     * Generates a URI for an accessReviewHistoryInstance object the status for which is done. Each URI can be used to retrieve the instance's review history data. Each URI is valid for 24 hours and can be retrieved by fetching the downloadUri property from the accessReviewHistoryInstance object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of accessReviewHistoryInstance
     * @see <a href="https://learn.microsoft.com/graph/api/accessreviewhistoryinstance-generatedownloaduri?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewHistoryInstance> post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, AccessReviewHistoryInstance::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Generates a URI for an accessReviewHistoryInstance object the status for which is done. Each URI can be used to retrieve the instance's review history data. Each URI is valid for 24 hours and can be retrieved by fetching the downloadUri property from the accessReviewHistoryInstance object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Generates a URI for an accessReviewHistoryInstance object the status for which is done. Each URI can be used to retrieve the instance's review history data. Each URI is valid for 24 hours and can be retrieved by fetching the downloadUri property from the accessReviewHistoryInstance object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
