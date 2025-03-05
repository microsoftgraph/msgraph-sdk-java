package com.microsoft.graph.directoryroles;

import com.microsoft.graph.directoryroles.count.CountRequestBuilder;
import com.microsoft.graph.directoryroles.delta.DeltaRequestBuilder;
import com.microsoft.graph.directoryroles.getavailableextensionproperties.GetAvailableExtensionPropertiesRequestBuilder;
import com.microsoft.graph.directoryroles.getbyids.GetByIdsRequestBuilder;
import com.microsoft.graph.directoryroles.item.DirectoryRoleItemRequestBuilder;
import com.microsoft.graph.directoryroles.validateproperties.ValidatePropertiesRequestBuilder;
import com.microsoft.graph.models.DirectoryRole;
import com.microsoft.graph.models.DirectoryRoleCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to manage the collection of directoryRole entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryRolesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     * @return a {@link CountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @return a {@link DeltaRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getAvailableExtensionProperties method.
     * @return a {@link GetAvailableExtensionPropertiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAvailableExtensionPropertiesRequestBuilder getAvailableExtensionProperties() {
        return new GetAvailableExtensionPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getByIds method.
     * @return a {@link GetByIdsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetByIdsRequestBuilder getByIds() {
        return new GetByIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validateProperties method.
     * @return a {@link ValidatePropertiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ValidatePropertiesRequestBuilder validateProperties() {
        return new ValidatePropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the collection of directoryRole entities.
     * @param directoryRoleId The unique identifier of directoryRole
     * @return a {@link DirectoryRoleItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRoleItemRequestBuilder byDirectoryRoleId(@jakarta.annotation.Nonnull final String directoryRoleId) {
        Objects.requireNonNull(directoryRoleId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryRole%2Did", directoryRoleId);
        return new DirectoryRoleItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link DirectoryRolesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryRolesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directoryRoles{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", pathParameters);
    }
    /**
     * Instantiates a new {@link DirectoryRolesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DirectoryRolesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/directoryRoles{?%24count,%24expand,%24filter,%24orderby,%24search,%24select,%24skip,%24top}", rawUrl);
    }
    /**
     * List the directory roles that are activated in the tenant. This operation only returns roles that have been activated. A role becomes activated when an admin activates the role using the Activate directoryRole API. Not all built-in roles are initially activated.  When assigning a role using the Microsoft Entra admin center, the role activation step is implicitly done on the admin&apos;s behalf. To get the full list of roles that are available in Microsoft Entra ID, use List directoryRoleTemplates.
     * @return a {@link DirectoryRoleCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/directoryrole-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DirectoryRoleCollectionResponse get() {
        return get(null);
    }
    /**
     * List the directory roles that are activated in the tenant. This operation only returns roles that have been activated. A role becomes activated when an admin activates the role using the Activate directoryRole API. Not all built-in roles are initially activated.  When assigning a role using the Microsoft Entra admin center, the role activation step is implicitly done on the admin&apos;s behalf. To get the full list of roles that are available in Microsoft Entra ID, use List directoryRoleTemplates.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DirectoryRoleCollectionResponse}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/directoryrole-list?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DirectoryRoleCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DirectoryRoleCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Activate a directory role. To read a directory role or update its members, it must first be activated in the tenant. The Company Administrators and the implicit user directory roles (User, Guest User, and Restricted Guest User roles) are activated by default. To access and assign members to other directory roles, you must first activate it with its corresponding directory role template ID.
     * @param body The request body
     * @return a {@link DirectoryRole}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/directoryrole-post-directoryroles?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DirectoryRole post(@jakarta.annotation.Nonnull final DirectoryRole body) {
        return post(body, null);
    }
    /**
     * Activate a directory role. To read a directory role or update its members, it must first be activated in the tenant. The Company Administrators and the implicit user directory roles (User, Guest User, and Restricted Guest User roles) are activated by default. To access and assign members to other directory roles, you must first activate it with its corresponding directory role template ID.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DirectoryRole}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/directoryrole-post-directoryroles?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public DirectoryRole post(@jakarta.annotation.Nonnull final DirectoryRole body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DirectoryRole::createFromDiscriminatorValue);
    }
    /**
     * List the directory roles that are activated in the tenant. This operation only returns roles that have been activated. A role becomes activated when an admin activates the role using the Activate directoryRole API. Not all built-in roles are initially activated.  When assigning a role using the Microsoft Entra admin center, the role activation step is implicitly done on the admin&apos;s behalf. To get the full list of roles that are available in Microsoft Entra ID, use List directoryRoleTemplates.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List the directory roles that are activated in the tenant. This operation only returns roles that have been activated. A role becomes activated when an admin activates the role using the Activate directoryRole API. Not all built-in roles are initially activated.  When assigning a role using the Microsoft Entra admin center, the role activation step is implicitly done on the admin&apos;s behalf. To get the full list of roles that are available in Microsoft Entra ID, use List directoryRoleTemplates.
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
     * Activate a directory role. To read a directory role or update its members, it must first be activated in the tenant. The Company Administrators and the implicit user directory roles (User, Guest User, and Restricted Guest User roles) are activated by default. To access and assign members to other directory roles, you must first activate it with its corresponding directory role template ID.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DirectoryRole body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Activate a directory role. To read a directory role or update its members, it must first be activated in the tenant. The Company Administrators and the implicit user directory roles (User, Guest User, and Restricted Guest User roles) are activated by default. To access and assign members to other directory roles, you must first activate it with its corresponding directory role template ID.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DirectoryRole body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link DirectoryRolesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DirectoryRolesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DirectoryRolesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List the directory roles that are activated in the tenant. This operation only returns roles that have been activated. A role becomes activated when an admin activates the role using the Activate directoryRole API. Not all built-in roles are initially activated.  When assigning a role using the Microsoft Entra admin center, the role activation step is implicitly done on the admin&apos;s behalf. To get the full list of roles that are available in Microsoft Entra ID, use List directoryRoleTemplates.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Include count of items
         */
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @jakarta.annotation.Nullable
        public Integer top;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24count", count);
            allQueryParams.put("%24filter", filter);
            allQueryParams.put("%24search", search);
            allQueryParams.put("%24skip", skip);
            allQueryParams.put("%24top", top);
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24orderby", orderby);
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
