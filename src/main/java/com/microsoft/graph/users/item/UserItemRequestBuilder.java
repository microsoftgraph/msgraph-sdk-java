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
import com.microsoft.graph.users.item.retryserviceprovisioning.RetryServiceProvisioningRequestBuilder;
import com.microsoft.graph.users.item.revokesigninsessions.RevokeSignInSessionsRequestBuilder;
import com.microsoft.graph.users.item.scopedrolememberof.ScopedRoleMemberOfRequestBuilder;
import com.microsoft.graph.users.item.sendmail.SendMailRequestBuilder;
import com.microsoft.graph.users.item.serviceprovisioningerrors.ServiceProvisioningErrorsRequestBuilder;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the collection of user entities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the activities property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ActivitiesRequestBuilder activities() {
        return new ActivitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the agreementAcceptances property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public AgreementAcceptancesRequestBuilder agreementAcceptances() {
        return new AgreementAcceptancesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the appRoleAssignments property of the microsoft.graph.user entity.
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
     * Provides operations to manage the authentication property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public AuthenticationRequestBuilder authentication() {
        return new AuthenticationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendar property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarGroups property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarGroupsRequestBuilder calendarGroups() {
        return new CalendarGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendars property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarsRequestBuilder calendars() {
        return new CalendarsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the calendarView property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public CalendarViewRequestBuilder calendarView() {
        return new CalendarViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the changePassword method.
     */
    @jakarta.annotation.Nonnull
    public ChangePasswordRequestBuilder changePassword() {
        return new ChangePasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the chats property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ChatsRequestBuilder chats() {
        return new ChatsRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to manage the contactFolders property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ContactFoldersRequestBuilder contactFolders() {
        return new ContactFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the contacts property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ContactsRequestBuilder contacts() {
        return new ContactsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the createdObjects property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public CreatedObjectsRequestBuilder createdObjects() {
        return new CreatedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the deviceManagementTroubleshootingEvents property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public DeviceManagementTroubleshootingEventsRequestBuilder deviceManagementTroubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the directReports property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public DirectReportsRequestBuilder directReports() {
        return new DirectReportsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drive property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the drives property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public DrivesRequestBuilder drives() {
        return new DrivesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the employeeExperience property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public EmployeeExperienceRequestBuilder employeeExperience() {
        return new EmployeeExperienceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the events property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exportDeviceAndAppManagementData method.
     */
    @jakarta.annotation.Nonnull
    public ExportDeviceAndAppManagementDataRequestBuilder exportDeviceAndAppManagementData() {
        return new ExportDeviceAndAppManagementDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the exportPersonalData method.
     */
    @jakarta.annotation.Nonnull
    public ExportPersonalDataRequestBuilder exportPersonalData() {
        return new ExportPersonalDataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the extensions property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ExtensionsRequestBuilder extensions() {
        return new ExtensionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the findMeetingTimes method.
     */
    @jakarta.annotation.Nonnull
    public FindMeetingTimesRequestBuilder findMeetingTimes() {
        return new FindMeetingTimesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the followedSites property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public FollowedSitesRequestBuilder followedSites() {
        return new FollowedSitesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getMailTips method.
     */
    @jakarta.annotation.Nonnull
    public GetMailTipsRequestBuilder getMailTips() {
        return new GetMailTipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppDiagnosticStatuses method.
     */
    @jakarta.annotation.Nonnull
    public GetManagedAppDiagnosticStatusesRequestBuilder getManagedAppDiagnosticStatuses() {
        return new GetManagedAppDiagnosticStatusesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedAppPolicies method.
     */
    @jakarta.annotation.Nonnull
    public GetManagedAppPoliciesRequestBuilder getManagedAppPolicies() {
        return new GetManagedAppPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getManagedDevicesWithAppFailures method.
     */
    @jakarta.annotation.Nonnull
    public GetManagedDevicesWithAppFailuresRequestBuilder getManagedDevicesWithAppFailures() {
        return new GetManagedDevicesWithAppFailuresRequestBuilder(pathParameters, requestAdapter);
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
     * Provides operations to manage the inferenceClassification property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public InferenceClassificationRequestBuilder inferenceClassification() {
        return new InferenceClassificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the insights property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public InsightsRequestBuilder insights() {
        return new InsightsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the joinedTeams property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public JoinedTeamsRequestBuilder joinedTeams() {
        return new JoinedTeamsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the licenseDetails property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public LicenseDetailsRequestBuilder licenseDetails() {
        return new LicenseDetailsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The mailboxSettings property
     */
    @jakarta.annotation.Nonnull
    public MailboxSettingsRequestBuilder mailboxSettings() {
        return new MailboxSettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the mailFolders property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public MailFoldersRequestBuilder mailFolders() {
        return new MailFoldersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedAppRegistrations property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedAppRegistrationsRequestBuilder managedAppRegistrations() {
        return new ManagedAppRegistrationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the managedDevices property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ManagedDevicesRequestBuilder managedDevices() {
        return new ManagedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the manager property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ManagerRequestBuilder manager() {
        return new ManagerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the memberOf property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public MemberOfRequestBuilder memberOf() {
        return new MemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder messages() {
        return new MessagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the oauth2PermissionGrants property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public Oauth2PermissionGrantsRequestBuilder oauth2PermissionGrants() {
        return new Oauth2PermissionGrantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onenote property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the onlineMeetings property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public OnlineMeetingsRequestBuilder onlineMeetings() {
        return new OnlineMeetingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the outlook property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public OutlookRequestBuilder outlook() {
        return new OutlookRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedDevices property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public OwnedDevicesRequestBuilder ownedDevices() {
        return new OwnedDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the ownedObjects property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public OwnedObjectsRequestBuilder ownedObjects() {
        return new OwnedObjectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the people property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public PeopleRequestBuilder people() {
        return new PeopleRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photo property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the photos property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public PhotosRequestBuilder photos() {
        return new PhotosRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the planner property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public PlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the presence property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public PresenceRequestBuilder presence() {
        return new PresenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the registeredDevices property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public RegisteredDevicesRequestBuilder registeredDevices() {
        return new RegisteredDevicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the removeAllDevicesFromManagement method.
     */
    @jakarta.annotation.Nonnull
    public RemoveAllDevicesFromManagementRequestBuilder removeAllDevicesFromManagement() {
        return new RemoveAllDevicesFromManagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reprocessLicenseAssignment method.
     */
    @jakarta.annotation.Nonnull
    public ReprocessLicenseAssignmentRequestBuilder reprocessLicenseAssignment() {
        return new ReprocessLicenseAssignmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the restore method.
     */
    @jakarta.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the retryServiceProvisioning method.
     */
    @jakarta.annotation.Nonnull
    public RetryServiceProvisioningRequestBuilder retryServiceProvisioning() {
        return new RetryServiceProvisioningRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the revokeSignInSessions method.
     */
    @jakarta.annotation.Nonnull
    public RevokeSignInSessionsRequestBuilder revokeSignInSessions() {
        return new RevokeSignInSessionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the scopedRoleMemberOf property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public ScopedRoleMemberOfRequestBuilder scopedRoleMemberOf() {
        return new ScopedRoleMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the sendMail method.
     */
    @jakarta.annotation.Nonnull
    public SendMailRequestBuilder sendMail() {
        return new SendMailRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The serviceProvisioningErrors property
     */
    @jakarta.annotation.Nonnull
    public ServiceProvisioningErrorsRequestBuilder serviceProvisioningErrors() {
        return new ServiceProvisioningErrorsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the settings property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public SettingsRequestBuilder settings() {
        return new SettingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the teamwork property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public TeamworkRequestBuilder teamwork() {
        return new TeamworkRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the todo property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public TodoRequestBuilder todo() {
        return new TodoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the transitiveMemberOf property of the microsoft.graph.user entity.
     */
    @jakarta.annotation.Nonnull
    public TransitiveMemberOfRequestBuilder transitiveMemberOf() {
        return new TransitiveMemberOfRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the translateExchangeIds method.
     */
    @jakarta.annotation.Nonnull
    public TranslateExchangeIdsRequestBuilder translateExchangeIds() {
        return new TranslateExchangeIdsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the wipeManagedAppRegistrationsByDeviceTag method.
     */
    @jakarta.annotation.Nonnull
    public WipeManagedAppRegistrationsByDeviceTagRequestBuilder wipeManagedAppRegistrationsByDeviceTag() {
        return new WipeManagedAppRegistrationsByDeviceTagRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new UserItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UserItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes a user.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-onboarding-user-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Deletes a user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/intune-onboarding-user-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, Void.class, errorMapping);
    }
    /**
     * Provides operations to call the exportDeviceAndAppManagementData method.
     * @param skip Usage: skip={skip}
     * @param top Usage: top={top}
     * @return a ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder exportDeviceAndAppManagementDataWithSkipWithTop(@jakarta.annotation.Nonnull final Integer skip, @jakarta.annotation.Nonnull final Integer top) {
        Objects.requireNonNull(skip);
        Objects.requireNonNull(top);
        return new ExportDeviceAndAppManagementDataWithSkipWithTopRequestBuilder(pathParameters, requestAdapter, skip, top);
    }
    /**
     * Retrieve the properties and relationships of user object. This API is available in the following national cloud deployments.
     * @return a User
     * @see <a href="https://learn.microsoft.com/graph/api/user-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of user object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a User
     * @see <a href="https://learn.microsoft.com/graph/api/user-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, User::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the properties of a user object.
     * @param body The request body
     * @return a User
     * @see <a href="https://learn.microsoft.com/graph/api/intune-mam-user-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User patch(@jakarta.annotation.Nonnull final User body) {
        return patch(body, null);
    }
    /**
     * Update the properties of a user object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a User
     * @see <a href="https://learn.microsoft.com/graph/api/intune-mam-user-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public User patch(@jakarta.annotation.Nonnull final User body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, User::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provides operations to call the reminderView method.
     * @param EndDateTime Usage: EndDateTime='{EndDateTime}'
     * @param StartDateTime Usage: StartDateTime='{StartDateTime}'
     * @return a ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder reminderViewWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final String EndDateTime, @jakarta.annotation.Nonnull final String StartDateTime) {
        Objects.requireNonNull(EndDateTime);
        Objects.requireNonNull(StartDateTime);
        return new ReminderViewWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, EndDateTime, StartDateTime);
    }
    /**
     * Deletes a user.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a user.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final DeleteRequestConfiguration requestConfig = new DeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.DELETE;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of user object. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of user object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the properties of a user object.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final User body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of a user object.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final User body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        if (requestConfiguration != null) {
            final PatchRequestConfiguration requestConfig = new PatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        requestInfo.httpMethod = HttpMethod.PATCH;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a UserItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of user object. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
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
