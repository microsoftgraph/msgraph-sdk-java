// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import java.util.EnumSet;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.generated.MailTipsType;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseUserGetMailTipsCollectionRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the User Get Mail Tips Collection Request Builder.
 */
public class UserGetMailTipsCollectionRequestBuilder extends BaseUserGetMailTipsCollectionRequestBuilder implements IUserGetMailTipsCollectionRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param emailAddresses the emailAddresses
     * @param mailTipsOptions the mailTipsOptions
     */
    public UserGetMailTipsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<String> emailAddresses, final EnumSet<MailTipsType> mailTipsOptions) {
        super(requestUrl, client, requestOptions, emailAddresses, mailTipsOptions);
    }
}
