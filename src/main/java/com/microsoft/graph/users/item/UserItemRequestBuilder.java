package com.microsoft.graph.users.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.User;
import com.microsoft.graph.users.item.activities.ActivitiesRequestBuilder;
import com.microsoft.graph.users.item.activities.item.UserActivityItemRequestBuilder;
import com.microsoft.graph.users.item.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.users.item.agreementacceptances.item.AgreementAcceptanceItemRequestBuilder;
import com.microsoft.graph.users.item.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.users.item.approleassignments.item.AppRoleAssignmentItemRequestBuilder;
import com.microsoft.graph.users.item.assignlicense.AssignLicenseRequestBuilder;
import com.microsoft.graph.users.item.authentication.AuthenticationRequestBuilder;
import com.microsoft.graph.users.item.calendar.CalendarRequestBuilder;
import com.microsoft.graph.users.item.calendargroups.CalendarGroupsRequestBuilder;
import com.microsoft.graph.users.item.calendargroups.item.CalendarGroupItemRequestBuilder;
import com.microsoft.graph.users.item.calendars.CalendarsRequestBuilder;
import com.microsoft.graph.users.item.calendars.item.CalendarItemRequestBuilder;
import com.microsoft.graph.users.item.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.users.item.changepassword.ChangePasswordRequestBuilder;
import com.microsoft.graph.users.item.chats.ChatsRequestBuilder;
import com.microsoft.graph.users.item.chats.item.ChatItemRequestBuilder;
import com.microsoft.graph.users.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.users.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.users.item.contactfolders.ContactFoldersRequestBuilder;
import com.microsoft.graph.users.item.contactfolders.item.ContactFolderItemRequestBuilder;
import com.microsoft.graph.users.item.contacts.ContactsRequestBuilder;
import com.microsoft.graph.users.item.contacts.item.ContactItemRequestBuilder;
import com.microsoft.graph.users.item.createdobjects.CreatedObjectsRequestBuilder;
import com.microsoft.graph.users.item.devicemanagementtroubleshootingevents.DeviceManagementTroubleshootingEventsRequestBuilder;
import com.microsoft.graph.users.item.devicemanagementtroubleshootingevents.item.DeviceManagementTroubleshootingEventItemRequestBuilder;
import com.microsoft.graph.users.item.directreports.DirectReportsRequestBuilder;
import com.microsoft.graph.users.item.drive.DriveRequestBuilder;
import com.microsoft.graph.users.item.drives.DrivesRequestBuilder;
import com.microsoft.graph.users.item.drives.item.DriveItemRequestBuilder;
import com.microsoft.graph.users.item.events.EventsRequestBuilder;
import com.microsoft.graph.users.item.events.item.EventItemRequestBuilder;
import com.microsoft.graph.users.item.exportpersonaldata.ExportPersonalDataRequestBuilder;
import com.microsoft.graph.users.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.users.item.extensions.item.ExtensionItemRequestBuilder;
import com.microsoft.graph.users.item.findmeetingtimes.FindMeetingTimesRequestBuilder;
import com.microsoft.graph.users.item.followedsites.FollowedSitesRequestBuilder;
import com.microsoft.graph.users.item.followedsites.item.SiteItemRequestBuilder;
import com.microsoft.graph.users.item.getmailtips.GetMailTipsRequestBuilder;
import com.microsoft.graph.users.item.getmanagedappdiagnosticstatuses.GetManagedAppDiagnosticStatusesRequestBuilder;
import com.microsoft.graph.users.item.getmanagedapppolicies.GetManagedAppPoliciesRequestBuilder;
import com.microsoft.graph.users.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.users.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.users.item.inferenceclassification.InferenceClassificationRequestBuilder;
import com.microsoft.graph.users.item.insights.InsightsRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.item.TeamItemRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.JoinedTeamsRequestBuilder;
import com.microsoft.graph.users.item.licensedetails.item.LicenseDetailsItemRequestBuilder;
import com.microsoft.graph.users.item.licensedetails.LicenseDetailsRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.item.MailFolderItemRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.MailFoldersRequestBuilder;
import com.microsoft.graph.users.item.managedappregistrations.item.ManagedAppRegistrationItemRequestBuilder;
import com.microsoft.graph.users.item.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.item.ManagedDeviceItemRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.ManagedDevicesRequestBuilder;
import com.microsoft.graph.users.item.manager.ManagerRequestBuilder;
import com.microsoft.graph.users.item.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.users.item.messages.item.MessageItemRequestBuilder;
import com.microsoft.graph.users.item.messages.MessagesRequestBuilder;
import com.microsoft.graph.users.item.oauth2permissiongrants.item.OAuth2PermissionGrantItemRequestBuilder;
import com.microsoft.graph.users.item.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.users.item.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.users.item.onlinemeetings.item.OnlineMeetingItemRequestBuilder;
import com.microsoft.graph.users.item.onlinemeetings.OnlineMeetingsRequestBuilder;
import com.microsoft.graph.users.item.outlook.OutlookRequestBuilder;
import com.microsoft.graph.users.item.owneddevices.OwnedDevicesRequestBuilder;
import com.microsoft.graph.users.item.ownedobjects.OwnedObjectsRequestBuilder;
import com.microsoft.graph.users.item.people.item.PersonItemRequestBuilder;
import com.microsoft.graph.users.item.people.PeopleRequestBuilder;
import com.microsoft.graph.users.item.photo.PhotoRequestBuilder;
import com.microsoft.graph.users.item.photos.item.ProfilePhotoItemRequestBuilder;
import com.microsoft.graph.users.item.photos.PhotosRequestBuilder;
import com.microsoft.graph.users.item.planner.PlannerRequestBuilder;
import com.microsoft.graph.users.item.presence.PresenceRequestBuilder;
import com.microsoft.graph.users.item.registereddevices.item.DirectoryObjectItemRequestBuilder;
import com.microsoft.graph.users.item.registereddevices.RegisteredDevicesRequestBuilder;
import com.microsoft.graph.users.item.reminderviewwithstartdatetimewithenddatetime.ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.users.item.removealldevicesfrommanagement.RemoveAllDevicesFromManagementRequestBuilder;
import com.microsoft.graph.users.item.reprocesslicenseassignment.ReprocessLicenseAssignmentRequestBuilder;
import com.microsoft.graph.users.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.users.item.revokesigninsessions.RevokeSignInSessionsRequestBuilder;
import com.microsoft.graph.users.item.scopedrolememberof.item.ScopedRoleMembershipItemRequestBuilder;
import com.microsoft.graph.users.item.scopedrolememberof.ScopedRoleMemberOfRequestBuilder;
import com.microsoft.graph.users.item.sendmail.SendMailRequestBuilder;
import com.microsoft.graph.users.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.users.item.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.users.item.todo.TodoRequestBuilder;
import com.microsoft.graph.users.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import com.microsoft.graph.users.item.translateexchangeids.TranslateExchangeIdsRequestBuilder;
import com.microsoft.graph.users.item.wipemanagedappregistrationsbydevicetag.WipeManagedAppRegistrationsByDeviceTagRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of user entities. */
public class UserItemRequestBuilder {
    /** Provides operations to manage the activities property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the agreementAcceptances property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the appRoleAssignments property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the assignLicense method. */
    @javax.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the authentication property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the calendar property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the calendarGroups property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public CalendarGroupsRequestBuilder calendarGroups() {
        return new CalendarGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the calendars property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public CalendarsRequestBuilder calendars() {
        return new CalendarsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the calendarView property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the changePassword method. */
    @javax.annotation.Nonnull
    public ChangePasswordRequestBuilder changePassword() {
        return new ChangePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the chats property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the checkMemberGroups method. */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the checkMemberObjects method. */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the contactFolders property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ContactFoldersRequestBuilder contactFolders() {
        return new ContactFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the contacts property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the createdObjects property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the deviceManagementTroubleshootingEvents property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventsRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the directReports property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public DirectReportsRequestBuilder directReports() {
        return new DirectReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the drive property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the drives property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the events property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the exportPersonalData method. */
    @javax.annotation.Nonnull
    public ExportPersonalDataRequestBuilder exportPersonalData() {
        return new ExportPersonalDataRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the extensions property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the findMeetingTimes method. */
    @javax.annotation.Nonnull
    public FindMeetingTimesRequestBuilder findMeetingTimes() {
        return new FindMeetingTimesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the followedSites property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public FollowedSitesRequestBuilder followedSites() {
        return new FollowedSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMailTips method. */
    @javax.annotation.Nonnull
    public GetMailTipsRequestBuilder getMailTips() {
        return new GetMailTipsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMemberGroups method. */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the getMemberObjects method. */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the inferenceClassification property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the insights property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public InsightsRequestBuilder insights() {
        return new InsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the joinedTeams property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public JoinedTeamsRequestBuilder joinedTeams() {
        return new JoinedTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the licenseDetails property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public LicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the mailFolders property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public MailFoldersRequestBuilder mailFolders() {
        return new MailFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedAppRegistrations property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the managedDevices property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the manager property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ManagerRequestBuilder manager() {
        return new ManagerRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the memberOf property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the messages property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the onenote property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the onlineMeetings property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the outlook property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public OutlookRequestBuilder outlook() {
        return new OutlookRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the ownedDevices property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public OwnedDevicesRequestBuilder ownedDevices() {
        return new OwnedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the ownedObjects property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** Provides operations to manage the people property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public PeopleRequestBuilder people() {
        return new PeopleRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the photo property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the photos property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the planner property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the presence property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public PresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the registeredDevices property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public RegisteredDevicesRequestBuilder registeredDevices() {
        return new RegisteredDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the removeAllDevicesFromManagement method. */
    @javax.annotation.Nonnull
    public RemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new RemoveAllDevicesFromManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the reprocessLicenseAssignment method. */
    @javax.annotation.Nonnull
    public ReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new ReprocessLicenseAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Provides operations to call the restore method. */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the revokeSignInSessions method. */
    @javax.annotation.Nonnull
    public RevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new RevokeSignInSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the scopedRoleMemberOf property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public ScopedRoleMemberOfRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the sendMail method. */
    @javax.annotation.Nonnull
    public SendMailRequestBuilder sendMail() {
        return new SendMailRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the settings property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the teamwork property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the todo property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to manage the transitiveMemberOf property of the microsoft.graph.user entity. */
    @javax.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /** Provides operations to call the translateExchangeIds method. */
    @javax.annotation.Nonnull
    public TranslateExchangeIdsRequestBuilder translateExchangeIds() {
        return new TranslateExchangeIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** Provides operations to call the wipeManagedAppRegistrationsByDeviceTag method. */
    @javax.annotation.Nonnull
    public WipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag() {
        return new WipeManagedAppRegistrationsByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the activities property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a UserActivityItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public UserActivityItemRequestBuilder activities(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userActivity%2Did", id);
        return new UserActivityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the agreementAcceptances property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a AgreementAcceptanceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AgreementAcceptanceItemRequestBuilder agreementAcceptances(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("agreementAcceptance%2Did", id);
        return new AgreementAcceptanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignments property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a AppRoleAssignmentItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public AppRoleAssignmentItemRequestBuilder appRoleAssignments(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("appRoleAssignment%2Did", id);
        return new AppRoleAssignmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarGroups property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a CalendarGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CalendarGroupItemRequestBuilder calendarGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("calendarGroup%2Did", id);
        return new CalendarGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the calendars property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a CalendarItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public CalendarItemRequestBuilder calendars(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("calendar%2Did", id);
        return new CalendarItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.calendarview.item.EventItemRequestBuilder calendarView(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new com.microsoft.graph.users.item.calendarview.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the chats property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a ChatItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ChatItemRequestBuilder chats(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("chat%2Did", id);
        return new ChatItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UserItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/users/{user%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new UserItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/users/{user%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Provides operations to manage the contactFolders property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a ContactFolderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContactFolderItemRequestBuilder contactFolders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contactFolder%2Did", id);
        return new ContactFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the contacts property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a ContactItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ContactItemRequestBuilder contacts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("contact%2Did", id);
        return new ContactItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Delete user.   When deleted, user resources are moved to a temporary container and can be restored within 30 days.  After that time, they are permanently deleted.  To learn more, see deletedItems.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete user.   When deleted, user resources are moved to a temporary container and can be restored within 30 days.  After that time, they are permanently deleted.  To learn more, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Provides operations to manage the createdObjects property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.createdobjects.item.DirectoryObjectItemRequestBuilder createdObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.users.item.createdobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of user object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of user object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
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
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete user.   When deleted, user resources are moved to a temporary container and can be restored within 30 days.  After that time, they are permanently deleted.  To learn more, see deletedItems.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Delete user.   When deleted, user resources are moved to a temporary container and can be restored within 30 days.  After that time, they are permanently deleted.  To learn more, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<Void> executionException = new java.util.concurrent.CompletableFuture<Void>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the deviceManagementTroubleshootingEvents property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DeviceManagementTroubleshootingEventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventItemRequestBuilder deviceManagementTroubleshootingEvents(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("deviceManagementTroubleshootingEvent%2Did", id);
        return new DeviceManagementTroubleshootingEventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the directReports property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.directreports.item.DirectoryObjectItemRequestBuilder directReports(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.users.item.directreports.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the drives property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DriveItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemRequestBuilder drives(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("drive%2Did", id);
        return new DriveItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the events property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a EventItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.events.item.EventItemRequestBuilder events(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("event%2Did", id);
        return new com.microsoft.graph.users.item.events.item.EventItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a ExtensionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExtensionItemRequestBuilder extensions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("extension%2Did", id);
        return new ExtensionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the followedSites property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a SiteItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SiteItemRequestBuilder followedSites(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("site%2Did", id);
        return new SiteItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Retrieve the properties and relationships of user object.
     * @return a CompletableFuture of user
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<User> executionException = new java.util.concurrent.CompletableFuture<User>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve the properties and relationships of user object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<User> executionException = new java.util.concurrent.CompletableFuture<User>();
            executionException.completeExceptionally(ex);
            return executionException;
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
     * Provides operations to manage the joinedTeams property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a TeamItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TeamItemRequestBuilder joinedTeams(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("team%2Did", id);
        return new TeamItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the licenseDetails property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a LicenseDetailsItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public LicenseDetailsItemRequestBuilder licenseDetails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("licenseDetails%2Did", id);
        return new LicenseDetailsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the mailFolders property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a MailFolderItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MailFolderItemRequestBuilder mailFolders(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("mailFolder%2Did", id);
        return new MailFolderItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppRegistrations property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a ManagedAppRegistrationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationItemRequestBuilder managedAppRegistrations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedAppRegistration%2Did", id);
        return new ManagedAppRegistrationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDevices property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a ManagedDeviceItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ManagedDeviceItemRequestBuilder managedDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("managedDevice%2Did", id);
        return new ManagedDeviceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.memberof.item.DirectoryObjectItemRequestBuilder memberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.users.item.memberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a MessageItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public MessageItemRequestBuilder messages(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("message%2Did", id);
        return new MessageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a OAuth2PermissionGrantItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OAuth2PermissionGrantItemRequestBuilder oauth2PermissionGrants(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("oAuth2PermissionGrant%2Did", id);
        return new OAuth2PermissionGrantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a OnlineMeetingItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OnlineMeetingItemRequestBuilder onlineMeetings(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("onlineMeeting%2Did", id);
        return new OnlineMeetingItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedDevices property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.owneddevices.item.DirectoryObjectItemRequestBuilder ownedDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.users.item.owneddevices.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedObjects property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.ownedobjects.item.DirectoryObjectItemRequestBuilder ownedObjects(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.users.item.ownedobjects.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @return a CompletableFuture of user
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> patch(@javax.annotation.Nonnull final User body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<User> executionException = new java.util.concurrent.CompletableFuture<User>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> patch(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            java.util.concurrent.CompletableFuture<User> executionException = new java.util.concurrent.CompletableFuture<User>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Provides operations to manage the people property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a PersonItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PersonItemRequestBuilder people(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("person%2Did", id);
        return new PersonItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the photos property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a ProfilePhotoItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ProfilePhotoItemRequestBuilder photos(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("profilePhoto%2Did", id);
        return new ProfilePhotoItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the registeredDevices property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.registereddevices.item.DirectoryObjectItemRequestBuilder registeredDevices(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.users.item.registereddevices.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
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
     * Provides operations to manage the scopedRoleMemberOf property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a ScopedRoleMembershipItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ScopedRoleMembershipItemRequestBuilder scopedRoleMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("scopedRoleMembership%2Did", id);
        return new ScopedRoleMembershipItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.user entity.
     * @param id Unique identifier of the item
     * @return a DirectoryObjectItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public com.microsoft.graph.users.item.transitivememberof.item.DirectoryObjectItemRequestBuilder transitiveMemberOf(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("directoryObject%2Did", id);
        return new com.microsoft.graph.users.item.transitivememberof.item.DirectoryObjectItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DeleteRequestConfiguration() {
        }
    }
    /** Retrieve the properties and relationships of user object. */
    public class GetQueryParameters {
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
    public class GetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
        /**
         * Instantiates a new GetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public GetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class PatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new PatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public PatchRequestConfiguration() {
        }
    }
}
