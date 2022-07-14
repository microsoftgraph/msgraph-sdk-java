package microsoft.graph.me;

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
import microsoft.graph.me.activities.ActivitiesRequestBuilder;
import microsoft.graph.me.activities.item.UserActivityItemRequestBuilder;
import microsoft.graph.me.agreementacceptances.AgreementAcceptancesRequestBuilder;
import microsoft.graph.me.agreementacceptances.item.AgreementAcceptanceItemRequestBuilder;
import microsoft.graph.me.approleassignments.AppRoleAssignmentsRequestBuilder;
import microsoft.graph.me.approleassignments.item.AppRoleAssignmentItemRequestBuilder;
import microsoft.graph.me.assignlicense.AssignLicenseRequestBuilder;
import microsoft.graph.me.authentication.AuthenticationRequestBuilder;
import microsoft.graph.me.calendar.CalendarRequestBuilder;
import microsoft.graph.me.calendargroups.CalendarGroupsRequestBuilder;
import microsoft.graph.me.calendargroups.item.CalendarGroupItemRequestBuilder;
import microsoft.graph.me.calendars.CalendarsRequestBuilder;
import microsoft.graph.me.calendars.item.CalendarItemRequestBuilder;
import microsoft.graph.me.calendarview.CalendarViewRequestBuilder;
import microsoft.graph.me.changepassword.ChangePasswordRequestBuilder;
import microsoft.graph.me.chats.ChatsRequestBuilder;
import microsoft.graph.me.chats.item.ChatItemRequestBuilder;
import microsoft.graph.me.checkmembergroups.CheckMemberGroupsRequestBuilder;
import microsoft.graph.me.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import microsoft.graph.me.contactfolders.ContactFoldersRequestBuilder;
import microsoft.graph.me.contactfolders.item.ContactFolderItemRequestBuilder;
import microsoft.graph.me.contacts.ContactsRequestBuilder;
import microsoft.graph.me.contacts.item.ContactItemRequestBuilder;
import microsoft.graph.me.createdobjects.CreatedObjectsRequestBuilder;
import microsoft.graph.me.devicemanagementtroubleshootingevents.DeviceManagementTroubleshootingEventsRequestBuilder;
import microsoft.graph.me.devicemanagementtroubleshootingevents.item.DeviceManagementTroubleshootingEventItemRequestBuilder;
import microsoft.graph.me.directreports.DirectReportsRequestBuilder;
import microsoft.graph.me.drive.DriveRequestBuilder;
import microsoft.graph.me.drives.DrivesRequestBuilder;
import microsoft.graph.me.drives.item.DriveItemRequestBuilder;
import microsoft.graph.me.events.EventsRequestBuilder;
import microsoft.graph.me.exportpersonaldata.ExportPersonalDataRequestBuilder;
import microsoft.graph.me.extensions.ExtensionsRequestBuilder;
import microsoft.graph.me.extensions.item.ExtensionItemRequestBuilder;
import microsoft.graph.me.findmeetingtimes.FindMeetingTimesRequestBuilder;
import microsoft.graph.me.followedsites.FollowedSitesRequestBuilder;
import microsoft.graph.me.followedsites.item.SiteItemRequestBuilder;
import microsoft.graph.me.getmailtips.GetMailTipsRequestBuilder;
import microsoft.graph.me.getmanagedappdiagnosticstatuses.GetManagedAppDiagnosticStatusesRequestBuilder;
import microsoft.graph.me.getmanagedapppolicies.GetManagedAppPoliciesRequestBuilder;
import microsoft.graph.me.getmembergroups.GetMemberGroupsRequestBuilder;
import microsoft.graph.me.getmemberobjects.GetMemberObjectsRequestBuilder;
import microsoft.graph.me.inferenceclassification.InferenceClassificationRequestBuilder;
import microsoft.graph.me.insights.InsightsRequestBuilder;
import microsoft.graph.me.joinedteams.item.TeamItemRequestBuilder;
import microsoft.graph.me.joinedteams.JoinedTeamsRequestBuilder;
import microsoft.graph.me.licensedetails.item.LicenseDetailsItemRequestBuilder;
import microsoft.graph.me.licensedetails.LicenseDetailsRequestBuilder;
import microsoft.graph.me.mailfolders.item.MailFolderItemRequestBuilder;
import microsoft.graph.me.mailfolders.MailFoldersRequestBuilder;
import microsoft.graph.me.managedappregistrations.item.ManagedAppRegistrationItemRequestBuilder;
import microsoft.graph.me.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import microsoft.graph.me.manageddevices.item.ManagedDeviceItemRequestBuilder;
import microsoft.graph.me.manageddevices.ManagedDevicesRequestBuilder;
import microsoft.graph.me.manager.ManagerRequestBuilder;
import microsoft.graph.me.memberof.MemberOfRequestBuilder;
import microsoft.graph.me.messages.item.MessageItemRequestBuilder;
import microsoft.graph.me.messages.MessagesRequestBuilder;
import microsoft.graph.me.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import microsoft.graph.me.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import microsoft.graph.me.onenote.OnenoteRequestBuilder;
import microsoft.graph.me.onlinemeetings.item.OnlineMeetingItemRequestBuilder;
import microsoft.graph.me.onlinemeetings.OnlineMeetingsRequestBuilder;
import microsoft.graph.me.outlook.OutlookRequestBuilder;
import microsoft.graph.me.owneddevices.OwnedDevicesRequestBuilder;
import microsoft.graph.me.ownedobjects.OwnedObjectsRequestBuilder;
import microsoft.graph.me.people.item.PersonItemRequestBuilder;
import microsoft.graph.me.people.PeopleRequestBuilder;
import microsoft.graph.me.photo.PhotoRequestBuilder;
import microsoft.graph.me.photos.item.ProfilePhotoItemRequestBuilder;
import microsoft.graph.me.photos.PhotosRequestBuilder;
import microsoft.graph.me.planner.PlannerRequestBuilder;
import microsoft.graph.me.presence.PresenceRequestBuilder;
import microsoft.graph.me.registereddevices.RegisteredDevicesRequestBuilder;
import microsoft.graph.me.reminderviewwithstartdatetimewithenddatetime.ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder;
import microsoft.graph.me.removealldevicesfrommanagement.RemoveAllDevicesFromManagementRequestBuilder;
import microsoft.graph.me.reprocesslicenseassignment.ReprocessLicenseAssignmentRequestBuilder;
import microsoft.graph.me.restore.RestoreRequestBuilder;
import microsoft.graph.me.revokesigninsessions.RevokeSignInSessionsRequestBuilder;
import microsoft.graph.me.scopedrolememberof.item.ScopedRoleMembershipItemRequestBuilder;
import microsoft.graph.me.scopedrolememberof.ScopedRoleMemberOfRequestBuilder;
import microsoft.graph.me.sendmail.SendMailRequestBuilder;
import microsoft.graph.me.settings.SettingsRequestBuilder;
import microsoft.graph.me.teamwork.TeamworkRequestBuilder;
import microsoft.graph.me.todo.TodoRequestBuilder;
import microsoft.graph.me.transitivememberof.TransitiveMemberOfRequestBuilder;
import microsoft.graph.me.translateexchangeids.TranslateExchangeIdsRequestBuilder;
import microsoft.graph.me.wipemanagedappregistrationsbydevicetag.WipeManagedAppRegistrationsByDeviceTagRequestBuilder;
import microsoft.graph.models.odataerrors.ODataError;
import microsoft.graph.models.User;
/** Provides operations to manage the user singleton. */
public class MeRequestBuilder {
    /** The activities property */
    @javax.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The agreementAcceptances property */
    @javax.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The appRoleAssignments property */
    @javax.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The assignLicense property */
    @javax.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /** The authentication property */
    @javax.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendar property */
    @javax.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendarGroups property */
    @javax.annotation.Nonnull
    public CalendarGroupsRequestBuilder calendarGroups() {
        return new CalendarGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendars property */
    @javax.annotation.Nonnull
    public CalendarsRequestBuilder calendars() {
        return new CalendarsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The calendarView property */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The changePassword property */
    @javax.annotation.Nonnull
    public ChangePasswordRequestBuilder changePassword() {
        return new ChangePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** The chats property */
    @javax.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberGroups property */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkMemberObjects property */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contactFolders property */
    @javax.annotation.Nonnull
    public ContactFoldersRequestBuilder contactFolders() {
        return new ContactFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The contacts property */
    @javax.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createdObjects property */
    @javax.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The deviceManagementTroubleshootingEvents property */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventsRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The directReports property */
    @javax.annotation.Nonnull
    public DirectReportsRequestBuilder directReports() {
        return new DirectReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drive property */
    @javax.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /** The drives property */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The events property */
    @javax.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The exportPersonalData property */
    @javax.annotation.Nonnull
    public ExportPersonalDataRequestBuilder exportPersonalData() {
        return new ExportPersonalDataRequestBuilder(pathParameters, requestAdapter);
    }
    /** The extensions property */
    @javax.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The findMeetingTimes property */
    @javax.annotation.Nonnull
    public FindMeetingTimesRequestBuilder findMeetingTimes() {
        return new FindMeetingTimesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The followedSites property */
    @javax.annotation.Nonnull
    public FollowedSitesRequestBuilder followedSites() {
        return new FollowedSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMailTips property */
    @javax.annotation.Nonnull
    public GetMailTipsRequestBuilder getMailTips() {
        return new GetMailTipsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberGroups property */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The getMemberObjects property */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The inferenceClassification property */
    @javax.annotation.Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /** The insights property */
    @javax.annotation.Nonnull
    public InsightsRequestBuilder insights() {
        return new InsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The joinedTeams property */
    @javax.annotation.Nonnull
    public JoinedTeamsRequestBuilder joinedTeams() {
        return new JoinedTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The licenseDetails property */
    @javax.annotation.Nonnull
    public LicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The mailFolders property */
    @javax.annotation.Nonnull
    public MailFoldersRequestBuilder mailFolders() {
        return new MailFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedAppRegistrations property */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The managedDevices property */
    @javax.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The manager property */
    @javax.annotation.Nonnull
    public ManagerRequestBuilder manager() {
        return new ManagerRequestBuilder(pathParameters, requestAdapter);
    }
    /** The memberOf property */
    @javax.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The messages property */
    @javax.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The oauth2PermissionGrants property */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The onenote property */
    @javax.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /** The onlineMeetings property */
    @javax.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The outlook property */
    @javax.annotation.Nonnull
    public OutlookRequestBuilder outlook() {
        return new OutlookRequestBuilder(pathParameters, requestAdapter);
    }
    /** The ownedDevices property */
    @javax.annotation.Nonnull
    public OwnedDevicesRequestBuilder ownedDevices() {
        return new OwnedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The ownedObjects property */
    @javax.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private final HashMap<String, Object> pathParameters;
    /** The people property */
    @javax.annotation.Nonnull
    public PeopleRequestBuilder people() {
        return new PeopleRequestBuilder(pathParameters, requestAdapter);
    }
    /** The photo property */
    @javax.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /** The photos property */
    @javax.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /** The planner property */
    @javax.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /** The presence property */
    @javax.annotation.Nonnull
    public PresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /** The registeredDevices property */
    @javax.annotation.Nonnull
    public RegisteredDevicesRequestBuilder registeredDevices() {
        return new RegisteredDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** The removeAllDevicesFromManagement property */
    @javax.annotation.Nonnull
    public RemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new RemoveAllDevicesFromManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** The reprocessLicenseAssignment property */
    @javax.annotation.Nonnull
    public ReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new ReprocessLicenseAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private final RequestAdapter requestAdapter;
    /** The restore property */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** The revokeSignInSessions property */
    @javax.annotation.Nonnull
    public RevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new RevokeSignInSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The scopedRoleMemberOf property */
    @javax.annotation.Nonnull
    public ScopedRoleMemberOfRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The sendMail property */
    @javax.annotation.Nonnull
    public SendMailRequestBuilder sendMail() {
        return new SendMailRequestBuilder(pathParameters, requestAdapter);
    }
    /** The settings property */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The teamwork property */
    @javax.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /** The todo property */
    @javax.annotation.Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(pathParameters, requestAdapter);
    }
    /** The transitiveMemberOf property */
    @javax.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** The translateExchangeIds property */
    @javax.annotation.Nonnull
    public TranslateExchangeIdsRequestBuilder translateExchangeIds() {
        return new TranslateExchangeIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private final String urlTemplate;
    /** The wipeManagedAppRegistrationsByDeviceTag property */
    @javax.annotation.Nonnull
    public WipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag() {
        return new WipeManagedAppRegistrationsByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.activities.item collection
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
     * Gets an item from the Microsoft.Graph.me.agreementAcceptances.item collection
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
     * Gets an item from the Microsoft.Graph.me.appRoleAssignments.item collection
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
     * Gets an item from the Microsoft.Graph.me.calendarGroups.item collection
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
     * Gets an item from the Microsoft.Graph.me.calendars.item collection
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
     * Gets an item from the Microsoft.Graph.me.calendarView.item collection
     * @param id Unique identifier of the item
     * @return a eventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.calendarview.item.EventItemRequestBuilder calendarView(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new microsoft.graph.me.calendarview.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.chats.item collection
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
     * Instantiates a new MeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public MeRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new MeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    public MeRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me{?%24select,%24expand}";
        var urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Gets an item from the Microsoft.Graph.me.contactFolders.item collection
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
     * Gets an item from the Microsoft.Graph.me.contacts.item collection
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
     * Gets an item from the Microsoft.Graph.me.createdObjects.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.createdobjects.item.DirectoryObjectItemRequestBuilder createdObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.me.createdobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Returns the user or organizational contact assigned as the user's manager. Optionally, you can expand the manager's chain up to the root node.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Returns the user or organizational contact assigned as the user's manager. Optionally, you can expand the manager's chain up to the root node.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final MeRequestBuilderGetRequestConfiguration requestConfig = new MeRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final User body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final MeRequestBuilderPatchRequestConfiguration requestConfig = new MeRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Gets an item from the Microsoft.Graph.me.deviceManagementTroubleshootingEvents.item collection
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
     * Gets an item from the Microsoft.Graph.me.directReports.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.directreports.item.DirectoryObjectItemRequestBuilder directReports(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.me.directreports.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.drives.item collection
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
     * Gets an item from the Microsoft.Graph.me.events.item collection
     * @param id Unique identifier of the item
     * @return a eventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.events.item.EventItemRequestBuilder events(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new microsoft.graph.me.events.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.extensions.item collection
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
     * Gets an item from the Microsoft.Graph.me.followedSites.item collection
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
     * Returns the user or organizational contact assigned as the user's manager. Optionally, you can expand the manager's chain up to the root node.
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
     * Returns the user or organizational contact assigned as the user's manager. Optionally, you can expand the manager's chain up to the root node.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     */
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderGetRequestConfiguration> requestConfiguration) {
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
     * Returns the user or organizational contact assigned as the user's manager. Optionally, you can expand the manager's chain up to the root node.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of user
     */
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderGetRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
     * Gets an item from the Microsoft.Graph.me.joinedTeams.item collection
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
     * Gets an item from the Microsoft.Graph.me.licenseDetails.item collection
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
     * Gets an item from the Microsoft.Graph.me.mailFolders.item collection
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
     * Gets an item from the Microsoft.Graph.me.managedAppRegistrations.item collection
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
     * Gets an item from the Microsoft.Graph.me.managedDevices.item collection
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
     * Gets an item from the Microsoft.Graph.me.memberOf.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.memberof.item.DirectoryObjectItemRequestBuilder memberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.me.memberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.messages.item collection
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
     * Gets an item from the Microsoft.Graph.me.oauth2PermissionGrants.item collection
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
     * Gets an item from the Microsoft.Graph.me.onlineMeetings.item collection
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
     * Gets an item from the Microsoft.Graph.me.ownedDevices.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.owneddevices.item.DirectoryObjectItemRequestBuilder ownedDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.me.owneddevices.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the Microsoft.Graph.me.ownedObjects.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.ownedobjects.item.DirectoryObjectItemRequestBuilder ownedObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.me.ownedobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
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
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderPatchRequestConfiguration> requestConfiguration) {
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
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @param responseHandler Response handler to use in place of the default response handling provided by the core service
     * @return a CompletableFuture of void
     */
    public java.util.concurrent.CompletableFuture<Void> patch(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<MeRequestBuilderPatchRequestConfiguration> requestConfiguration, @javax.annotation.Nullable final ResponseHandler responseHandler) {
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
     * Gets an item from the Microsoft.Graph.me.people.item collection
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
     * Gets an item from the Microsoft.Graph.me.photos.item collection
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
     * Gets an item from the Microsoft.Graph.me.registeredDevices.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.registereddevices.item.DirectoryObjectItemRequestBuilder registeredDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.me.registereddevices.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
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
     * Gets an item from the Microsoft.Graph.me.scopedRoleMemberOf.item collection
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
     * Gets an item from the Microsoft.Graph.me.transitiveMemberOf.item collection
     * @param id Unique identifier of the item
     * @return a directoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public microsoft.graph.me.transitivememberof.item.DirectoryObjectItemRequestBuilder transitiveMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        var urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new microsoft.graph.me.transitivememberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Returns the user or organizational contact assigned as the user's manager. Optionally, you can expand the manager's chain up to the root node. */
    public class MeRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class MeRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public MeRequestBuilderGetQueryParameters queryParameters = new MeRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new meRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        public MeRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class MeRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public Collection<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new meRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        public MeRequestBuilderPatchRequestConfiguration() {
        }
    }
}
