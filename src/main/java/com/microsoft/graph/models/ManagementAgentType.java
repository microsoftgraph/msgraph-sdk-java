package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the admin singleton. */
public enum ManagementAgentType implements ValuedEnum {
    /** The device is managed by Exchange server. */
    Eas("eas"),
    /** The device is managed by Intune MDM. */
    Mdm("mdm"),
    /** The device is managed by both Exchange server and Intune MDM. */
    EasMdm("easMdm"),
    /** Intune client managed. */
    IntuneClient("intuneClient"),
    /** The device is EAS and Intune client dual managed. */
    EasIntuneClient("easIntuneClient"),
    /** The device is managed by Configuration Manager. */
    ConfigurationManagerClient("configurationManagerClient"),
    /** The device is managed by Configuration Manager and MDM. */
    ConfigurationManagerClientMdm("configurationManagerClientMdm"),
    /** The device is managed by Configuration Manager, MDM and Eas. */
    ConfigurationManagerClientMdmEas("configurationManagerClientMdmEas"),
    /** Unknown management agent type. */
    Unknown("unknown"),
    /** The device attributes are fetched from Jamf. */
    Jamf("jamf"),
    /** The device is managed by Google's CloudDPC. */
    GoogleCloudDevicePolicyController("googleCloudDevicePolicyController"),
    /** This device is managed by Microsoft 365 through Intune. */
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
