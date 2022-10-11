package com.microsoft.serviceClient;

import com.azure.core.credential.TokenCredential;
import com.microsoft.graph.Requests.BaseGraphRequestAdapter;
import com.microsoft.graph.Requests.IBaseClient;
import com.microsoft.graph.Requests.GraphClientOption;
import com.microsoft.info.Constants;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.authentication.AnonymousAuthenticationProvider;
import com.microsoft.kiota.authentication.AuthenticationProvider;
import com.microsoft.kiota.authentication.AzureIdentityAuthenticationProvider;

import okhttp3.OkHttpClient;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class GraphServiceClient extends com.microsoft.graph.BaseGraphServiceClient {

    /**
     * Sets a few basic values for the GraphClientOptions to pass to the client.
     * @return the GraphClientOptions instance for the GraphServiceClient.
     */
    @Nonnull
    public static GraphClientOption getGraphClientOptions() {
        GraphClientOption graphClientOptions = new GraphClientOption();
        graphClientOptions.setGraphServiceTargetVersion("v1.0");
        graphClientOptions.setClientLibraryVersion(Constants.VERSION_NAME);
        return graphClientOptions;
    }
    /**
     * Instantiates a new BaseGraphServiceClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphServiceClient(@Nonnull RequestAdapter requestAdapter) {
        super(requestAdapter);
    }
    /**
     * Instantiate the GraphServiceClient using an AuthenticationProvider.
     * @param authenticationProvider The AuthenticationProvider for this GraphServiceClient.
     */
    public GraphServiceClient(@Nonnull AuthenticationProvider authenticationProvider) {
        super(new BaseGraphRequestAdapter(authenticationProvider, null, "v1.0" , getGraphClientOptions()));
    }
    /**
     * Instantiate the GraphServiceClient using a TokenCredential and Scopes.
     * @param tokenCredential The TokenCredential for this GraphServiceClient.
     * @param scopes The Scopes for this GraphServiceClient.
     */
    @SuppressWarnings("LambdaLast")
    public GraphServiceClient(@Nonnull TokenCredential tokenCredential, @Nullable String... scopes) {
        this(new AzureIdentityAuthenticationProvider(tokenCredential, null, scopes));
    }
    /**
     * Instantiate the GraphServiceClient using an OkHttpClient
     * @param client The OkHttpClient for the GraphServiceClient.
     */
    public GraphServiceClient(@Nonnull OkHttpClient client) {
        super(new BaseGraphRequestAdapter(new AnonymousAuthenticationProvider(), null, "v1.0", client));
    }
}
