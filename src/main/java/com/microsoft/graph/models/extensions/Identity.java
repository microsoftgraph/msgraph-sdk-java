// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.generated.BaseIdentity;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Identity.
 */
public class Identity extends BaseIdentity {

    @SerializedName("email")
    @Expose
    public String email;
}
