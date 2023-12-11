package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrivilegedAccessGroupRelationships implements ValuedEnum {
    Owner("owner"),
    Member("member"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrivilegedAccessGroupRelationships(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrivilegedAccessGroupRelationships forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "owner": return Owner;
            case "member": return Member;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
