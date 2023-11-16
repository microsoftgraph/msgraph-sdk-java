package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TextColumn implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new TextColumn and sets the default values.
     */
    public TextColumn() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TextColumn
     */
    @jakarta.annotation.Nonnull
    public static TextColumn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TextColumn();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the allowMultipleLines property value. Whether to allow multiple lines of text.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowMultipleLines() {
        return this.BackingStore.get("allowMultipleLines");
    }
    /**
     * Gets the appendChangesToExistingText property value. Whether updates to this column should replace existing text, or append to it.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppendChangesToExistingText() {
        return this.BackingStore.get("appendChangesToExistingText");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowMultipleLines", (n) -> { this.setAllowMultipleLines(n.getBooleanValue()); });
        deserializerMap.put("appendChangesToExistingText", (n) -> { this.setAppendChangesToExistingText(n.getBooleanValue()); });
        deserializerMap.put("linesForEditing", (n) -> { this.setLinesForEditing(n.getIntegerValue()); });
        deserializerMap.put("maxLength", (n) -> { this.setMaxLength(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("textType", (n) -> { this.setTextType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the linesForEditing property value. The size of the text box.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLinesForEditing() {
        return this.BackingStore.get("linesForEditing");
    }
    /**
     * Gets the maxLength property value. The maximum number of characters for the value.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxLength() {
        return this.BackingStore.get("maxLength");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the textType property value. The type of text being stored. Must be one of plain or richText
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTextType() {
        return this.BackingStore.get("textType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowMultipleLines", this.getAllowMultipleLines());
        writer.writeBooleanValue("appendChangesToExistingText", this.getAppendChangesToExistingText());
        writer.writeIntegerValue("linesForEditing", this.getLinesForEditing());
        writer.writeIntegerValue("maxLength", this.getMaxLength());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("textType", this.getTextType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the allowMultipleLines property value. Whether to allow multiple lines of text.
     * @param value Value to set for the allowMultipleLines property.
     */
    public void setAllowMultipleLines(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("allowMultipleLines", value);
    }
    /**
     * Sets the appendChangesToExistingText property value. Whether updates to this column should replace existing text, or append to it.
     * @param value Value to set for the appendChangesToExistingText property.
     */
    public void setAppendChangesToExistingText(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("appendChangesToExistingText", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the linesForEditing property value. The size of the text box.
     * @param value Value to set for the linesForEditing property.
     */
    public void setLinesForEditing(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("linesForEditing", value);
    }
    /**
     * Sets the maxLength property value. The maximum number of characters for the value.
     * @param value Value to set for the maxLength property.
     */
    public void setMaxLength(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("maxLength", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the textType property value. The type of text being stored. Must be one of plain or richText
     * @param value Value to set for the textType property.
     */
    public void setTextType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("textType", value);
    }
}
