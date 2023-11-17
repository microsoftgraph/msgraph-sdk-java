package com.microsoft.graph.teamwork.deletedteams.item.channels.item.provisionemail;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.ProvisionChannelEmailResult;
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
 * Provides operations to call the provisionEmail method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvisionEmailRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new ProvisionEmailRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvisionEmailRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}/provisionEmail", pathParameters);
    }
    /**
     * Instantiates a new ProvisionEmailRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvisionEmailRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}/provisionEmail", rawUrl);
    }
    /**
     * Provision an email address for a channel. Microsoft Teams doesn't automatically provision an email address for a channel by default. To have Teams provision an email address, you can call provisionEmail, or through the Teams user interface, select Get email address, which triggers Teams to generate an email address if it has not already provisioned one. To remove the email address of a channel, use the removeEmail method. This API is available in the following national cloud deployments.
     * @return a ProvisionChannelEmailResult
     * @see <a href="https://learn.microsoft.com/graph/api/channel-provisionemail?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ProvisionChannelEmailResult post() {
        return post(null);
    }
    /**
     * Provision an email address for a channel. Microsoft Teams doesn't automatically provision an email address for a channel by default. To have Teams provision an email address, you can call provisionEmail, or through the Teams user interface, select Get email address, which triggers Teams to generate an email address if it has not already provisioned one. To remove the email address of a channel, use the removeEmail method. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProvisionChannelEmailResult
     * @see <a href="https://learn.microsoft.com/graph/api/channel-provisionemail?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ProvisionChannelEmailResult post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, ProvisionChannelEmailResult::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provision an email address for a channel. Microsoft Teams doesn't automatically provision an email address for a channel by default. To have Teams provision an email address, you can call provisionEmail, or through the Teams user interface, select Get email address, which triggers Teams to generate an email address if it has not already provisioned one. To remove the email address of a channel, use the removeEmail method. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Provision an email address for a channel. Microsoft Teams doesn't automatically provision an email address for a channel by default. To have Teams provision an email address, you can call provisionEmail, or through the Teams user interface, select Get email address, which triggers Teams to generate an email address if it has not already provisioned one. To remove the email address of a channel, use the removeEmail method. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
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
     * @return a ProvisionEmailRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ProvisionEmailRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProvisionEmailRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
