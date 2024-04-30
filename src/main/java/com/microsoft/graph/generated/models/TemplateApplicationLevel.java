package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TemplateApplicationLevel implements ValuedEnum {
    None("none"),
    NewPartners("newPartners"),
    ExistingPartners("existingPartners"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TemplateApplicationLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TemplateApplicationLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "newPartners": return NewPartners;
            case "existingPartners": return ExistingPartners;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
