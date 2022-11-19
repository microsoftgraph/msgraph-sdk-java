package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartDataLabels extends Entity implements Parsable {
    /** Represents the format of chart data labels, which includes fill and font formatting. Read-only. */
    private WorkbookChartDataLabelFormat _format;
    /** DataLabelPosition value that represents the position of the data label. The possible values are: None, Center, InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout. */
    private String _position;
    /** String representing the separator used for the data labels on a chart. */
    private String _separator;
    /** Boolean value representing if the data label bubble size is visible or not. */
    private Boolean _showBubbleSize;
    /** Boolean value representing if the data label category name is visible or not. */
    private Boolean _showCategoryName;
    /** Boolean value representing if the data label legend key is visible or not. */
    private Boolean _showLegendKey;
    /** Boolean value representing if the data label percentage is visible or not. */
    private Boolean _showPercentage;
    /** Boolean value representing if the data label series name is visible or not. */
    private Boolean _showSeriesName;
    /** Boolean value representing if the data label value is visible or not. */
    private Boolean _showValue;
    /**
     * Instantiates a new workbookChartDataLabels and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartDataLabels() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartDataLabels");
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartDataLabels currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartDataLabelFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("position", (n) -> { currentObject.setPosition(n.getStringValue()); });
        deserializerMap.put("separator", (n) -> { currentObject.setSeparator(n.getStringValue()); });
        deserializerMap.put("showBubbleSize", (n) -> { currentObject.setShowBubbleSize(n.getBooleanValue()); });
        deserializerMap.put("showCategoryName", (n) -> { currentObject.setShowCategoryName(n.getBooleanValue()); });
        deserializerMap.put("showLegendKey", (n) -> { currentObject.setShowLegendKey(n.getBooleanValue()); });
        deserializerMap.put("showPercentage", (n) -> { currentObject.setShowPercentage(n.getBooleanValue()); });
        deserializerMap.put("showSeriesName", (n) -> { currentObject.setShowSeriesName(n.getBooleanValue()); });
        deserializerMap.put("showValue", (n) -> { currentObject.setShowValue(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the format of chart data labels, which includes fill and font formatting. Read-only.
     * @return a workbookChartDataLabelFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartDataLabelFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the position property value. DataLabelPosition value that represents the position of the data label. The possible values are: None, Center, InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPosition() {
        return this._position;
    }
    /**
     * Gets the separator property value. String representing the separator used for the data labels on a chart.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeparator() {
        return this._separator;
    }
    /**
     * Gets the showBubbleSize property value. Boolean value representing if the data label bubble size is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowBubbleSize() {
        return this._showBubbleSize;
    }
    /**
     * Gets the showCategoryName property value. Boolean value representing if the data label category name is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowCategoryName() {
        return this._showCategoryName;
    }
    /**
     * Gets the showLegendKey property value. Boolean value representing if the data label legend key is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowLegendKey() {
        return this._showLegendKey;
    }
    /**
     * Gets the showPercentage property value. Boolean value representing if the data label percentage is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowPercentage() {
        return this._showPercentage;
    }
    /**
     * Gets the showSeriesName property value. Boolean value representing if the data label series name is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowSeriesName() {
        return this._showSeriesName;
    }
    /**
     * Gets the showValue property value. Boolean value representing if the data label value is visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowValue() {
        return this._showValue;
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
        this._format = value;
    }
    /**
     * Sets the position property value. DataLabelPosition value that represents the position of the data label. The possible values are: None, Center, InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
     * @param value Value to set for the position property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPosition(@javax.annotation.Nullable final String value) {
        this._position = value;
    }
    /**
     * Sets the separator property value. String representing the separator used for the data labels on a chart.
     * @param value Value to set for the separator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeparator(@javax.annotation.Nullable final String value) {
        this._separator = value;
    }
    /**
     * Sets the showBubbleSize property value. Boolean value representing if the data label bubble size is visible or not.
     * @param value Value to set for the showBubbleSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowBubbleSize(@javax.annotation.Nullable final Boolean value) {
        this._showBubbleSize = value;
    }
    /**
     * Sets the showCategoryName property value. Boolean value representing if the data label category name is visible or not.
     * @param value Value to set for the showCategoryName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowCategoryName(@javax.annotation.Nullable final Boolean value) {
        this._showCategoryName = value;
    }
    /**
     * Sets the showLegendKey property value. Boolean value representing if the data label legend key is visible or not.
     * @param value Value to set for the showLegendKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowLegendKey(@javax.annotation.Nullable final Boolean value) {
        this._showLegendKey = value;
    }
    /**
     * Sets the showPercentage property value. Boolean value representing if the data label percentage is visible or not.
     * @param value Value to set for the showPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowPercentage(@javax.annotation.Nullable final Boolean value) {
        this._showPercentage = value;
    }
    /**
     * Sets the showSeriesName property value. Boolean value representing if the data label series name is visible or not.
     * @param value Value to set for the showSeriesName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowSeriesName(@javax.annotation.Nullable final Boolean value) {
        this._showSeriesName = value;
    }
    /**
     * Sets the showValue property value. Boolean value representing if the data label value is visible or not.
     * @param value Value to set for the showValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShowValue(@javax.annotation.Nullable final Boolean value) {
        this._showValue = value;
    }
}
