// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.AttendeeBase;
import com.microsoft.graph.models.LocationConstraint;
import com.microsoft.graph.models.TimeConstraint;
import com.microsoft.graph.models.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.MailTipsType;
import com.microsoft.graph.models.MailTips;
import java.util.EnumSet;
import com.microsoft.graph.models.Message;
import com.microsoft.graph.models.ExchangeIdFormat;
import com.microsoft.graph.models.ConvertIdResult;
import com.microsoft.graph.models.Reminder;
import com.microsoft.graph.models.ManagedAppDiagnosticStatus;
import com.microsoft.graph.models.ManagedAppPolicy;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.OrgContactRequestBuilder;
import com.microsoft.graph.requests.LicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.LicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.GroupRequestBuilder;
import com.microsoft.graph.requests.ApplicationRequestBuilder;
import com.microsoft.graph.requests.DeviceRequestBuilder;
import com.microsoft.graph.requests.OAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.OAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EndpointRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.CalendarRequestBuilder;
import com.microsoft.graph.requests.CalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.CalendarGroupRequestBuilder;
import com.microsoft.graph.requests.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.EventRequestBuilder;
import com.microsoft.graph.requests.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.ContactFolderRequestBuilder;
import com.microsoft.graph.requests.ContactCollectionRequestBuilder;
import com.microsoft.graph.requests.ContactRequestBuilder;
import com.microsoft.graph.requests.InferenceClassificationRequestBuilder;
import com.microsoft.graph.requests.MailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.MailFolderRequestBuilder;
import com.microsoft.graph.requests.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.MessageRequestBuilder;
import com.microsoft.graph.requests.OutlookUserRequestBuilder;
import com.microsoft.graph.requests.PersonCollectionRequestBuilder;
import com.microsoft.graph.requests.PersonRequestBuilder;
import com.microsoft.graph.requests.DriveRequestBuilder;
import com.microsoft.graph.requests.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.SiteCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.SiteWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
import com.microsoft.graph.requests.AgreementAcceptanceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.AgreementAcceptanceWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.ManagedAppRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.ManagedAppRegistrationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.PlannerUserRequestBuilder;
import com.microsoft.graph.requests.OfficeGraphInsightsRequestBuilder;
import com.microsoft.graph.requests.UserSettingsRequestBuilder;
import com.microsoft.graph.requests.OnenoteRequestBuilder;
import com.microsoft.graph.requests.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.UserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.UserActivityRequestBuilder;
import com.microsoft.graph.requests.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.OnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.PresenceRequestBuilder;
import com.microsoft.graph.requests.AuthenticationRequestBuilder;
import com.microsoft.graph.requests.ChatCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatRequestBuilder;
import com.microsoft.graph.requests.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamRequestBuilder;
import com.microsoft.graph.requests.UserTeamworkRequestBuilder;
import com.microsoft.graph.requests.TodoRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User With Reference Request Builder.
 */
public class UserWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<User, UserWithReferenceRequest, UserReferenceRequestBuilder> {

    /**
     * The request builder for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserWithReferenceRequest.class, UserReferenceRequestBuilder.class);
    }
}
