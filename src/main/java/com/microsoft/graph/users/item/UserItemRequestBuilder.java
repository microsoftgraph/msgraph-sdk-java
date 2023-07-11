package com.microsoft.graph.users.item;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.User;
import com.microsoft.graph.users.item.activities.ActivitiesRequestBuilder;
import com.microsoft.graph.users.item.agreementacceptances.AgreementAcceptancesRequestBuilder;
import com.microsoft.graph.users.item.approleassignments.AppRoleAssignmentsRequestBuilder;
import com.microsoft.graph.users.item.assignlicense.AssignLicenseRequestBuilder;
import com.microsoft.graph.users.item.authentication.AuthenticationRequestBuilder;
import com.microsoft.graph.users.item.calendar.CalendarRequestBuilder;
import com.microsoft.graph.users.item.calendargroups.CalendarGroupsRequestBuilder;
import com.microsoft.graph.users.item.calendars.CalendarsRequestBuilder;
import com.microsoft.graph.users.item.calendarview.CalendarViewRequestBuilder;
import com.microsoft.graph.users.item.changepassword.ChangePasswordRequestBuilder;
import com.microsoft.graph.users.item.chats.ChatsRequestBuilder;
import com.microsoft.graph.users.item.checkmembergroups.CheckMemberGroupsRequestBuilder;
import com.microsoft.graph.users.item.checkmemberobjects.CheckMemberObjectsRequestBuilder;
import com.microsoft.graph.users.item.contactfolders.ContactFoldersRequestBuilder;
import com.microsoft.graph.users.item.contacts.ContactsRequestBuilder;
import com.microsoft.graph.users.item.createdobjects.CreatedObjectsRequestBuilder;
import com.microsoft.graph.users.item.devicemanagementtroubleshootingevents.DeviceManagementTroubleshootingEventsRequestBuilder;
import com.microsoft.graph.users.item.directreports.DirectReportsRequestBuilder;
import com.microsoft.graph.users.item.drive.DriveRequestBuilder;
import com.microsoft.graph.users.item.drives.DrivesRequestBuilder;
import com.microsoft.graph.users.item.employeeexperience.EmployeeExperienceRequestBuilder;
import com.microsoft.graph.users.item.events.EventsRequestBuilder;
import com.microsoft.graph.users.item.exportdeviceandappmanagementdata.ExportDeviceAndAppManagementDataRequestBuilder;
import com.microsoft.graph.users.item.exportdeviceandappmanagementdatawithskipwithtop.ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder;
import com.microsoft.graph.users.item.exportpersonaldata.ExportPersonalDataRequestBuilder;
import com.microsoft.graph.users.item.extensions.ExtensionsRequestBuilder;
import com.microsoft.graph.users.item.findmeetingtimes.FindMeetingTimesRequestBuilder;
import com.microsoft.graph.users.item.followedsites.FollowedSitesRequestBuilder;
import com.microsoft.graph.users.item.getmailtips.GetMailTipsRequestBuilder;
import com.microsoft.graph.users.item.getmanagedappdiagnosticstatuses.GetManagedAppDiagnosticStatusesRequestBuilder;
import com.microsoft.graph.users.item.getmanagedapppolicies.GetManagedAppPoliciesRequestBuilder;
import com.microsoft.graph.users.item.getmanageddeviceswithappfailures.GetManagedDevicesWithAppFailuresRequestBuilder;
import com.microsoft.graph.users.item.getmembergroups.GetMemberGroupsRequestBuilder;
import com.microsoft.graph.users.item.getmemberobjects.GetMemberObjectsRequestBuilder;
import com.microsoft.graph.users.item.inferenceclassification.InferenceClassificationRequestBuilder;
import com.microsoft.graph.users.item.insights.InsightsRequestBuilder;
import com.microsoft.graph.users.item.joinedteams.JoinedTeamsRequestBuilder;
import com.microsoft.graph.users.item.licensedetails.LicenseDetailsRequestBuilder;
import com.microsoft.graph.users.item.mailboxsettings.MailboxSettingsRequestBuilder;
import com.microsoft.graph.users.item.mailfolders.MailFoldersRequestBuilder;
import com.microsoft.graph.users.item.managedappregistrations.ManagedAppRegistrationsRequestBuilder;
import com.microsoft.graph.users.item.manageddevices.ManagedDevicesRequestBuilder;
import com.microsoft.graph.users.item.manager.ManagerRequestBuilder;
import com.microsoft.graph.users.item.memberof.MemberOfRequestBuilder;
import com.microsoft.graph.users.item.messages.MessagesRequestBuilder;
import com.microsoft.graph.users.item.oauth2permissiongrants.Oauth2PermissionGrantsRequestBuilder;
import com.microsoft.graph.users.item.onenote.OnenoteRequestBuilder;
import com.microsoft.graph.users.item.onlinemeetings.OnlineMeetingsRequestBuilder;
import com.microsoft.graph.users.item.outlook.OutlookRequestBuilder;
import com.microsoft.graph.users.item.owneddevices.OwnedDevicesRequestBuilder;
import com.microsoft.graph.users.item.ownedobjects.OwnedObjectsRequestBuilder;
import com.microsoft.graph.users.item.people.PeopleRequestBuilder;
import com.microsoft.graph.users.item.photo.PhotoRequestBuilder;
import com.microsoft.graph.users.item.photos.PhotosRequestBuilder;
import com.microsoft.graph.users.item.planner.PlannerRequestBuilder;
import com.microsoft.graph.users.item.presence.PresenceRequestBuilder;
import com.microsoft.graph.users.item.registereddevices.RegisteredDevicesRequestBuilder;
import com.microsoft.graph.users.item.reminderviewwithstartdatetimewithenddatetime.ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.users.item.removealldevicesfrommanagement.RemoveAllDevicesFromManagementRequestBuilder;
import com.microsoft.graph.users.item.reprocesslicenseassignment.ReprocessLicenseAssignmentRequestBuilder;
import com.microsoft.graph.users.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.users.item.revokesigninsessions.RevokeSignInSessionsRequestBuilder;
import com.microsoft.graph.users.item.scopedrolememberof.ScopedRoleMemberOfRequestBuilder;
import com.microsoft.graph.users.item.sendmail.SendMailRequestBuilder;
import com.microsoft.graph.users.item.settings.SettingsRequestBuilder;
import com.microsoft.graph.users.item.teamwork.TeamworkRequestBuilder;
import com.microsoft.graph.users.item.todo.TodoRequestBuilder;
import com.microsoft.graph.users.item.transitivememberof.TransitiveMemberOfRequestBuilder;
import com.microsoft.graph.users.item.translateexchangeids.TranslateExchangeIdsRequestBuilder;
import com.microsoft.graph.users.item.wipemanagedappregistrationsbydevicetag.WipeManagedAppRegistrationsByDeviceTagRequestBuilder;
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
 * Provides operations to manage the collection of user entities.
 */
