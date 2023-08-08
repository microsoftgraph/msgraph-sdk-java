package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum AppLogDecryptionAlgorithm implements ValuedEnum {
    /** decrypting using Aes256. */
    Aes256("aes256"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppLogDecryptionAlgorithm(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppLogDecryptionAlgorithm forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aes256": return Aes256;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
