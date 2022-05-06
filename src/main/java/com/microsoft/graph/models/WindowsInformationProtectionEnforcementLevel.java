package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum WindowsInformationProtectionEnforcementLevel implements ValuedEnum {
    NoProtection("noProtection"),
    EncryptAndAuditOnly("encryptAndAuditOnly"),
    EncryptAuditAndPrompt("encryptAuditAndPrompt"),
    EncryptAuditAndBlock("encryptAuditAndBlock");
    public final String value;
    WindowsInformationProtectionEnforcementLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsInformationProtectionEnforcementLevel forValue(@javax.annotation.Nonnull final String searchValue) {
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
