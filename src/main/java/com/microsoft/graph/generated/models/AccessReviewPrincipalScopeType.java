package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccessReviewPrincipalScopeType implements ValuedEnum {
    AllUsers("allUsers"),
    GuestUsers("guestUsers"),
    InactiveUsers("inactiveUsers"),
    InactiveGuestUsers("inactiveGuestUsers"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccessReviewPrincipalScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccessReviewPrincipalScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allUsers": return AllUsers;
            case "guestUsers": return GuestUsers;
            case "inactiveUsers": return InactiveUsers;
            case "inactiveGuestUsers": return InactiveGuestUsers;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
