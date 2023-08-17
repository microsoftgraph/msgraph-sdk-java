package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TextColumn implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether to allow multiple lines of text.
     */
    private Boolean allowMultipleLines;
    /**
     * Whether updates to this column should replace existing text, or append to it.
     */
    private Boolean appendChangesToExistingText;
    /**
     * The size of the text box.
     */
    private Integer linesForEditing;
    /**
     * The maximum number of characters for the value.
     */
    private Integer maxLength;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The type of text being stored. Must be one of plain or richText
     */
    private String textType;
    /**
     * Instantiates a new textColumn and sets the default values.
     */
    public TextColumn() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a textColumn
     */
    @jakarta.annotation.Nonnull
    public static TextColumn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TextColumn();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowMultipleLines property value. Whether to allow multiple lines of text.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowMultipleLines() {
        return this.allowMultipleLines;
    }
    /**
     * Gets the appendChangesToExistingText property value. Whether updates to this column should replace existing text, or append to it.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppendChangesToExistingText() {
        return this.appendChangesToExistingText;
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
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getLinesForEditing() {
        return this.linesForEditing;
    }
    /**
     * Gets the maxLength property value. The maximum number of characters for the value.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxLength() {
        return this.maxLength;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the textType property value. The type of text being stored. Must be one of plain or richText
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTextType() {
        return this.textType;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowMultipleLines property value. Whether to allow multiple lines of text.
     * @param value Value to set for the allowMultipleLines property.
     */
    public void setAllowMultipleLines(@jakarta.annotation.Nullable final Boolean value) {
        this.allowMultipleLines = value;
    }
    /**
     * Sets the appendChangesToExistingText property value. Whether updates to this column should replace existing text, or append to it.
     * @param value Value to set for the appendChangesToExistingText property.
     */
    public void setAppendChangesToExistingText(@jakarta.annotation.Nullable final Boolean value) {
        this.appendChangesToExistingText = value;
    }
    /**
     * Sets the linesForEditing property value. The size of the text box.
     * @param value Value to set for the linesForEditing property.
     */
    public void setLinesForEditing(@jakarta.annotation.Nullable final Integer value) {
        this.linesForEditing = value;
    }
    /**
     * Sets the maxLength property value. The maximum number of characters for the value.
     * @param value Value to set for the maxLength property.
     */
    public void setMaxLength(@jakarta.annotation.Nullable final Integer value) {
        this.maxLength = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the textType property value. The type of text being stored. Must be one of plain or richText
     * @param value Value to set for the textType property.
     */
    public void setTextType(@jakarta.annotation.Nullable final String value) {
        this.textType = value;
    }
}
