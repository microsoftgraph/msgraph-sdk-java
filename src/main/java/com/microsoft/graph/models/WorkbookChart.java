package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChart extends Entity implements Parsable {
    /** Represents chart axes. Read-only. */
    private WorkbookChartAxes _axes;
    /** Represents the datalabels on the chart. Read-only. */
    private WorkbookChartDataLabels _dataLabels;
    /** Encapsulates the format properties for the chart area. Read-only. */
    private WorkbookChartAreaFormat _format;
    /** Represents the height, in points, of the chart object. */
    private Double _height;
    /** The distance, in points, from the left side of the chart to the worksheet origin. */
    private Double _left;
    /** Represents the legend for the chart. Read-only. */
    private WorkbookChartLegend _legend;
    /** Represents the name of a chart object. */
    private String _name;
    /** Represents either a single series or collection of series in the chart. Read-only. */
    private java.util.List<WorkbookChartSeries> _series;
    /** Represents the title of the specified chart, including the text, visibility, position and formating of the title. Read-only. */
    private WorkbookChartTitle _title;
    /** Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart). */
    private Double _top;
    /** Represents the width, in points, of the chart object. */
    private Double _width;
    /** The worksheet containing the current chart. Read-only. */
    private WorkbookWorksheet _worksheet;
    /**
     * Instantiates a new workbookChart and sets the default values.
     * @return a void
     */
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
        return this._axes;
    }
    /**
     * Gets the dataLabels property value. Represents the datalabels on the chart. Read-only.
     * @return a workbookChartDataLabels
     */
    @javax.annotation.Nullable
    public WorkbookChartDataLabels getDataLabels() {
        return this._dataLabels;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChart currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("axes", (n) -> { currentObject.setAxes(n.getObjectValue(WorkbookChartAxes::createFromDiscriminatorValue)); });
            this.put("dataLabels", (n) -> { currentObject.setDataLabels(n.getObjectValue(WorkbookChartDataLabels::createFromDiscriminatorValue)); });
            this.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartAreaFormat::createFromDiscriminatorValue)); });
            this.put("height", (n) -> { currentObject.setHeight(n.getDoubleValue()); });
            this.put("left", (n) -> { currentObject.setLeft(n.getDoubleValue()); });
            this.put("legend", (n) -> { currentObject.setLegend(n.getObjectValue(WorkbookChartLegend::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("series", (n) -> { currentObject.setSeries(n.getCollectionOfObjectValues(WorkbookChartSeries::createFromDiscriminatorValue)); });
            this.put("title", (n) -> { currentObject.setTitle(n.getObjectValue(WorkbookChartTitle::createFromDiscriminatorValue)); });
            this.put("top", (n) -> { currentObject.setTop(n.getDoubleValue()); });
            this.put("width", (n) -> { currentObject.setWidth(n.getDoubleValue()); });
            this.put("worksheet", (n) -> { currentObject.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the format property value. Encapsulates the format properties for the chart area. Read-only.
     * @return a workbookChartAreaFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartAreaFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the height property value. Represents the height, in points, of the chart object.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getHeight() {
        return this._height;
    }
    /**
     * Gets the left property value. The distance, in points, from the left side of the chart to the worksheet origin.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getLeft() {
        return this._left;
    }
    /**
     * Gets the legend property value. Represents the legend for the chart. Read-only.
     * @return a workbookChartLegend
     */
    @javax.annotation.Nullable
    public WorkbookChartLegend getLegend() {
        return this._legend;
    }
    /**
     * Gets the name property value. Represents the name of a chart object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the series property value. Represents either a single series or collection of series in the chart. Read-only.
     * @return a workbookChartSeries
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookChartSeries> getSeries() {
        return this._series;
    }
    /**
     * Gets the title property value. Represents the title of the specified chart, including the text, visibility, position and formating of the title. Read-only.
     * @return a workbookChartTitle
     */
    @javax.annotation.Nullable
    public WorkbookChartTitle getTitle() {
        return this._title;
    }
    /**
     * Gets the top property value. Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getTop() {
        return this._top;
    }
    /**
     * Gets the width property value. Represents the width, in points, of the chart object.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWidth() {
        return this._width;
    }
    /**
     * Gets the worksheet property value. The worksheet containing the current chart. Read-only.
     * @return a workbookWorksheet
     */
    @javax.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this._worksheet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAxes(@javax.annotation.Nullable final WorkbookChartAxes value) {
        this._axes = value;
    }
    /**
     * Sets the dataLabels property value. Represents the datalabels on the chart. Read-only.
     * @param value Value to set for the dataLabels property.
     * @return a void
     */
    public void setDataLabels(@javax.annotation.Nullable final WorkbookChartDataLabels value) {
        this._dataLabels = value;
    }
    /**
     * Sets the format property value. Encapsulates the format properties for the chart area. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final WorkbookChartAreaFormat value) {
        this._format = value;
    }
    /**
     * Sets the height property value. Represents the height, in points, of the chart object.
     * @param value Value to set for the height property.
     * @return a void
     */
    public void setHeight(@javax.annotation.Nullable final Double value) {
        this._height = value;
    }
    /**
     * Sets the left property value. The distance, in points, from the left side of the chart to the worksheet origin.
     * @param value Value to set for the left property.
     * @return a void
     */
    public void setLeft(@javax.annotation.Nullable final Double value) {
        this._left = value;
    }
    /**
     * Sets the legend property value. Represents the legend for the chart. Read-only.
     * @param value Value to set for the legend property.
     * @return a void
     */
    public void setLegend(@javax.annotation.Nullable final WorkbookChartLegend value) {
        this._legend = value;
    }
    /**
     * Sets the name property value. Represents the name of a chart object.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the series property value. Represents either a single series or collection of series in the chart. Read-only.
     * @param value Value to set for the series property.
     * @return a void
     */
    public void setSeries(@javax.annotation.Nullable final java.util.List<WorkbookChartSeries> value) {
        this._series = value;
    }
    /**
     * Sets the title property value. Represents the title of the specified chart, including the text, visibility, position and formating of the title. Read-only.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final WorkbookChartTitle value) {
        this._title = value;
    }
    /**
     * Sets the top property value. Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
     * @param value Value to set for the top property.
     * @return a void
     */
    public void setTop(@javax.annotation.Nullable final Double value) {
        this._top = value;
    }
    /**
     * Sets the width property value. Represents the width, in points, of the chart object.
     * @param value Value to set for the width property.
     * @return a void
     */
    public void setWidth(@javax.annotation.Nullable final Double value) {
        this._width = value;
    }
    /**
     * Sets the worksheet property value. The worksheet containing the current chart. Read-only.
     * @param value Value to set for the worksheet property.
     * @return a void
     */
    public void setWorksheet(@javax.annotation.Nullable final WorkbookWorksheet value) {
        this._worksheet = value;
    }
}
