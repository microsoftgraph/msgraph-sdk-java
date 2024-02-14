package com.microsoft.graph.teamwork;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Teamwork;
import com.microsoft.graph.teamwork.deletedteams.DeletedTeamsRequestBuilder;
import com.microsoft.graph.teamwork.sendactivitynotificationtorecipients.SendActivityNotificationToRecipientsRequestBuilder;
import com.microsoft.graph.teamwork.teamsappsettings.TeamsAppSettingsRequestBuilder;
import com.microsoft.graph.teamwork.workforceintegrations.WorkforceIntegrationsRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Provides operations to manage the teamwork singleton.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the deletedTeams property of the microsoft.graph.teamwork entity.
     * @return a {@link DeletedTeamsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeletedTeamsRequestBuilder deletedTeams() {
        return new DeletedTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendActivityNotificationToRecipients method.
     * @return a {@link SendActivityNotificationToRecipientsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendActivityNotificationToRecipientsRequestBuilder sendActivityNotificationToRecipients() {
        return new SendActivityNotificationToRecipientsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the teamsAppSettings property of the microsoft.graph.teamwork entity.
     * @return a {@link TeamsAppSettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamsAppSettingsRequestBuilder teamsAppSettings() {
        return new TeamsAppSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the workforceIntegrations property of the microsoft.graph.teamwork entity.
     * @return a {@link WorkforceIntegrationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorkforceIntegrationsRequestBuilder workforceIntegrations() {
        return new WorkforceIntegrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TeamworkRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamworkRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link TeamworkRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TeamworkRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teamwork{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get teamwork
     * @return a {@link Teamwork}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Teamwork get() {
        return get(null);
    }
    /**
     * Get teamwork
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Teamwork}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Teamwork get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Teamwork::createFromDiscriminatorValue);
    }
    /**
     * Update teamwork
     * @param body The request body
     * @return a {@link Teamwork}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Teamwork patch(@jakarta.annotation.Nonnull final Teamwork body) {
        return patch(body, null);
    }
    /**
     * Update teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Teamwork}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public Teamwork patch(@jakarta.annotation.Nonnull final Teamwork body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Teamwork::createFromDiscriminatorValue);
    }
    /**
     * Get teamwork
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get teamwork
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update teamwork
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Teamwork body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update teamwork
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Teamwork body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/teamwork", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link TeamworkRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamworkRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new TeamworkRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get teamwork
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
