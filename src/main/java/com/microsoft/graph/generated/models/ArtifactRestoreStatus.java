package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ArtifactRestoreStatus implements ValuedEnum {
    Added("added"),
    Scheduling("scheduling"),
    Scheduled("scheduled"),
    InProgress("inProgress"),
    Succeeded("succeeded"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ArtifactRestoreStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ArtifactRestoreStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "added": return Added;
            case "scheduling": return Scheduling;
            case "scheduled": return Scheduled;
            case "inProgress": return InProgress;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
