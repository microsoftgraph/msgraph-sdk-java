package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnlineMeetingContentSharingDisabledReason implements ValuedEnum {
    WatermarkProtection("watermarkProtection"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnlineMeetingContentSharingDisabledReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnlineMeetingContentSharingDisabledReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "watermarkProtection": return WatermarkProtection;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
