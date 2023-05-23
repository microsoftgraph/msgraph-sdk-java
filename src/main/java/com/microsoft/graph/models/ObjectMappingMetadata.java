package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ObjectMappingMetadata implements ValuedEnum {
    EscrowBehavior("EscrowBehavior"),
    DisableMonitoringForChanges("DisableMonitoringForChanges"),
    OriginalJoiningProperty("OriginalJoiningProperty"),
    Disposition("Disposition"),
    IsCustomerDefined("IsCustomerDefined"),
    ExcludeFromReporting("ExcludeFromReporting"),
    Unsynchronized("Unsynchronized");
    public final String value;
    ObjectMappingMetadata(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ObjectMappingMetadata forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EscrowBehavior": return EscrowBehavior;
            case "DisableMonitoringForChanges": return DisableMonitoringForChanges;
            case "OriginalJoiningProperty": return OriginalJoiningProperty;
            case "Disposition": return Disposition;
            case "IsCustomerDefined": return IsCustomerDefined;
            case "ExcludeFromReporting": return ExcludeFromReporting;
            case "Unsynchronized": return Unsynchronized;
            default: return null;
        }
    }
}
