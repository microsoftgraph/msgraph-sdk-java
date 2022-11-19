package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceSpecificPermission implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Describes the level of access that the resource-specific permission represents. */
    private String _description;
    /** The display name for the resource-specific permission. */
    private String _displayName;
    /** The unique identifier for the resource-specific application permission. */
    private String _id;
    /** Indicates whether the permission is enabled. */
    private Boolean _isEnabled;
    /** The OdataType property */
    private String _odataType;
    /** The value of the permission. */
    private String _value;
    /**
     * Instantiates a new resourceSpecificPermission and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResourceSpecificPermission() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.resourceSpecificPermission");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resourceSpecificPermission
     */
    @javax.annotation.Nonnull
    public static ResourceSpecificPermission createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceSpecificPermission();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the description property value. Describes the level of access that the resource-specific permission represents.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the resource-specific permission.
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
        final ResourceSpecificPermission currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the resource-specific application permission.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the permission is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the value property value. The value of the permission.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the description property value. Describes the level of access that the resource-specific permission represents.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the resource-specific permission.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the id property value. The unique identifier for the resource-specific application permission.
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether the permission is enabled.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the value property value. The value of the permission.
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}
