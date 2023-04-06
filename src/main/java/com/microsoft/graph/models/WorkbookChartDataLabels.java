package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartDataLabels extends Entity implements Parsable {
    /** Represents the format of chart data labels, which includes fill and font formatting. Read-only. */
    private WorkbookChartDataLabelFormat format;
    /** DataLabelPosition value that represents the position of the data label. The possible values are: None, Center, InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout. */
    private String position;
    /** String representing the separator used for the data labels on a chart. */
    private String separator;
    /** Boolean value representing if the data label bubble size is visible or not. */
    private Boolean showBubbleSize;
    /** Boolean value representing if the data label category name is visible or not. */
    private Boolean showCategoryName;
    /** Boolean value representing if the data label legend key is visible or not. */
    private Boolean showLegendKey;
    /** Boolean value representing if the data label percentage is visible or not. */
    private Boolean showPercentage;
    /** Boolean value representing if the data label series name is visible or not. */
    private Boolean showSeriesName;
    /** Boolean value representing if the data label value is visible or not. */
    private Boolean showValue;
    /**
     * Instantiates a new workbookChartDataLabels and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartDataLabels() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartDataLabels
     */
    @javax.annotation.Nonnull
    public static WorkbookChartDataLabels createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartDataLabels();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a workbookChartDataLabelFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartDataLabelFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the position property value. DataLabelPosition value that represents the position of the data label. The possible values are: None, Center, InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPosition() {
        return this.position;
    }
    /**
     * Gets the separator property value. String representing the separator used for the data labels on a chart.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeparator() {
        return this.separator;
    }
    /**
     * Gets the showBubbleSize property value. Boolean value representing if the data label bubble size is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowBubbleSize() {
        return this.showBubbleSize;
    }
    /**
     * Gets the showCategoryName property value. Boolean value representing if the data label category name is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowCategoryName() {
        return this.showCategoryName;
    }
    /**
     * Gets the showLegendKey property value. Boolean value representing if the data label legend key is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowLegendKey() {
        return this.showLegendKey;
    }
    /**
     * Gets the showPercentage property value. Boolean value representing if the data label percentage is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowPercentage() {
        return this.showPercentage;
    }
    /**
     * Gets the showSeriesName property value. Boolean value representing if the data label series name is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowSeriesName() {
        return this.showSeriesName;
    }
    /**
     * Gets the showValue property value. Boolean value representing if the data label value is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowValue() {
        return this.showValue;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final WorkbookChartDataLabelFormat value) {
        this.format = value;
    }
    /**
     * Sets the position property value. DataLabelPosition value that represents the position of the data label. The possible values are: None, Center, InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
     * @param value Value to set for the position property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPosition(@javax.annotation.Nullable final String value) {
        this.position = value;
    }
    /**
     * Sets the separator property value. String representing the separator used for the data labels on a chart.
     * @param value Value to set for the separator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeparator(@javax.annotation.Nullable final String value) {
        this.separator = value;
    }
    /**
     * Sets the showBubbleSize property value. Boolean value representing if the data label bubble size is visible or not.
     * @param value Value to set for the showBubbleSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowBubbleSize(@javax.annotation.Nullable final Boolean value) {
        this.showBubbleSize = value;
    }
    /**
     * Sets the showCategoryName property value. Boolean value representing if the data label category name is visible or not.
     * @param value Value to set for the showCategoryName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowCategoryName(@javax.annotation.Nullable final Boolean value) {
        this.showCategoryName = value;
    }
    /**
     * Sets the showLegendKey property value. Boolean value representing if the data label legend key is visible or not.
     * @param value Value to set for the showLegendKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowLegendKey(@javax.annotation.Nullable final Boolean value) {
        this.showLegendKey = value;
    }
    /**
     * Sets the showPercentage property value. Boolean value representing if the data label percentage is visible or not.
     * @param value Value to set for the showPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowPercentage(@javax.annotation.Nullable final Boolean value) {
        this.showPercentage = value;
    }
    /**
     * Sets the showSeriesName property value. Boolean value representing if the data label series name is visible or not.
     * @param value Value to set for the showSeriesName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowSeriesName(@javax.annotation.Nullable final Boolean value) {
        this.showSeriesName = value;
    }
    /**
     * Sets the showValue property value. Boolean value representing if the data label value is visible or not.
     * @param value Value to set for the showValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowValue(@javax.annotation.Nullable final Boolean value) {
        this.showValue = value;
    }
}
