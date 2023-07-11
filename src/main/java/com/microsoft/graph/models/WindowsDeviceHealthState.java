package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Computer endpoint protection state
 */
public enum WindowsDeviceHealthState implements ValuedEnum {
    /** Computer is clean and no action is required */
    Clean("clean"),
    /** Computer is in pending full scan state */
    FullScanPending("fullScanPending"),
    /** Computer is in pending reboot state */
    RebootPending("rebootPending"),
    /** Computer is in pending manual steps state */
    ManualStepsPending("manualStepsPending"),
    /** Computer is in pending offline scan state */
    OfflineScanPending("offlineScanPending"),
    /** Computer is in critical failure state */
    Critical("critical");
    public final String value;
    WindowsDeviceHealthState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDeviceHealthState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clean": return Clean;
            case "fullScanPending": return FullScanPending;
            case "rebootPending": return RebootPending;
            case "manualStepsPending": return ManualStepsPending;
            case "offlineScanPending": return OfflineScanPending;
            case "critical": return Critical;
            default: return null;
        }
    }
}
