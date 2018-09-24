// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.requests.generated.IBaseDriveItemRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The interface for the Drive Item Request Builder.
 */
public interface IDriveItemRequestBuilder extends IBaseDriveItemRequestBuilder {


    /**
     * Gets the item request builder for the specified item path
     * @param path The path to the item
     * @return The request builder for the specified item
     */
    IDriveItemRequestBuilder itemWithPath(final String path);
}
