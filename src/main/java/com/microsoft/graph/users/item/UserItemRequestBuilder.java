package microsoft.graph.users.item;

import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.ResponseHandler;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.User;
import microsoft.graph.users.item.activities.ActivitiesRequestBuilder;
import microsoft.graph.users.item.activities.item.UserActivityItemRequestBuilder;
import microsoft.graph.users.item.agreementacceptances.AgreementAcceptancesRequestBuilder;
import microsoft.graph.users.item.agreementacceptances.item.AgreementAcceptanceItemRequestBuilder;
import microsoft.graph.users.item.approleassignments.AppRoleAssignmentsRequestBuilder;
import microsoft.graph.users.item.approleassignments.item.AppRoleAssignmentItemRequestBuilder;
import microsoft.graph.users.item.assignlicense.AssignLicenseRequestBuilder;
import microsoft.graph.users.item.authentication.AuthenticationRequestBuilder;
import microsoft.graph.users.item.calendar.CalendarRequestBuilder;
import microsoft.graph.users.item.calendargroups.CalendarGroupsRequestBuilder;
import microsoft.graph.users.item.calendargroups.item.CalendarGroupItemRequestBuilder;
import microsoft.graph.users.item.calendars.CalendarsRequestBuilder;
import microsoft.graph.users.item.calendars.item.CalendarItemRequestBuilder;
import microsoft.graph.users.item.calendarview.CalendarViewRequestBuilder;
import microsoft.graph.users.item.changepassword.ChangePasswordRequestBuilder;
import microsoft.graph.users.item.chats.ChatsRequestBuilder;
import microsoft.graph.users.item.chats.item.ChatItemRequestBuilder;
import microsoft.graph.users.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import microsoft.graph.users.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import microsoft.graph.users.item.contactfolders.ContactFoldersRequestBuilder;
import microsoft.graph.users.item.contactfolders.item.ContactFolderItemRequestBuilder;
import microsoft.graph.users.item.contacts.ContactsRequestBuilder;
import microsoft.graph.users.item.contacts.item.ContactItemRequestBuilder;
import microsoft.graph.users.item.createdobjects.CreatedObjectsRequestBuilder;
import microsoft.graph.users.item.devicemanagementtroubleshootingevents.DeviceManagementTroubleshootingEventsRequestBuilder;
import microsoft.graph.users.item.devicemanagementtroubleshootingevents.item.DeviceManagementTroubleshootingEventItemRequestBuilder;
import microsoft.graph.users.item.directreports.DirectReportsRequestBuilder;
import microsoft.graph.users.item.drive.DriveRequestBuilder;
import microsoft.graph.users.item.drives.DrivesRequestBuilder;
import microsoft.graph.users.item.drives.item.DriveItemRequestBuilder;
import microsoft.graph.users.item.events.EventsRequestBuilder;
import microsoft.graph.users.item.exportpersonaldata.ExportPersonalDataRequestBuilder;
import microsoft.graph.users.item.extensions.ExtensionsRequestBuilder;
import microsoft.graph.users.item.extensions.item.ExtensionItemRequestBuilder;
import microsoft.graph.users.item.findmeetingtimes.FindMeetingTimesRequestBuilder;
import microsoft.graph.users.item.followedsites.FollowedSitesRequestBuilder;
import microsoft.graph.users.item.followedsites.item.SiteItemRequestBuilder;
import microsoft.graph.users.item.getmailtips.GetMailTipsRequestBuilder;
import microsoft.graph.users.item.getmanagedappdiagnosticstatuses.GetManagedAppDiagnosticStatusesRequestBuilder;
import microsoft.graph.users.item.getmanagedapppolicies.GetManagedAppPoliciesRequestBuilder;
import microsoft.graph.users.item.getmembergroups.GetMemberGroupsRequestBuilder;
import microsoft.graph.users.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import microsoft.graph.users.item.inferenceclassification.InferenceClassificationRequestBuilder;
import microsoft.graph.users.item.insights.InsightsRequestBuilder;
import microsoft.graph.users.item.joinedteams.item.TeamItemRequestBuilder;
import microsoft.graph.users.item.joinedteams.JoinedTeamsRequestBuilder;
import microsoft.graph.users.item.licensedetails.item.LicenseDetailsItemRequestBuilder;
import microsoft.graph.users.item.licensedetails.LicenseDetailsRequestBuilder;
import microsoft.graph.users.item.mailfolders.item.MailFolderItemRequestBuilder;
import microsoft.graph.users.item.mailfolders.MailFoldersRequestBuilder;
import microsoft.graph.users.item.managedappregistrations.item.ManagedAppRegistrationItemRequestBuilder;
import microsoft.graph.users.item.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import microsoft.graph.users.item.manageddevices.item.ManagedDeviceItemRequestBuilder;
import microsoft.graph.users.item.manageddevices.ManagedDevicesRequestBuilder;
import microsoft.graph.users.item.manager.ManagerRequestBuilder;
import microsoft.graph.users.item.memberof.MemberOfRequestBuilder;
import microsoft.graph.users.item.messages.item.MessageItemRequestBuilder;
import microsoft.graph.users.item.messages.MessagesRequestBuilder;
import microsoft.graph.users.item.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import microsoft.graph.users.item.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import microsoft.graph.users.item.onenote.OnenoteRequestBuilder;
import microsoft.graph.users.item.onlinemeetings.item.OnlineMeetingItemRequestBuilder;
import microsoft.graph.users.item.onlinemeetings.OnlineMeetingsRequestBuilder;
import microsoft.graph.users.item.outlook.OutlookRequestBuilder;
import microsoft.graph.users.item.owneddevices.OwnedDevicesRequestBuilder;
import microsoft.graph.users.item.ownedobjects.OwnedObjectsRequestBuilder;
import microsoft.graph.users.item.people.item.PersonItemRequestBuilder;
import microsoft.graph.users.item.people.PeopleRequestBuilder;
import microsoft.graph.users.item.photo.PhotoRequestBuilder;
import microsoft.graph.users.item.photos.item.ProfilePhotoItemRequestBuilder;
import microsoft.graph.users.item.photos.PhotosRequestBuilder;
import microsoft.graph.users.item.planner.PlannerRequestBuilder;
import microsoft.graph.users.item.presence.PresenceRequestBuilder;
import microsoft.graph.users.item.registereddevices.RegisteredDevicesRequestBuilder;
import microsoft.graph.users.item.reminderviewwithstartdatetimewithenddatetime.ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder;
import microsoft.graph.users.item.removealldevicesfrommanagement.RemoveAllDevicesFromManagementRequestBuilder;
import microsoft.graph.users.item.reprocesslicenseassignment.ReprocessLicenseAssignmentRequestBuilder;
import microsoft.graph.users.item.restore.RestoreRequestBuilder;
import microsoft.graph.users.item.revokesigninsessions.RevokeSignInSessionsRequestBuilder;
import microsoft.graph.users.item.scopedrolememberof.item.ScopedRoleMembershipItemRequestBuilder;
import microsoft.graph.users.item.scopedrolememberof.ScopedRoleMemberOfRequestBuilder;
import microsoft.graph.users.item.sendmail.SendMailRequestBuilder;
import microsoft.graph.users.item.settings.SettingsRequestBuilder;
import microsoft.graph.users.item.teamwork.TeamworkRequestBuilder;
import microsoft.graph.users.item.todo.TodoRequestBuilder;
import microsoft.graph.users.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import microsoft.graph.users.item.translateexchangeids.TranslateExchangeIdsRequestBuilder;
import microsoft.graph.users.item.wipemanagedappregistrationsbydevicetag.WipeManagedAppRegistrationsByDeviceTagRequestBuilder;
/** Provides operations to manage the collection of user entities.  */
public class UserItemRequestBuilder {
    /** The activities property  */
    @javax.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The agreementAcceptances property  */
    @javax.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appRoleAssignments property  */
    @javax.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignLicense property  */
    @javax.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /** The authentication property  */
    @javax.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendar property  */
    @javax.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendarGroups property  */
    @javax.annotation.Nonnull
    public CalendarGroupsRequestBuilder calendarGroups() {
        return new CalendarGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendars property  */
    @javax.annotation.Nonnull
    public CalendarsRequestBuilder calendars() {
        return new CalendarsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendarView property  */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The changePassword property  */
    @javax.annotation.Nonnull
    public ChangePasswordRequestBuilder changePassword() {
        return new ChangePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** The chats property  */
    @javax.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberGroups property  */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberObjects property  */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contactFolders property  */
    @javax.annotation.Nonnull
    public ContactFoldersRequestBuilder contactFolders() {
        return new ContactFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contacts property  */
    @javax.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createdObjects property  */
    @javax.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceManagementTroubleshootingEvents property  */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventsRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The directReports property  */
    @javax.annotation.Nonnull
    public DirectReportsRequestBuilder directReports() {
        return new DirectReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drive property  */
    @javax.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drives property  */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The events property  */
    @javax.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The exportPersonalData property  */
    @javax.annotation.Nonnull
    public ExportPersonalDataRequestBuilder exportPersonalData() {
        return new ExportPersonalDataRequestBuilder(pathParameters, requestAdapter);
    }
    /** The extensions property  */
    @javax.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The findMeetingTimes property  */
    @javax.annotation.Nonnull
    public FindMeetingTimesRequestBuilder findMeetingTimes() {
        return new FindMeetingTimesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The followedSites property  */
    @javax.annotation.Nonnull
    public FollowedSitesRequestBuilder followedSites() {
        return new FollowedSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMailTips property  */
    @javax.annotation.Nonnull
    public GetMailTipsRequestBuilder getMailTips() {
        return new GetMailTipsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberGroups property  */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberObjects property  */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The inferenceClassification property  */
    @javax.annotation.Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The insights property  */
    @javax.annotation.Nonnull
    public InsightsRequestBuilder insights() {
        return new InsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The joinedTeams property  */
    @javax.annotation.Nonnull
    public JoinedTeamsRequestBuilder joinedTeams() {
        return new JoinedTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The licenseDetails property  */
    @javax.annotation.Nonnull
    public LicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mailFolders property  */
    @javax.annotation.Nonnull
    public MailFoldersRequestBuilder mailFolders() {
        return new MailFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedAppRegistrations property  */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDevices property  */
    @javax.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The manager property  */
    @javax.annotation.Nonnull
    public ManagerRequestBuilder manager() {
        return new ManagerRequestBuilder(pathParameters, requestAdapter);
    }
    /** The memberOf property  */
    @javax.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The messages property  */
    @javax.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The oauth2PermissionGrants property  */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The onenote property  */
    @javax.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /** The onlineMeetings property  */
    @javax.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The outlook property  */
    @javax.annotation.Nonnull
    public OutlookRequestBuilder outlook() {
        return new OutlookRequestBuilder(pathParameters, requestAdapter);
    }
    /** The ownedDevices property  */
    @javax.annotation.Nonnull
    public OwnedDevicesRequestBuilder ownedDevices() {
        return new OwnedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The ownedObjects property  */
    @javax.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request  */
    private final HashMap<String, Object> pathParameters;
    /** The people property  */
    @javax.annotation.Nonnull
    public PeopleRequestBuilder people() {
        return new PeopleRequestBuilder(pathParameters, requestAdapter);
    }
    /** The photo property  */
    @javax.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /** The photos property  */
    @javax.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /** The planner property  */
    @javax.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /** The presence property  */
    @javax.annotation.Nonnull
    public PresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The registeredDevices property  */
    @javax.annotation.Nonnull
    public RegisteredDevicesRequestBuilder registeredDevices() {
        return new RegisteredDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The removeAllDevicesFromManagement property  */
    @javax.annotation.Nonnull
    public RemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new RemoveAllDevicesFromManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reprocessLicenseAssignment property  */
    @javax.annotation.Nonnull
    public ReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new ReprocessLicenseAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests.  */
    private final RequestAdapter requestAdapter;
    /** The restore property  */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** The revokeSignInSessions property  */
    @javax.annotation.Nonnull
    public RevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new RevokeSignInSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The scopedRoleMemberOf property  */
    @javax.annotation.Nonnull
    public ScopedRoleMemberOfRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sendMail property  */
    @javax.annotation.Nonnull
    public SendMailRequestBuilder sendMail() {
        return new SendMailRequestBuilder(pathParameters, requestAdapter);
    }
    /** The settings property  */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The teamwork property  */
    @javax.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /** The todo property  */
    @javax.annotation.Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(pathParameters, requestAdapter);
    }
    /** The transitiveMemberOf property  */
    @javax.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The translateExchangeIds property  */
    @javax.annotation.Nonnull
    public TranslateExchangeIdsRequestBuilder translateExchangeIds() {
        return new TranslateExchangeIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder  */
    private final String urlTemplate;
    /** The wipeManagedAppRegistrationsByDeviceTag property  */
    @javax.annotation.Nonnull
    public WipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag() {
        return new WipeManagedAppRegistrationsByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.activities.item collection
     * @param id Unique identifier of the item
     * @return a userActivityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserActivityItemRequestBuilder activities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userActivity%2Did", id);
        return new UserActivityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.agreementAcceptances.item collection
     * @param id Unique identifier of the item
     * @return a agreementAcceptanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgreementAcceptanceItemRequestBuilder agreementAcceptances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agreementAcceptance%2Did", id);
        return new AgreementAcceptanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.appRoleAssignments.item collection
     * @param id Unique identifier of the item
     * @return a appRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AppRoleAssignmentItemRequestBuilder appRoleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appRoleAssignment%2Did", id);
        return new AppRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.calendarGroups.item collection
     * @param id Unique identifier of the item
     * @return a calendarGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CalendarGroupItemRequestBuilder calendarGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("calendarGroup%2Did", id);
        return new CalendarGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.calendars.item collection
     * @param id Unique identifier of the item
     * @return a calendarItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CalendarItemRequestBuilder calendars(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("calendar%2Did", id);
        return new CalendarItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.calendarView.item collection
     * @param id Unique identifier of the item
     * @return a eventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.calendarview.item.EventItemRequestBuilder calendarView(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new microsoft.graph.users.item.calendarview.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.chats.item collection
     * @param id Unique identifier of the item
     * @return a chatItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ChatItemRequestBuilder chats(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("chat%2Did", id);
        return new ChatItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UserItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public UserItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new UserItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public UserItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.contactFolders.item collection
     * @param id Unique identifier of the item
     * @return a contactFolderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContactFolderItemRequestBuilder contactFolders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contactFolder%2Did", id);
        return new ContactFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.contacts.item collection
     * @param id Unique identifier of the item
     * @return a contactItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContactItemRequestBuilder contacts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contact%2Did", id);
        return new ContactItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete entity from users
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete entity from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final UserItemRequestBuilderDeleteRequestConfiguration requestConfig = new UserItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.createdObjects.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.createdobjects.item.DirectoryObjectItemRequestBuilder createdObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.users.item.createdobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get entity from users by key
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get entity from users by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final UserItemRequestBuilderGetRequestConfiguration requestConfig = new UserItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update entity in users
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final User body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update entity in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final UserItemRequestBuilderPatchRequestConfiguration requestConfig = new UserItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete entity from users
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete entity from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Delete entity from users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderDeleteRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.deviceManagementTroubleshootingEvents.item collection
     * @param id Unique identifier of the item
     * @return a deviceManagementTroubleshootingEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventItemRequestBuilder deviceManagementTroubleshootingEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementTroubleshootingEvent%2Did", id);
        return new DeviceManagementTroubleshootingEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.directReports.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.directreports.item.DirectoryObjectItemRequestBuilder directReports(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.users.item.directreports.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.drives.item collection
     * @param id Unique identifier of the item
     * @return a driveItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemRequestBuilder drives(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("drive%2Did", id);
        return new DriveItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.events.item collection
     * @param id Unique identifier of the item
     * @return a eventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.events.item.EventItemRequestBuilder events(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new microsoft.graph.users.item.events.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.extensions.item collection
     * @param id Unique identifier of the item
     * @return a extensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExtensionItemRequestBuilder extensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("extension%2Did", id);
        return new ExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.followedSites.item collection
     * @param id Unique identifier of the item
     * @return a siteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SiteItemRequestBuilder followedSites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did", id);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Get entity from users by key
     * @return a CompletableFuture of user
     */
    public java.util.concurrent.CompletableFuture<User> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entity from users by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     */
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Get entity from users by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of user
     */
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Provides operations to call the getManagedAppDiagnosticStatuses method.
     * @return a getManagedAppDiagnosticStatusesRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetManagedAppDiagnosticStatusesRequestBuilder getManagedAppDiagnosticStatuses() {
        return new GetManagedAppDiagnosticStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppPolicies method.
     * @return a getManagedAppPoliciesRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetManagedAppPoliciesRequestBuilder getManagedAppPolicies() {
        return new GetManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.joinedTeams.item collection
     * @param id Unique identifier of the item
     * @return a teamItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamItemRequestBuilder joinedTeams(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("team%2Did", id);
        return new TeamItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.licenseDetails.item collection
     * @param id Unique identifier of the item
     * @return a licenseDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LicenseDetailsItemRequestBuilder licenseDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("licenseDetails%2Did", id);
        return new LicenseDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.mailFolders.item collection
     * @param id Unique identifier of the item
     * @return a mailFolderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MailFolderItemRequestBuilder mailFolders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mailFolder%2Did", id);
        return new MailFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.managedAppRegistrations.item collection
     * @param id Unique identifier of the item
     * @return a managedAppRegistrationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationItemRequestBuilder managedAppRegistrations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppRegistration%2Did", id);
        return new ManagedAppRegistrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.managedDevices.item collection
     * @param id Unique identifier of the item
     * @return a managedDeviceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceItemRequestBuilder managedDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDevice%2Did", id);
        return new ManagedDeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.memberOf.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.memberof.item.DirectoryObjectItemRequestBuilder memberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.users.item.memberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.messages.item collection
     * @param id Unique identifier of the item
     * @return a messageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MessageItemRequestBuilder messages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("message%2Did", id);
        return new MessageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.oauth2PermissionGrants.item collection
     * @param id Unique identifier of the item
     * @return a oAuth2PermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder oauth2PermissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", id);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.onlineMeetings.item collection
     * @param id Unique identifier of the item
     * @return a onlineMeetingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OnlineMeetingItemRequestBuilder onlineMeetings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("onlineMeeting%2Did", id);
        return new OnlineMeetingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.ownedDevices.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.owneddevices.item.DirectoryObjectItemRequestBuilder ownedDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.users.item.owneddevices.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.ownedObjects.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.ownedobjects.item.DirectoryObjectItemRequestBuilder ownedObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.users.item.ownedobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update entity in users
     * @param body 
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final User body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update entity in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, null, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Update entity in users
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<UserItemRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, responseHandler, errorMapping);
        } catch (URISyntaxException ex) {
            return java.util.concurrent.CompletableFuture.failedFuture(ex);
        }
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.people.item collection
     * @param id Unique identifier of the item
     * @return a personItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonItemRequestBuilder people(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("person%2Did", id);
        return new PersonItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.photos.item collection
     * @param id Unique identifier of the item
     * @return a profilePhotoItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProfilePhotoItemRequestBuilder photos(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("profilePhoto%2Did", id);
        return new ProfilePhotoItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.registeredDevices.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.registereddevices.item.DirectoryObjectItemRequestBuilder registeredDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.users.item.registereddevices.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the reminderView method.
     * @param EndDateTime Usage: EndDateTime='{EndDateTime}'
     * @param StartDateTime Usage: StartDateTime='{StartDateTime}'
     * @return a reminderViewWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @javax.annotation.Nonnull
    public ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder reminderViewWithStartDateTimeWithEndDateTime(@javax.annotation.Nonnull final String endDateTime, @javax.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.scopedRoleMemberOf.item collection
     * @param id Unique identifier of the item
     * @return a scopedRoleMembershipItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ScopedRoleMembershipItemRequestBuilder scopedRoleMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("scopedRoleMembership%2Did", id);
        return new ScopedRoleMembershipItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.users.item.transitiveMemberOf.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.users.item.transitivememberof.item.DirectoryObjectItemRequestBuilder transitiveMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.users.item.transitivememberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class UserItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new userItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        public UserItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get entity from users by key  */
    public class UserItemRequestBuilderGetQueryParameters {
        /** Expand related entities  */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned  */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class UserItemRequestBuilderGetRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters  */
        @javax.annotation.Nullable
        public UserItemRequestBuilderGetQueryParameters queryParameters = new UserItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new userItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public UserItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options.  */
    public class UserItemRequestBuilderPatchRequestConfiguration {
        /** Request headers  */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options  */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new userItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public UserItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
