package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum Modality implements ValuedEnum {
    Audio("audio"),
    Video("video"),
    VideoBasedScreenSharing("videoBasedScreenSharing"),
    Data("data"),
    ScreenSharing("screenSharing"),
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
            case "screenSharing": return ScreenSharing;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
