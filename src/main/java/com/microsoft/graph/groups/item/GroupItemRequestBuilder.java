package com.microsoft.graph.groups.item;

import com.microsoft.graph.groups.item.acceptedsenders.AcceptedSendersRequestBuilder;
import com.microsoft.graph.groups.item.addfavorite.AddFavoriteRequestBuilder;
import com.microsoft.graph.groups.item.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.groups.item.assignlicense.AssignLicenseRequestBuilder;
import com.microsoft.graph.groups.item.calendar.CalendarRequestBuilder;
import com.microsoft.graph.groups.item.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.groups.item.checkgrantedpermissionsforapp.CheckGrantedPermissionsForAppRequestBuilder;
import com.microsoft.graph.groups.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.groups.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.groups.item.conversations.ConversationsRequestBuilder;
import com.microsoft.graph.groups.item.createdonbehalfof.CreatedOnBehalfOfRequestBuilder;
import com.microsoft.graph.groups.item.drive.DriveRequestBuilder;
import com.microsoft.graph.groups.item.drives.DrivesRequestBuilder;
import com.microsoft.graph.groups.item.events.EventsRequestBuilder;
import com.microsoft.graph.groups.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.groups.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.groups.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.groups.item.grouplifecyclepolicies.GroupLifecyclePoliciesRequestBuilder;
import com.microsoft.graph.groups.item.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.groups.item.members.MembersRequestBuilder;
import com.microsoft.graph.groups.item.memberswithlicenseerrors.MembersWithLicenseErrorsRequestBuilder;
import com.microsoft.graph.groups.item.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.groups.item.owners.OwnersRequestBuilder;
import com.microsoft.graph.groups.item.permissiongrants.PermissionGrantsRequestBuilder;
import com.microsoft.graph.groups.item.photo.PhotoRequestBuilder;
import com.microsoft.graph.groups.item.photos.PhotosRequestBuilder;
import com.microsoft.graph.groups.item.planner.PlannerRequestBuilder;
import com.microsoft.graph.groups.item.rejectedsenders.RejectedSendersRequestBuilder;
import com.microsoft.graph.groups.item.removefavorite.RemoveFavoriteRequestBuilder;
import com.microsoft.graph.groups.item.renew.RenewRequestBuilder;
import com.microsoft.graph.groups.item.resetunseencount.ResetUnseenCountRequestBuilder;
import com.microsoft.graph.groups.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.groups.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.groups.item.sites.SitesRequestBuilder;
import com.microsoft.graph.groups.item.subscribebymail.SubscribeByMailRequestBuilder;
import com.microsoft.graph.groups.item.team.TeamRequestBuilder;
import com.microsoft.graph.groups.item.threads.ThreadsRequestBuilder;
import com.microsoft.graph.groups.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import com.microsoft.graph.groups.item.transitivemembers.TransitiveMembersRequestBuilder;
import com.microsoft.graph.groups.item.unsubscribebymail.UnsubscribeByMailRequestBuilder;
import com.microsoft.graph.groups.item.validateproperties.ValidatePropertiesRequestBuilder;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of group entities.
 */
