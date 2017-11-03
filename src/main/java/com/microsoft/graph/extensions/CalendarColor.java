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
 * The Enum Calendar Color.
*/
public enum CalendarColor
{
    /**
    * light Blue
    */
    LIGHTBLUE,
    /**
    * light Green
    */
    LIGHTGREEN,
    /**
    * light Orange
    */
    LIGHTORANGE,
    /**
    * light Gray
    */
    LIGHTGRAY,
    /**
    * light Yellow
    */
    LIGHTYELLOW,
    /**
    * light Teal
    */
    LIGHTTEAL,
    /**
    * light Pink
    */
    LIGHTPINK,
    /**
    * light Brown
    */
    LIGHTBROWN,
    /**
    * light Red
    */
    LIGHTRED,
    /**
    * max Color
    */
    MAXCOLOR,
    /**
    * auto
    */
    AUTO,
    /**
    * For CalendarColor values that were not expected from the service
    */
    unexpectedValue
}
