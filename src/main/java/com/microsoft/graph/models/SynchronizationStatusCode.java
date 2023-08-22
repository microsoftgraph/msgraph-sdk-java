package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SynchronizationStatusCode implements ValuedEnum {
    NotConfigured("NotConfigured"),
    NotRun("NotRun"),
    Active("Active"),
    Paused("Paused"),
    Quarantine("Quarantine");
    public final String value;
    SynchronizationStatusCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SynchronizationStatusCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NotConfigured": return NotConfigured;
            case "NotRun": return NotRun;
            case "Active": return Active;
            case "Paused": return Paused;
            case "Quarantine": return Quarantine;
            default: return null;
        }
    }
}
