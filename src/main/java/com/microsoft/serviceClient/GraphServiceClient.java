package com.microsoft.serviceClient;

import com.microsoft.kiota.RequestAdapter;
import org.jetbrains.annotations.NotNull;

public class GraphServiceClient extends microsoft.graph.BaseGraphServiceClient {

    /**
     * Instantiates a new BaseGraphServiceClient and sets the default values.
     *
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public GraphServiceClient(@NotNull RequestAdapter requestAdapter) {
        super(requestAdapter);
    }
}
