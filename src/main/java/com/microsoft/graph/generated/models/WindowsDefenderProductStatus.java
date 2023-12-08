package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Product Status of Windows Defender
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsDefenderProductStatus implements ValuedEnum {
    /** No status */
    NoStatus("noStatus"),
    /** Service not running */
    ServiceNotRunning("serviceNotRunning"),
    /** Service started without any malware protection engine */
    ServiceStartedWithoutMalwareProtection("serviceStartedWithoutMalwareProtection"),
    /** Pending full scan due to threat action */
    PendingFullScanDueToThreatAction("pendingFullScanDueToThreatAction"),
    /** Pending reboot due to threat action */
    PendingRebootDueToThreatAction("pendingRebootDueToThreatAction"),
    /** Pending manual steps due to threat action  */
    PendingManualStepsDueToThreatAction("pendingManualStepsDueToThreatAction"),
    /** AV signatures out of date */
    AvSignaturesOutOfDate("avSignaturesOutOfDate"),
    /** AS signatures out of date */
    AsSignaturesOutOfDate("asSignaturesOutOfDate"),
    /** No quick scan has happened for a specified period */
    NoQuickScanHappenedForSpecifiedPeriod("noQuickScanHappenedForSpecifiedPeriod"),
    /** No full scan has happened for a specified period */
    NoFullScanHappenedForSpecifiedPeriod("noFullScanHappenedForSpecifiedPeriod"),
    /** System initiated scan in progress */
    SystemInitiatedScanInProgress("systemInitiatedScanInProgress"),
    /** System initiated clean in progress */
    SystemInitiatedCleanInProgress("systemInitiatedCleanInProgress"),
    /** There are samples pending submission */
    SamplesPendingSubmission("samplesPendingSubmission"),
    /** Product running in evaluation mode */
    ProductRunningInEvaluationMode("productRunningInEvaluationMode"),
    /** Product running in non-genuine Windows mode */
    ProductRunningInNonGenuineMode("productRunningInNonGenuineMode"),
    /** Product expired */
    ProductExpired("productExpired"),
    /** Off-line scan required */
    OfflineScanRequired("offlineScanRequired"),
    /** Service is shutting down as part of system shutdown */
    ServiceShutdownAsPartOfSystemShutdown("serviceShutdownAsPartOfSystemShutdown"),
    /** Threat remediation failed critically */
    ThreatRemediationFailedCritically("threatRemediationFailedCritically"),
    /** Threat remediation failed non-critically */
    ThreatRemediationFailedNonCritically("threatRemediationFailedNonCritically"),
    /** No status flags set (well initialized state) */
    NoStatusFlagsSet("noStatusFlagsSet"),
    /** Platform is out of date */
    PlatformOutOfDate("platformOutOfDate"),
    /** Platform update is in progress */
    PlatformUpdateInProgress("platformUpdateInProgress"),
    /** Platform is about to be outdated */
    PlatformAboutToBeOutdated("platformAboutToBeOutdated"),
    /** Signature or platform end of life is past or is impending */
    SignatureOrPlatformEndOfLifeIsPastOrIsImpending("signatureOrPlatformEndOfLifeIsPastOrIsImpending"),
    /** Windows SMode signatures still in use on non-Win10S install */
    WindowsSModeSignaturesInUseOnNonWin10SInstall("windowsSModeSignaturesInUseOnNonWin10SInstall");
    public final String value;
    WindowsDefenderProductStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsDefenderProductStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noStatus": return NoStatus;
            case "serviceNotRunning": return ServiceNotRunning;
            case "serviceStartedWithoutMalwareProtection": return ServiceStartedWithoutMalwareProtection;
            case "pendingFullScanDueToThreatAction": return PendingFullScanDueToThreatAction;
            case "pendingRebootDueToThreatAction": return PendingRebootDueToThreatAction;
            case "pendingManualStepsDueToThreatAction": return PendingManualStepsDueToThreatAction;
            case "avSignaturesOutOfDate": return AvSignaturesOutOfDate;
            case "asSignaturesOutOfDate": return AsSignaturesOutOfDate;
            case "noQuickScanHappenedForSpecifiedPeriod": return NoQuickScanHappenedForSpecifiedPeriod;
            case "noFullScanHappenedForSpecifiedPeriod": return NoFullScanHappenedForSpecifiedPeriod;
            case "systemInitiatedScanInProgress": return SystemInitiatedScanInProgress;
            case "systemInitiatedCleanInProgress": return SystemInitiatedCleanInProgress;
            case "samplesPendingSubmission": return SamplesPendingSubmission;
            case "productRunningInEvaluationMode": return ProductRunningInEvaluationMode;
            case "productRunningInNonGenuineMode": return ProductRunningInNonGenuineMode;
            case "productExpired": return ProductExpired;
            case "offlineScanRequired": return OfflineScanRequired;
            case "serviceShutdownAsPartOfSystemShutdown": return ServiceShutdownAsPartOfSystemShutdown;
            case "threatRemediationFailedCritically": return ThreatRemediationFailedCritically;
            case "threatRemediationFailedNonCritically": return ThreatRemediationFailedNonCritically;
            case "noStatusFlagsSet": return NoStatusFlagsSet;
            case "platformOutOfDate": return PlatformOutOfDate;
            case "platformUpdateInProgress": return PlatformUpdateInProgress;
            case "platformAboutToBeOutdated": return PlatformAboutToBeOutdated;
            case "signatureOrPlatformEndOfLifeIsPastOrIsImpending": return SignatureOrPlatformEndOfLifeIsPastOrIsImpending;
            case "windowsSModeSignaturesInUseOnNonWin10SInstall": return WindowsSModeSignaturesInUseOnNonWin10SInstall;
            default: return null;
        }
    }
}
