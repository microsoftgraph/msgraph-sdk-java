package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartAxes extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookChartAxes} and sets the default values.
     */
    public WorkbookChartAxes() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookChartAxes}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartAxes createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxes();
    }
    /**
     * Gets the categoryAxis property value. Represents the category axis in a chart. Read-only.
     * @return a {@link WorkbookChartAxis}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartAxis getCategoryAxis() {
        return this.backingStore.get("categoryAxis");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categoryAxis", (n) -> { this.setCategoryAxis(n.getObjectValue(WorkbookChartAxis::createFromDiscriminatorValue)); });
        deserializerMap.put("seriesAxis", (n) -> { this.setSeriesAxis(n.getObjectValue(WorkbookChartAxis::createFromDiscriminatorValue)); });
        deserializerMap.put("valueAxis", (n) -> { this.setValueAxis(n.getObjectValue(WorkbookChartAxis::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the seriesAxis property value. Represents the series axis of a 3-dimensional chart. Read-only.
     * @return a {@link WorkbookChartAxis}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartAxis getSeriesAxis() {
        return this.backingStore.get("seriesAxis");
    }
    /**
     * Gets the valueAxis property value. Represents the value axis in an axis. Read-only.
     * @return a {@link WorkbookChartAxis}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartAxis getValueAxis() {
        return this.backingStore.get("valueAxis");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("categoryAxis", this.getCategoryAxis());
        writer.writeObjectValue("seriesAxis", this.getSeriesAxis());
        writer.writeObjectValue("valueAxis", this.getValueAxis());
    }
    /**
     * Sets the categoryAxis property value. Represents the category axis in a chart. Read-only.
     * @param value Value to set for the categoryAxis property.
     */
    public void setCategoryAxis(@jakarta.annotation.Nullable final WorkbookChartAxis value) {
        this.backingStore.set("categoryAxis", value);
    }
    /**
     * Sets the seriesAxis property value. Represents the series axis of a 3-dimensional chart. Read-only.
     * @param value Value to set for the seriesAxis property.
     */
    public void setSeriesAxis(@jakarta.annotation.Nullable final WorkbookChartAxis value) {
        this.backingStore.set("seriesAxis", value);
    }
    /**
     * Sets the valueAxis property value. Represents the value axis in an axis. Read-only.
     * @param value Value to set for the valueAxis property.
     */
    public void setValueAxis(@jakarta.annotation.Nullable final WorkbookChartAxis value) {
        this.backingStore.set("valueAxis", value);
    }
}
