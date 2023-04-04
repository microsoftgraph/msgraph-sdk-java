package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EventPropagationStatus implements ValuedEnum {
    None("none"),
    InProcessing("inProcessing"),
    Failed("failed"),
    Success("success"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EventPropagationStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EventPropagationStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "inProcessing": return InProcessing;
            case "failed": return Failed;
            case "success": return Success;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
