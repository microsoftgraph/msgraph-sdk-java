package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * BitLockerEncryptionMethod types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BitLockerEncryptionMethod implements ValuedEnum {
    /** AES-CBC 128-bit. */
    AesCbc128("aesCbc128"),
    /** AES-CBC 256-bit. */
    AesCbc256("aesCbc256"),
    /** XTS-AES 128-bit. */
    XtsAes128("xtsAes128"),
    /** XTS-AES 256-bit. */
    XtsAes256("xtsAes256");
    public final String value;
    BitLockerEncryptionMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BitLockerEncryptionMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "aesCbc128": return AesCbc128;
            case "aesCbc256": return AesCbc256;
            case "xtsAes128": return XtsAes128;
            case "xtsAes256": return XtsAes256;
            default: return null;
        }
    }
}
