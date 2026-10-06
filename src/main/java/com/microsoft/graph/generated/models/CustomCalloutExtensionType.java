package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CustomCalloutExtensionType implements ValuedEnum {
    PreApproval("preApproval"),
    PostApproval("postApproval"),
    Grant("grant"),
    Revoke("revoke"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CustomCalloutExtensionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CustomCalloutExtensionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "preApproval": return PreApproval;
            case "postApproval": return PostApproval;
            case "grant": return Grant;
            case "revoke": return Revoke;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
