package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartLegend extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookChartLegend and sets the default values.
     */
    public WorkbookChartLegend() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookChartLegend
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartLegend createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartLegend();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartLegendFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("overlay", (n) -> { this.setOverlay(n.getBooleanValue()); });
        deserializerMap.put("position", (n) -> { this.setPosition(n.getStringValue()); });
        deserializerMap.put("visible", (n) -> { this.setVisible(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
     * @return a WorkbookChartLegendFormat
     */
    @jakarta.annotation.Nullable
    public WorkbookChartLegendFormat getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the overlay property value. Boolean value for whether the chart legend should overlap with the main body of the chart.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOverlay() {
        return this.backingStore.get("overlay");
    }
    /**
     * Gets the position property value. Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPosition() {
        return this.backingStore.get("position");
    }
    /**
     * Gets the visible property value. A boolean value the represents the visibility of a ChartLegend object.
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
        writer.writeStringValue("position", this.getPosition());
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartLegendFormat value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the overlay property value. Boolean value for whether the chart legend should overlap with the main body of the chart.
     * @param value Value to set for the overlay property.
     */
    public void setOverlay(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("overlay", value);
    }
    /**
     * Sets the position property value. Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom.
     * @param value Value to set for the position property.
     */
    public void setPosition(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("position", value);
    }
    /**
     * Sets the visible property value. A boolean value the represents the visibility of a ChartLegend object.
     * @param value Value to set for the visible property.
     */
    public void setVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("visible", value);
    }
}
