package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartSeries extends Entity implements Parsable {
    /**
     * Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
     */
    private WorkbookChartSeriesFormat format;
    /**
     * Represents the name of a series in a chart.
     */
    private String name;
    /**
     * Represents a collection of all points in the series. Read-only.
     */
    private java.util.List<WorkbookChartPoint> points;
    /**
     * Instantiates a new workbookChartSeries and sets the default values.
     */
    public WorkbookChartSeries() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartSeries
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartSeries createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartSeries();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartSeriesFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("points", (n) -> { this.setPoints(n.getCollectionOfObjectValues(WorkbookChartPoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
     * @return a workbookChartSeriesFormat
     */
    @jakarta.annotation.Nullable
    public WorkbookChartSeriesFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the name property value. Represents the name of a series in a chart.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the points property value. Represents a collection of all points in the series. Read-only.
     * @return a workbookChartPoint
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookChartPoint> getPoints() {
        return this.points;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("points", this.getPoints());
    }
    /**
     * Sets the format property value. Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartSeriesFormat value) {
        this.format = value;
    }
    /**
     * Sets the name property value. Represents the name of a series in a chart.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the points property value. Represents a collection of all points in the series. Read-only.
     * @param value Value to set for the points property.
     */
    public void setPoints(@jakarta.annotation.Nullable final java.util.List<WorkbookChartPoint> value) {
        this.points = value;
    }
}
