package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartAxes extends Entity implements Parsable {
    /** Represents the category axis in a chart. Read-only. */
    private WorkbookChartAxis _categoryAxis;
    /** Represents the series axis of a 3-dimensional chart. Read-only. */
    private WorkbookChartAxis _seriesAxis;
    /** Represents the value axis in an axis. Read-only. */
    private WorkbookChartAxis _valueAxis;
    /**
     * Instantiates a new workbookChartAxes and sets the default values.
     * @return a void
     */
    public WorkbookChartAxes() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartAxes");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartAxes
     */
    @javax.annotation.Nonnull
    public static WorkbookChartAxes createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxes();
    }
    /**
     * Gets the categoryAxis property value. Represents the category axis in a chart. Read-only.
     * @return a workbookChartAxis
     */
    @javax.annotation.Nullable
    public WorkbookChartAxis getCategoryAxis() {
        return this._categoryAxis;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartAxes currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("categoryAxis", (n) -> { currentObject.setCategoryAxis(n.getObjectValue(WorkbookChartAxis::createFromDiscriminatorValue)); });
            this.put("seriesAxis", (n) -> { currentObject.setSeriesAxis(n.getObjectValue(WorkbookChartAxis::createFromDiscriminatorValue)); });
            this.put("valueAxis", (n) -> { currentObject.setValueAxis(n.getObjectValue(WorkbookChartAxis::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the seriesAxis property value. Represents the series axis of a 3-dimensional chart. Read-only.
     * @return a workbookChartAxis
     */
    @javax.annotation.Nullable
    public WorkbookChartAxis getSeriesAxis() {
        return this._seriesAxis;
    }
    /**
     * Gets the valueAxis property value. Represents the value axis in an axis. Read-only.
     * @return a workbookChartAxis
     */
    @javax.annotation.Nullable
    public WorkbookChartAxis getValueAxis() {
        return this._valueAxis;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("categoryAxis", this.getCategoryAxis());
        writer.writeObjectValue("seriesAxis", this.getSeriesAxis());
        writer.writeObjectValue("valueAxis", this.getValueAxis());
    }
    /**
     * Sets the categoryAxis property value. Represents the category axis in a chart. Read-only.
     * @param value Value to set for the categoryAxis property.
     * @return a void
     */
    public void setCategoryAxis(@javax.annotation.Nullable final WorkbookChartAxis value) {
        this._categoryAxis = value;
    }
    /**
     * Sets the seriesAxis property value. Represents the series axis of a 3-dimensional chart. Read-only.
     * @param value Value to set for the seriesAxis property.
     * @return a void
     */
    public void setSeriesAxis(@javax.annotation.Nullable final WorkbookChartAxis value) {
        this._seriesAxis = value;
    }
    /**
     * Sets the valueAxis property value. Represents the value axis in an axis. Read-only.
     * @param value Value to set for the valueAxis property.
     * @return a void
     */
    public void setValueAxis(@javax.annotation.Nullable final WorkbookChartAxis value) {
        this._valueAxis = value;
    }
}
