package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AttributeFlowType implements ValuedEnum {
    Always("Always"),
    ObjectAddOnly("ObjectAddOnly"),
    MultiValueAddOnly("MultiValueAddOnly"),
    ValueAddOnly("ValueAddOnly"),
    AttributeAddOnly("AttributeAddOnly");
    public final String value;
    AttributeFlowType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttributeFlowType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Always": return Always;
            case "ObjectAddOnly": return ObjectAddOnly;
            case "MultiValueAddOnly": return MultiValueAddOnly;
            case "ValueAddOnly": return ValueAddOnly;
            case "AttributeAddOnly": return AttributeAddOnly;
            default: return null;
        }
    }
}
