package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AttributeFlowBehavior implements ValuedEnum {
    FlowWhenChanged("FlowWhenChanged"),
    FlowAlways("FlowAlways");
    public final String value;
    AttributeFlowBehavior(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AttributeFlowBehavior forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FlowWhenChanged": return FlowWhenChanged;
            case "FlowAlways": return FlowAlways;
            default: return null;
        }
    }
}
