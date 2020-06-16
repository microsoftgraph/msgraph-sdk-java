// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupRequest;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.requests.extensions.IGroupAssignLicenseRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupValidatePropertiesRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupSubscribeByMailRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupUnsubscribeByMailRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupAddFavoriteRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRemoveFavoriteRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupResetUnseenCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRenewRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Request Builder.
 */
public interface IGroupRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IGroupRequest instance
     */
    IGroupRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGroupRequest instance
     */
    IGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments();

    IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder members();

    IDirectoryObjectWithReferenceRequestBuilder members(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf();

    IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder membersWithLicenseErrors();

    IDirectoryObjectWithReferenceRequestBuilder membersWithLicenseErrors(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMembers();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMembers(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id);

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    IDirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf();

    IDirectoryObjectCollectionWithReferencesRequestBuilder owners();

    IDirectoryObjectWithReferenceRequestBuilder owners(final String id);

    IGroupSettingCollectionRequestBuilder settings();

    IGroupSettingRequestBuilder settings(final String id);

    IConversationCollectionRequestBuilder conversations();

    IConversationRequestBuilder conversations(final String id);

    IProfilePhotoCollectionRequestBuilder photos();

    IProfilePhotoRequestBuilder photos(final String id);

    IDirectoryObjectCollectionRequestBuilder acceptedSenders();

    IDirectoryObjectRequestBuilder acceptedSenders(final String id);

    IDirectoryObjectCollectionRequestBuilder rejectedSenders();

    IDirectoryObjectRequestBuilder rejectedSenders(final String id);

    IConversationThreadCollectionRequestBuilder threads();

    IConversationThreadRequestBuilder threads(final String id);

    /**
     * Gets the request builder for Calendar
     *
     * @return the ICalendarRequestBuilder instance
     */
    ICalendarRequestBuilder calendar();

    IEventCollectionRequestBuilder calendarView();

    IEventRequestBuilder calendarView(final String id);

    IEventCollectionRequestBuilder events();

    IEventRequestBuilder events(final String id);

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the IProfilePhotoRequestBuilder instance
     */
    IProfilePhotoRequestBuilder photo();

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    IDriveRequestBuilder drive();

    IDriveCollectionRequestBuilder drives();

    IDriveRequestBuilder drives(final String id);

    ISiteCollectionRequestBuilder sites();

    ISiteRequestBuilder sites(final String id);

    IExtensionCollectionRequestBuilder extensions();

    IExtensionRequestBuilder extensions(final String id);

    IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies();

    IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id);

    /**
     * Gets the request builder for PlannerGroup
     *
     * @return the IPlannerGroupRequestBuilder instance
     */
    IPlannerGroupRequestBuilder planner();

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    IOnenoteRequestBuilder onenote();

    /**
     * Gets the request builder for Team
     *
     * @return the ITeamRequestBuilder instance
     */
    ITeamRequestBuilder team();
    IGroupAssignLicenseRequestBuilder assignLicense(final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses);
    IGroupValidatePropertiesRequestBuilder validateProperties(final String displayName, final String mailNickname, final java.util.UUID onBehalfOfUserId);
    IGroupSubscribeByMailRequestBuilder subscribeByMail();
    IGroupUnsubscribeByMailRequestBuilder unsubscribeByMail();
    IGroupAddFavoriteRequestBuilder addFavorite();
    IGroupRemoveFavoriteRequestBuilder removeFavorite();
    IGroupResetUnseenCountRequestBuilder resetUnseenCount();
    IGroupRenewRequestBuilder renew();

}
