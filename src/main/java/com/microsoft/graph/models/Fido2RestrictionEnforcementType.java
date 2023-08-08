package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum Fido2RestrictionEnforcementType implements ValuedEnum {
    Allow("allow"),
    Block("block"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Fido2RestrictionEnforcementType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Fido2RestrictionEnforcementType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allow": return Allow;
            case "block": return Block;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
