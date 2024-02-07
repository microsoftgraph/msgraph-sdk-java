package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrivilegedAccessGroupAssignmentType implements ValuedEnum {
    Assigned("assigned"),
    Activated("activated"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrivilegedAccessGroupAssignmentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrivilegedAccessGroupAssignmentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "assigned": return Assigned;
            case "activated": return Activated;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
