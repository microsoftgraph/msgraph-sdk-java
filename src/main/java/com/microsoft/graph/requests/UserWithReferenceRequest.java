// Template Source: BaseEntityWithReferenceRequest.java.tt
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
import com.microsoft.graph.requests.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.LicenseDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.LicenseDetailsRequestBuilder;
import com.microsoft.graph.requests.OAuth2PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.OAuth2PermissionGrantRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.CalendarGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.CalendarGroupRequestBuilder;
import com.microsoft.graph.requests.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.CalendarRequestBuilder;
import com.microsoft.graph.requests.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.EventRequestBuilder;
import com.microsoft.graph.requests.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.ContactFolderRequestBuilder;
import com.microsoft.graph.requests.ContactCollectionRequestBuilder;
import com.microsoft.graph.requests.ContactRequestBuilder;
import com.microsoft.graph.requests.MailFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.MailFolderRequestBuilder;
import com.microsoft.graph.requests.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.MessageRequestBuilder;
import com.microsoft.graph.requests.PersonCollectionRequestBuilder;
import com.microsoft.graph.requests.PersonRequestBuilder;
import com.microsoft.graph.requests.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.DriveRequestBuilder;
import com.microsoft.graph.requests.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.SiteRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.ManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.UserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.UserActivityRequestBuilder;
import com.microsoft.graph.requests.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.OnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamRequestBuilder;
import com.microsoft.graph.requests.InferenceClassificationRequestBuilder;
import com.microsoft.graph.requests.OutlookUserRequestBuilder;
import com.microsoft.graph.requests.PlannerUserRequestBuilder;
import com.microsoft.graph.requests.OfficeGraphInsightsRequestBuilder;
import com.microsoft.graph.requests.UserSettingsRequestBuilder;
import com.microsoft.graph.requests.OnenoteRequestBuilder;
import com.microsoft.graph.requests.PresenceRequestBuilder;
import com.microsoft.graph.requests.UserTeamworkRequestBuilder;
import com.microsoft.graph.requests.TodoRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseWithReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User With Reference Request.
 */
public class UserWithReferenceRequest extends BaseWithReferenceRequest<User> {

    /**
     * The request for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserWithReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, User.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public UserWithReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UserWithReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
}