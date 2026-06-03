package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RestEncryptionType implements ValuedEnum {
    None("none"),
    Aes("aes"),
    Bitlocker("bitlocker"),
    Blowfish("blowfish"),
    Des("des"),
    Rc4("rc4"),
    Rsa("rsa"),
    NotSupported("notSupported"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RestEncryptionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RestEncryptionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "aes": return Aes;
            case "bitlocker": return Bitlocker;
            case "blowfish": return Blowfish;
            case "des": return Des;
            case "rc4": return Rc4;
            case "rsa": return Rsa;
            case "notSupported": return NotSupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
