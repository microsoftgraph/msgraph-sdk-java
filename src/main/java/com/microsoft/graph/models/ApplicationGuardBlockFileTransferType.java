package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for applicationGuardBlockFileTransfer
 */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ApplicationGuardBlockFileTransferType forValue(@javax.annotation.Nonnull final String searchValue) {
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
