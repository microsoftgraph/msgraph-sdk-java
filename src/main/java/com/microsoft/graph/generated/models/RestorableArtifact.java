package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RestorableArtifact implements ValuedEnum {
    Message("message"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RestorableArtifact(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RestorableArtifact forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "message": return Message;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
