package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FileHashAlgorithm forValue(@javax.annotation.Nonnull final String searchValue) {
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
