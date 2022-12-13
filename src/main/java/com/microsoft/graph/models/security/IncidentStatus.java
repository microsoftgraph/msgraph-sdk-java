package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum IncidentStatus implements ValuedEnum {
    Active("active"),
    Resolved("resolved"),
    Redirected("redirected"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    IncidentStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IncidentStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "resolved": return Resolved;
            case "redirected": return Redirected;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
