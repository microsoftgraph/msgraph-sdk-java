package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceAppManagement singleton.  */
public enum WindowsInformationProtectionPinCharacterRequirements implements ValuedEnum {
    NotAllow("notAllow"),
    RequireAtLeastOne("requireAtLeastOne"),
    Allow("allow");
    public final String value;
    WindowsInformationProtectionPinCharacterRequirements(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsInformationProtectionPinCharacterRequirements forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notAllow": return NotAllow;
            case "requireAtLeastOne": return RequireAtLeastOne;
            case "allow": return Allow;
            default: return null;
        }
    }
}
