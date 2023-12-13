package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for monitoring file activity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DefenderMonitorFileActivity implements ValuedEnum {
    /** User Defined, default value, no intent. */
    UserDefined("userDefined"),
    /** Disable monitoring file activity. */
    Disable("disable"),
    /** Monitor all files. */
    MonitorAllFiles("monitorAllFiles"),
    /**  Monitor incoming files only. */
    MonitorIncomingFilesOnly("monitorIncomingFilesOnly"),
    /** Monitor outgoing files only. */
    MonitorOutgoingFilesOnly("monitorOutgoingFilesOnly");
    public final String value;
    DefenderMonitorFileActivity(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderMonitorFileActivity forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "disable": return Disable;
            case "monitorAllFiles": return MonitorAllFiles;
            case "monitorIncomingFilesOnly": return MonitorIncomingFilesOnly;
            case "monitorOutgoingFilesOnly": return MonitorOutgoingFilesOnly;
            default: return null;
        }
    }
}
