package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ScheduleRequestActions implements ValuedEnum {
    AdminAssign("adminAssign"),
    AdminUpdate("adminUpdate"),
    AdminRemove("adminRemove"),
    SelfActivate("selfActivate"),
    SelfDeactivate("selfDeactivate"),
    AdminExtend("adminExtend"),
    AdminRenew("adminRenew"),
    SelfExtend("selfExtend"),
    SelfRenew("selfRenew"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ScheduleRequestActions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ScheduleRequestActions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "adminAssign": return AdminAssign;
            case "adminUpdate": return AdminUpdate;
            case "adminRemove": return AdminRemove;
            case "selfActivate": return SelfActivate;
            case "selfDeactivate": return SelfDeactivate;
            case "adminExtend": return AdminExtend;
            case "adminRenew": return AdminRenew;
            case "selfExtend": return SelfExtend;
            case "selfRenew": return SelfRenew;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
