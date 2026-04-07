package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensitivityLabel extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SensitivityLabel} and sets the default values.
     */
    public SensitivityLabel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensitivityLabel}
     */
    @jakarta.annotation.Nonnull
    public static SensitivityLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityLabel();
    }
    /**
     * Gets the actionSource property value. The actionSource property
     * @return a {@link LabelActionSource}
     */
    @jakarta.annotation.Nullable
    public LabelActionSource getActionSource() {
        return this.backingStore.get("actionSource");
    }
    /**
     * Gets the autoTooltip property value. The autoTooltip property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAutoTooltip() {
        return this.backingStore.get("autoTooltip");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionSource", (n) -> { this.setActionSource(n.getEnumValue(LabelActionSource::forValue)); });
        deserializerMap.put("autoTooltip", (n) -> { this.setAutoTooltip(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("hasProtection", (n) -> { this.setHasProtection(n.getBooleanValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isEndpointProtectionEnabled", (n) -> { this.setIsEndpointProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("isScopedToUser", (n) -> { this.setIsScopedToUser(n.getBooleanValue()); });
        deserializerMap.put("locale", (n) -> { this.setLocale(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("rights", (n) -> { this.setRights(n.getObjectValue(UsageRightsIncluded::createFromDiscriminatorValue)); });
        deserializerMap.put("sublabels", (n) -> { this.setSublabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("toolTip", (n) -> { this.setToolTip(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasProtection property value. The hasProtection property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasProtection() {
        return this.backingStore.get("hasProtection");
    }
    /**
     * Gets the isDefault property value. The isDefault property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the isEndpointProtectionEnabled property value. The isEndpointProtectionEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEndpointProtectionEnabled() {
        return this.backingStore.get("isEndpointProtectionEnabled");
    }
    /**
     * Gets the isScopedToUser property value. The isScopedToUser property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsScopedToUser() {
        return this.backingStore.get("isScopedToUser");
    }
    /**
     * Gets the locale property value. The locale property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocale() {
        return this.backingStore.get("locale");
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Gets the rights property value. The rights property
     * @return a {@link UsageRightsIncluded}
     */
    @jakarta.annotation.Nullable
    public UsageRightsIncluded getRights() {
        return this.backingStore.get("rights");
    }
    /**
     * Gets the sublabels property value. The sublabels property
     * @return a {@link java.util.List<SensitivityLabel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitivityLabel> getSublabels() {
        return this.backingStore.get("sublabels");
    }
    /**
     * Gets the toolTip property value. The toolTip property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToolTip() {
        return this.backingStore.get("toolTip");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionSource", this.getActionSource());
        writer.writeStringValue("autoTooltip", this.getAutoTooltip());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("hasProtection", this.getHasProtection());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isEndpointProtectionEnabled", this.getIsEndpointProtectionEnabled());
        writer.writeBooleanValue("isScopedToUser", this.getIsScopedToUser());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("rights", this.getRights());
        writer.writeCollectionOfObjectValues("sublabels", this.getSublabels());
        writer.writeStringValue("toolTip", this.getToolTip());
    }
    /**
     * Sets the actionSource property value. The actionSource property
     * @param value Value to set for the actionSource property.
     */
    public void setActionSource(@jakarta.annotation.Nullable final LabelActionSource value) {
        this.backingStore.set("actionSource", value);
    }
    /**
     * Sets the autoTooltip property value. The autoTooltip property
     * @param value Value to set for the autoTooltip property.
     */
    public void setAutoTooltip(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("autoTooltip", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the hasProtection property value. The hasProtection property
     * @param value Value to set for the hasProtection property.
     */
    public void setHasProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasProtection", value);
    }
    /**
     * Sets the isDefault property value. The isDefault property
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the isEndpointProtectionEnabled property value. The isEndpointProtectionEnabled property
     * @param value Value to set for the isEndpointProtectionEnabled property.
     */
    public void setIsEndpointProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEndpointProtectionEnabled", value);
    }
    /**
     * Sets the isScopedToUser property value. The isScopedToUser property
     * @param value Value to set for the isScopedToUser property.
     */
    public void setIsScopedToUser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isScopedToUser", value);
    }
    /**
     * Sets the locale property value. The locale property
     * @param value Value to set for the locale property.
     */
    public void setLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("locale", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("priority", value);
    }
    /**
     * Sets the rights property value. The rights property
     * @param value Value to set for the rights property.
     */
    public void setRights(@jakarta.annotation.Nullable final UsageRightsIncluded value) {
        this.backingStore.set("rights", value);
    }
    /**
     * Sets the sublabels property value. The sublabels property
     * @param value Value to set for the sublabels property.
     */
    public void setSublabels(@jakarta.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this.backingStore.set("sublabels", value);
    }
    /**
     * Sets the toolTip property value. The toolTip property
     * @param value Value to set for the toolTip property.
     */
    public void setToolTip(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("toolTip", value);
    }
}
