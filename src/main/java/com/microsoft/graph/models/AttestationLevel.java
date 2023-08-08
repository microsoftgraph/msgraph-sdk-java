package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AttestationLevel implements ValuedEnum {
    Attested("attested"),
    NotAttested("notAttested"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AttestationLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttestationLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "attested": return Attested;
            case "notAttested": return NotAttested;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
