package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DiskType implements ValuedEnum {
    /** Enum member for unknown or default diskType */
    Unknown("unknown"),
    /** Enum member for HDD devices */
    Hdd("hdd"),
    /** Enum member for SSD devices */
    Ssd("ssd"),
    /** Evolvable enum member */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DiskType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DiskType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "hdd": return Hdd;
            case "ssd": return Ssd;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
