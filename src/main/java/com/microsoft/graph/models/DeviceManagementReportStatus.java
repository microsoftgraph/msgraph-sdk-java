package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible statuses associated with a generated report
 */
public enum DeviceManagementReportStatus implements ValuedEnum {
    /** Report generation status is unknown */
    Unknown("unknown"),
    /** Report generation has not started */
    NotStarted("notStarted"),
    /** Report generation is in progress */
    InProgress("inProgress"),
    /** Report generation is completed */
    Completed("completed"),
    /** Report generation has failed */
    Failed("failed");
    public final String value;
    DeviceManagementReportStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementReportStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "notStarted": return NotStarted;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "failed": return Failed;
            default: return null;
        }
    }
}
