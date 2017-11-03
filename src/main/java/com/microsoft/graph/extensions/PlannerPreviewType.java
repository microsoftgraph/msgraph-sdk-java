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

/**
 * The Enum Planner Preview Type.
*/
public enum PlannerPreviewType
{
    /**
    * automatic
    */
    AUTOMATIC,
    /**
    * no Preview
    */
    NOPREVIEW,
    /**
    * checklist
    */
    CHECKLIST,
    /**
    * description
    */
    DESCRIPTION,
    /**
    * reference
    */
    REFERENCE,
    /**
    * For PlannerPreviewType values that were not expected from the service
    */
    unexpectedValue
}
