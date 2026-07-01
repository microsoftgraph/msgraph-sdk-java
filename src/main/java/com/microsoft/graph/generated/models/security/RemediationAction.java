package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RemediationAction implements ValuedEnum {
    MoveToJunk("moveToJunk"),
    MoveToInbox("moveToInbox"),
    HardDelete("hardDelete"),
    SoftDelete("softDelete"),
    MoveToDeletedItems("moveToDeletedItems"),
    UnknownFutureValue("unknownFutureValue"),
    MoveToQuarantine("moveToQuarantine");
    public final String value;
    RemediationAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RemediationAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "moveToJunk": return MoveToJunk;
            case "moveToInbox": return MoveToInbox;
            case "hardDelete": return HardDelete;
            case "softDelete": return SoftDelete;
            case "moveToDeletedItems": return MoveToDeletedItems;
            case "unknownFutureValue": return UnknownFutureValue;
            case "moveToQuarantine": return MoveToQuarantine;
            default: return null;
        }
    }
}