public class GroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the acceptedSenders property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public AcceptedSendersRequestBuilder acceptedSenders() {
        return new AcceptedSendersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the addFavorite method.
     */
    @jakarta.annotation.Nonnull
    public AddFavoriteRequestBuilder addFavorite() {
        return new AddFavoriteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignments property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assignLicense method.
     */
    @jakarta.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendar property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkGrantedPermissionsForApp method.
     */
    @jakarta.annotation.Nonnull
    public CheckGrantedPermissionsForAppRequestBuilder checkGrantedPermissionsForApp() {
        return new CheckGrantedPermissionsForAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberGroups method.
     */
    @jakarta.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberObjects method.
     */
    @jakarta.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the conversations property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public ConversationsRequestBuilder conversations() {
        return new ConversationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdOnBehalfOf property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public CreatedOnBehalfOfRequestBuilder createdOnBehalfOf() {
        return new CreatedOnBehalfOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drives property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the events property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberGroups method.
     */
    @jakarta.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberObjects method.
     */
    @jakarta.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the groupLifecyclePolicies property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public GroupLifecyclePoliciesRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the membersWithLicenseErrors property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public MembersWithLicenseErrorsRequestBuilder membersWithLicenseErrors() {
        return new MembersWithLicenseErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onenote property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the owners property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrants property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photo property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photos property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the planner property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rejectedSenders property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public RejectedSendersRequestBuilder rejectedSenders() {
        return new RejectedSendersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeFavorite method.
     */
    @jakarta.annotation.Nonnull
    public RemoveFavoriteRequestBuilder removeFavorite() {
        return new RemoveFavoriteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the renew method.
     */
    @jakarta.annotation.Nonnull
    public RenewRequestBuilder renew() {
        return new RenewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resetUnseenCount method.
     */
    @jakarta.annotation.Nonnull
    public ResetUnseenCountRequestBuilder resetUnseenCount() {
        return new ResetUnseenCountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sites property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the subscribeByMail method.
     */
    @jakarta.annotation.Nonnull
    public SubscribeByMailRequestBuilder subscribeByMail() {
        return new SubscribeByMailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the team property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public TeamRequestBuilder team() {
        return new TeamRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threads property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public ThreadsRequestBuilder threads() {
        return new ThreadsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMembers property of the microsoft.graph.group entity.
     */
    @jakarta.annotation.Nonnull
    public TransitiveMembersRequestBuilder transitiveMembers() {
        return new TransitiveMembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unsubscribeByMail method.
     */
    @jakarta.annotation.Nonnull
    public UnsubscribeByMailRequestBuilder unsubscribeByMail() {
        return new UnsubscribeByMailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the validateProperties method.
     */
    @jakarta.annotation.Nonnull
    public ValidatePropertiesRequestBuilder validateProperties() {
        return new ValidatePropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new GroupItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new GroupItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete group. When deleted, Microsoft 365 groups are moved to a temporary container and can be restored within 30 days. After that time, they're permanently deleted. This isn't applicable to Security groups and Distribution groups which are permanently deleted immediately. To learn more, see deletedItems.
     * @return a CompletableFuture of void
     * @see <a href="https://learn.microsoft.com/graph/api/group-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete group. When deleted, Microsoft 365 groups are moved to a temporary container and can be restored within 30 days. After that time, they're permanently deleted. This isn't applicable to Security groups and Distribution groups which are permanently deleted immediately. To learn more, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     * @see <a href="https://learn.microsoft.com/graph/api/group-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that are not returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and are not returned in the $select query.
     * @return a CompletableFuture of group
     * @see <a href="https://learn.microsoft.com/graph/api/group-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Group> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Group::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Group> executionException = new java.util.concurrent.CompletableFuture<Group>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that are not returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and are not returned in the $select query.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of group
     * @see <a href="https://learn.microsoft.com/graph/api/group-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Group> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Group::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Group> executionException = new java.util.concurrent.CompletableFuture<Group>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of a group object.
     * @param body The request body
     * @return a CompletableFuture of group
     * @see <a href="https://learn.microsoft.com/graph/api/group-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Group> patch(@jakarta.annotation.Nonnull final Group body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Group::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Group> executionException = new java.util.concurrent.CompletableFuture<Group>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of a group object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of group
     * @see <a href="https://learn.microsoft.com/graph/api/group-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Group> patch(@jakarta.annotation.Nonnull final Group body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, Group::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<Group> executionException = new java.util.concurrent.CompletableFuture<Group>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete group. When deleted, Microsoft 365 groups are moved to a temporary container and can be restored within 30 days. After that time, they're permanently deleted. This isn't applicable to Security groups and Distribution groups which are permanently deleted immediately. To learn more, see deletedItems.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete group. When deleted, Microsoft 365 groups are moved to a temporary container and can be restored within 30 days. After that time, they're permanently deleted. This isn't applicable to Security groups and Distribution groups which are permanently deleted immediately. To learn more, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that are not returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and are not returned in the $select query.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that are not returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and are not returned in the $select query.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the properties of a group object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Group body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a group object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Group body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that are not returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and are not returned in the $select query.
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
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
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
