package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChart extends Entity implements Parsable {
    /** Represents chart axes. Read-only. */
    private WorkbookChartAxes axes;
    /** Represents the datalabels on the chart. Read-only. */
    private WorkbookChartDataLabels dataLabels;
    /** Encapsulates the format properties for the chart area. Read-only. */
    private WorkbookChartAreaFormat format;
    /** Represents the height, in points, of the chart object. */
    private Double height;
    /** The distance, in points, from the left side of the chart to the worksheet origin. */
    private Double left;
    /** Represents the legend for the chart. Read-only. */
    private WorkbookChartLegend legend;
    /** Represents the name of a chart object. */
    private String name;
    /** Represents either a single series or collection of series in the chart. Read-only. */
    private java.util.List<WorkbookChartSeries> series;
    /** Represents the title of the specified chart, including the text, visibility, position and formating of the title. Read-only. */
    private WorkbookChartTitle title;
    /** Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart). */
    private Double top;
    /** Represents the width, in points, of the chart object. */
    private Double width;
    /** The worksheet containing the current chart. Read-only. */
    private WorkbookWorksheet worksheet;
    /**
     * Instantiates a new workbookChart and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChart() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChart
     */
    @javax.annotation.Nonnull
    public static WorkbookChart createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChart();
    }
    /**
     * Gets the axes property value. Represents chart axes. Read-only.
     * @return a workbookChartAxes
     */
    @javax.annotation.Nullable
    public WorkbookChartAxes getAxes() {
        return this.axes;
    }
    /**
     * Gets the dataLabels property value. Represents the datalabels on the chart. Read-only.
     * @return a workbookChartDataLabels
     */
    @javax.annotation.Nullable
    public WorkbookChartDataLabels getDataLabels() {
        return this.dataLabels;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("axes", (n) -> { this.setAxes(n.getObjectValue(WorkbookChartAxes::createFromDiscriminatorValue)); });
        deserializerMap.put("dataLabels", (n) -> { this.setDataLabels(n.getObjectValue(WorkbookChartDataLabels::createFromDiscriminatorValue)); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartAreaFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("height", (n) -> { this.setHeight(n.getDoubleValue()); });
        deserializerMap.put("left", (n) -> { this.setLeft(n.getDoubleValue()); });
        deserializerMap.put("legend", (n) -> { this.setLegend(n.getObjectValue(WorkbookChartLegend::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("series", (n) -> { this.setSeries(n.getCollectionOfObjectValues(WorkbookChartSeries::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getObjectValue(WorkbookChartTitle::createFromDiscriminatorValue)); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getDoubleValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getDoubleValue()); });
        deserializerMap.put("worksheet", (n) -> { this.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Encapsulates the format properties for the chart area. Read-only.
     * @return a workbookChartAreaFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartAreaFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the height property value. Represents the height, in points, of the chart object.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getHeight() {
        return this.height;
    }
    /**
     * Gets the left property value. The distance, in points, from the left side of the chart to the worksheet origin.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLeft() {
        return this.left;
    }
    /**
     * Gets the legend property value. Represents the legend for the chart. Read-only.
     * @return a workbookChartLegend
     */
    @javax.annotation.Nullable
    public WorkbookChartLegend getLegend() {
        return this.legend;
    }
    /**
     * Gets the name property value. Represents the name of a chart object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the series property value. Represents either a single series or collection of series in the chart. Read-only.
     * @return a workbookChartSeries
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookChartSeries> getSeries() {
        return this.series;
    }
    /**
     * Gets the title property value. Represents the title of the specified chart, including the text, visibility, position and formating of the title. Read-only.
     * @return a workbookChartTitle
     */
    @javax.annotation.Nullable
    public WorkbookChartTitle getTitle() {
        return this.title;
    }
    /**
     * Gets the top property value. Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTop() {
        return this.top;
    }
    /**
     * Gets the width property value. Represents the width, in points, of the chart object.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWidth() {
        return this.width;
    }
    /**
     * Gets the worksheet property value. The worksheet containing the current chart. Read-only.
     * @return a workbookWorksheet
     */
    @javax.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this.worksheet;
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
        writer.writeObjectValue("axes", this.getAxes());
        writer.writeObjectValue("dataLabels", this.getDataLabels());
        writer.writeObjectValue("format", this.getFormat());
        writer.writeDoubleValue("height", this.getHeight());
        writer.writeDoubleValue("left", this.getLeft());
        writer.writeObjectValue("legend", this.getLegend());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("series", this.getSeries());
        writer.writeObjectValue("title", this.getTitle());
        writer.writeDoubleValue("top", this.getTop());
        writer.writeDoubleValue("width", this.getWidth());
        writer.writeObjectValue("worksheet", this.getWorksheet());
    }
    /**
     * Sets the axes property value. Represents chart axes. Read-only.
     * @param value Value to set for the axes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAxes(@javax.annotation.Nullable final WorkbookChartAxes value) {
        this.axes = value;
    }
    /**
     * Sets the dataLabels property value. Represents the datalabels on the chart. Read-only.
     * @param value Value to set for the dataLabels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataLabels(@javax.annotation.Nullable final WorkbookChartDataLabels value) {
        this.dataLabels = value;
    }
    /**
     * Sets the format property value. Encapsulates the format properties for the chart area. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final WorkbookChartAreaFormat value) {
        this.format = value;
    }
    /**
     * Sets the height property value. Represents the height, in points, of the chart object.
     * @param value Value to set for the height property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeight(@javax.annotation.Nullable final Double value) {
        this.height = value;
    }
    /**
     * Sets the left property value. The distance, in points, from the left side of the chart to the worksheet origin.
     * @param value Value to set for the left property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeft(@javax.annotation.Nullable final Double value) {
        this.left = value;
    }
    /**
     * Sets the legend property value. Represents the legend for the chart. Read-only.
     * @param value Value to set for the legend property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLegend(@javax.annotation.Nullable final WorkbookChartLegend value) {
        this.legend = value;
    }
    /**
     * Sets the name property value. Represents the name of a chart object.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the series property value. Represents either a single series or collection of series in the chart. Read-only.
     * @param value Value to set for the series property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeries(@javax.annotation.Nullable final java.util.List<WorkbookChartSeries> value) {
        this.series = value;
    }
    /**
     * Sets the title property value. Represents the title of the specified chart, including the text, visibility, position and formating of the title. Read-only.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final WorkbookChartTitle value) {
        this.title = value;
    }
    /**
     * Sets the top property value. Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
     * @param value Value to set for the top property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTop(@javax.annotation.Nullable final Double value) {
        this.top = value;
    }
    /**
     * Sets the width property value. Represents the width, in points, of the chart object.
     * @param value Value to set for the width property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWidth(@javax.annotation.Nullable final Double value) {
        this.width = value;
    }
    /**
     * Sets the worksheet property value. The worksheet containing the current chart. Read-only.
     * @param value Value to set for the worksheet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorksheet(@javax.annotation.Nullable final WorkbookWorksheet value) {
        this.worksheet = value;
    }
}
