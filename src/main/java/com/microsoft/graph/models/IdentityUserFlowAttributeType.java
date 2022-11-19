package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreement entities. */
public enum IdentityUserFlowAttributeType implements ValuedEnum {
    BuiltIn("builtIn"),
    Custom("custom"),
    Required("required"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IdentityUserFlowAttributeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IdentityUserFlowAttributeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "builtIn": return BuiltIn;
            case "custom": return Custom;
            case "required": return Required;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
