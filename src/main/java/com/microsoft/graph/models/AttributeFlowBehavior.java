package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AttributeFlowBehavior implements ValuedEnum {
    FlowWhenChanged("FlowWhenChanged"),
    FlowAlways("FlowAlways");
    public final String value;
    AttributeFlowBehavior(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AttributeFlowBehavior forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FlowWhenChanged": return FlowWhenChanged;
            case "FlowAlways": return FlowAlways;
            default: return null;
        }
    }
}
