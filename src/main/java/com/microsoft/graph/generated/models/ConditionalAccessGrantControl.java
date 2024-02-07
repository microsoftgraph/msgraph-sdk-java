package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConditionalAccessGrantControl implements ValuedEnum {
    Block("block"),
    Mfa("mfa"),
    CompliantDevice("compliantDevice"),
    DomainJoinedDevice("domainJoinedDevice"),
    ApprovedApplication("approvedApplication"),
    CompliantApplication("compliantApplication"),
    PasswordChange("passwordChange"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ConditionalAccessGrantControl(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConditionalAccessGrantControl forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "block": return Block;
            case "mfa": return Mfa;
            case "compliantDevice": return CompliantDevice;
            case "domainJoinedDevice": return DomainJoinedDevice;
            case "approvedApplication": return ApprovedApplication;
            case "compliantApplication": return CompliantApplication;
            case "passwordChange": return PasswordChange;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
