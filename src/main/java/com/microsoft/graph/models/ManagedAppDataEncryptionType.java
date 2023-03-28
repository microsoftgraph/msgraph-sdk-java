package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Represents the level to which app data is encrypted for managed apps */
public enum ManagedAppDataEncryptionType implements ValuedEnum {
    /** App data is encrypted based on the default settings on the device. */
    UseDeviceSettings("useDeviceSettings"),
    /** App data is encrypted when the device is restarted. */
    AfterDeviceRestart("afterDeviceRestart"),
    /** App data associated with this policy is encrypted when the device is locked, except data in files that are open */
    WhenDeviceLockedExceptOpenFiles("whenDeviceLockedExceptOpenFiles"),
    /** App data associated with this policy is encrypted when the device is locked */
    WhenDeviceLocked("whenDeviceLocked");
    public final String value;
    ManagedAppDataEncryptionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedAppDataEncryptionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "useDeviceSettings": return UseDeviceSettings;
            case "afterDeviceRestart": return AfterDeviceRestart;
            case "whenDeviceLockedExceptOpenFiles": return WhenDeviceLockedExceptOpenFiles;
            case "whenDeviceLocked": return WhenDeviceLocked;
            default: return null;
        }
    }
}
