package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartFont extends Entity implements Parsable {
    /** Represents the bold status of font. */
    private Boolean _bold;
    /** HTML color code representation of the text color. E.g. #FF0000 represents Red. */
    private String _color;
    /** Represents the italic status of the font. */
    private Boolean _italic;
    /** Font name (e.g. 'Calibri') */
    private String _name;
    /** Size of the font (e.g. 11) */
    private Double _size;
    /** Type of underline applied to the font. The possible values are: None, Single. */
    private String _underline;
    /**
     * Instantiates a new workbookChartFont and sets the default values.
     * @return a void
     */
    public WorkbookChartFont() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartFont");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartFont
     */
    @javax.annotation.Nonnull
    public static WorkbookChartFont createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartFont();
    }
    /**
     * Gets the bold property value. Represents the bold status of font.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBold() {
        return this._bold;
    }
    /**
     * Gets the color property value. HTML color code representation of the text color. E.g. #FF0000 represents Red.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColor() {
        return this._color;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartFont currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("bold", (n) -> { currentObject.setBold(n.getBooleanValue()); });
            this.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
            this.put("italic", (n) -> { currentObject.setItalic(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("size", (n) -> { currentObject.setSize(n.getDoubleValue()); });
            this.put("underline", (n) -> { currentObject.setUnderline(n.getStringValue()); });
        }};
    }
    /**
     * Gets the italic property value. Represents the italic status of the font.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getItalic() {
        return this._italic;
    }
    /**
     * Gets the name property value. Font name (e.g. 'Calibri')
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the size property value. Size of the font (e.g. 11)
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSize() {
        return this._size;
    }
    /**
     * Gets the underline property value. Type of underline applied to the font. The possible values are: None, Single.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnderline() {
        return this._underline;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("bold", this.getBold());
        writer.writeStringValue("color", this.getColor());
        writer.writeBooleanValue("italic", this.getItalic());
        writer.writeStringValue("name", this.getName());
        writer.writeDoubleValue("size", this.getSize());
        writer.writeStringValue("underline", this.getUnderline());
    }
    /**
     * Sets the bold property value. Represents the bold status of font.
     * @param value Value to set for the bold property.
     * @return a void
     */
    public void setBold(@javax.annotation.Nullable final Boolean value) {
        this._bold = value;
    }
    /**
     * Sets the color property value. HTML color code representation of the text color. E.g. #FF0000 represents Red.
     * @param value Value to set for the color property.
     * @return a void
     */
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
    }
    /**
     * Sets the italic property value. Represents the italic status of the font.
     * @param value Value to set for the italic property.
     * @return a void
     */
    public void setItalic(@javax.annotation.Nullable final Boolean value) {
        this._italic = value;
    }
    /**
     * Sets the name property value. Font name (e.g. 'Calibri')
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the size property value. Size of the font (e.g. 11)
     * @param value Value to set for the size property.
     * @return a void
     */
    public void setSize(@javax.annotation.Nullable final Double value) {
        this._size = value;
    }
    /**
     * Sets the underline property value. Type of underline applied to the font. The possible values are: None, Single.
     * @param value Value to set for the underline property.
     * @return a void
     */
    public void setUnderline(@javax.annotation.Nullable final String value) {
        this._underline = value;
    }
}
