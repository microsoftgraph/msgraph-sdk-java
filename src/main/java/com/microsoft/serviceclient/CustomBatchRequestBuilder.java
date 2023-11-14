package com.microsoft.serviceclient;

import com.microsoft.graph.content.BatchRequestContent;
import com.microsoft.graph.content.BatchRequestContentCollection;
import com.microsoft.graph.content.BatchResponseContent;
import com.microsoft.graph.content.BatchResponseContentCollection;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.requests.BatchRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * CustomBatchRequestBuilder extends BatchRequestBuilder to include graph specific default error mappings.
 */
public class CustomBatchRequestBuilder extends BatchRequestBuilder {
    /**
     * Instantiates a new CustomBatchRequestBuilder
     * @param requestAdapter the request adapter to use to execute the requests
     */
    public CustomBatchRequestBuilder(@Nonnull RequestAdapter requestAdapter) {
        super(requestAdapter);
    }
    /**
     * Sends out the BatchRequestContent using the POST method.
     * @param requestContent the BatchRequestContent to post.
     * @param errorMappings the error mappings to use when parsing the response.
     * @return the batchResponseContent.
     */
    @Nonnull
    @Override
    public BatchResponseContent post(@Nonnull BatchRequestContent requestContent, @Nullable Map<String, ParsableFactory<? extends Parsable>> errorMappings) throws IOException {
        Map<String, ParsableFactory<? extends Parsable>> batchErrorMappings = errorMappings == null ? getDefaultErrorMappings() : errorMappings;
        return super.post(requestContent, batchErrorMappings);
    }
    /**
     * Sends out the BatchRequestContentCollection using the POST method.
     * @param requestContentCollection the BatchRequestContentCollection to post.
     * @param errorMappings the error mappings to use when parsing the response.
     * @return the responseContentCollection.
     */
    @Nonnull
    @Override
    public BatchResponseContentCollection post(@Nonnull BatchRequestContentCollection requestContentCollection, @Nullable Map<String, ParsableFactory<? extends Parsable>> errorMappings) throws IOException {
        Map<String, ParsableFactory<? extends Parsable>> batchErrorMappings = errorMappings == null ? getDefaultErrorMappings() : errorMappings;
        return super.post(requestContentCollection, batchErrorMappings);
    }

    private Map<String, ParsableFactory<? extends Parsable>> getDefaultErrorMappings() {
        Map<String, ParsableFactory<? extends Parsable>> errorMappings = new HashMap<>();
        errorMappings.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMappings.put("5XX", ODataError::createFromDiscriminatorValue);
        return errorMappings;
    }
}
