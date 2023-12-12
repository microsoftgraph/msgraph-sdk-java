package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for applicationGuardBlockFileTransfer
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApplicationGuardBlockFileTransferType implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Block clipboard to transfer Image and Text file */
    BlockImageAndTextFile("blockImageAndTextFile"),
    /** Block clipboard to transfer Image file */
    BlockImageFile("blockImageFile"),
    /** Neither of text file or image file is blocked from transferring */
    BlockNone("blockNone"),
    /** Block clipboard to transfer Text file */
    BlockTextFile("blockTextFile");
    public final String value;
    ApplicationGuardBlockFileTransferType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApplicationGuardBlockFileTransferType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "blockImageAndTextFile": return BlockImageAndTextFile;
            case "blockImageFile": return BlockImageFile;
            case "blockNone": return BlockNone;
            case "blockTextFile": return BlockTextFile;
            default: return null;
        }
    }
}
