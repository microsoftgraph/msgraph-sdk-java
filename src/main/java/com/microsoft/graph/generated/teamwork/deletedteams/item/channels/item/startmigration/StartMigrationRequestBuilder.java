package com.microsoft.graph.teamwork.deletedteams.item.channels.item.startmigration;

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
 * Provides operations to call the startMigration method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StartMigrationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link StartMigrationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StartMigrationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}/startMigration", pathParameters);
    }
    /**
     * Instantiates a new {@link StartMigrationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StartMigrationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork/deletedTeams/{deletedTeam%2Did}/channels/{channel%2Did}/startMigration", rawUrl);
    }
    /**
     * Start the migration of external messages by enabling migration mode in an existing channel. Import operations were limited to newly created standard channels that were in an empty state. For more information, see Import third-party platform messages to Teams using Microsoft Graph. Users are also allowed to define a minimum timestamp for content to be migrated, allowing them to import messages from the past. The provided timestamp must be older than the current createdDateTime for a channel. The provided timestamp is used to replace the existing createdDateTime of the channel. This API supportes the following channel types.
     * @param body The request body
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/channel-startmigration?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final StartMigrationPostRequestBody body) {
        post(body, null);
    }
    /**
     * Start the migration of external messages by enabling migration mode in an existing channel. Import operations were limited to newly created standard channels that were in an empty state. For more information, see Import third-party platform messages to Teams using Microsoft Graph. Users are also allowed to define a minimum timestamp for content to be migrated, allowing them to import messages from the past. The provided timestamp must be older than the current createdDateTime for a channel. The provided timestamp is used to replace the existing createdDateTime of the channel. This API supportes the following channel types.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/channel-startmigration?view=graph-rest-1.0">Find more info here</a>
     */
    public void post(@jakarta.annotation.Nonnull final StartMigrationPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Start the migration of external messages by enabling migration mode in an existing channel. Import operations were limited to newly created standard channels that were in an empty state. For more information, see Import third-party platform messages to Teams using Microsoft Graph. Users are also allowed to define a minimum timestamp for content to be migrated, allowing them to import messages from the past. The provided timestamp must be older than the current createdDateTime for a channel. The provided timestamp is used to replace the existing createdDateTime of the channel. This API supportes the following channel types.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final StartMigrationPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Start the migration of external messages by enabling migration mode in an existing channel. Import operations were limited to newly created standard channels that were in an empty state. For more information, see Import third-party platform messages to Teams using Microsoft Graph. Users are also allowed to define a minimum timestamp for content to be migrated, allowing them to import messages from the past. The provided timestamp must be older than the current createdDateTime for a channel. The provided timestamp is used to replace the existing createdDateTime of the channel. This API supportes the following channel types.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final StartMigrationPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link StartMigrationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public StartMigrationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StartMigrationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
