package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ManagementAgentType implements ValuedEnum {
    Eas("eas"),
    Mdm("mdm"),
    EasMdm("easMdm"),
    IntuneClient("intuneClient"),
    EasIntuneClient("easIntuneClient"),
    ConfigurationManagerClient("configurationManagerClient"),
    ConfigurationManagerClientMdm("configurationManagerClientMdm"),
    ConfigurationManagerClientMdmEas("configurationManagerClientMdmEas"),
    Unknown("unknown"),
    Jamf("jamf"),
    GoogleCloudDevicePolicyController("googleCloudDevicePolicyController"),
    Microsoft365ManagedMdm("microsoft365ManagedMdm"),
    MsSense("msSense");
    public final String value;
    ManagementAgentType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagementAgentType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "eas": return Eas;
            case "mdm": return Mdm;
            case "easMdm": return EasMdm;
            case "intuneClient": return IntuneClient;
            case "easIntuneClient": return EasIntuneClient;
            case "configurationManagerClient": return ConfigurationManagerClient;
            case "configurationManagerClientMdm": return ConfigurationManagerClientMdm;
            case "configurationManagerClientMdmEas": return ConfigurationManagerClientMdmEas;
            case "unknown": return Unknown;
            case "jamf": return Jamf;
            case "googleCloudDevicePolicyController": return GoogleCloudDevicePolicyController;
            case "microsoft365ManagedMdm": return Microsoft365ManagedMdm;
            case "msSense": return MsSense;
            default: return null;
        }
    }
}
