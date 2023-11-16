package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartFont extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookChartFont and sets the default values.
     */
    public WorkbookChartFont() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookChartFont
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartFont createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartFont();
    }
    /**
     * Gets the bold property value. Represents the bold status of font.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBold() {
        return this.BackingStore.get("bold");
    }
    /**
     * Gets the color property value. HTML color code representation of the text color. for example #FF0000 represents Red.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.BackingStore.get("color");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getItalic() {
        return this.BackingStore.get("italic");
    }
    /**
     * Gets the name property value. Font name (for example 'Calibri')
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the size property value. Size of the font (for example 11)
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSize() {
        return this.BackingStore.get("size");
    }
    /**
     * Gets the underline property value. Type of underline applied to the font. The possible values are: None, Single.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUnderline() {
        return this.BackingStore.get("underline");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setBold(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("bold", value);
    }
    /**
     * Sets the color property value. HTML color code representation of the text color. for example #FF0000 represents Red.
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("color", value);
    }
    /**
     * Sets the italic property value. Represents the italic status of the font.
     * @param value Value to set for the italic property.
     */
    public void setItalic(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("italic", value);
    }
    /**
     * Sets the name property value. Font name (for example 'Calibri')
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the size property value. Size of the font (for example 11)
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("size", value);
    }
    /**
     * Sets the underline property value. Type of underline applied to the font. The possible values are: None, Single.
     * @param value Value to set for the underline property.
     */
    public void setUnderline(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("underline", value);
    }
}
