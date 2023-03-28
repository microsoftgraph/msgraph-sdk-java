package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookRangeFont extends Entity implements Parsable {
    /** Represents the bold status of font. */
    private Boolean bold;
    /** HTML color code representation of the text color. E.g. #FF0000 represents Red. */
    private String color;
    /** Represents the italic status of the font. */
    private Boolean italic;
    /** Font name (e.g. 'Calibri') */
    private String name;
    /** Font size. */
    private Double size;
    /** Type of underline applied to the font. The possible values are: None, Single, Double, SingleAccountant, DoubleAccountant. */
    private String underline;
    /**
     * Instantiates a new workbookRangeFont and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookRangeFont() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookRangeFont
     */
    @javax.annotation.Nonnull
    public static WorkbookRangeFont createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeFont();
    }
    /**
     * Gets the bold property value. Represents the bold status of font.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBold() {
        return this.bold;
    }
    /**
     * Gets the color property value. HTML color code representation of the text color. E.g. #FF0000 represents Red.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColor() {
        return this.color;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bold", (n) -> { this.setBold(n.getBooleanValue()); });
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        deserializerMap.put("italic", (n) -> { this.setItalic(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getDoubleValue()); });
        deserializerMap.put("underline", (n) -> { this.setUnderline(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the italic property value. Represents the italic status of the font.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getItalic() {
        return this.italic;
    }
    /**
     * Gets the name property value. Font name (e.g. 'Calibri')
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the size property value. Font size.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getSize() {
        return this.size;
    }
    /**
     * Gets the underline property value. Type of underline applied to the font. The possible values are: None, Single, Double, SingleAccountant, DoubleAccountant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnderline() {
        return this.underline;
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
    @javax.annotation.Nonnull
    public void setBold(@javax.annotation.Nullable final Boolean value) {
        this.bold = value;
    }
    /**
     * Sets the color property value. HTML color code representation of the text color. E.g. #FF0000 represents Red.
     * @param value Value to set for the color property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColor(@javax.annotation.Nullable final String value) {
        this.color = value;
    }
    /**
     * Sets the italic property value. Represents the italic status of the font.
     * @param value Value to set for the italic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItalic(@javax.annotation.Nullable final Boolean value) {
        this.italic = value;
    }
    /**
     * Sets the name property value. Font name (e.g. 'Calibri')
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the size property value. Font size.
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Double value) {
        this.size = value;
    }
    /**
     * Sets the underline property value. Type of underline applied to the font. The possible values are: None, Single, Double, SingleAccountant, DoubleAccountant.
     * @param value Value to set for the underline property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnderline(@javax.annotation.Nullable final String value) {
        this.underline = value;
    }
}
