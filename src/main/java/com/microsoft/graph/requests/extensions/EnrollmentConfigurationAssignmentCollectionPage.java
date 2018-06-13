// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseEnrollmentConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.generated.BaseEnrollmentConfigurationAssignmentCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Enrollment Configuration Assignment Collection Page.
 */
public class EnrollmentConfigurationAssignmentCollectionPage extends BaseEnrollmentConfigurationAssignmentCollectionPage implements IEnrollmentConfigurationAssignmentCollectionPage {

    /**
     * A collection page for DeviceEnrollmentConfiguration.
     *
     * @param response the serialized BaseEnrollmentConfigurationAssignmentCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public EnrollmentConfigurationAssignmentCollectionPage(final BaseEnrollmentConfigurationAssignmentCollectionResponse response, final IEnrollmentConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
