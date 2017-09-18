// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Find Meeting Times Request Builder.
 */
public class UserFindMeetingTimesRequestBuilder extends BaseUserFindMeetingTimesRequestBuilder implements IUserFindMeetingTimesRequestBuilder {

    /**
     * The request builder for this UserFindMeetingTimes
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public UserFindMeetingTimesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final java.util.List<AttendeeBase> attendees, final LocationConstraint locationConstraint, final TimeConstraint timeConstraint, final javax.xml.datatype.Duration meetingDuration, final Integer maxCandidates, final Boolean isOrganizerOptional, final Boolean returnSuggestionReasons, final Double minimumAttendeePercentage) {
        super(requestUrl, client, requestOptions, attendees, locationConstraint, timeConstraint, meetingDuration, maxCandidates, isOrganizerOptional, returnSuggestionReasons, minimumAttendeePercentage);
    }
}
