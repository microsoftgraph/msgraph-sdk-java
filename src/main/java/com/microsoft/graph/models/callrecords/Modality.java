package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the cloudCommunications singleton. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Modality forValue(@javax.annotation.Nonnull final String searchValue) {
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
