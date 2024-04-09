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
import com.microsoft.graph.groups.item.retryserviceprovisioning.RetryServiceProvisioningRequestBuilder;
import com.microsoft.graph.groups.item.serviceprovisioningerrors.ServiceProvisioningErrorsRequestBuilder;
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
 * Provides operations to manage the collection of group entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the acceptedSenders property of the microsoft.graph.group entity.
     * @return a {@link AcceptedSendersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptedSendersRequestBuilder acceptedSenders() {
        return new AcceptedSendersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the addFavorite method.
     * @return a {@link AddFavoriteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddFavoriteRequestBuilder addFavorite() {
        return new AddFavoriteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignments property of the microsoft.graph.group entity.
     * @return a {@link AppRoleAssignmentsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assignLicense method.
     * @return a {@link AssignLicenseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendar property of the microsoft.graph.group entity.
     * @return a {@link CalendarRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.group entity.
     * @return a {@link CalendarViewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkGrantedPermissionsForApp method.
     * @return a {@link CheckGrantedPermissionsForAppRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckGrantedPermissionsForAppRequestBuilder checkGrantedPermissionsForApp() {
        return new CheckGrantedPermissionsForAppRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberGroups method.
     * @return a {@link CheckMemberGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberObjects method.
     * @return a {@link CheckMemberObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the conversations property of the microsoft.graph.group entity.
     * @return a {@link ConversationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConversationsRequestBuilder conversations() {
        return new ConversationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdOnBehalfOf property of the microsoft.graph.group entity.
     * @return a {@link CreatedOnBehalfOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreatedOnBehalfOfRequestBuilder createdOnBehalfOf() {
        return new CreatedOnBehalfOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.group entity.
     * @return a {@link DriveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drives property of the microsoft.graph.group entity.
     * @return a {@link DrivesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the events property of the microsoft.graph.group entity.
     * @return a {@link EventsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.group entity.
     * @return a {@link ExtensionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberGroups method.
     * @return a {@link GetMemberGroupsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberObjects method.
     * @return a {@link GetMemberObjectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the groupLifecyclePolicies property of the microsoft.graph.group entity.
     * @return a {@link GroupLifecyclePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupLifecyclePoliciesRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.group entity.
     * @return a {@link MemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the members property of the microsoft.graph.group entity.
     * @return a {@link MembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersRequestBuilder members() {
        return new MembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the membersWithLicenseErrors property of the microsoft.graph.group entity.
     * @return a {@link MembersWithLicenseErrorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MembersWithLicenseErrorsRequestBuilder membersWithLicenseErrors() {
        return new MembersWithLicenseErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onenote property of the microsoft.graph.group entity.
     * @return a {@link OnenoteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the owners property of the microsoft.graph.group entity.
     * @return a {@link OwnersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OwnersRequestBuilder owners() {
        return new OwnersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the permissionGrants property of the microsoft.graph.group entity.
     * @return a {@link PermissionGrantsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PermissionGrantsRequestBuilder permissionGrants() {
        return new PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photo property of the microsoft.graph.group entity.
     * @return a {@link PhotoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photos property of the microsoft.graph.group entity.
     * @return a {@link PhotosRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the planner property of the microsoft.graph.group entity.
     * @return a {@link PlannerRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rejectedSenders property of the microsoft.graph.group entity.
     * @return a {@link RejectedSendersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RejectedSendersRequestBuilder rejectedSenders() {
        return new RejectedSendersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeFavorite method.
     * @return a {@link RemoveFavoriteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RemoveFavoriteRequestBuilder removeFavorite() {
        return new RemoveFavoriteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the renew method.
     * @return a {@link RenewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RenewRequestBuilder renew() {
        return new RenewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the resetUnseenCount method.
     * @return a {@link ResetUnseenCountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResetUnseenCountRequestBuilder resetUnseenCount() {
        return new ResetUnseenCountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     * @return a {@link RestoreRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retryServiceProvisioning method.
     * @return a {@link RetryServiceProvisioningRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RetryServiceProvisioningRequestBuilder retryServiceProvisioning() {
        return new RetryServiceProvisioningRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The serviceProvisioningErrors property
     * @return a {@link ServiceProvisioningErrorsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ServiceProvisioningErrorsRequestBuilder serviceProvisioningErrors() {
        return new ServiceProvisioningErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.group entity.
     * @return a {@link SettingsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sites property of the microsoft.graph.group entity.
     * @return a {@link SitesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SitesRequestBuilder sites() {
        return new SitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the subscribeByMail method.
     * @return a {@link SubscribeByMailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SubscribeByMailRequestBuilder subscribeByMail() {
        return new SubscribeByMailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the team property of the microsoft.graph.group entity.
     * @return a {@link TeamRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TeamRequestBuilder team() {
        return new TeamRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the threads property of the microsoft.graph.group entity.
     * @return a {@link ThreadsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ThreadsRequestBuilder threads() {
        return new ThreadsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.group entity.
     * @return a {@link TransitiveMemberOfRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMembers property of the microsoft.graph.group entity.
     * @return a {@link TransitiveMembersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TransitiveMembersRequestBuilder transitiveMembers() {
        return new TransitiveMembersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unsubscribeByMail method.
     * @return a {@link UnsubscribeByMailRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnsubscribeByMailRequestBuilder unsubscribeByMail() {
        return new UnsubscribeByMailRequestBuilder(pathParameters, requestAdapter);
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
     * Instantiates a new {@link GroupItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link GroupItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete group. When deleted, Microsoft 365 groups are moved to a temporary container and can be restored within 30 days. After that time, they're permanently deleted. This isn't applicable to Security groups and Distribution groups which are permanently deleted immediately. To learn more, see deletedItems.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/group-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete group. When deleted, Microsoft 365 groups are moved to a temporary container and can be restored within 30 days. After that time, they're permanently deleted. This isn't applicable to Security groups and Distribution groups which are permanently deleted immediately. To learn more, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/group-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that aren't_ returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and aren't returned in the $select query.
     * @return a {@link Group}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/group-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Group get() {
        return get(null);
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that aren't_ returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and aren't returned in the $select query.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Group}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/group-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Group get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Group::createFromDiscriminatorValue);
    }
    /**
     * Add a member to a security or Microsoft 365 group through the members navigation property. The following table shows the types of members that can be added to either security groups or Microsoft 365 groups.
     * @param body The request body
     * @return a {@link Group}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/group-post-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Group patch(@jakarta.annotation.Nonnull final Group body) {
        return patch(body, null);
    }
    /**
     * Add a member to a security or Microsoft 365 group through the members navigation property. The following table shows the types of members that can be added to either security groups or Microsoft 365 groups.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Group}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/group-post-members?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public Group patch(@jakarta.annotation.Nonnull final Group body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Group::createFromDiscriminatorValue);
    }
    /**
     * Delete group. When deleted, Microsoft 365 groups are moved to a temporary container and can be restored within 30 days. After that time, they're permanently deleted. This isn't applicable to Security groups and Distribution groups which are permanently deleted immediately. To learn more, see deletedItems.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete group. When deleted, Microsoft 365 groups are moved to a temporary container and can be restored within 30 days. After that time, they're permanently deleted. This isn't applicable to Security groups and Distribution groups which are permanently deleted immediately. To learn more, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that aren't_ returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and aren't returned in the $select query.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that aren't_ returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and aren't returned in the $select query.
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
     * Add a member to a security or Microsoft 365 group through the members navigation property. The following table shows the types of members that can be added to either security groups or Microsoft 365 groups.
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Group body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Add a member to a security or Microsoft 365 group through the members navigation property. The following table shows the types of members that can be added to either security groups or Microsoft 365 groups.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final Group body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GroupItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GroupItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GroupItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get the properties and relationships of a group object. This operation returns by default only a subset of all the available properties, as noted in the Properties section. To get properties that aren't_ returned by default, specify them in a $select OData query option. The hasMembersWithLicenseErrors and isArchived properties are an exception and aren't returned in the $select query.
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
