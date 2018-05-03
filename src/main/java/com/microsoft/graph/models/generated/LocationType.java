// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

/**
 * The Enum Location Type.
*/
public enum LocationType
{
    /**
    * default
    */
    DEFAULT,
    /**
    * conference Room
    */
    CONFERENCE_ROOM,
    /**
    * home Address
    */
    HOME_ADDRESS,
    /**
    * business Address
    */
    BUSINESS_ADDRESS,
    /**
    * geo Coordinates
    */
    GEO_COORDINATES,
    /**
    * street Address
    */
    STREET_ADDRESS,
    /**
    * hotel
    */
    HOTEL,
    /**
    * restaurant
    */
    RESTAURANT,
    /**
    * local Business
    */
    LOCAL_BUSINESS,
    /**
    * postal Address
    */
    POSTAL_ADDRESS,
    /**
    * For LocationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
