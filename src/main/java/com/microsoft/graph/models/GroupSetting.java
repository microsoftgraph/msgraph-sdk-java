package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class GroupSetting extends Entity implements Parsable {
    /** Display name of this group of settings, which comes from the associated template. */
    private String _displayName;
    /** Unique identifier for the tenant-level groupSettingTemplates object that's been customized for this group-level settings object. Read-only. */
    private String _templateId;
    /** Collection of name-value pairs corresponding to the name and defaultValue properties in the referenced groupSettingTemplates object. */
    private java.util.List<SettingValue> _values;
    /**
     * Instantiates a new groupSetting and sets the default values.
     * @return a void
     */
    public GroupSetting() {
        super();
        this.setOdataType("#microsoft.graph.groupSetting");
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
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GroupSetting currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("templateId", (n) -> { currentObject.setTemplateId(n.getStringValue()); });
            this.put("values", (n) -> { currentObject.setValues(n.getCollectionOfObjectValues(SettingValue::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the templateId property value. Unique identifier for the tenant-level groupSettingTemplates object that's been customized for this group-level settings object. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this._templateId;
    }
    /**
     * Gets the values property value. Collection of name-value pairs corresponding to the name and defaultValue properties in the referenced groupSettingTemplates object.
     * @return a settingValue
     */
    @javax.annotation.Nullable
    public java.util.List<SettingValue> getValues() {
        return this._values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the templateId property value. Unique identifier for the tenant-level groupSettingTemplates object that's been customized for this group-level settings object. Read-only.
     * @param value Value to set for the templateId property.
     * @return a void
     */
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this._templateId = value;
    }
    /**
     * Sets the values property value. Collection of name-value pairs corresponding to the name and defaultValue properties in the referenced groupSettingTemplates object.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final java.util.List<SettingValue> value) {
        this._values = value;
    }
}
