// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseGroupSettingTemplateCollectionPage;
import com.microsoft.graph.requests.generated.BaseGroupSettingTemplateCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Group Setting Template Collection Page.
 */
public class GroupSettingTemplateCollectionPage extends BaseGroupSettingTemplateCollectionPage implements IGroupSettingTemplateCollectionPage {

    /**
     * A collection page for GroupSettingTemplate.
     *
     * @param response the serialized BaseGroupSettingTemplateCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public GroupSettingTemplateCollectionPage(final BaseGroupSettingTemplateCollectionResponse response, final IGroupSettingTemplateCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
