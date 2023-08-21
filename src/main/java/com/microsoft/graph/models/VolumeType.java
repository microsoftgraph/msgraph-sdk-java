package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum VolumeType implements ValuedEnum {
    OperatingSystemVolume("operatingSystemVolume"),
    FixedDataVolume("fixedDataVolume"),
    RemovableDataVolume("removableDataVolume"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VolumeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static VolumeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "operatingSystemVolume": return OperatingSystemVolume;
            case "fixedDataVolume": return FixedDataVolume;
            case "removableDataVolume": return RemovableDataVolume;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
