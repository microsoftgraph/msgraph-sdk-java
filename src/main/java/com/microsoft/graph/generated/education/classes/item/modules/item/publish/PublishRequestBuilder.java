package com.microsoft.graph.education.classes.item.modules.item.publish;

import com.microsoft.graph.models.EducationModule;
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
 * Provides operations to call the publish method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublishRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PublishRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PublishRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/classes/{educationClass%2Did}/modules/{educationModule%2Did}/publish", pathParameters);
    }
    /**
     * Instantiates a new {@link PublishRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PublishRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/classes/{educationClass%2Did}/modules/{educationModule%2Did}/publish", rawUrl);
    }
    /**
     * Change the state of an educationModule from its original draft status to the published status. Only teachers in the class can perform this operation. When a module is in draft status, students can&apos;t see the module. When you call this API, the module appears in the student&apos;s class work list.
     * @return a {@link EducationModule}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/educationmodule-publish?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationModule post() {
        return post(null);
    }
    /**
     * Change the state of an educationModule from its original draft status to the published status. Only teachers in the class can perform this operation. When a module is in draft status, students can&apos;t see the module. When you call this API, the module appears in the student&apos;s class work list.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link EducationModule}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/educationmodule-publish?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public EducationModule post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, EducationModule::createFromDiscriminatorValue);
    }
    /**
     * Change the state of an educationModule from its original draft status to the published status. Only teachers in the class can perform this operation. When a module is in draft status, students can&apos;t see the module. When you call this API, the module appears in the student&apos;s class work list.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Change the state of an educationModule from its original draft status to the published status. Only teachers in the class can perform this operation. When a module is in draft status, students can&apos;t see the module. When you call this API, the module appears in the student&apos;s class work list.
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
     * @return a {@link PublishRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PublishRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PublishRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
