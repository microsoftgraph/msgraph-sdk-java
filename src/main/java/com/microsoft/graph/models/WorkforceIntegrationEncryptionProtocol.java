package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkforceIntegrationEncryptionProtocol implements ValuedEnum {
    SharedSecret("sharedSecret"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkforceIntegrationEncryptionProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkforceIntegrationEncryptionProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sharedSecret": return SharedSecret;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
