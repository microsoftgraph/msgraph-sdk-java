package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum VolumeType implements ValuedEnum {
    OperatingSystemVolume("operatingSystemVolume"),
    FixedDataVolume("fixedDataVolume"),
    RemovableDataVolume("removableDataVolume"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    VolumeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static VolumeType forValue(@javax.annotation.Nonnull final String searchValue) {
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
