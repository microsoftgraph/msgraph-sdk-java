package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ConnectedOrganizationState implements ValuedEnum {
    Configured("configured"),
    Proposed("proposed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConnectedOrganizationState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConnectedOrganizationState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "configured": return Configured;
            case "proposed": return Proposed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
