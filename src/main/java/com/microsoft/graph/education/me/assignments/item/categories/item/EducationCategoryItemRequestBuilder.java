package com.microsoft.graph.education.me.assignments.item.categories.item;

import com.microsoft.graph.education.me.assignments.item.categories.item.ref.RefRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /education/me/assignments/{educationAssignment-id}/categories/{educationCategory-id}
 */
public class EducationCategoryItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the collection of educationRoot entities.
     */
    @jakarta.annotation.Nonnull
    public RefRequestBuilder ref() {
        return new RefRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new EducationCategoryItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EducationCategoryItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/me/assignments/{educationAssignment%2Did}/categories/{educationCategory%2Did}", pathParameters);
    }
    /**
     * Instantiates a new EducationCategoryItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EducationCategoryItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/education/me/assignments/{educationAssignment%2Did}/categories/{educationCategory%2Did}", rawUrl);
    }
}
