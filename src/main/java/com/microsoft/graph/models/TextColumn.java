package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TextColumn implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Whether to allow multiple lines of text. */
    private Boolean _allowMultipleLines;
    /** Whether updates to this column should replace existing text, or append to it. */
    private Boolean _appendChangesToExistingText;
    /** The size of the text box. */
    private Integer _linesForEditing;
    /** The maximum number of characters for the value. */
    private Integer _maxLength;
    /** The OdataType property */
    private String _odataType;
    /** The type of text being stored. Must be one of plain or richText */
    private String _textType;
    /**
     * Instantiates a new textColumn and sets the default values.
     * @return a void
     */
    public TextColumn() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.textColumn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a textColumn
     */
    @javax.annotation.Nonnull
    public static TextColumn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TextColumn();
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
     * Gets the allowMultipleLines property value. Whether to allow multiple lines of text.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowMultipleLines() {
        return this._allowMultipleLines;
    }
    /**
     * Gets the appendChangesToExistingText property value. Whether updates to this column should replace existing text, or append to it.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppendChangesToExistingText() {
        return this._appendChangesToExistingText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TextColumn currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("allowMultipleLines", (n) -> { currentObject.setAllowMultipleLines(n.getBooleanValue()); });
            this.put("appendChangesToExistingText", (n) -> { currentObject.setAppendChangesToExistingText(n.getBooleanValue()); });
            this.put("linesForEditing", (n) -> { currentObject.setLinesForEditing(n.getIntegerValue()); });
            this.put("maxLength", (n) -> { currentObject.setMaxLength(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("textType", (n) -> { currentObject.setTextType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the linesForEditing property value. The size of the text box.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLinesForEditing() {
        return this._linesForEditing;
    }
    /**
     * Gets the maxLength property value. The maximum number of characters for the value.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxLength() {
        return this._maxLength;
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
     * Gets the textType property value. The type of text being stored. Must be one of plain or richText
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTextType() {
        return this._textType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowMultipleLines property value. Whether to allow multiple lines of text.
     * @param value Value to set for the allowMultipleLines property.
     * @return a void
     */
    public void setAllowMultipleLines(@javax.annotation.Nullable final Boolean value) {
        this._allowMultipleLines = value;
    }
    /**
     * Sets the appendChangesToExistingText property value. Whether updates to this column should replace existing text, or append to it.
     * @param value Value to set for the appendChangesToExistingText property.
     * @return a void
     */
    public void setAppendChangesToExistingText(@javax.annotation.Nullable final Boolean value) {
        this._appendChangesToExistingText = value;
    }
    /**
     * Sets the linesForEditing property value. The size of the text box.
     * @param value Value to set for the linesForEditing property.
     * @return a void
     */
    public void setLinesForEditing(@javax.annotation.Nullable final Integer value) {
        this._linesForEditing = value;
    }
    /**
     * Sets the maxLength property value. The maximum number of characters for the value.
     * @param value Value to set for the maxLength property.
     * @return a void
     */
    public void setMaxLength(@javax.annotation.Nullable final Integer value) {
        this._maxLength = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the textType property value. The type of text being stored. Must be one of plain or richText
     * @param value Value to set for the textType property.
     * @return a void
     */
    public void setTextType(@javax.annotation.Nullable final String value) {
        this._textType = value;
    }
}
