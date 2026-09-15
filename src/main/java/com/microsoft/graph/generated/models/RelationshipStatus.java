package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RelationshipStatus implements ValuedEnum {
    /** Represents a relationship that is currently active. */
    Active("active"),
    /** Represents a relationship that has been terminated. */
    Terminated("terminated"),
    /** Represents a relationship that has been requested to be terminated by governing tenant. */
    TerminationRequestedByGoverningTenant("terminationRequestedByGoverningTenant"),
    /** This will help in making this enum evolable and adding more values in the future- */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RelationshipStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RelationshipStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "terminated": return Terminated;
            case "terminationRequestedByGoverningTenant": return TerminationRequestedByGoverningTenant;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
