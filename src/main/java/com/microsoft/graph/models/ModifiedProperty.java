package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ModifiedProperty implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates the property name of the target attribute that was changed.
     */
    private String displayName;
    /**
     * Indicates the updated value for the propery.
     */
    private String newValue;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates the previous value (before the update) for the property.
     */
    private String oldValue;
    /**
     * Instantiates a new modifiedProperty and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ModifiedProperty() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a modifiedProperty
     */
    @javax.annotation.Nonnull
    public static ModifiedProperty createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ModifiedProperty();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. Indicates the property name of the target attribute that was changed.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("newValue", (n) -> { this.setNewValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("oldValue", (n) -> { this.setOldValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newValue property value. Indicates the updated value for the propery.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNewValue() {
        return this.newValue;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the oldValue property value. Indicates the previous value (before the update) for the property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOldValue() {
        return this.oldValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("newValue", this.getNewValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("oldValue", this.getOldValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. Indicates the property name of the target attribute that was changed.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the newValue property value. Indicates the updated value for the propery.
     * @param value Value to set for the newValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewValue(@javax.annotation.Nullable final String value) {
        this.newValue = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the oldValue property value. Indicates the previous value (before the update) for the property.
     * @param value Value to set for the oldValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOldValue(@javax.annotation.Nullable final String value) {
        this.oldValue = value;
    }
}
