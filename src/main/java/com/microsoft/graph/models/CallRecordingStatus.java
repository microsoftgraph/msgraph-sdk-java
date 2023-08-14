package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CallRecordingStatus implements ValuedEnum {
    Success("success"),
    Failure("failure"),
    Initial("initial"),
    ChunkFinished("chunkFinished"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CallRecordingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CallRecordingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "failure": return Failure;
            case "initial": return Initial;
            case "chunkFinished": return ChunkFinished;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
