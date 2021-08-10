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
    * alert Removal Of Binary Change Entry
    */
    ALERT_REMOVAL_OF_BINARY_CHANGE_ENTRY,
    /**
    * bander Added
    */
    BANDER_ADDED,
    /**
    * bander Almost Empty
    */
    BANDER_ALMOST_EMPTY,
    /**
    * bander Almost Full
    */
    BANDER_ALMOST_FULL,
    /**
    * bander At Limit
    */
    BANDER_AT_LIMIT,
    /**
    * bander Closed
    */
    BANDER_CLOSED,
    /**
    * bander Configuration Change
    */
    BANDER_CONFIGURATION_CHANGE,
    /**
    * bander Cover Closed
    */
    BANDER_COVER_CLOSED,
    /**
    * bander Cover Open
    */
    BANDER_COVER_OPEN,
    /**
    * bander Empty
    */
    BANDER_EMPTY,
    /**
    * bander Full
    */
    BANDER_FULL,
    /**
    * bander Interlock Closed
    */
    BANDER_INTERLOCK_CLOSED,
    /**
    * bander Interlock Open
    */
    BANDER_INTERLOCK_OPEN,
    /**
    * bander Jam
    */
    BANDER_JAM,
    /**
    * bander Life Almost Over
    */
    BANDER_LIFE_ALMOST_OVER,
    /**
    * bander Life Over
    */
    BANDER_LIFE_OVER,
    /**
    * bander Memory Exhausted
    */
    BANDER_MEMORY_EXHAUSTED,
    /**
    * bander Missing
    */
    BANDER_MISSING,
    /**
    * bander Motor Failure
    */
    BANDER_MOTOR_FAILURE,
    /**
    * bander Near Limit
    */
    BANDER_NEAR_LIMIT,
    /**
    * bander Offline
    */
    BANDER_OFFLINE,
    /**
    * bander Opened
    */
    BANDER_OPENED,
    /**
    * bander Over Temperature
    */
    BANDER_OVER_TEMPERATURE,
    /**
    * bander Power Saver
    */
    BANDER_POWER_SAVER,
    /**
    * bander Recoverable Failure
    */
    BANDER_RECOVERABLE_FAILURE,
    /**
    * bander Recoverable Storage
    */
    BANDER_RECOVERABLE_STORAGE,
    /**
    * bander Removed
    */
    BANDER_REMOVED,
    /**
    * bander Resource Added
    */
    BANDER_RESOURCE_ADDED,
    /**
    * bander Resource Removed
    */
    BANDER_RESOURCE_REMOVED,
    /**
    * bander Thermistor Failure
    */
    BANDER_THERMISTOR_FAILURE,
    /**
    * bander Timing Failure
    */
    BANDER_TIMING_FAILURE,
    /**
    * bander Turned Off
    */
    BANDER_TURNED_OFF,
    /**
    * bander Turned On
    */
    BANDER_TURNED_ON,
    /**
    * bander Under Temperature
    */
    BANDER_UNDER_TEMPERATURE,
    /**
    * bander Unrecoverable Failure
    */
    BANDER_UNRECOVERABLE_FAILURE,
    /**
    * bander Unrecoverable Storage Error
    */
    BANDER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * bander Warming Up
    */
    BANDER_WARMING_UP,
    /**
    * binder Added
    */
    BINDER_ADDED,
    /**
    * binder Almost Empty
    */
    BINDER_ALMOST_EMPTY,
    /**
    * binder Almost Full
    */
    BINDER_ALMOST_FULL,
    /**
    * binder At Limit
    */
    BINDER_AT_LIMIT,
    /**
    * binder Closed
    */
    BINDER_CLOSED,
    /**
    * binder Configuration Change
    */
    BINDER_CONFIGURATION_CHANGE,
    /**
    * binder Cover Closed
    */
    BINDER_COVER_CLOSED,
    /**
    * binder Cover Open
    */
    BINDER_COVER_OPEN,
    /**
    * binder Empty
    */
    BINDER_EMPTY,
    /**
    * binder Full
    */
    BINDER_FULL,
    /**
    * binder Interlock Closed
    */
    BINDER_INTERLOCK_CLOSED,
    /**
    * binder Interlock Open
    */
    BINDER_INTERLOCK_OPEN,
    /**
    * binder Jam
    */
    BINDER_JAM,
    /**
    * binder Life Almost Over
    */
    BINDER_LIFE_ALMOST_OVER,
    /**
    * binder Life Over
    */
    BINDER_LIFE_OVER,
    /**
    * binder Memory Exhausted
    */
    BINDER_MEMORY_EXHAUSTED,
    /**
    * binder Missing
    */
    BINDER_MISSING,
    /**
    * binder Motor Failure
    */
    BINDER_MOTOR_FAILURE,
    /**
    * binder Near Limit
    */
    BINDER_NEAR_LIMIT,
    /**
    * binder Offline
    */
    BINDER_OFFLINE,
    /**
    * binder Opened
    */
    BINDER_OPENED,
    /**
    * binder Over Temperature
    */
    BINDER_OVER_TEMPERATURE,
    /**
    * binder Power Saver
    */
    BINDER_POWER_SAVER,
    /**
    * binder Recoverable Failure
    */
    BINDER_RECOVERABLE_FAILURE,
    /**
    * binder Recoverable Storage
    */
    BINDER_RECOVERABLE_STORAGE,
    /**
    * binder Removed
    */
    BINDER_REMOVED,
    /**
    * binder Resource Added
    */
    BINDER_RESOURCE_ADDED,
    /**
    * binder Resource Removed
    */
    BINDER_RESOURCE_REMOVED,
    /**
    * binder Thermistor Failure
    */
    BINDER_THERMISTOR_FAILURE,
    /**
    * binder Timing Failure
    */
    BINDER_TIMING_FAILURE,
    /**
    * binder Turned Off
    */
    BINDER_TURNED_OFF,
    /**
    * binder Turned On
    */
    BINDER_TURNED_ON,
    /**
    * binder Under Temperature
    */
    BINDER_UNDER_TEMPERATURE,
    /**
    * binder Unrecoverable Failure
    */
    BINDER_UNRECOVERABLE_FAILURE,
    /**
    * binder Unrecoverable Storage Error
    */
    BINDER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * binder Warming Up
    */
    BINDER_WARMING_UP,
    /**
    * camera Failure
    */
    CAMERA_FAILURE,
    /**
    * chamber Cooling
    */
    CHAMBER_COOLING,
    /**
    * chamber Failure
    */
    CHAMBER_FAILURE,
    /**
    * chamber Heating
    */
    CHAMBER_HEATING,
    /**
    * chamber Temperature High
    */
    CHAMBER_TEMPERATURE_HIGH,
    /**
    * chamber Temperature Low
    */
    CHAMBER_TEMPERATURE_LOW,
    /**
    * cleaner Life Almost Over
    */
    CLEANER_LIFE_ALMOST_OVER,
    /**
    * cleaner Life Over
    */
    CLEANER_LIFE_OVER,
    /**
    * configuration Change
    */
    CONFIGURATION_CHANGE,
    /**
    * deactivated
    */
    DEACTIVATED,
    /**
    * deleted
    */
    DELETED,
    /**
    * die Cutter Added
    */
    DIE_CUTTER_ADDED,
    /**
    * die Cutter Almost Empty
    */
    DIE_CUTTER_ALMOST_EMPTY,
    /**
    * die Cutter Almost Full
    */
    DIE_CUTTER_ALMOST_FULL,
    /**
    * die Cutter At Limit
    */
    DIE_CUTTER_AT_LIMIT,
    /**
    * die Cutter Closed
    */
    DIE_CUTTER_CLOSED,
    /**
    * die Cutter Configuration Change
    */
    DIE_CUTTER_CONFIGURATION_CHANGE,
    /**
    * die Cutter Cover Closed
    */
    DIE_CUTTER_COVER_CLOSED,
    /**
    * die Cutter Cover Open
    */
    DIE_CUTTER_COVER_OPEN,
    /**
    * die Cutter Empty
    */
    DIE_CUTTER_EMPTY,
    /**
    * die Cutter Full
    */
    DIE_CUTTER_FULL,
    /**
    * die Cutter Interlock Closed
    */
    DIE_CUTTER_INTERLOCK_CLOSED,
    /**
    * die Cutter Interlock Open
    */
    DIE_CUTTER_INTERLOCK_OPEN,
    /**
    * die Cutter Jam
    */
    DIE_CUTTER_JAM,
    /**
    * die Cutter Life Almost Over
    */
    DIE_CUTTER_LIFE_ALMOST_OVER,
    /**
    * die Cutter Life Over
    */
    DIE_CUTTER_LIFE_OVER,
    /**
    * die Cutter Memory Exhausted
    */
    DIE_CUTTER_MEMORY_EXHAUSTED,
    /**
    * die Cutter Missing
    */
    DIE_CUTTER_MISSING,
    /**
    * die Cutter Motor Failure
    */
    DIE_CUTTER_MOTOR_FAILURE,
    /**
    * die Cutter Near Limit
    */
    DIE_CUTTER_NEAR_LIMIT,
    /**
    * die Cutter Offline
    */
    DIE_CUTTER_OFFLINE,
    /**
    * die Cutter Opened
    */
    DIE_CUTTER_OPENED,
    /**
    * die Cutter Over Temperature
    */
    DIE_CUTTER_OVER_TEMPERATURE,
    /**
    * die Cutter Power Saver
    */
    DIE_CUTTER_POWER_SAVER,
    /**
    * die Cutter Recoverable Failure
    */
    DIE_CUTTER_RECOVERABLE_FAILURE,
    /**
    * die Cutter Recoverable Storage
    */
    DIE_CUTTER_RECOVERABLE_STORAGE,
    /**
    * die Cutter Removed
    */
    DIE_CUTTER_REMOVED,
    /**
    * die Cutter Resource Added
    */
    DIE_CUTTER_RESOURCE_ADDED,
    /**
    * die Cutter Resource Removed
    */
    DIE_CUTTER_RESOURCE_REMOVED,
    /**
    * die Cutter Thermistor Failure
    */
    DIE_CUTTER_THERMISTOR_FAILURE,
    /**
    * die Cutter Timing Failure
    */
    DIE_CUTTER_TIMING_FAILURE,
    /**
    * die Cutter Turned Off
    */
    DIE_CUTTER_TURNED_OFF,
    /**
    * die Cutter Turned On
    */
    DIE_CUTTER_TURNED_ON,
    /**
    * die Cutter Under Temperature
    */
    DIE_CUTTER_UNDER_TEMPERATURE,
    /**
    * die Cutter Unrecoverable Failure
    */
    DIE_CUTTER_UNRECOVERABLE_FAILURE,
    /**
    * die Cutter Unrecoverable Storage Error
    */
    DIE_CUTTER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * die Cutter Warming Up
    */
    DIE_CUTTER_WARMING_UP,
    /**
    * extruder Cooling
    */
    EXTRUDER_COOLING,
    /**
    * extruder Failure
    */
    EXTRUDER_FAILURE,
    /**
    * extruder Heating
    */
    EXTRUDER_HEATING,
    /**
    * extruder Jam
    */
    EXTRUDER_JAM,
    /**
    * extruder Temperature High
    */
    EXTRUDER_TEMPERATURE_HIGH,
    /**
    * extruder Temperature Low
    */
    EXTRUDER_TEMPERATURE_LOW,
    /**
    * fan Failure
    */
    FAN_FAILURE,
    /**
    * fax Modem Life Almost Over
    */
    FAX_MODEM_LIFE_ALMOST_OVER,
    /**
    * fax Modem Life Over
    */
    FAX_MODEM_LIFE_OVER,
    /**
    * fax Modem Missing
    */
    FAX_MODEM_MISSING,
    /**
    * fax Modem Turned Off
    */
    FAX_MODEM_TURNED_OFF,
    /**
    * fax Modem Turned On
    */
    FAX_MODEM_TURNED_ON,
    /**
    * folder Added
    */
    FOLDER_ADDED,
    /**
    * folder Almost Empty
    */
    FOLDER_ALMOST_EMPTY,
    /**
    * folder Almost Full
    */
    FOLDER_ALMOST_FULL,
    /**
    * folder At Limit
    */
    FOLDER_AT_LIMIT,
    /**
    * folder Closed
    */
    FOLDER_CLOSED,
    /**
    * folder Configuration Change
    */
    FOLDER_CONFIGURATION_CHANGE,
    /**
    * folder Cover Closed
    */
    FOLDER_COVER_CLOSED,
    /**
    * folder Cover Open
    */
    FOLDER_COVER_OPEN,
    /**
    * folder Empty
    */
    FOLDER_EMPTY,
    /**
    * folder Full
    */
    FOLDER_FULL,
    /**
    * folder Interlock Closed
    */
    FOLDER_INTERLOCK_CLOSED,
    /**
    * folder Interlock Open
    */
    FOLDER_INTERLOCK_OPEN,
    /**
    * folder Jam
    */
    FOLDER_JAM,
    /**
    * folder Life Almost Over
    */
    FOLDER_LIFE_ALMOST_OVER,
    /**
    * folder Life Over
    */
    FOLDER_LIFE_OVER,
    /**
    * folder Memory Exhausted
    */
    FOLDER_MEMORY_EXHAUSTED,
    /**
    * folder Missing
    */
    FOLDER_MISSING,
    /**
    * folder Motor Failure
    */
    FOLDER_MOTOR_FAILURE,
    /**
    * folder Near Limit
    */
    FOLDER_NEAR_LIMIT,
    /**
    * folder Offline
    */
    FOLDER_OFFLINE,
    /**
    * folder Opened
    */
    FOLDER_OPENED,
    /**
    * folder Over Temperature
    */
    FOLDER_OVER_TEMPERATURE,
    /**
    * folder Power Saver
    */
    FOLDER_POWER_SAVER,
    /**
    * folder Recoverable Failure
    */
    FOLDER_RECOVERABLE_FAILURE,
    /**
    * folder Recoverable Storage
    */
    FOLDER_RECOVERABLE_STORAGE,
    /**
    * folder Removed
    */
    FOLDER_REMOVED,
    /**
    * folder Resource Added
    */
    FOLDER_RESOURCE_ADDED,
    /**
    * folder Resource Removed
    */
    FOLDER_RESOURCE_REMOVED,
    /**
    * folder Thermistor Failure
    */
    FOLDER_THERMISTOR_FAILURE,
    /**
    * folder Timing Failure
    */
    FOLDER_TIMING_FAILURE,
    /**
    * folder Turned Off
    */
    FOLDER_TURNED_OFF,
    /**
    * folder Turned On
    */
    FOLDER_TURNED_ON,
    /**
    * folder Under Temperature
    */
    FOLDER_UNDER_TEMPERATURE,
    /**
    * folder Unrecoverable Failure
    */
    FOLDER_UNRECOVERABLE_FAILURE,
    /**
    * folder Unrecoverable Storage Error
    */
    FOLDER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * folder Warming Up
    */
    FOLDER_WARMING_UP,
    /**
    * hibernate
    */
    HIBERNATE,
    /**
    * hold New Jobs
    */
    HOLD_NEW_JOBS,
    /**
    * identify Printer Requested
    */
    IDENTIFY_PRINTER_REQUESTED,
    /**
    * imprinter Added
    */
    IMPRINTER_ADDED,
    /**
    * imprinter Almost Empty
    */
    IMPRINTER_ALMOST_EMPTY,
    /**
    * imprinter Almost Full
    */
    IMPRINTER_ALMOST_FULL,
    /**
    * imprinter At Limit
    */
    IMPRINTER_AT_LIMIT,
    /**
    * imprinter Closed
    */
    IMPRINTER_CLOSED,
    /**
    * imprinter Configuration Change
    */
    IMPRINTER_CONFIGURATION_CHANGE,
    /**
    * imprinter Cover Closed
    */
    IMPRINTER_COVER_CLOSED,
    /**
    * imprinter Cover Open
    */
    IMPRINTER_COVER_OPEN,
    /**
    * imprinter Empty
    */
    IMPRINTER_EMPTY,
    /**
    * imprinter Full
    */
    IMPRINTER_FULL,
    /**
    * imprinter Interlock Closed
    */
    IMPRINTER_INTERLOCK_CLOSED,
    /**
    * imprinter Interlock Open
    */
    IMPRINTER_INTERLOCK_OPEN,
    /**
    * imprinter Jam
    */
    IMPRINTER_JAM,
    /**
    * imprinter Life Almost Over
    */
    IMPRINTER_LIFE_ALMOST_OVER,
    /**
    * imprinter Life Over
    */
    IMPRINTER_LIFE_OVER,
    /**
    * imprinter Memory Exhausted
    */
    IMPRINTER_MEMORY_EXHAUSTED,
    /**
    * imprinter Missing
    */
    IMPRINTER_MISSING,
    /**
    * imprinter Motor Failure
    */
    IMPRINTER_MOTOR_FAILURE,
    /**
    * imprinter Near Limit
    */
    IMPRINTER_NEAR_LIMIT,
    /**
    * imprinter Offline
    */
    IMPRINTER_OFFLINE,
    /**
    * imprinter Opened
    */
    IMPRINTER_OPENED,
    /**
    * imprinter Over Temperature
    */
    IMPRINTER_OVER_TEMPERATURE,
    /**
    * imprinter Power Saver
    */
    IMPRINTER_POWER_SAVER,
    /**
    * imprinter Recoverable Failure
    */
    IMPRINTER_RECOVERABLE_FAILURE,
    /**
    * imprinter Recoverable Storage
    */
    IMPRINTER_RECOVERABLE_STORAGE,
    /**
    * imprinter Removed
    */
    IMPRINTER_REMOVED,
    /**
    * imprinter Resource Added
    */
    IMPRINTER_RESOURCE_ADDED,
    /**
    * imprinter Resource Removed
    */
    IMPRINTER_RESOURCE_REMOVED,
    /**
    * imprinter Thermistor Failure
    */
    IMPRINTER_THERMISTOR_FAILURE,
    /**
    * imprinter Timing Failure
    */
    IMPRINTER_TIMING_FAILURE,
    /**
    * imprinter Turned Off
    */
    IMPRINTER_TURNED_OFF,
    /**
    * imprinter Turned On
    */
    IMPRINTER_TURNED_ON,
    /**
    * imprinter Under Temperature
    */
    IMPRINTER_UNDER_TEMPERATURE,
    /**
    * imprinter Unrecoverable Failure
    */
    IMPRINTER_UNRECOVERABLE_FAILURE,
    /**
    * imprinter Unrecoverable Storage Error
    */
    IMPRINTER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * imprinter Warming Up
    */
    IMPRINTER_WARMING_UP,
    /**
    * input Cannot Feed Size Selected
    */
    INPUT_CANNOT_FEED_SIZE_SELECTED,
    /**
    * input Manual Input Request
    */
    INPUT_MANUAL_INPUT_REQUEST,
    /**
    * input Media Color Change
    */
    INPUT_MEDIA_COLOR_CHANGE,
    /**
    * input Media Form Parts Change
    */
    INPUT_MEDIA_FORM_PARTS_CHANGE,
    /**
    * input Media Size Change
    */
    INPUT_MEDIA_SIZE_CHANGE,
    /**
    * input Media Tray Failure
    */
    INPUT_MEDIA_TRAY_FAILURE,
    /**
    * input Media Tray Feed Error
    */
    INPUT_MEDIA_TRAY_FEED_ERROR,
    /**
    * input Media Tray Jam
    */
    INPUT_MEDIA_TRAY_JAM,
    /**
    * input Media Type Change
    */
    INPUT_MEDIA_TYPE_CHANGE,
    /**
    * input Media Weight Change
    */
    INPUT_MEDIA_WEIGHT_CHANGE,
    /**
    * input Pick Roller Failure
    */
    INPUT_PICK_ROLLER_FAILURE,
    /**
    * input Pick Roller Life Over
    */
    INPUT_PICK_ROLLER_LIFE_OVER,
    /**
    * input Pick Roller Life Warn
    */
    INPUT_PICK_ROLLER_LIFE_WARN,
    /**
    * input Pick Roller Missing
    */
    INPUT_PICK_ROLLER_MISSING,
    /**
    * input Tray Elevation Failure
    */
    INPUT_TRAY_ELEVATION_FAILURE,
    /**
    * input Tray Position Failure
    */
    INPUT_TRAY_POSITION_FAILURE,
    /**
    * inserter Added
    */
    INSERTER_ADDED,
    /**
    * inserter Almost Empty
    */
    INSERTER_ALMOST_EMPTY,
    /**
    * inserter Almost Full
    */
    INSERTER_ALMOST_FULL,
    /**
    * inserter At Limit
    */
    INSERTER_AT_LIMIT,
    /**
    * inserter Closed
    */
    INSERTER_CLOSED,
    /**
    * inserter Configuration Change
    */
    INSERTER_CONFIGURATION_CHANGE,
    /**
    * inserter Cover Closed
    */
    INSERTER_COVER_CLOSED,
    /**
    * inserter Cover Open
    */
    INSERTER_COVER_OPEN,
    /**
    * inserter Empty
    */
    INSERTER_EMPTY,
    /**
    * inserter Full
    */
    INSERTER_FULL,
    /**
    * inserter Interlock Closed
    */
    INSERTER_INTERLOCK_CLOSED,
    /**
    * inserter Interlock Open
    */
    INSERTER_INTERLOCK_OPEN,
    /**
    * inserter Jam
    */
    INSERTER_JAM,
    /**
    * inserter Life Almost Over
    */
    INSERTER_LIFE_ALMOST_OVER,
    /**
    * inserter Life Over
    */
    INSERTER_LIFE_OVER,
    /**
    * inserter Memory Exhausted
    */
    INSERTER_MEMORY_EXHAUSTED,
    /**
    * inserter Missing
    */
    INSERTER_MISSING,
    /**
    * inserter Motor Failure
    */
    INSERTER_MOTOR_FAILURE,
    /**
    * inserter Near Limit
    */
    INSERTER_NEAR_LIMIT,
    /**
    * inserter Offline
    */
    INSERTER_OFFLINE,
    /**
    * inserter Opened
    */
    INSERTER_OPENED,
    /**
    * inserter Over Temperature
    */
    INSERTER_OVER_TEMPERATURE,
    /**
    * inserter Power Saver
    */
    INSERTER_POWER_SAVER,
    /**
    * inserter Recoverable Failure
    */
    INSERTER_RECOVERABLE_FAILURE,
    /**
    * inserter Recoverable Storage
    */
    INSERTER_RECOVERABLE_STORAGE,
    /**
    * inserter Removed
    */
    INSERTER_REMOVED,
    /**
    * inserter Resource Added
    */
    INSERTER_RESOURCE_ADDED,
    /**
    * inserter Resource Removed
    */
    INSERTER_RESOURCE_REMOVED,
    /**
    * inserter Thermistor Failure
    */
    INSERTER_THERMISTOR_FAILURE,
    /**
    * inserter Timing Failure
    */
    INSERTER_TIMING_FAILURE,
    /**
    * inserter Turned Off
    */
    INSERTER_TURNED_OFF,
    /**
    * inserter Turned On
    */
    INSERTER_TURNED_ON,
    /**
    * inserter Under Temperature
    */
    INSERTER_UNDER_TEMPERATURE,
    /**
    * inserter Unrecoverable Failure
    */
    INSERTER_UNRECOVERABLE_FAILURE,
    /**
    * inserter Unrecoverable Storage Error
    */
    INSERTER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * inserter Warming Up
    */
    INSERTER_WARMING_UP,
    /**
    * interlock Closed
    */
    INTERLOCK_CLOSED,
    /**
    * interpreter Cartridge Added
    */
    INTERPRETER_CARTRIDGE_ADDED,
    /**
    * interpreter Cartridge Deleted
    */
    INTERPRETER_CARTRIDGE_DELETED,
    /**
    * interpreter Complex Page Encountered
    */
    INTERPRETER_COMPLEX_PAGE_ENCOUNTERED,
    /**
    * interpreter Memory Decrease
    */
    INTERPRETER_MEMORY_DECREASE,
    /**
    * interpreter Memory Increase
    */
    INTERPRETER_MEMORY_INCREASE,
    /**
    * interpreter Resource Added
    */
    INTERPRETER_RESOURCE_ADDED,
    /**
    * interpreter Resource Deleted
    */
    INTERPRETER_RESOURCE_DELETED,
    /**
    * lamp At Eol
    */
    LAMP_AT_EOL,
    /**
    * lamp Failure
    */
    LAMP_FAILURE,
    /**
    * lamp Near Eol
    */
    LAMP_NEAR_EOL,
    /**
    * laser At Eol
    */
    LASER_AT_EOL,
    /**
    * laser Failure
    */
    LASER_FAILURE,
    /**
    * laser Near Eol
    */
    LASER_NEAR_EOL,
    /**
    * make Envelope Added
    */
    MAKE_ENVELOPE_ADDED,
    /**
    * make Envelope Almost Empty
    */
    MAKE_ENVELOPE_ALMOST_EMPTY,
    /**
    * make Envelope Almost Full
    */
    MAKE_ENVELOPE_ALMOST_FULL,
    /**
    * make Envelope At Limit
    */
    MAKE_ENVELOPE_AT_LIMIT,
    /**
    * make Envelope Closed
    */
    MAKE_ENVELOPE_CLOSED,
    /**
    * make Envelope Configuration Change
    */
    MAKE_ENVELOPE_CONFIGURATION_CHANGE,
    /**
    * make Envelope Cover Closed
    */
    MAKE_ENVELOPE_COVER_CLOSED,
    /**
    * make Envelope Cover Open
    */
    MAKE_ENVELOPE_COVER_OPEN,
    /**
    * make Envelope Empty
    */
    MAKE_ENVELOPE_EMPTY,
    /**
    * make Envelope Full
    */
    MAKE_ENVELOPE_FULL,
    /**
    * make Envelope Interlock Closed
    */
    MAKE_ENVELOPE_INTERLOCK_CLOSED,
    /**
    * make Envelope Interlock Open
    */
    MAKE_ENVELOPE_INTERLOCK_OPEN,
    /**
    * make Envelope Jam
    */
    MAKE_ENVELOPE_JAM,
    /**
    * make Envelope Life Almost Over
    */
    MAKE_ENVELOPE_LIFE_ALMOST_OVER,
    /**
    * make Envelope Life Over
    */
    MAKE_ENVELOPE_LIFE_OVER,
    /**
    * make Envelope Memory Exhausted
    */
    MAKE_ENVELOPE_MEMORY_EXHAUSTED,
    /**
    * make Envelope Missing
    */
    MAKE_ENVELOPE_MISSING,
    /**
    * make Envelope Motor Failure
    */
    MAKE_ENVELOPE_MOTOR_FAILURE,
    /**
    * make Envelope Near Limit
    */
    MAKE_ENVELOPE_NEAR_LIMIT,
    /**
    * make Envelope Offline
    */
    MAKE_ENVELOPE_OFFLINE,
    /**
    * make Envelope Opened
    */
    MAKE_ENVELOPE_OPENED,
    /**
    * make Envelope Over Temperature
    */
    MAKE_ENVELOPE_OVER_TEMPERATURE,
    /**
    * make Envelope Power Saver
    */
    MAKE_ENVELOPE_POWER_SAVER,
    /**
    * make Envelope Recoverable Failure
    */
    MAKE_ENVELOPE_RECOVERABLE_FAILURE,
    /**
    * make Envelope Recoverable Storage
    */
    MAKE_ENVELOPE_RECOVERABLE_STORAGE,
    /**
    * make Envelope Removed
    */
    MAKE_ENVELOPE_REMOVED,
    /**
    * make Envelope Resource Added
    */
    MAKE_ENVELOPE_RESOURCE_ADDED,
    /**
    * make Envelope Resource Removed
    */
    MAKE_ENVELOPE_RESOURCE_REMOVED,
    /**
    * make Envelope Thermistor Failure
    */
    MAKE_ENVELOPE_THERMISTOR_FAILURE,
    /**
    * make Envelope Timing Failure
    */
    MAKE_ENVELOPE_TIMING_FAILURE,
    /**
    * make Envelope Turned Off
    */
    MAKE_ENVELOPE_TURNED_OFF,
    /**
    * make Envelope Turned On
    */
    MAKE_ENVELOPE_TURNED_ON,
    /**
    * make Envelope Under Temperature
    */
    MAKE_ENVELOPE_UNDER_TEMPERATURE,
    /**
    * make Envelope Unrecoverable Failure
    */
    MAKE_ENVELOPE_UNRECOVERABLE_FAILURE,
    /**
    * make Envelope Unrecoverable Storage Error
    */
    MAKE_ENVELOPE_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * make Envelope Warming Up
    */
    MAKE_ENVELOPE_WARMING_UP,
    /**
    * marker Adjusting Print Quality
    */
    MARKER_ADJUSTING_PRINT_QUALITY,
    /**
    * marker Cleaner Missing
    */
    MARKER_CLEANER_MISSING,
    /**
    * marker Developer Almost Empty
    */
    MARKER_DEVELOPER_ALMOST_EMPTY,
    /**
    * marker Developer Empty
    */
    MARKER_DEVELOPER_EMPTY,
    /**
    * marker Developer Missing
    */
    MARKER_DEVELOPER_MISSING,
    /**
    * marker Fuser Missing
    */
    MARKER_FUSER_MISSING,
    /**
    * marker Fuser Thermistor Failure
    */
    MARKER_FUSER_THERMISTOR_FAILURE,
    /**
    * marker Fuser Timing Failure
    */
    MARKER_FUSER_TIMING_FAILURE,
    /**
    * marker Ink Almost Empty
    */
    MARKER_INK_ALMOST_EMPTY,
    /**
    * marker Ink Empty
    */
    MARKER_INK_EMPTY,
    /**
    * marker Ink Missing
    */
    MARKER_INK_MISSING,
    /**
    * marker Opc Missing
    */
    MARKER_OPC_MISSING,
    /**
    * marker Print Ribbon Almost Empty
    */
    MARKER_PRINT_RIBBON_ALMOST_EMPTY,
    /**
    * marker Print Ribbon Empty
    */
    MARKER_PRINT_RIBBON_EMPTY,
    /**
    * marker Print Ribbon Missing
    */
    MARKER_PRINT_RIBBON_MISSING,
    /**
    * marker Supply Almost Empty
    */
    MARKER_SUPPLY_ALMOST_EMPTY,
    /**
    * marker Supply Missing
    */
    MARKER_SUPPLY_MISSING,
    /**
    * marker Toner Cartridge Missing
    */
    MARKER_TONER_CARTRIDGE_MISSING,
    /**
    * marker Toner Missing
    */
    MARKER_TONER_MISSING,
    /**
    * marker Waste Ink Receptacle Almost Full
    */
    MARKER_WASTE_INK_RECEPTACLE_ALMOST_FULL,
    /**
    * marker Waste Ink Receptacle Full
    */
    MARKER_WASTE_INK_RECEPTACLE_FULL,
    /**
    * marker Waste Ink Receptacle Missing
    */
    MARKER_WASTE_INK_RECEPTACLE_MISSING,
    /**
    * marker Waste Missing
    */
    MARKER_WASTE_MISSING,
    /**
    * marker Waste Toner Receptacle Almost Full
    */
    MARKER_WASTE_TONER_RECEPTACLE_ALMOST_FULL,
    /**
    * marker Waste Toner Receptacle Full
    */
    MARKER_WASTE_TONER_RECEPTACLE_FULL,
    /**
    * marker Waste Toner Receptacle Missing
    */
    MARKER_WASTE_TONER_RECEPTACLE_MISSING,
    /**
    * material Empty
    */
    MATERIAL_EMPTY,
    /**
    * material Low
    */
    MATERIAL_LOW,
    /**
    * material Needed
    */
    MATERIAL_NEEDED,
    /**
    * media Drying
    */
    MEDIA_DRYING,
    /**
    * media Path Cannot Duplex Media Selected
    */
    MEDIA_PATH_CANNOT_DUPLEX_MEDIA_SELECTED,
    /**
    * media Path Failure
    */
    MEDIA_PATH_FAILURE,
    /**
    * media Path Input Empty
    */
    MEDIA_PATH_INPUT_EMPTY,
    /**
    * media Path Input Feed Error
    */
    MEDIA_PATH_INPUT_FEED_ERROR,
    /**
    * media Path Input Jam
    */
    MEDIA_PATH_INPUT_JAM,
    /**
    * media Path Input Request
    */
    MEDIA_PATH_INPUT_REQUEST,
    /**
    * media Path Jam
    */
    MEDIA_PATH_JAM,
    /**
    * media Path Media Tray Almost Full
    */
    MEDIA_PATH_MEDIA_TRAY_ALMOST_FULL,
    /**
    * media Path Media Tray Full
    */
    MEDIA_PATH_MEDIA_TRAY_FULL,
    /**
    * media Path Media Tray Missing
    */
    MEDIA_PATH_MEDIA_TRAY_MISSING,
    /**
    * media Path Output Feed Error
    */
    MEDIA_PATH_OUTPUT_FEED_ERROR,
    /**
    * media Path Output Full
    */
    MEDIA_PATH_OUTPUT_FULL,
    /**
    * media Path Output Jam
    */
    MEDIA_PATH_OUTPUT_JAM,
    /**
    * media Path Pick Roller Failure
    */
    MEDIA_PATH_PICK_ROLLER_FAILURE,
    /**
    * media Path Pick Roller Life Over
    */
    MEDIA_PATH_PICK_ROLLER_LIFE_OVER,
    /**
    * media Path Pick Roller Life Warn
    */
    MEDIA_PATH_PICK_ROLLER_LIFE_WARN,
    /**
    * media Path Pick Roller Missing
    */
    MEDIA_PATH_PICK_ROLLER_MISSING,
    /**
    * motor Failure
    */
    MOTOR_FAILURE,
    /**
    * output Mailbox Select Failure
    */
    OUTPUT_MAILBOX_SELECT_FAILURE,
    /**
    * output Media Tray Failure
    */
    OUTPUT_MEDIA_TRAY_FAILURE,
    /**
    * output Media Tray Feed Error
    */
    OUTPUT_MEDIA_TRAY_FEED_ERROR,
    /**
    * output Media Tray Jam
    */
    OUTPUT_MEDIA_TRAY_JAM,
    /**
    * perforater Added
    */
    PERFORATER_ADDED,
    /**
    * perforater Almost Empty
    */
    PERFORATER_ALMOST_EMPTY,
    /**
    * perforater Almost Full
    */
    PERFORATER_ALMOST_FULL,
    /**
    * perforater At Limit
    */
    PERFORATER_AT_LIMIT,
    /**
    * perforater Closed
    */
    PERFORATER_CLOSED,
    /**
    * perforater Configuration Change
    */
    PERFORATER_CONFIGURATION_CHANGE,
    /**
    * perforater Cover Closed
    */
    PERFORATER_COVER_CLOSED,
    /**
    * perforater Cover Open
    */
    PERFORATER_COVER_OPEN,
    /**
    * perforater Empty
    */
    PERFORATER_EMPTY,
    /**
    * perforater Full
    */
    PERFORATER_FULL,
    /**
    * perforater Interlock Closed
    */
    PERFORATER_INTERLOCK_CLOSED,
    /**
    * perforater Interlock Open
    */
    PERFORATER_INTERLOCK_OPEN,
    /**
    * perforater Jam
    */
    PERFORATER_JAM,
    /**
    * perforater Life Almost Over
    */
    PERFORATER_LIFE_ALMOST_OVER,
    /**
    * perforater Life Over
    */
    PERFORATER_LIFE_OVER,
    /**
    * perforater Memory Exhausted
    */
    PERFORATER_MEMORY_EXHAUSTED,
    /**
    * perforater Missing
    */
    PERFORATER_MISSING,
    /**
    * perforater Motor Failure
    */
    PERFORATER_MOTOR_FAILURE,
    /**
    * perforater Near Limit
    */
    PERFORATER_NEAR_LIMIT,
    /**
    * perforater Offline
    */
    PERFORATER_OFFLINE,
    /**
    * perforater Opened
    */
    PERFORATER_OPENED,
    /**
    * perforater Over Temperature
    */
    PERFORATER_OVER_TEMPERATURE,
    /**
    * perforater Power Saver
    */
    PERFORATER_POWER_SAVER,
    /**
    * perforater Recoverable Failure
    */
    PERFORATER_RECOVERABLE_FAILURE,
    /**
    * perforater Recoverable Storage
    */
    PERFORATER_RECOVERABLE_STORAGE,
    /**
    * perforater Removed
    */
    PERFORATER_REMOVED,
    /**
    * perforater Resource Added
    */
    PERFORATER_RESOURCE_ADDED,
    /**
    * perforater Resource Removed
    */
    PERFORATER_RESOURCE_REMOVED,
    /**
    * perforater Thermistor Failure
    */
    PERFORATER_THERMISTOR_FAILURE,
    /**
    * perforater Timing Failure
    */
    PERFORATER_TIMING_FAILURE,
    /**
    * perforater Turned Off
    */
    PERFORATER_TURNED_OFF,
    /**
    * perforater Turned On
    */
    PERFORATER_TURNED_ON,
    /**
    * perforater Under Temperature
    */
    PERFORATER_UNDER_TEMPERATURE,
    /**
    * perforater Unrecoverable Failure
    */
    PERFORATER_UNRECOVERABLE_FAILURE,
    /**
    * perforater Unrecoverable Storage Error
    */
    PERFORATER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * perforater Warming Up
    */
    PERFORATER_WARMING_UP,
    /**
    * platform Cooling
    */
    PLATFORM_COOLING,
    /**
    * platform Failure
    */
    PLATFORM_FAILURE,
    /**
    * platform Heating
    */
    PLATFORM_HEATING,
    /**
    * platform Temperature High
    */
    PLATFORM_TEMPERATURE_HIGH,
    /**
    * platform Temperature Low
    */
    PLATFORM_TEMPERATURE_LOW,
    /**
    * power Down
    */
    POWER_DOWN,
    /**
    * power Up
    */
    POWER_UP,
    /**
    * printer Manual Reset
    */
    PRINTER_MANUAL_RESET,
    /**
    * printer Nms Reset
    */
    PRINTER_NMS_RESET,
    /**
    * printer Ready To Print
    */
    PRINTER_READY_TO_PRINT,
    /**
    * puncher Added
    */
    PUNCHER_ADDED,
    /**
    * puncher Almost Empty
    */
    PUNCHER_ALMOST_EMPTY,
    /**
    * puncher Almost Full
    */
    PUNCHER_ALMOST_FULL,
    /**
    * puncher At Limit
    */
    PUNCHER_AT_LIMIT,
    /**
    * puncher Closed
    */
    PUNCHER_CLOSED,
    /**
    * puncher Configuration Change
    */
    PUNCHER_CONFIGURATION_CHANGE,
    /**
    * puncher Cover Closed
    */
    PUNCHER_COVER_CLOSED,
    /**
    * puncher Cover Open
    */
    PUNCHER_COVER_OPEN,
    /**
    * puncher Empty
    */
    PUNCHER_EMPTY,
    /**
    * puncher Full
    */
    PUNCHER_FULL,
    /**
    * puncher Interlock Closed
    */
    PUNCHER_INTERLOCK_CLOSED,
    /**
    * puncher Interlock Open
    */
    PUNCHER_INTERLOCK_OPEN,
    /**
    * puncher Jam
    */
    PUNCHER_JAM,
    /**
    * puncher Life Almost Over
    */
    PUNCHER_LIFE_ALMOST_OVER,
    /**
    * puncher Life Over
    */
    PUNCHER_LIFE_OVER,
    /**
    * puncher Memory Exhausted
    */
    PUNCHER_MEMORY_EXHAUSTED,
    /**
    * puncher Missing
    */
    PUNCHER_MISSING,
    /**
    * puncher Motor Failure
    */
    PUNCHER_MOTOR_FAILURE,
    /**
    * puncher Near Limit
    */
    PUNCHER_NEAR_LIMIT,
    /**
    * puncher Offline
    */
    PUNCHER_OFFLINE,
    /**
    * puncher Opened
    */
    PUNCHER_OPENED,
    /**
    * puncher Over Temperature
    */
    PUNCHER_OVER_TEMPERATURE,
    /**
    * puncher Power Saver
    */
    PUNCHER_POWER_SAVER,
    /**
    * puncher Recoverable Failure
    */
    PUNCHER_RECOVERABLE_FAILURE,
    /**
    * puncher Recoverable Storage
    */
    PUNCHER_RECOVERABLE_STORAGE,
    /**
    * puncher Removed
    */
    PUNCHER_REMOVED,
    /**
    * puncher Resource Added
    */
    PUNCHER_RESOURCE_ADDED,
    /**
    * puncher Resource Removed
    */
    PUNCHER_RESOURCE_REMOVED,
    /**
    * puncher Thermistor Failure
    */
    PUNCHER_THERMISTOR_FAILURE,
    /**
    * puncher Timing Failure
    */
    PUNCHER_TIMING_FAILURE,
    /**
    * puncher Turned Off
    */
    PUNCHER_TURNED_OFF,
    /**
    * puncher Turned On
    */
    PUNCHER_TURNED_ON,
    /**
    * puncher Under Temperature
    */
    PUNCHER_UNDER_TEMPERATURE,
    /**
    * puncher Unrecoverable Failure
    */
    PUNCHER_UNRECOVERABLE_FAILURE,
    /**
    * puncher Unrecoverable Storage Error
    */
    PUNCHER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * puncher Warming Up
    */
    PUNCHER_WARMING_UP,
    /**
    * resuming
    */
    RESUMING,
    /**
    * scan Media Path Failure
    */
    SCAN_MEDIA_PATH_FAILURE,
    /**
    * scan Media Path Input Empty
    */
    SCAN_MEDIA_PATH_INPUT_EMPTY,
    /**
    * scan Media Path Input Feed Error
    */
    SCAN_MEDIA_PATH_INPUT_FEED_ERROR,
    /**
    * scan Media Path Input Jam
    */
    SCAN_MEDIA_PATH_INPUT_JAM,
    /**
    * scan Media Path Input Request
    */
    SCAN_MEDIA_PATH_INPUT_REQUEST,
    /**
    * scan Media Path Jam
    */
    SCAN_MEDIA_PATH_JAM,
    /**
    * scan Media Path Output Feed Error
    */
    SCAN_MEDIA_PATH_OUTPUT_FEED_ERROR,
    /**
    * scan Media Path Output Full
    */
    SCAN_MEDIA_PATH_OUTPUT_FULL,
    /**
    * scan Media Path Output Jam
    */
    SCAN_MEDIA_PATH_OUTPUT_JAM,
    /**
    * scan Media Path Pick Roller Failure
    */
    SCAN_MEDIA_PATH_PICK_ROLLER_FAILURE,
    /**
    * scan Media Path Pick Roller Life Over
    */
    SCAN_MEDIA_PATH_PICK_ROLLER_LIFE_OVER,
    /**
    * scan Media Path Pick Roller Life Warn
    */
    SCAN_MEDIA_PATH_PICK_ROLLER_LIFE_WARN,
    /**
    * scan Media Path Pick Roller Missing
    */
    SCAN_MEDIA_PATH_PICK_ROLLER_MISSING,
    /**
    * scan Media Path Tray Almost Full
    */
    SCAN_MEDIA_PATH_TRAY_ALMOST_FULL,
    /**
    * scan Media Path Tray Full
    */
    SCAN_MEDIA_PATH_TRAY_FULL,
    /**
    * scan Media Path Tray Missing
    */
    SCAN_MEDIA_PATH_TRAY_MISSING,
    /**
    * scanner Light Failure
    */
    SCANNER_LIGHT_FAILURE,
    /**
    * scanner Light Life Almost Over
    */
    SCANNER_LIGHT_LIFE_ALMOST_OVER,
    /**
    * scanner Light Life Over
    */
    SCANNER_LIGHT_LIFE_OVER,
    /**
    * scanner Light Missing
    */
    SCANNER_LIGHT_MISSING,
    /**
    * scanner Sensor Failure
    */
    SCANNER_SENSOR_FAILURE,
    /**
    * scanner Sensor Life Almost Over
    */
    SCANNER_SENSOR_LIFE_ALMOST_OVER,
    /**
    * scanner Sensor Life Over
    */
    SCANNER_SENSOR_LIFE_OVER,
    /**
    * scanner Sensor Missing
    */
    SCANNER_SENSOR_MISSING,
    /**
    * separation Cutter Added
    */
    SEPARATION_CUTTER_ADDED,
    /**
    * separation Cutter Almost Empty
    */
    SEPARATION_CUTTER_ALMOST_EMPTY,
    /**
    * separation Cutter Almost Full
    */
    SEPARATION_CUTTER_ALMOST_FULL,
    /**
    * separation Cutter At Limit
    */
    SEPARATION_CUTTER_AT_LIMIT,
    /**
    * separation Cutter Closed
    */
    SEPARATION_CUTTER_CLOSED,
    /**
    * separation Cutter Configuration Change
    */
    SEPARATION_CUTTER_CONFIGURATION_CHANGE,
    /**
    * separation Cutter Cover Closed
    */
    SEPARATION_CUTTER_COVER_CLOSED,
    /**
    * separation Cutter Cover Open
    */
    SEPARATION_CUTTER_COVER_OPEN,
    /**
    * separation Cutter Empty
    */
    SEPARATION_CUTTER_EMPTY,
    /**
    * separation Cutter Full
    */
    SEPARATION_CUTTER_FULL,
    /**
    * separation Cutter Interlock Closed
    */
    SEPARATION_CUTTER_INTERLOCK_CLOSED,
    /**
    * separation Cutter Interlock Open
    */
    SEPARATION_CUTTER_INTERLOCK_OPEN,
    /**
    * separation Cutter Jam
    */
    SEPARATION_CUTTER_JAM,
    /**
    * separation Cutter Life Almost Over
    */
    SEPARATION_CUTTER_LIFE_ALMOST_OVER,
    /**
    * separation Cutter Life Over
    */
    SEPARATION_CUTTER_LIFE_OVER,
    /**
    * separation Cutter Memory Exhausted
    */
    SEPARATION_CUTTER_MEMORY_EXHAUSTED,
    /**
    * separation Cutter Missing
    */
    SEPARATION_CUTTER_MISSING,
    /**
    * separation Cutter Motor Failure
    */
    SEPARATION_CUTTER_MOTOR_FAILURE,
    /**
    * separation Cutter Near Limit
    */
    SEPARATION_CUTTER_NEAR_LIMIT,
    /**
    * separation Cutter Offline
    */
    SEPARATION_CUTTER_OFFLINE,
    /**
    * separation Cutter Opened
    */
    SEPARATION_CUTTER_OPENED,
    /**
    * separation Cutter Over Temperature
    */
    SEPARATION_CUTTER_OVER_TEMPERATURE,
    /**
    * separation Cutter Power Saver
    */
    SEPARATION_CUTTER_POWER_SAVER,
    /**
    * separation Cutter Recoverable Failure
    */
    SEPARATION_CUTTER_RECOVERABLE_FAILURE,
    /**
    * separation Cutter Recoverable Storage
    */
    SEPARATION_CUTTER_RECOVERABLE_STORAGE,
    /**
    * separation Cutter Removed
    */
    SEPARATION_CUTTER_REMOVED,
    /**
    * separation Cutter Resource Added
    */
    SEPARATION_CUTTER_RESOURCE_ADDED,
    /**
    * separation Cutter Resource Removed
    */
    SEPARATION_CUTTER_RESOURCE_REMOVED,
    /**
    * separation Cutter Thermistor Failure
    */
    SEPARATION_CUTTER_THERMISTOR_FAILURE,
    /**
    * separation Cutter Timing Failure
    */
    SEPARATION_CUTTER_TIMING_FAILURE,
    /**
    * separation Cutter Turned Off
    */
    SEPARATION_CUTTER_TURNED_OFF,
    /**
    * separation Cutter Turned On
    */
    SEPARATION_CUTTER_TURNED_ON,
    /**
    * separation Cutter Under Temperature
    */
    SEPARATION_CUTTER_UNDER_TEMPERATURE,
    /**
    * separation Cutter Unrecoverable Failure
    */
    SEPARATION_CUTTER_UNRECOVERABLE_FAILURE,
    /**
    * separation Cutter Unrecoverable Storage Error
    */
    SEPARATION_CUTTER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * separation Cutter Warming Up
    */
    SEPARATION_CUTTER_WARMING_UP,
    /**
    * sheet Rotator Added
    */
    SHEET_ROTATOR_ADDED,
    /**
    * sheet Rotator Almost Empty
    */
    SHEET_ROTATOR_ALMOST_EMPTY,
    /**
    * sheet Rotator Almost Full
    */
    SHEET_ROTATOR_ALMOST_FULL,
    /**
    * sheet Rotator At Limit
    */
    SHEET_ROTATOR_AT_LIMIT,
    /**
    * sheet Rotator Closed
    */
    SHEET_ROTATOR_CLOSED,
    /**
    * sheet Rotator Configuration Change
    */
    SHEET_ROTATOR_CONFIGURATION_CHANGE,
    /**
    * sheet Rotator Cover Closed
    */
    SHEET_ROTATOR_COVER_CLOSED,
    /**
    * sheet Rotator Cover Open
    */
    SHEET_ROTATOR_COVER_OPEN,
    /**
    * sheet Rotator Empty
    */
    SHEET_ROTATOR_EMPTY,
    /**
    * sheet Rotator Full
    */
    SHEET_ROTATOR_FULL,
    /**
    * sheet Rotator Interlock Closed
    */
    SHEET_ROTATOR_INTERLOCK_CLOSED,
    /**
    * sheet Rotator Interlock Open
    */
    SHEET_ROTATOR_INTERLOCK_OPEN,
    /**
    * sheet Rotator Jam
    */
    SHEET_ROTATOR_JAM,
    /**
    * sheet Rotator Life Almost Over
    */
    SHEET_ROTATOR_LIFE_ALMOST_OVER,
    /**
    * sheet Rotator Life Over
    */
    SHEET_ROTATOR_LIFE_OVER,
    /**
    * sheet Rotator Memory Exhausted
    */
    SHEET_ROTATOR_MEMORY_EXHAUSTED,
    /**
    * sheet Rotator Missing
    */
    SHEET_ROTATOR_MISSING,
    /**
    * sheet Rotator Motor Failure
    */
    SHEET_ROTATOR_MOTOR_FAILURE,
    /**
    * sheet Rotator Near Limit
    */
    SHEET_ROTATOR_NEAR_LIMIT,
    /**
    * sheet Rotator Offline
    */
    SHEET_ROTATOR_OFFLINE,
    /**
    * sheet Rotator Opened
    */
    SHEET_ROTATOR_OPENED,
    /**
    * sheet Rotator Over Temperature
    */
    SHEET_ROTATOR_OVER_TEMPERATURE,
    /**
    * sheet Rotator Power Saver
    */
    SHEET_ROTATOR_POWER_SAVER,
    /**
    * sheet Rotator Recoverable Failure
    */
    SHEET_ROTATOR_RECOVERABLE_FAILURE,
    /**
    * sheet Rotator Recoverable Storage
    */
    SHEET_ROTATOR_RECOVERABLE_STORAGE,
    /**
    * sheet Rotator Removed
    */
    SHEET_ROTATOR_REMOVED,
    /**
    * sheet Rotator Resource Added
    */
    SHEET_ROTATOR_RESOURCE_ADDED,
    /**
    * sheet Rotator Resource Removed
    */
    SHEET_ROTATOR_RESOURCE_REMOVED,
    /**
    * sheet Rotator Thermistor Failure
    */
    SHEET_ROTATOR_THERMISTOR_FAILURE,
    /**
    * sheet Rotator Timing Failure
    */
    SHEET_ROTATOR_TIMING_FAILURE,
    /**
    * sheet Rotator Turned Off
    */
    SHEET_ROTATOR_TURNED_OFF,
    /**
    * sheet Rotator Turned On
    */
    SHEET_ROTATOR_TURNED_ON,
    /**
    * sheet Rotator Under Temperature
    */
    SHEET_ROTATOR_UNDER_TEMPERATURE,
    /**
    * sheet Rotator Unrecoverable Failure
    */
    SHEET_ROTATOR_UNRECOVERABLE_FAILURE,
    /**
    * sheet Rotator Unrecoverable Storage Error
    */
    SHEET_ROTATOR_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * sheet Rotator Warming Up
    */
    SHEET_ROTATOR_WARMING_UP,
    /**
    * slitter Added
    */
    SLITTER_ADDED,
    /**
    * slitter Almost Empty
    */
    SLITTER_ALMOST_EMPTY,
    /**
    * slitter Almost Full
    */
    SLITTER_ALMOST_FULL,
    /**
    * slitter At Limit
    */
    SLITTER_AT_LIMIT,
    /**
    * slitter Closed
    */
    SLITTER_CLOSED,
    /**
    * slitter Configuration Change
    */
    SLITTER_CONFIGURATION_CHANGE,
    /**
    * slitter Cover Closed
    */
    SLITTER_COVER_CLOSED,
    /**
    * slitter Cover Open
    */
    SLITTER_COVER_OPEN,
    /**
    * slitter Empty
    */
    SLITTER_EMPTY,
    /**
    * slitter Full
    */
    SLITTER_FULL,
    /**
    * slitter Interlock Closed
    */
    SLITTER_INTERLOCK_CLOSED,
    /**
    * slitter Interlock Open
    */
    SLITTER_INTERLOCK_OPEN,
    /**
    * slitter Jam
    */
    SLITTER_JAM,
    /**
    * slitter Life Almost Over
    */
    SLITTER_LIFE_ALMOST_OVER,
    /**
    * slitter Life Over
    */
    SLITTER_LIFE_OVER,
    /**
    * slitter Memory Exhausted
    */
    SLITTER_MEMORY_EXHAUSTED,
    /**
    * slitter Missing
    */
    SLITTER_MISSING,
    /**
    * slitter Motor Failure
    */
    SLITTER_MOTOR_FAILURE,
    /**
    * slitter Near Limit
    */
    SLITTER_NEAR_LIMIT,
    /**
    * slitter Offline
    */
    SLITTER_OFFLINE,
    /**
    * slitter Opened
    */
    SLITTER_OPENED,
    /**
    * slitter Over Temperature
    */
    SLITTER_OVER_TEMPERATURE,
    /**
    * slitter Power Saver
    */
    SLITTER_POWER_SAVER,
    /**
    * slitter Recoverable Failure
    */
    SLITTER_RECOVERABLE_FAILURE,
    /**
    * slitter Recoverable Storage
    */
    SLITTER_RECOVERABLE_STORAGE,
    /**
    * slitter Removed
    */
    SLITTER_REMOVED,
    /**
    * slitter Resource Added
    */
    SLITTER_RESOURCE_ADDED,
    /**
    * slitter Resource Removed
    */
    SLITTER_RESOURCE_REMOVED,
    /**
    * slitter Thermistor Failure
    */
    SLITTER_THERMISTOR_FAILURE,
    /**
    * slitter Timing Failure
    */
    SLITTER_TIMING_FAILURE,
    /**
    * slitter Turned Off
    */
    SLITTER_TURNED_OFF,
    /**
    * slitter Turned On
    */
    SLITTER_TURNED_ON,
    /**
    * slitter Under Temperature
    */
    SLITTER_UNDER_TEMPERATURE,
    /**
    * slitter Unrecoverable Failure
    */
    SLITTER_UNRECOVERABLE_FAILURE,
    /**
    * slitter Unrecoverable Storage Error
    */
    SLITTER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * slitter Warming Up
    */
    SLITTER_WARMING_UP,
    /**
    * stacker Added
    */
    STACKER_ADDED,
    /**
    * stacker Almost Empty
    */
    STACKER_ALMOST_EMPTY,
    /**
    * stacker Almost Full
    */
    STACKER_ALMOST_FULL,
    /**
    * stacker At Limit
    */
    STACKER_AT_LIMIT,
    /**
    * stacker Closed
    */
    STACKER_CLOSED,
    /**
    * stacker Configuration Change
    */
    STACKER_CONFIGURATION_CHANGE,
    /**
    * stacker Cover Closed
    */
    STACKER_COVER_CLOSED,
    /**
    * stacker Cover Open
    */
    STACKER_COVER_OPEN,
    /**
    * stacker Empty
    */
    STACKER_EMPTY,
    /**
    * stacker Full
    */
    STACKER_FULL,
    /**
    * stacker Interlock Closed
    */
    STACKER_INTERLOCK_CLOSED,
    /**
    * stacker Interlock Open
    */
    STACKER_INTERLOCK_OPEN,
    /**
    * stacker Jam
    */
    STACKER_JAM,
    /**
    * stacker Life Almost Over
    */
    STACKER_LIFE_ALMOST_OVER,
    /**
    * stacker Life Over
    */
    STACKER_LIFE_OVER,
    /**
    * stacker Memory Exhausted
    */
    STACKER_MEMORY_EXHAUSTED,
    /**
    * stacker Missing
    */
    STACKER_MISSING,
    /**
    * stacker Motor Failure
    */
    STACKER_MOTOR_FAILURE,
    /**
    * stacker Near Limit
    */
    STACKER_NEAR_LIMIT,
    /**
    * stacker Offline
    */
    STACKER_OFFLINE,
    /**
    * stacker Opened
    */
    STACKER_OPENED,
    /**
    * stacker Over Temperature
    */
    STACKER_OVER_TEMPERATURE,
    /**
    * stacker Power Saver
    */
    STACKER_POWER_SAVER,
    /**
    * stacker Recoverable Failure
    */
    STACKER_RECOVERABLE_FAILURE,
    /**
    * stacker Recoverable Storage
    */
    STACKER_RECOVERABLE_STORAGE,
    /**
    * stacker Removed
    */
    STACKER_REMOVED,
    /**
    * stacker Resource Added
    */
    STACKER_RESOURCE_ADDED,
    /**
    * stacker Resource Removed
    */
    STACKER_RESOURCE_REMOVED,
    /**
    * stacker Thermistor Failure
    */
    STACKER_THERMISTOR_FAILURE,
    /**
    * stacker Timing Failure
    */
    STACKER_TIMING_FAILURE,
    /**
    * stacker Turned Off
    */
    STACKER_TURNED_OFF,
    /**
    * stacker Turned On
    */
    STACKER_TURNED_ON,
    /**
    * stacker Under Temperature
    */
    STACKER_UNDER_TEMPERATURE,
    /**
    * stacker Unrecoverable Failure
    */
    STACKER_UNRECOVERABLE_FAILURE,
    /**
    * stacker Unrecoverable Storage Error
    */
    STACKER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * stacker Warming Up
    */
    STACKER_WARMING_UP,
    /**
    * standby
    */
    STANDBY,
    /**
    * stapler Added
    */
    STAPLER_ADDED,
    /**
    * stapler Almost Empty
    */
    STAPLER_ALMOST_EMPTY,
    /**
    * stapler Almost Full
    */
    STAPLER_ALMOST_FULL,
    /**
    * stapler At Limit
    */
    STAPLER_AT_LIMIT,
    /**
    * stapler Closed
    */
    STAPLER_CLOSED,
    /**
    * stapler Configuration Change
    */
    STAPLER_CONFIGURATION_CHANGE,
    /**
    * stapler Cover Closed
    */
    STAPLER_COVER_CLOSED,
    /**
    * stapler Cover Open
    */
    STAPLER_COVER_OPEN,
    /**
    * stapler Empty
    */
    STAPLER_EMPTY,
    /**
    * stapler Full
    */
    STAPLER_FULL,
    /**
    * stapler Interlock Closed
    */
    STAPLER_INTERLOCK_CLOSED,
    /**
    * stapler Interlock Open
    */
    STAPLER_INTERLOCK_OPEN,
    /**
    * stapler Jam
    */
    STAPLER_JAM,
    /**
    * stapler Life Almost Over
    */
    STAPLER_LIFE_ALMOST_OVER,
    /**
    * stapler Life Over
    */
    STAPLER_LIFE_OVER,
    /**
    * stapler Memory Exhausted
    */
    STAPLER_MEMORY_EXHAUSTED,
    /**
    * stapler Missing
    */
    STAPLER_MISSING,
    /**
    * stapler Motor Failure
    */
    STAPLER_MOTOR_FAILURE,
    /**
    * stapler Near Limit
    */
    STAPLER_NEAR_LIMIT,
    /**
    * stapler Offline
    */
    STAPLER_OFFLINE,
    /**
    * stapler Opened
    */
    STAPLER_OPENED,
    /**
    * stapler Over Temperature
    */
    STAPLER_OVER_TEMPERATURE,
    /**
    * stapler Power Saver
    */
    STAPLER_POWER_SAVER,
    /**
    * stapler Recoverable Failure
    */
    STAPLER_RECOVERABLE_FAILURE,
    /**
    * stapler Recoverable Storage
    */
    STAPLER_RECOVERABLE_STORAGE,
    /**
    * stapler Removed
    */
    STAPLER_REMOVED,
    /**
    * stapler Resource Added
    */
    STAPLER_RESOURCE_ADDED,
    /**
    * stapler Resource Removed
    */
    STAPLER_RESOURCE_REMOVED,
    /**
    * stapler Thermistor Failure
    */
    STAPLER_THERMISTOR_FAILURE,
    /**
    * stapler Timing Failure
    */
    STAPLER_TIMING_FAILURE,
    /**
    * stapler Turned Off
    */
    STAPLER_TURNED_OFF,
    /**
    * stapler Turned On
    */
    STAPLER_TURNED_ON,
    /**
    * stapler Under Temperature
    */
    STAPLER_UNDER_TEMPERATURE,
    /**
    * stapler Unrecoverable Failure
    */
    STAPLER_UNRECOVERABLE_FAILURE,
    /**
    * stapler Unrecoverable Storage Error
    */
    STAPLER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * stapler Warming Up
    */
    STAPLER_WARMING_UP,
    /**
    * stitcher Added
    */
    STITCHER_ADDED,
    /**
    * stitcher Almost Empty
    */
    STITCHER_ALMOST_EMPTY,
    /**
    * stitcher Almost Full
    */
    STITCHER_ALMOST_FULL,
    /**
    * stitcher At Limit
    */
    STITCHER_AT_LIMIT,
    /**
    * stitcher Closed
    */
    STITCHER_CLOSED,
    /**
    * stitcher Configuration Change
    */
    STITCHER_CONFIGURATION_CHANGE,
    /**
    * stitcher Cover Closed
    */
    STITCHER_COVER_CLOSED,
    /**
    * stitcher Cover Open
    */
    STITCHER_COVER_OPEN,
    /**
    * stitcher Empty
    */
    STITCHER_EMPTY,
    /**
    * stitcher Full
    */
    STITCHER_FULL,
    /**
    * stitcher Interlock Closed
    */
    STITCHER_INTERLOCK_CLOSED,
    /**
    * stitcher Interlock Open
    */
    STITCHER_INTERLOCK_OPEN,
    /**
    * stitcher Jam
    */
    STITCHER_JAM,
    /**
    * stitcher Life Almost Over
    */
    STITCHER_LIFE_ALMOST_OVER,
    /**
    * stitcher Life Over
    */
    STITCHER_LIFE_OVER,
    /**
    * stitcher Memory Exhausted
    */
    STITCHER_MEMORY_EXHAUSTED,
    /**
    * stitcher Missing
    */
    STITCHER_MISSING,
    /**
    * stitcher Motor Failure
    */
    STITCHER_MOTOR_FAILURE,
    /**
    * stitcher Near Limit
    */
    STITCHER_NEAR_LIMIT,
    /**
    * stitcher Offline
    */
    STITCHER_OFFLINE,
    /**
    * stitcher Opened
    */
    STITCHER_OPENED,
    /**
    * stitcher Over Temperature
    */
    STITCHER_OVER_TEMPERATURE,
    /**
    * stitcher Power Saver
    */
    STITCHER_POWER_SAVER,
    /**
    * stitcher Recoverable Failure
    */
    STITCHER_RECOVERABLE_FAILURE,
    /**
    * stitcher Recoverable Storage
    */
    STITCHER_RECOVERABLE_STORAGE,
    /**
    * stitcher Removed
    */
    STITCHER_REMOVED,
    /**
    * stitcher Resource Added
    */
    STITCHER_RESOURCE_ADDED,
    /**
    * stitcher Resource Removed
    */
    STITCHER_RESOURCE_REMOVED,
    /**
    * stitcher Thermistor Failure
    */
    STITCHER_THERMISTOR_FAILURE,
    /**
    * stitcher Timing Failure
    */
    STITCHER_TIMING_FAILURE,
    /**
    * stitcher Turned Off
    */
    STITCHER_TURNED_OFF,
    /**
    * stitcher Turned On
    */
    STITCHER_TURNED_ON,
    /**
    * stitcher Under Temperature
    */
    STITCHER_UNDER_TEMPERATURE,
    /**
    * stitcher Unrecoverable Failure
    */
    STITCHER_UNRECOVERABLE_FAILURE,
    /**
    * stitcher Unrecoverable Storage Error
    */
    STITCHER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * stitcher Warming Up
    */
    STITCHER_WARMING_UP,
    /**
    * subunit Added
    */
    SUBUNIT_ADDED,
    /**
    * subunit Almost Empty
    */
    SUBUNIT_ALMOST_EMPTY,
    /**
    * subunit Almost Full
    */
    SUBUNIT_ALMOST_FULL,
    /**
    * subunit At Limit
    */
    SUBUNIT_AT_LIMIT,
    /**
    * subunit Closed
    */
    SUBUNIT_CLOSED,
    /**
    * subunit Cooling Down
    */
    SUBUNIT_COOLING_DOWN,
    /**
    * subunit Empty
    */
    SUBUNIT_EMPTY,
    /**
    * subunit Full
    */
    SUBUNIT_FULL,
    /**
    * subunit Life Almost Over
    */
    SUBUNIT_LIFE_ALMOST_OVER,
    /**
    * subunit Life Over
    */
    SUBUNIT_LIFE_OVER,
    /**
    * subunit Memory Exhausted
    */
    SUBUNIT_MEMORY_EXHAUSTED,
    /**
    * subunit Missing
    */
    SUBUNIT_MISSING,
    /**
    * subunit Motor Failure
    */
    SUBUNIT_MOTOR_FAILURE,
    /**
    * subunit Near Limit
    */
    SUBUNIT_NEAR_LIMIT,
    /**
    * subunit Offline
    */
    SUBUNIT_OFFLINE,
    /**
    * subunit Opened
    */
    SUBUNIT_OPENED,
    /**
    * subunit Over Temperature
    */
    SUBUNIT_OVER_TEMPERATURE,
    /**
    * subunit Power Saver
    */
    SUBUNIT_POWER_SAVER,
    /**
    * subunit Recoverable Failure
    */
    SUBUNIT_RECOVERABLE_FAILURE,
    /**
    * subunit Recoverable Storage
    */
    SUBUNIT_RECOVERABLE_STORAGE,
    /**
    * subunit Removed
    */
    SUBUNIT_REMOVED,
    /**
    * subunit Resource Added
    */
    SUBUNIT_RESOURCE_ADDED,
    /**
    * subunit Resource Removed
    */
    SUBUNIT_RESOURCE_REMOVED,
    /**
    * subunit Thermistor Failure
    */
    SUBUNIT_THERMISTOR_FAILURE,
    /**
    * subunit Timing Failure
    */
    SUBUNIT_TIMING_FAILURE,
    /**
    * subunit Turned Off
    */
    SUBUNIT_TURNED_OFF,
    /**
    * subunit Turned On
    */
    SUBUNIT_TURNED_ON,
    /**
    * subunit Under Temperature
    */
    SUBUNIT_UNDER_TEMPERATURE,
    /**
    * subunit Unrecoverable Failure
    */
    SUBUNIT_UNRECOVERABLE_FAILURE,
    /**
    * subunit Unrecoverable Storage
    */
    SUBUNIT_UNRECOVERABLE_STORAGE,
    /**
    * subunit Warming Up
    */
    SUBUNIT_WARMING_UP,
    /**
    * suspend
    */
    SUSPEND,
    /**
    * testing
    */
    TESTING,
    /**
    * trimmer Added
    */
    TRIMMER_ADDED,
    /**
    * trimmer Almost Empty
    */
    TRIMMER_ALMOST_EMPTY,
    /**
    * trimmer Almost Full
    */
    TRIMMER_ALMOST_FULL,
    /**
    * trimmer At Limit
    */
    TRIMMER_AT_LIMIT,
    /**
    * trimmer Closed
    */
    TRIMMER_CLOSED,
    /**
    * trimmer Configuration Change
    */
    TRIMMER_CONFIGURATION_CHANGE,
    /**
    * trimmer Cover Closed
    */
    TRIMMER_COVER_CLOSED,
    /**
    * trimmer Cover Open
    */
    TRIMMER_COVER_OPEN,
    /**
    * trimmer Empty
    */
    TRIMMER_EMPTY,
    /**
    * trimmer Full
    */
    TRIMMER_FULL,
    /**
    * trimmer Interlock Closed
    */
    TRIMMER_INTERLOCK_CLOSED,
    /**
    * trimmer Interlock Open
    */
    TRIMMER_INTERLOCK_OPEN,
    /**
    * trimmer Jam
    */
    TRIMMER_JAM,
    /**
    * trimmer Life Almost Over
    */
    TRIMMER_LIFE_ALMOST_OVER,
    /**
    * trimmer Life Over
    */
    TRIMMER_LIFE_OVER,
    /**
    * trimmer Memory Exhausted
    */
    TRIMMER_MEMORY_EXHAUSTED,
    /**
    * trimmer Missing
    */
    TRIMMER_MISSING,
    /**
    * trimmer Motor Failure
    */
    TRIMMER_MOTOR_FAILURE,
    /**
    * trimmer Near Limit
    */
    TRIMMER_NEAR_LIMIT,
    /**
    * trimmer Offline
    */
    TRIMMER_OFFLINE,
    /**
    * trimmer Opened
    */
    TRIMMER_OPENED,
    /**
    * trimmer Over Temperature
    */
    TRIMMER_OVER_TEMPERATURE,
    /**
    * trimmer Power Saver
    */
    TRIMMER_POWER_SAVER,
    /**
    * trimmer Recoverable Failure
    */
    TRIMMER_RECOVERABLE_FAILURE,
    /**
    * trimmer Recoverable Storage
    */
    TRIMMER_RECOVERABLE_STORAGE,
    /**
    * trimmer Removed
    */
    TRIMMER_REMOVED,
    /**
    * trimmer Resource Added
    */
    TRIMMER_RESOURCE_ADDED,
    /**
    * trimmer Resource Removed
    */
    TRIMMER_RESOURCE_REMOVED,
    /**
    * trimmer Thermistor Failure
    */
    TRIMMER_THERMISTOR_FAILURE,
    /**
    * trimmer Timing Failure
    */
    TRIMMER_TIMING_FAILURE,
    /**
    * trimmer Turned Off
    */
    TRIMMER_TURNED_OFF,
    /**
    * trimmer Turned On
    */
    TRIMMER_TURNED_ON,
    /**
    * trimmer Under Temperature
    */
    TRIMMER_UNDER_TEMPERATURE,
    /**
    * trimmer Unrecoverable Failure
    */
    TRIMMER_UNRECOVERABLE_FAILURE,
    /**
    * trimmer Unrecoverable Storage Error
    */
    TRIMMER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * trimmer Warming Up
    */
    TRIMMER_WARMING_UP,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * wrapper Added
    */
    WRAPPER_ADDED,
    /**
    * wrapper Almost Empty
    */
    WRAPPER_ALMOST_EMPTY,
    /**
    * wrapper Almost Full
    */
    WRAPPER_ALMOST_FULL,
    /**
    * wrapper At Limit
    */
    WRAPPER_AT_LIMIT,
    /**
    * wrapper Closed
    */
    WRAPPER_CLOSED,
    /**
    * wrapper Configuration Change
    */
    WRAPPER_CONFIGURATION_CHANGE,
    /**
    * wrapper Cover Closed
    */
    WRAPPER_COVER_CLOSED,
    /**
    * wrapper Cover Open
    */
    WRAPPER_COVER_OPEN,
    /**
    * wrapper Empty
    */
    WRAPPER_EMPTY,
    /**
    * wrapper Full
    */
    WRAPPER_FULL,
    /**
    * wrapper Interlock Closed
    */
    WRAPPER_INTERLOCK_CLOSED,
    /**
    * wrapper Interlock Open
    */
    WRAPPER_INTERLOCK_OPEN,
    /**
    * wrapper Jam
    */
    WRAPPER_JAM,
    /**
    * wrapper Life Almost Over
    */
    WRAPPER_LIFE_ALMOST_OVER,
    /**
    * wrapper Life Over
    */
    WRAPPER_LIFE_OVER,
    /**
    * wrapper Memory Exhausted
    */
    WRAPPER_MEMORY_EXHAUSTED,
    /**
    * wrapper Missing
    */
    WRAPPER_MISSING,
    /**
    * wrapper Motor Failure
    */
    WRAPPER_MOTOR_FAILURE,
    /**
    * wrapper Near Limit
    */
    WRAPPER_NEAR_LIMIT,
    /**
    * wrapper Offline
    */
    WRAPPER_OFFLINE,
    /**
    * wrapper Opened
    */
    WRAPPER_OPENED,
    /**
    * wrapper Over Temperature
    */
    WRAPPER_OVER_TEMPERATURE,
    /**
    * wrapper Power Saver
    */
    WRAPPER_POWER_SAVER,
    /**
    * wrapper Recoverable Failure
    */
    WRAPPER_RECOVERABLE_FAILURE,
    /**
    * wrapper Recoverable Storage
    */
    WRAPPER_RECOVERABLE_STORAGE,
    /**
    * wrapper Removed
    */
    WRAPPER_REMOVED,
    /**
    * wrapper Resource Added
    */
    WRAPPER_RESOURCE_ADDED,
    /**
    * wrapper Resource Removed
    */
    WRAPPER_RESOURCE_REMOVED,
    /**
    * wrapper Thermistor Failure
    */
    WRAPPER_THERMISTOR_FAILURE,
    /**
    * wrapper Timing Failure
    */
    WRAPPER_TIMING_FAILURE,
    /**
    * wrapper Turned Off
    */
    WRAPPER_TURNED_OFF,
    /**
    * wrapper Turned On
    */
    WRAPPER_TURNED_ON,
    /**
    * wrapper Under Temperature
    */
    WRAPPER_UNDER_TEMPERATURE,
    /**
    * wrapper Unrecoverable Failure
    */
    WRAPPER_UNRECOVERABLE_FAILURE,
    /**
    * wrapper Unrecoverable Storage Error
    */
    WRAPPER_UNRECOVERABLE_STORAGE_ERROR,
    /**
    * wrapper Warming Up
    */
    WRAPPER_WARMING_UP,
    /**
    * For PrinterProcessingStateDetail values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
