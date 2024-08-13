package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserSettings} and sets the default values.
     */
    public UserSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserSettings}
     */
    @jakarta.annotation.Nonnull
    public static UserSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSettings();
    }
    /**
     * Gets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the organization level setting controlling delegate access to the trending API. When set to true, the organization doesn't have access to Office Delve. The relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for work or school is affected for the whole organization. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getContributionToContentDiscoveryAsOrganizationDisabled() {
        return this.backingStore.get("contributionToContentDiscoveryAsOrganizationDisabled");
    }
    /**
     * Gets the contributionToContentDiscoveryDisabled property value. When set to true, the delegate access to the user's trending API is disabled. When set to true, documents in the user's Office Delve are disabled. When set to true, the relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for work or school is affected. Users can control this setting in Office Delve.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getContributionToContentDiscoveryDisabled() {
        return this.backingStore.get("contributionToContentDiscoveryDisabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contributionToContentDiscoveryAsOrganizationDisabled", (n) -> { this.setContributionToContentDiscoveryAsOrganizationDisabled(n.getBooleanValue()); });
        deserializerMap.put("contributionToContentDiscoveryDisabled", (n) -> { this.setContributionToContentDiscoveryDisabled(n.getBooleanValue()); });
        deserializerMap.put("itemInsights", (n) -> { this.setItemInsights(n.getObjectValue(UserInsightsSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("shiftPreferences", (n) -> { this.setShiftPreferences(n.getObjectValue(ShiftPreferences::createFromDiscriminatorValue)); });
        deserializerMap.put("storage", (n) -> { this.setStorage(n.getObjectValue(UserStorage::createFromDiscriminatorValue)); });
        deserializerMap.put("windows", (n) -> { this.setWindows(n.getCollectionOfObjectValues(WindowsSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemInsights property value. The user's settings for the visibility of meeting hour insights, and insights derived between a user and other items in Microsoft 365, such as documents or sites. Get userInsightsSettings through this navigation property.
     * @return a {@link UserInsightsSettings}
     */
    @jakarta.annotation.Nullable
    public UserInsightsSettings getItemInsights() {
        return this.backingStore.get("itemInsights");
    }
    /**
     * Gets the shiftPreferences property value. The shiftPreferences property
     * @return a {@link ShiftPreferences}
     */
    @jakarta.annotation.Nullable
    public ShiftPreferences getShiftPreferences() {
        return this.backingStore.get("shiftPreferences");
    }
    /**
     * Gets the storage property value. The storage property
     * @return a {@link UserStorage}
     */
    @jakarta.annotation.Nullable
    public UserStorage getStorage() {
        return this.backingStore.get("storage");
    }
    /**
     * Gets the windows property value. The windows property
     * @return a {@link java.util.List<WindowsSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsSetting> getWindows() {
        return this.backingStore.get("windows");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("contributionToContentDiscoveryAsOrganizationDisabled", this.getContributionToContentDiscoveryAsOrganizationDisabled());
        writer.writeBooleanValue("contributionToContentDiscoveryDisabled", this.getContributionToContentDiscoveryDisabled());
        writer.writeObjectValue("itemInsights", this.getItemInsights());
        writer.writeObjectValue("shiftPreferences", this.getShiftPreferences());
        writer.writeObjectValue("storage", this.getStorage());
        writer.writeCollectionOfObjectValues("windows", this.getWindows());
    }
    /**
     * Sets the contributionToContentDiscoveryAsOrganizationDisabled property value. Reflects the organization level setting controlling delegate access to the trending API. When set to true, the organization doesn't have access to Office Delve. The relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for work or school is affected for the whole organization. This setting is read-only and can only be changed by administrators in the SharePoint admin center.
     * @param value Value to set for the contributionToContentDiscoveryAsOrganizationDisabled property.
     */
    public void setContributionToContentDiscoveryAsOrganizationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("contributionToContentDiscoveryAsOrganizationDisabled", value);
    }
    /**
     * Sets the contributionToContentDiscoveryDisabled property value. When set to true, the delegate access to the user's trending API is disabled. When set to true, documents in the user's Office Delve are disabled. When set to true, the relevancy of the content displayed in Microsoft 365, for example in Suggested sites in SharePoint Home and the Discover view in OneDrive for work or school is affected. Users can control this setting in Office Delve.
     * @param value Value to set for the contributionToContentDiscoveryDisabled property.
     */
    public void setContributionToContentDiscoveryDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("contributionToContentDiscoveryDisabled", value);
    }
    /**
     * Sets the itemInsights property value. The user's settings for the visibility of meeting hour insights, and insights derived between a user and other items in Microsoft 365, such as documents or sites. Get userInsightsSettings through this navigation property.
     * @param value Value to set for the itemInsights property.
     */
    public void setItemInsights(@jakarta.annotation.Nullable final UserInsightsSettings value) {
        this.backingStore.set("itemInsights", value);
    }
    /**
     * Sets the shiftPreferences property value. The shiftPreferences property
     * @param value Value to set for the shiftPreferences property.
     */
    public void setShiftPreferences(@jakarta.annotation.Nullable final ShiftPreferences value) {
        this.backingStore.set("shiftPreferences", value);
    }
    /**
     * Sets the storage property value. The storage property
     * @param value Value to set for the storage property.
     */
    public void setStorage(@jakarta.annotation.Nullable final UserStorage value) {
        this.backingStore.set("storage", value);
    }
    /**
     * Sets the windows property value. The windows property
     * @param value Value to set for the windows property.
     */
    public void setWindows(@jakarta.annotation.Nullable final java.util.List<WindowsSetting> value) {
        this.backingStore.set("windows", value);
    }
}
