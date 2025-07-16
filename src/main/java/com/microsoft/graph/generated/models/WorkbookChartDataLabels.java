package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartDataLabels extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookChartDataLabels} and sets the default values.
     */
    public WorkbookChartDataLabels() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookChartDataLabels}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartDataLabels createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartDataLabels();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartDataLabelFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("position", (n) -> { this.setPosition(n.getStringValue()); });
        deserializerMap.put("separator", (n) -> { this.setSeparator(n.getStringValue()); });
        deserializerMap.put("showBubbleSize", (n) -> { this.setShowBubbleSize(n.getBooleanValue()); });
        deserializerMap.put("showCategoryName", (n) -> { this.setShowCategoryName(n.getBooleanValue()); });
        deserializerMap.put("showLegendKey", (n) -> { this.setShowLegendKey(n.getBooleanValue()); });
        deserializerMap.put("showPercentage", (n) -> { this.setShowPercentage(n.getBooleanValue()); });
        deserializerMap.put("showSeriesName", (n) -> { this.setShowSeriesName(n.getBooleanValue()); });
        deserializerMap.put("showValue", (n) -> { this.setShowValue(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the format of chart data labels, which includes fill and font formatting. Read-only.
     * @return a {@link WorkbookChartDataLabelFormat}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartDataLabelFormat getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the position property value. DataLabelPosition value that represents the position of the data label. The possible values are: None, Center, InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPosition() {
        return this.backingStore.get("position");
    }
    /**
     * Gets the separator property value. String that represents the separator used for the data labels on a chart.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeparator() {
        return this.backingStore.get("separator");
    }
    /**
     * Gets the showBubbleSize property value. Boolean value that represents whether the data label bubble size is visible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowBubbleSize() {
        return this.backingStore.get("showBubbleSize");
    }
    /**
     * Gets the showCategoryName property value. Boolean value that represents whether the data label category name is visible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowCategoryName() {
        return this.backingStore.get("showCategoryName");
    }
    /**
     * Gets the showLegendKey property value. Boolean value that represents whether the data label legend key is visible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowLegendKey() {
        return this.backingStore.get("showLegendKey");
    }
    /**
     * Gets the showPercentage property value. Boolean value that represents whether the data label percentage is visible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowPercentage() {
        return this.backingStore.get("showPercentage");
    }
    /**
     * Gets the showSeriesName property value. Boolean value that represents whether the data label series name is visible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowSeriesName() {
        return this.backingStore.get("showSeriesName");
    }
    /**
     * Gets the showValue property value. Boolean value that represents whether the data label value is visible.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowValue() {
        return this.backingStore.get("showValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeStringValue("position", this.getPosition());
        writer.writeStringValue("separator", this.getSeparator());
        writer.writeBooleanValue("showBubbleSize", this.getShowBubbleSize());
        writer.writeBooleanValue("showCategoryName", this.getShowCategoryName());
        writer.writeBooleanValue("showLegendKey", this.getShowLegendKey());
        writer.writeBooleanValue("showPercentage", this.getShowPercentage());
        writer.writeBooleanValue("showSeriesName", this.getShowSeriesName());
        writer.writeBooleanValue("showValue", this.getShowValue());
    }
    /**
     * Sets the format property value. Represents the format of chart data labels, which includes fill and font formatting. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartDataLabelFormat value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the position property value. DataLabelPosition value that represents the position of the data label. The possible values are: None, Center, InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
     * @param value Value to set for the position property.
     */
    public void setPosition(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("position", value);
    }
    /**
     * Sets the separator property value. String that represents the separator used for the data labels on a chart.
     * @param value Value to set for the separator property.
     */
    public void setSeparator(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("separator", value);
    }
    /**
     * Sets the showBubbleSize property value. Boolean value that represents whether the data label bubble size is visible.
     * @param value Value to set for the showBubbleSize property.
     */
    public void setShowBubbleSize(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showBubbleSize", value);
    }
    /**
     * Sets the showCategoryName property value. Boolean value that represents whether the data label category name is visible.
     * @param value Value to set for the showCategoryName property.
     */
    public void setShowCategoryName(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showCategoryName", value);
    }
    /**
     * Sets the showLegendKey property value. Boolean value that represents whether the data label legend key is visible.
     * @param value Value to set for the showLegendKey property.
     */
    public void setShowLegendKey(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showLegendKey", value);
    }
    /**
     * Sets the showPercentage property value. Boolean value that represents whether the data label percentage is visible.
     * @param value Value to set for the showPercentage property.
     */
    public void setShowPercentage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showPercentage", value);
    }
    /**
     * Sets the showSeriesName property value. Boolean value that represents whether the data label series name is visible.
     * @param value Value to set for the showSeriesName property.
     */
    public void setShowSeriesName(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showSeriesName", value);
    }
    /**
     * Sets the showValue property value. Boolean value that represents whether the data label value is visible.
     * @param value Value to set for the showValue property.
     */
    public void setShowValue(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showValue", value);
    }
}
