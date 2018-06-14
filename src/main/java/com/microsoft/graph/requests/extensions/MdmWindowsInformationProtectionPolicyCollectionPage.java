// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseMdmWindowsInformationProtectionPolicyCollectionPage;
import com.microsoft.graph.requests.generated.BaseMdmWindowsInformationProtectionPolicyCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Mdm Windows Information Protection Policy Collection Page.
 */
public class MdmWindowsInformationProtectionPolicyCollectionPage extends BaseMdmWindowsInformationProtectionPolicyCollectionPage implements IMdmWindowsInformationProtectionPolicyCollectionPage {

    /**
     * A collection page for DeviceAppManagement.
     *
     * @param response the serialized BaseMdmWindowsInformationProtectionPolicyCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public MdmWindowsInformationProtectionPolicyCollectionPage(final BaseMdmWindowsInformationProtectionPolicyCollectionResponse response, final IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
