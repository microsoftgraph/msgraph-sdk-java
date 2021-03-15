// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Printer Processing State Detail.
*/
public enum PrinterProcessingStateDetail
{
    /**
    * paused
    */
    PAUSED,
    /**
    * media Jam
    */
    MEDIA_JAM,
    /**
    * media Needed
    */
    MEDIA_NEEDED,
    /**
    * media Low
    */
    MEDIA_LOW,
    /**
    * media Empty
    */
    MEDIA_EMPTY,
    /**
    * cover Open
    */
    COVER_OPEN,
    /**
    * interlock Open
    */
    INTERLOCK_OPEN,
    /**
    * output Tray Missing
    */
    OUTPUT_TRAY_MISSING,
    /**
    * output Area Full
    */
    OUTPUT_AREA_FULL,
    /**
    * marker Supply Low
    */
    MARKER_SUPPLY_LOW,
    /**
    * marker Supply Empty
    */
    MARKER_SUPPLY_EMPTY,
    /**
    * input Tray Missing
    */
    INPUT_TRAY_MISSING,
    /**
    * output Area Almost Full
    */
    OUTPUT_AREA_ALMOST_FULL,
    /**
    * marker Waste Almost Full
    */
    MARKER_WASTE_ALMOST_FULL,
    /**
    * marker Waste Full
    */
    MARKER_WASTE_FULL,
    /**
    * fuser Over Temp
    */
    FUSER_OVER_TEMP,
    /**
    * fuser Under Temp
    */
    FUSER_UNDER_TEMP,
    /**
    * other
    */
    OTHER,
    /**
    * none
    */
    NONE,
    /**
    * moving To Paused
    */
    MOVING_TO_PAUSED,
    /**
    * shutdown
    */
    SHUTDOWN,
    /**
    * connecting To Device
    */
    CONNECTING_TO_DEVICE,
    /**
    * timed Out
    */
    TIMED_OUT,
    /**
    * stopping
    */
    STOPPING,
    /**
    * stopped Partially
    */
    STOPPED_PARTIALLY,
    /**
    * toner Low
    */
    TONER_LOW,
    /**
    * toner Empty
    */
    TONER_EMPTY,
    /**
    * spool Area Full
    */
    SPOOL_AREA_FULL,
    /**
    * door Open
    */
    DOOR_OPEN,
    /**
    * optical Photo Conductor Near End Of Life
    */
    OPTICAL_PHOTO_CONDUCTOR_NEAR_END_OF_LIFE,
    /**
    * optical Photo Conductor Life Over
    */
    OPTICAL_PHOTO_CONDUCTOR_LIFE_OVER,
    /**
    * developer Low
    */
    DEVELOPER_LOW,
    /**
    * developer Empty
    */
    DEVELOPER_EMPTY,
    /**
    * interpreter Resource Unavailable
    */
    INTERPRETER_RESOURCE_UNAVAILABLE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PrinterProcessingStateDetail values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
