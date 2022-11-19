package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSettings extends Entity implements Parsable {
    /** The contributionToContentDiscoveryAsOrganizationDisabled property */
    private Boolean _contributionToContentDiscoveryAsOrganizationDisabled;
    /** The contributionToContentDiscoveryDisabled property */
    private Boolean _contributionToContentDiscoveryDisabled;
    /** The shiftPreferences property */
    private ShiftPreferences _shiftPreferences;
    /**
     * Instantiates a new userSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserSettings() {
        super();
        this.setOdataType("#microsoft.graph.userSettings");
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
     * Gets the contributionToContentDiscoveryAsOrganizationDisabled property value. The contributionToContentDiscoveryAsOrganizationDisabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContributionToContentDiscoveryAsOrganizationDisabled() {
        return this._contributionToContentDiscoveryAsOrganizationDisabled;
    }
    /**
     * Gets the contributionToContentDiscoveryDisabled property value. The contributionToContentDiscoveryDisabled property
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contributionToContentDiscoveryAsOrganizationDisabled", (n) -> { currentObject.setContributionToContentDiscoveryAsOrganizationDisabled(n.getBooleanValue()); });
        deserializerMap.put("contributionToContentDiscoveryDisabled", (n) -> { currentObject.setContributionToContentDiscoveryDisabled(n.getBooleanValue()); });
        deserializerMap.put("shiftPreferences", (n) -> { currentObject.setShiftPreferences(n.getObjectValue(ShiftPreferences::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the shiftPreferences property value. The shiftPreferences property
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("contributionToContentDiscoveryAsOrganizationDisabled", this.getContributionToContentDiscoveryAsOrganizationDisabled());
        writer.writeBooleanValue("contributionToContentDiscoveryDisabled", this.getContributionToContentDiscoveryDisabled());
        writer.writeObjectValue("shiftPreferences", this.getShiftPreferences());
    }
    /**
     * Sets the contributionToContentDiscoveryAsOrganizationDisabled property value. The contributionToContentDiscoveryAsOrganizationDisabled property
     * @param value Value to set for the contributionToContentDiscoveryAsOrganizationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContributionToContentDiscoveryAsOrganizationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._contributionToContentDiscoveryAsOrganizationDisabled = value;
    }
    /**
     * Sets the contributionToContentDiscoveryDisabled property value. The contributionToContentDiscoveryDisabled property
     * @param value Value to set for the contributionToContentDiscoveryDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContributionToContentDiscoveryDisabled(@javax.annotation.Nullable final Boolean value) {
        this._contributionToContentDiscoveryDisabled = value;
    }
    /**
     * Sets the shiftPreferences property value. The shiftPreferences property
     * @param value Value to set for the shiftPreferences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShiftPreferences(@javax.annotation.Nullable final ShiftPreferences value) {
        this._shiftPreferences = value;
    }
}
