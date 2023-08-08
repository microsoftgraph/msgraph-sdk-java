package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DefenderAvStatus implements ValuedEnum {
    NotReporting("notReporting"),
    Disabled("disabled"),
    NotUpdated("notUpdated"),
    Updated("updated"),
    Unknown("unknown"),
    NotSupported("notSupported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DefenderAvStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderAvStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notReporting": return NotReporting;
            case "disabled": return Disabled;
            case "notUpdated": return NotUpdated;
            case "updated": return Updated;
            case "unknown": return Unknown;
            case "notSupported": return NotSupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
