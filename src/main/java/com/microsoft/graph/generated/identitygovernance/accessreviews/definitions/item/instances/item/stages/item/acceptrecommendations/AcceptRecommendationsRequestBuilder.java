package com.microsoft.graph.identitygovernance.accessreviews.definitions.item.instances.item.stages.item.acceptrecommendations;

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
 * Provides operations to call the acceptRecommendations method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AcceptRecommendationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AcceptRecommendationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AcceptRecommendationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/accessReviews/definitions/{accessReviewScheduleDefinition%2Did}/instances/{accessReviewInstance%2Did}/stages/{accessReviewStage%2Did}/acceptRecommendations", pathParameters);
    }
    /**
     * Instantiates a new {@link AcceptRecommendationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AcceptRecommendationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/accessReviews/definitions/{accessReviewScheduleDefinition%2Did}/instances/{accessReviewInstance%2Did}/stages/{accessReviewStage%2Did}/acceptRecommendations", rawUrl);
    }
    /**
     * Accept the recommendations on all accessReviewInstanceDecisionItem objects that haven&apos;t been reviewed within a single accessReviewStage of a multi-stage accessReviewInstance. Recommendations are generated if recommendationsEnabled is true on the accessReviewScheduleDefinition object. If there&apos;s no recommendation on an accessReviewInstanceDecisionItem object, no decision is recorded. This action accepts recommendations for the decisions in a specific stage only, unlike accessReviewInstance: acceptRecommendations, which operates across the entire instance.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/accessreviewstage-acceptrecommendations?view=graph-rest-1.0">Find more info here</a>
     */
    public void post() {
        post(null);
    }
    /**
     * Accept the recommendations on all accessReviewInstanceDecisionItem objects that haven&apos;t been reviewed within a single accessReviewStage of a multi-stage accessReviewInstance. Recommendations are generated if recommendationsEnabled is true on the accessReviewScheduleDefinition object. If there&apos;s no recommendation on an accessReviewInstanceDecisionItem object, no decision is recorded. This action accepts recommendations for the decisions in a specific stage only, unlike accessReviewInstance: acceptRecommendations, which operates across the entire instance.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/accessreviewstage-acceptrecommendations?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Accept the recommendations on all accessReviewInstanceDecisionItem objects that haven&apos;t been reviewed within a single accessReviewStage of a multi-stage accessReviewInstance. Recommendations are generated if recommendationsEnabled is true on the accessReviewScheduleDefinition object. If there&apos;s no recommendation on an accessReviewInstanceDecisionItem object, no decision is recorded. This action accepts recommendations for the decisions in a specific stage only, unlike accessReviewInstance: acceptRecommendations, which operates across the entire instance.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Accept the recommendations on all accessReviewInstanceDecisionItem objects that haven&apos;t been reviewed within a single accessReviewStage of a multi-stage accessReviewInstance. Recommendations are generated if recommendationsEnabled is true on the accessReviewScheduleDefinition object. If there&apos;s no recommendation on an accessReviewInstanceDecisionItem object, no decision is recorded. This action accepts recommendations for the decisions in a specific stage only, unlike accessReviewInstance: acceptRecommendations, which operates across the entire instance.
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
     * @return a {@link AcceptRecommendationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptRecommendationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AcceptRecommendationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
