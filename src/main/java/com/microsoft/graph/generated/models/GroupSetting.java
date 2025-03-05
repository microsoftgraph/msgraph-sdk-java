package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GroupSetting} and sets the default values.
     */
    public GroupSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupSetting}
     */
    @jakarta.annotation.Nonnull
    public static GroupSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupSetting();
    }
    /**
     * Gets the displayName property value. Display name of this group of settings, which comes from the associated template.
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfObjectValues(SettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the templateId property value. Unique identifier for the tenant-level groupSettingTemplates object that&apos;s been customized for this group-level settings object. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Gets the values property value. Collection of name-value pairs corresponding to the name and defaultValue properties in the referenced groupSettingTemplates object.
     * @return a {@link java.util.List<SettingValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingValue> getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("templateId", this.getTemplateId());
        writer.writeCollectionOfObjectValues("values", this.getValues());
    }
    /**
     * Sets the displayName property value. Display name of this group of settings, which comes from the associated template.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the templateId property value. Unique identifier for the tenant-level groupSettingTemplates object that&apos;s been customized for this group-level settings object. Read-only.
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
    /**
     * Sets the values property value. Collection of name-value pairs corresponding to the name and defaultValue properties in the referenced groupSettingTemplates object.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<SettingValue> value) {
        this.backingStore.set("values", value);
    }
}
