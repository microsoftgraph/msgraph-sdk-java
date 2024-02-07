package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartTitle extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookChartTitle and sets the default values.
     */
    public WorkbookChartTitle() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookChartTitle
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartTitle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartTitle();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartTitleFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("overlay", (n) -> { this.setOverlay(n.getBooleanValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("visible", (n) -> { this.setVisible(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
     * @return a WorkbookChartTitleFormat
     */
    @jakarta.annotation.Nullable
    public WorkbookChartTitleFormat getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the overlay property value. Boolean value representing if the chart title will overlay the chart or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOverlay() {
        return this.backingStore.get("overlay");
    }
    /**
     * Gets the text property value. Represents the title text of a chart.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.backingStore.get("text");
    }
    /**
     * Gets the visible property value. A boolean value that represents the visibility of a chart title object.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVisible() {
        return this.backingStore.get("visible");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeBooleanValue("overlay", this.getOverlay());
        writer.writeStringValue("text", this.getText());
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartTitleFormat value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the overlay property value. Boolean value representing if the chart title will overlay the chart or not.
     * @param value Value to set for the overlay property.
     */
    public void setOverlay(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("overlay", value);
    }
    /**
     * Sets the text property value. Represents the title text of a chart.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("text", value);
    }
    /**
     * Sets the visible property value. A boolean value that represents the visibility of a chart title object.
     * @param value Value to set for the visible property.
     */
    public void setVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("visible", value);
    }
}
