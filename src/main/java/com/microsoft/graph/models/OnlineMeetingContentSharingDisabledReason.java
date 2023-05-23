package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OnlineMeetingContentSharingDisabledReason implements ValuedEnum {
    WatermarkProtection("watermarkProtection"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnlineMeetingContentSharingDisabledReason(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnlineMeetingContentSharingDisabledReason forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "watermarkProtection": return WatermarkProtection;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
