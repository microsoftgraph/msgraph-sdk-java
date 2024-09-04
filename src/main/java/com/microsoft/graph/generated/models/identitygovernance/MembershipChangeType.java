package com.microsoft.graph.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MembershipChangeType implements ValuedEnum {
    Add("add"),
    Remove("remove"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MembershipChangeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MembershipChangeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "add": return Add;
            case "remove": return Remove;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