public class UserItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activities property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the agreementAcceptances property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignments property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public AppRoleAssignmentsRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the assignLicense method.
     */
    @javax.annotation.Nonnull
    public AssignLicenseRequestBuilder assignLicense() {
        return new AssignLicenseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the authentication property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendar property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarGroups property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public CalendarGroupsRequestBuilder calendarGroups() {
        return new CalendarGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendars property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public CalendarsRequestBuilder calendars() {
        return new CalendarsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the changePassword method.
     */
    @javax.annotation.Nonnull
    public ChangePasswordRequestBuilder changePassword() {
        return new ChangePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the chats property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberGroups method.
     */
    @javax.annotation.Nonnull
    public CheckMemberGroupsRequestBuilder checkMemberGroups() {
        return new CheckMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the checkMemberObjects method.
     */
    @javax.annotation.Nonnull
    public CheckMemberObjectsRequestBuilder checkMemberObjects() {
        return new CheckMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contactFolders property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ContactFoldersRequestBuilder contactFolders() {
        return new ContactFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contacts property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdObjects property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceManagementTroubleshootingEvents property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public DeviceManagementTroubleshootingEventsRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directReports property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public DirectReportsRequestBuilder directReports() {
        return new DirectReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drives property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the employeeExperience property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public EmployeeExperienceRequestBuilder employeeExperience() {
        return new EmployeeExperienceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the events property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exportDeviceAndAppManagementData method.
     */
    @javax.annotation.Nonnull
    public ExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData() {
        return new ExportDeviceAndAppManagementDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exportPersonalData method.
     */
    @javax.annotation.Nonnull
    public ExportPersonalDataRequestBuilder exportPersonalData() {
        return new ExportPersonalDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findMeetingTimes method.
     */
    @javax.annotation.Nonnull
    public FindMeetingTimesRequestBuilder findMeetingTimes() {
        return new FindMeetingTimesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the followedSites property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public FollowedSitesRequestBuilder followedSites() {
        return new FollowedSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMailTips method.
     */
    @javax.annotation.Nonnull
    public GetMailTipsRequestBuilder getMailTips() {
        return new GetMailTipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppDiagnosticStatuses method.
     */
    @javax.annotation.Nonnull
    public GetManagedAppDiagnosticStatusesRequestBuilder getManagedAppDiagnosticStatuses() {
        return new GetManagedAppDiagnosticStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppPolicies method.
     */
    @javax.annotation.Nonnull
    public GetManagedAppPoliciesRequestBuilder getManagedAppPolicies() {
        return new GetManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedDevicesWithAppFailures method.
     */
    @javax.annotation.Nonnull
    public GetManagedDevicesWithAppFailuresRequestBuilder getManagedDevicesWithAppFailures() {
        return new GetManagedDevicesWithAppFailuresRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberGroups method.
     */
    @javax.annotation.Nonnull
    public GetMemberGroupsRequestBuilder getMemberGroups() {
        return new GetMemberGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMemberObjects method.
     */
    @javax.annotation.Nonnull
    public GetMemberObjectsRequestBuilder getMemberObjects() {
        return new GetMemberObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the inferenceClassification property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the insights property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public InsightsRequestBuilder insights() {
        return new InsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the joinedTeams property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public JoinedTeamsRequestBuilder joinedTeams() {
        return new JoinedTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the licenseDetails property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public LicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The mailboxSettings property
     */
    @javax.annotation.Nonnull
    public MailboxSettingsRequestBuilder mailboxSettings() {
        return new MailboxSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mailFolders property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public MailFoldersRequestBuilder mailFolders() {
        return new MailFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppRegistrations property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDevices property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the manager property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ManagerRequestBuilder manager() {
        return new ManagerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onenote property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the outlook property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public OutlookRequestBuilder outlook() {
        return new OutlookRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedDevices property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public OwnedDevicesRequestBuilder ownedDevices() {
        return new OwnedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedObjects property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the people property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public PeopleRequestBuilder people() {
        return new PeopleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photo property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photos property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the planner property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the presence property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public PresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the registeredDevices property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public RegisteredDevicesRequestBuilder registeredDevices() {
        return new RegisteredDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeAllDevicesFromManagement method.
     */
    @javax.annotation.Nonnull
    public RemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new RemoveAllDevicesFromManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprocessLicenseAssignment method.
     */
    @javax.annotation.Nonnull
    public ReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new ReprocessLicenseAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the revokeSignInSessions method.
     */
    @javax.annotation.Nonnull
    public RevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new RevokeSignInSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the scopedRoleMemberOf property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public ScopedRoleMemberOfRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendMail method.
     */
    @javax.annotation.Nonnull
    public SendMailRequestBuilder sendMail() {
        return new SendMailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the teamwork property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the todo property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.user entity.
     */
    @javax.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the translateExchangeIds method.
     */
    @javax.annotation.Nonnull
    public TranslateExchangeIdsRequestBuilder translateExchangeIds() {
        return new TranslateExchangeIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipeManagedAppRegistrationsByDeviceTag method.
     */
    @javax.annotation.Nonnull
    public WipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag() {
        return new WipeManagedAppRegistrationsByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UserItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UserItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete user.   When deleted, user resources are moved to a temporary container and can be restored within 30 days.  After that time, they are permanently deleted.  To learn more, see deletedItems.
     * @return a CompletableFuture of void
     * @see <a href="https://docs.microsoft.com/graph/api/user-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
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
     * Delete user.   When deleted, user resources are moved to a temporary container and can be restored within 30 days.  After that time, they are permanently deleted.  To learn more, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     * @see <a href="https://docs.microsoft.com/graph/api/user-delete?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
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
     * Provides operations to call the exportDeviceAndAppManagementData method.
     * @param skip Usage: skip={skip}
     * @param top Usage: top={top}
     * @return a exportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder exportDeviceAndAppManagementDataWithSkipWithTop(@javax.annotation.Nonnull final Integer skip, @javax.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(skip);
        Objects.requireNonNull(top);
        return new ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder(pathParameters, requestAdapter, skip, top);
    }
    /**
     * Retrieve the properties and relationships of user object.
     * @return a CompletableFuture of user
     * @see <a href="https://docs.microsoft.com/graph/api/user-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> get() {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<User> executionException = new java.util.concurrent.CompletableFuture<User>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Retrieve the properties and relationships of user object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     * @see <a href="https://docs.microsoft.com/graph/api/user-get?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> get(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<User> executionException = new java.util.concurrent.CompletableFuture<User>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body The request body
     * @return a CompletableFuture of user
     * @see <a href="https://docs.microsoft.com/graph/api/user-update?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> patch(@javax.annotation.Nonnull final User body) {
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<User> executionException = new java.util.concurrent.CompletableFuture<User>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of user
     * @see <a href="https://docs.microsoft.com/graph/api/user-update?view=graph-rest-1.0">Find more info here</a>
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<User> patch(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
            errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
            errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
            return this.requestAdapter.sendAsync(requestInfo, User::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            final java.util.concurrent.CompletableFuture<User> executionException = new java.util.concurrent.CompletableFuture<User>();
            executionException.completeExceptionally(ex);
            return executionException;
        }
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
     * Delete user.   When deleted, user resources are moved to a temporary container and can be restored within 30 days.  After that time, they are permanently deleted.  To learn more, see deletedItems.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() throws URISyntaxException {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete user.   When deleted, user resources are moved to a temporary container and can be restored within 30 days.  After that time, they are permanently deleted.  To learn more, see deletedItems.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Retrieve the properties and relationships of user object.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation() throws URISyntaxException {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of user object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body The request body
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final User body) throws URISyntaxException {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a user object. Not all properties can be updated by Member or Guest users with their default permissions without Administrator roles. Compare member and guest default permissions to see properties they can manage.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@javax.annotation.Nonnull final User body, @javax.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
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
     * Retrieve the properties and relationships of user object.
     */
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @javax.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
