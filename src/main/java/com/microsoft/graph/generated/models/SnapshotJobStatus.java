package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SnapshotJobStatus implements ValuedEnum {
    NotStarted("notStarted"),
    Running("running"),
    Succeeded("succeeded"),
    Failed("failed"),
    PartiallySuccessful("partiallySuccessful"),
    /** A marker value for members added after the release of this API. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SnapshotJobStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SnapshotJobStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "running": return Running;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "partiallySuccessful": return PartiallySuccessful;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
