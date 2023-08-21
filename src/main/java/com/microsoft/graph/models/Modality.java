package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Modality implements ValuedEnum {
    Audio("audio"),
    Video("video"),
    VideoBasedScreenSharing("videoBasedScreenSharing"),
    Data("data"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Modality(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Modality forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "audio": return Audio;
            case "video": return Video;
            case "videoBasedScreenSharing": return VideoBasedScreenSharing;
            case "data": return Data;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
