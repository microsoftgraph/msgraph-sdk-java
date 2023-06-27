package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserSettings extends Entity implements Parsable {
    /**
     * Reflects the organization level setting controlling delegate access to the trending API. When set to true, the organization doesn't have access to Office Delve. The relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for Business is affected for the whole organization. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     */
    private Boolean contributionToContentDiscoveryAsOrganizationDisabled;
    /**
     * When set to true, the delegate access to the user's trending API is disabled. When set to true, documents in the user's Office Delve are disabled. When set to true, the relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for Business is affected. Users can control this setting in Office Delve.
     */
    private Boolean contributionToContentDiscoveryDisabled;
    /**
     * The shiftPreferences property
     */
    private ShiftPreferences shiftPreferences;
    /**
     * Instantiates a new userSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * Gets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the organization level setting controlling delegate access to the trending API. When set to true, the organization doesn't have access to Office Delve. The relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for Business is affected for the whole organization. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContributionToContentDiscoveryAsOrganizationDisabled() {
        return this.contributionToContentDiscoveryAsOrganizationDisabled;
    }
    /**
     * Gets the contributionToContentDiscoveryDisabled property value. When set to true, the delegate access to the user's trending API is disabled. When set to true, documents in the user's Office Delve are disabled. When set to true, the relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for Business is affected. Users can control this setting in Office Delve.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getContributionToContentDiscoveryDisabled() {
        return this.contributionToContentDiscoveryDisabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contributionToContentDiscoveryAsOrganizationDisabled", (n) -> { this.setContributionToContentDiscoveryAsOrganizationDisabled(n.getBooleanValue()); });
        deserializerMap.put("contributionToContentDiscoveryDisabled", (n) -> { this.setContributionToContentDiscoveryDisabled(n.getBooleanValue()); });
        deserializerMap.put("shiftPreferences", (n) -> { this.setShiftPreferences(n.getObjectValue(ShiftPreferences::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shiftPreferences property value. The shiftPreferences property
     * @return a shiftPreferences
     */
    @javax.annotation.Nullable
    public ShiftPreferences getShiftPreferences() {
        return this.shiftPreferences;
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
     * Sets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the organization level setting controlling delegate access to the trending API. When set to true, the organization doesn't have access to Office Delve. The relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for Business is affected for the whole organization. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @param value Value to set for the contributionToContentDiscoveryAsOrganizationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContributionToContentDiscoveryAsOrganizationDisabled(@javax.annotation.Nullable final Boolean value) {
        this.contributionToContentDiscoveryAsOrganizationDisabled = value;
    }
    /**
     * Sets the contributionToContentDiscoveryDisabled property value. When set to true, the delegate access to the user's trending API is disabled. When set to true, documents in the user's Office Delve are disabled. When set to true, the relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for Business is affected. Users can control this setting in Office Delve.
     * @param value Value to set for the contributionToContentDiscoveryDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContributionToContentDiscoveryDisabled(@javax.annotation.Nullable final Boolean value) {
        this.contributionToContentDiscoveryDisabled = value;
    }
    /**
     * Sets the shiftPreferences property value. The shiftPreferences property
     * @param value Value to set for the shiftPreferences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShiftPreferences(@javax.annotation.Nullable final ShiftPreferences value) {
        this.shiftPreferences = value;
    }
}
