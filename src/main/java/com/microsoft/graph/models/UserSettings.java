package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to user. */
public class UserSettings extends Entity implements Parsable {
    /** Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center. */
    private Boolean _contributionToContentDiscoveryAsOrganizationDisabled;
    /** When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve. */
    private Boolean _contributionToContentDiscoveryDisabled;
    /** The shift preferences for the user. */
    private ShiftPreferences _shiftPreferences;
    /**
     * Instantiates a new userSettings and sets the default values.
     * @return a void
     */
    public UserSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userSettings
     */
    @javax.annotation.Nonnull
    public static UserSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSettings();
    }
    /**
     * Gets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContributionToContentDiscoveryAsOrganizationDisabled() {
        return this._contributionToContentDiscoveryAsOrganizationDisabled;
    }
    /**
     * Gets the contributionToContentDiscoveryDisabled property value. When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContributionToContentDiscoveryDisabled() {
        return this._contributionToContentDiscoveryDisabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("contributionToContentDiscoveryAsOrganizationDisabled", (n) -> { currentObject.setContributionToContentDiscoveryAsOrganizationDisabled(n.getBooleanValue()); });
            this.put("contributionToContentDiscoveryDisabled", (n) -> { currentObject.setContributionToContentDiscoveryDisabled(n.getBooleanValue()); });
            this.put("shiftPreferences", (n) -> { currentObject.setShiftPreferences(n.getObjectValue(ShiftPreferences::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the shiftPreferences property value. The shift preferences for the user.
     * @return a shiftPreferences
     */
    @javax.annotation.Nullable
    public ShiftPreferences getShiftPreferences() {
        return this._shiftPreferences;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("contributionToContentDiscoveryAsOrganizationDisabled", this.getContributionToContentDiscoveryAsOrganizationDisabled());
        writer.writeBooleanValue("contributionToContentDiscoveryDisabled", this.getContributionToContentDiscoveryDisabled());
        writer.writeObjectValue("shiftPreferences", this.getShiftPreferences());
    }
    /**
     * Sets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the Office Delve organization level setting. When set to true, the organization doesn't have access to Office Delve. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @param value Value to set for the contributionToContentDiscoveryAsOrganizationDisabled property.
     * @return a void
     */
    public void setContributionToContentDiscoveryAsOrganizationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._contributionToContentDiscoveryAsOrganizationDisabled = value;
    }
    /**
     * Sets the contributionToContentDiscoveryDisabled property value. When set to true, documents in the user's Office Delve are disabled. Users can control this setting in Office Delve.
     * @param value Value to set for the contributionToContentDiscoveryDisabled property.
     * @return a void
     */
    public void setContributionToContentDiscoveryDisabled(@javax.annotation.Nullable final Boolean value) {
        this._contributionToContentDiscoveryDisabled = value;
    }
    /**
     * Sets the shiftPreferences property value. The shift preferences for the user.
     * @param value Value to set for the shiftPreferences property.
     * @return a void
     */
    public void setShiftPreferences(@javax.annotation.Nullable final ShiftPreferences value) {
        this._shiftPreferences = value;
    }
}
