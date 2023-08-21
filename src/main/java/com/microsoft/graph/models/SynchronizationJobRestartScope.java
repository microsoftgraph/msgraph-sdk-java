package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SynchronizationJobRestartScope implements ValuedEnum {
    None("None"),
    ConnectorDataStore("ConnectorDataStore"),
    Escrows("Escrows"),
    Watermark("Watermark"),
    QuarantineState("QuarantineState"),
    Full("Full"),
    ForceDeletes("ForceDeletes");
    public final String value;
    SynchronizationJobRestartScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SynchronizationJobRestartScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "None": return None;
            case "ConnectorDataStore": return ConnectorDataStore;
            case "Escrows": return Escrows;
            case "Watermark": return Watermark;
            case "QuarantineState": return QuarantineState;
            case "Full": return Full;
            case "ForceDeletes": return ForceDeletes;
            default: return null;
        }
    }
}
