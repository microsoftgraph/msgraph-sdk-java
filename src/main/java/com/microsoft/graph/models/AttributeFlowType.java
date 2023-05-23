package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AttributeFlowType forValue(@javax.annotation.Nonnull final String searchValue) {
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
