// Template Source: BaseEntityRequest.java.tt
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
import com.microsoft.graph.requests.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.DriveRequestBuilder;
import com.microsoft.graph.requests.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.SiteCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.SiteWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
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
import com.microsoft.graph.requests.UserActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.UserActivityRequestBuilder;
import com.microsoft.graph.requests.OnlineMeetingCollectionRequestBuilder;
import com.microsoft.graph.requests.OnlineMeetingRequestBuilder;
import com.microsoft.graph.requests.PresenceRequestBuilder;
import com.microsoft.graph.requests.AuthenticationRequestBuilder;
import com.microsoft.graph.requests.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamRequestBuilder;
import com.microsoft.graph.requests.UserTeamworkRequestBuilder;
import com.microsoft.graph.requests.TodoRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Request.
 */
public class UserRequest extends BaseRequest<User> {
	
    /**
     * The request for the User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, User.class);
    }

    /**
     * Gets the User from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<User> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the User from the service
     *
     * @return the User from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public User get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<User> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public User delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this User with a source
     *
     * @param sourceUser the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<User> patchAsync(@Nonnull final User sourceUser) {
        return sendAsync(HttpMethod.PATCH, sourceUser);
    }

    /**
     * Patches this User with a source
     *
     * @param sourceUser the source object with updates
     * @return the updated User
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public User patch(@Nonnull final User sourceUser) throws ClientException {
        return send(HttpMethod.PATCH, sourceUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<User> postAsync(@Nonnull final User newUser) {
        return sendAsync(HttpMethod.POST, newUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the new object to create
     * @return the created User
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public User post(@Nonnull final User newUser) throws ClientException {
        return send(HttpMethod.POST, newUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<User> putAsync(@Nonnull final User newUser) {
        return sendAsync(HttpMethod.PUT, newUser);
    }

    /**
     * Creates a User with a new object
     *
     * @param newUser the object to create/update
     * @return the created User
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public User put(@Nonnull final User newUser) throws ClientException {
        return send(HttpMethod.PUT, newUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserRequest select(@Nonnull final String value) {
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
     public UserRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

