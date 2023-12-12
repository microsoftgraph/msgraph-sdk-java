package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Mutability implements ValuedEnum {
    ReadWrite("ReadWrite"),
    ReadOnly("ReadOnly"),
    Immutable("Immutable"),
    WriteOnly("WriteOnly");
    public final String value;
    Mutability(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Mutability forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ReadWrite": return ReadWrite;
            case "ReadOnly": return ReadOnly;
            case "Immutable": return Immutable;
            case "WriteOnly": return WriteOnly;
            default: return null;
        }
    }
}
