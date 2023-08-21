package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileHashAlgorithm implements ValuedEnum {
    Unknown("unknown"),
    Md5("md5"),
    Sha1("sha1"),
    Sha256("sha256"),
    Sha256ac("sha256ac"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileHashAlgorithm(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileHashAlgorithm forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "md5": return Md5;
            case "sha1": return Sha1;
            case "sha256": return Sha256;
            case "sha256ac": return Sha256ac;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
