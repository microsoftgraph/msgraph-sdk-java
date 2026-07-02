package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TimelineEventType implements ValuedEnum {
    OriginalDelivery("originalDelivery"),
    SystemTimeTravel("systemTimeTravel"),
    DynamicDelivery("dynamicDelivery"),
    UserUrlClick("userUrlClick"),
    Reprocessed("reprocessed"),
    Zap("zap"),
    QuarantineRelease("quarantineRelease"),
    Air("air"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TimelineEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TimelineEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "originalDelivery": return OriginalDelivery;
            case "systemTimeTravel": return SystemTimeTravel;
            case "dynamicDelivery": return DynamicDelivery;
            case "userUrlClick": return UserUrlClick;
            case "reprocessed": return Reprocessed;
            case "zap": return Zap;
            case "quarantineRelease": return QuarantineRelease;
            case "air": return Air;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
