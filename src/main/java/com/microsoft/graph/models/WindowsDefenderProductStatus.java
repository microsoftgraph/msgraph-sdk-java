// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows Defender Product Status.
*/
public enum WindowsDefenderProductStatus
{
    /**
    * no Status
    */
    NO_STATUS,
    /**
    * service Not Running
    */
    SERVICE_NOT_RUNNING,
    /**
    * service Started Without Malware Protection
    */
    SERVICE_STARTED_WITHOUT_MALWARE_PROTECTION,
    /**
    * pending Full Scan Due To Threat Action
    */
    PENDING_FULL_SCAN_DUE_TO_THREAT_ACTION,
    /**
    * pending Reboot Due To Threat Action
    */
    PENDING_REBOOT_DUE_TO_THREAT_ACTION,
    /**
    * pending Manual Steps Due To Threat Action
    */
    PENDING_MANUAL_STEPS_DUE_TO_THREAT_ACTION,
    /**
    * av Signatures Out Of Date
    */
    AV_SIGNATURES_OUT_OF_DATE,
    /**
    * as Signatures Out Of Date
    */
    AS_SIGNATURES_OUT_OF_DATE,
    /**
    * no Quick Scan Happened For Specified Period
    */
    NO_QUICK_SCAN_HAPPENED_FOR_SPECIFIED_PERIOD,
    /**
    * no Full Scan Happened For Specified Period
    */
    NO_FULL_SCAN_HAPPENED_FOR_SPECIFIED_PERIOD,
    /**
    * system Initiated Scan In Progress
    */
    SYSTEM_INITIATED_SCAN_IN_PROGRESS,
    /**
    * system Initiated Clean In Progress
    */
    SYSTEM_INITIATED_CLEAN_IN_PROGRESS,
    /**
    * samples Pending Submission
    */
    SAMPLES_PENDING_SUBMISSION,
    /**
    * product Running In Evaluation Mode
    */
    PRODUCT_RUNNING_IN_EVALUATION_MODE,
    /**
    * product Running In Non Genuine Mode
    */
    PRODUCT_RUNNING_IN_NON_GENUINE_MODE,
    /**
    * product Expired
    */
    PRODUCT_EXPIRED,
    /**
    * offline Scan Required
    */
    OFFLINE_SCAN_REQUIRED,
    /**
    * service Shutdown As Part Of System Shutdown
    */
    SERVICE_SHUTDOWN_AS_PART_OF_SYSTEM_SHUTDOWN,
    /**
    * threat Remediation Failed Critically
    */
    THREAT_REMEDIATION_FAILED_CRITICALLY,
    /**
    * threat Remediation Failed Non Critically
    */
    THREAT_REMEDIATION_FAILED_NON_CRITICALLY,
    /**
    * no Status Flags Set
    */
    NO_STATUS_FLAGS_SET,
    /**
    * platform Out Of Date
    */
    PLATFORM_OUT_OF_DATE,
    /**
    * platform Update In Progress
    */
    PLATFORM_UPDATE_IN_PROGRESS,
    /**
    * platform About To Be Outdated
    */
    PLATFORM_ABOUT_TO_BE_OUTDATED,
    /**
    * signature Or Platform End Of Life Is Past Or Is Impending
    */
    SIGNATURE_OR_PLATFORM_END_OF_LIFE_IS_PAST_OR_IS_IMPENDING,
    /**
    * windows SMode Signatures In Use On Non Win10SInstall
    */
    WINDOWS_S_MODE_SIGNATURES_IN_USE_ON_NON_WIN10_S_INSTALL,
    /**
    * For WindowsDefenderProductStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
