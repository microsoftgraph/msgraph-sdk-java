package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum FileHashType implements ValuedEnum {
    Unknown("unknown"),
    Sha1("sha1"),
    Sha256("sha256"),
    Md5("md5"),
    AuthenticodeHash256("authenticodeHash256"),
    LsHash("lsHash"),
    Ctph("ctph"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileHashType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileHashType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "sha1": return Sha1;
            case "sha256": return Sha256;
            case "md5": return Md5;
            case "authenticodeHash256": return AuthenticodeHash256;
            case "lsHash": return LsHash;
            case "ctph": return Ctph;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
