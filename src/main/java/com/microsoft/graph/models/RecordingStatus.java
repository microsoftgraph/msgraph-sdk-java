package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RecordingStatus implements ValuedEnum {
    Unknown("unknown"),
    NotRecording("notRecording"),
    Recording("recording"),
    Failed("failed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RecordingStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RecordingStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "notRecording": return NotRecording;
            case "recording": return Recording;
            case "failed": return Failed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
