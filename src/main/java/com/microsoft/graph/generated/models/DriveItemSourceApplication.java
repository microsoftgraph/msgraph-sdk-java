package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DriveItemSourceApplication implements ValuedEnum {
    Teams("teams"),
    Yammer("yammer"),
    SharePoint("sharePoint"),
    OneDrive("oneDrive"),
    Stream("stream"),
    PowerPoint("powerPoint"),
    Office("office"),
    Loki("loki"),
    Loop("loop"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DriveItemSourceApplication(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DriveItemSourceApplication forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "teams": return Teams;
            case "yammer": return Yammer;
            case "sharePoint": return SharePoint;
            case "oneDrive": return OneDrive;
            case "stream": return Stream;
            case "powerPoint": return PowerPoint;
            case "office": return Office;
            case "loki": return Loki;
            case "loop": return Loop;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
