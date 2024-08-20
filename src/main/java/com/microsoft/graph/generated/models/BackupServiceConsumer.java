package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BackupServiceConsumer implements ValuedEnum {
    Unknown("unknown"),
    Firstparty("firstparty"),
    Thirdparty("thirdparty"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BackupServiceConsumer(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BackupServiceConsumer forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "firstparty": return Firstparty;
            case "thirdparty": return Thirdparty;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
