package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for WIP Protection enforcement levels
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsInformationProtectionEnforcementLevel implements ValuedEnum {
    /** No protection enforcement */
    NoProtection("noProtection"),
    /** Encrypt and Audit only */
    EncryptAndAuditOnly("encryptAndAuditOnly"),
    /** Encrypt, Audit and Prompt */
    EncryptAuditAndPrompt("encryptAuditAndPrompt"),
    /** Encrypt, Audit and Block */
    EncryptAuditAndBlock("encryptAuditAndBlock");
    public final String value;
    WindowsInformationProtectionEnforcementLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsInformationProtectionEnforcementLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noProtection": return NoProtection;
            case "encryptAndAuditOnly": return EncryptAndAuditOnly;
            case "encryptAuditAndPrompt": return EncryptAuditAndPrompt;
            case "encryptAuditAndBlock": return EncryptAuditAndBlock;
            default: return null;
        }
    }
}
