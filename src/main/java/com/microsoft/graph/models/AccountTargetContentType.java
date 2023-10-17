package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AccountTargetContentType implements ValuedEnum {
    Unknown("unknown"),
    IncludeAll("includeAll"),
    AddressBook("addressBook"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AccountTargetContentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AccountTargetContentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "includeAll": return IncludeAll;
            case "addressBook": return AddressBook;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
