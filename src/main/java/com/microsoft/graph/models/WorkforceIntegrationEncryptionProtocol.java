package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WorkforceIntegrationEncryptionProtocol implements ValuedEnum {
    SharedSecret("sharedSecret"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkforceIntegrationEncryptionProtocol(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WorkforceIntegrationEncryptionProtocol forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sharedSecret": return SharedSecret;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
