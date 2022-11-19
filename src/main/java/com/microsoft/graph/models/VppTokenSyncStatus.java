package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum VppTokenSyncStatus implements ValuedEnum {
    /** Default status. */
    None("none"),
    /** Last Sync in progress. */
    InProgress("inProgress"),
    /** Last Sync completed successfully. */
    Completed("completed"),
    /** Last Sync failed. */
    Failed("failed");
    public final String value;
    VppTokenSyncStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VppTokenSyncStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "inProgress": return InProgress;
            case "completed": return Completed;
            case "failed": return Failed;
            default: return null;
        }
    }
}
