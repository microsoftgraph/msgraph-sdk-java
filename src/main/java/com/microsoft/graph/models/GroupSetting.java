package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupSetting extends Entity implements Parsable {
    /**
     * Display name of this group of settings, which comes from the associated template.
     */
    private String displayName;
    /**
     * Unique identifier for the tenant-level groupSettingTemplates object that's been customized for this group-level settings object. Read-only.
     */
    private String templateId;
    /**
     * Collection of name-value pairs corresponding to the name and defaultValue properties in the referenced groupSettingTemplates object.
     */
    private java.util.List<SettingValue> values;
    /**
     * Instantiates a new groupSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupSetting
     */
    @javax.annotation.Nonnull
    public static GroupSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupSetting();
    }
    /**
     * Gets the displayName property value. Display name of this group of settings, which comes from the associated template.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfObjectValues(SettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the templateId property value. Unique identifier for the tenant-level groupSettingTemplates object that's been customized for this group-level settings object. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this.templateId;
    }
    /**
     * Gets the values property value. Collection of name-value pairs corresponding to the name and defaultValue properties in the referenced groupSettingTemplates object.
     * @return a settingValue
     */
    @javax.annotation.Nullable
    public java.util.List<SettingValue> getValues() {
        return this.values;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("templateId", this.getTemplateId());
        writer.writeCollectionOfObjectValues("values", this.getValues());
    }
    /**
     * Sets the displayName property value. Display name of this group of settings, which comes from the associated template.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the templateId property value. Unique identifier for the tenant-level groupSettingTemplates object that's been customized for this group-level settings object. Read-only.
     * @param value Value to set for the templateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this.templateId = value;
    }
    /**
     * Sets the values property value. Collection of name-value pairs corresponding to the name and defaultValue properties in the referenced groupSettingTemplates object.
     * @param value Value to set for the values property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValues(@javax.annotation.Nullable final java.util.List<SettingValue> value) {
        this.values = value;
    }
}
