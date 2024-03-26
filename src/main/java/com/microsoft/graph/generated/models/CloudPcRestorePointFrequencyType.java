package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcRestorePointFrequencyType implements ValuedEnum {
    Default("default"),
    FourHours("fourHours"),
    SixHours("sixHours"),
    TwelveHours("twelveHours"),
    SixteenHours("sixteenHours"),
    TwentyFourHours("twentyFourHours"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcRestorePointFrequencyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcRestorePointFrequencyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "fourHours": return FourHours;
            case "sixHours": return SixHours;
            case "twelveHours": return TwelveHours;
            case "sixteenHours": return SixteenHours;
            case "twentyFourHours": return TwentyFourHours;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
