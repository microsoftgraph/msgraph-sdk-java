package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartSeries extends Entity implements Parsable {
    /** Represents the formatting of a chart series, which includes fill and line formatting. Read-only.  */
    private WorkbookChartSeriesFormat _format;
    /** Represents the name of a series in a chart.  */
    private String _name;
    /** Represents a collection of all points in the series. Read-only.  */
    private java.util.List<WorkbookChartPoint> _points;
    /**
     * Instantiates a new workbookChartSeries and sets the default values.
     * @return a void
     */
    public WorkbookChartSeries() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartSeries
     */
    @javax.annotation.Nonnull
    public static WorkbookChartSeries createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartSeries();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartSeries currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartSeriesFormat::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("points", (n) -> { currentObject.setPoints(n.getCollectionOfObjectValues(WorkbookChartPoint::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the format property value. Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
     * @return a workbookChartSeriesFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartSeriesFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the name property value. Represents the name of a series in a chart.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the points property value. Represents a collection of all points in the series. Read-only.
     * @return a workbookChartPoint
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookChartPoint> getPoints() {
        return this._points;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("points", this.getPoints());
    }
    /**
     * Sets the format property value. Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final WorkbookChartSeriesFormat value) {
        this._format = value;
    }
    /**
     * Sets the name property value. Represents the name of a series in a chart.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the points property value. Represents a collection of all points in the series. Read-only.
     * @param value Value to set for the points property.
     * @return a void
     */
    public void setPoints(@javax.annotation.Nullable final java.util.List<WorkbookChartPoint> value) {
        this._points = value;
    }
}
