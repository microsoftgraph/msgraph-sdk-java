package com.microsoft.graph.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountType implements ValuedEnum {
    User("user"),
    ResourceAccount("resourceAccount"),
    Guest("guest"),
    SfbOnPremUser("sfbOnPremUser"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue"),
    IneligibleUser("ineligibleUser");
    public final String value;
    AccountType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "resourceAccount": return ResourceAccount;
            case "guest": return Guest;
            case "sfbOnPremUser": return SfbOnPremUser;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            case "ineligibleUser": return IneligibleUser;
            default: return null;
        }
    }
}
