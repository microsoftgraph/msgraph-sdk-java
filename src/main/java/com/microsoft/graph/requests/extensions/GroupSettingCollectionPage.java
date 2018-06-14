// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.BaseGroupSettingCollectionPage;
import com.microsoft.graph.requests.generated.BaseGroupSettingCollectionResponse;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Group Setting Collection Page.
 */
public class GroupSettingCollectionPage extends BaseGroupSettingCollectionPage implements IGroupSettingCollectionPage {

    /**
     * A collection page for GroupSetting.
     *
     * @param response the serialized BaseGroupSettingCollectionResponse from the service
     * @param builder the request builder for the next collection page
     */
    public GroupSettingCollectionPage(final BaseGroupSettingCollectionResponse response, final IGroupSettingCollectionRequestBuilder builder) {
        super(response, builder);
    }
}
