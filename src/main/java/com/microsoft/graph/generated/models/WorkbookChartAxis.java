package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartAxis extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookChartAxis} and sets the default values.
     */
    public WorkbookChartAxis() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookChartAxis}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartAxis createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxis();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartAxisFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("majorGridlines", (n) -> { this.setMajorGridlines(n.getObjectValue(WorkbookChartGridlines::createFromDiscriminatorValue)); });
        deserializerMap.put("majorUnit", (n) -> { this.setMajorUnit(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("maximum", (n) -> { this.setMaximum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("minimum", (n) -> { this.setMinimum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("minorGridlines", (n) -> { this.setMinorGridlines(n.getObjectValue(WorkbookChartGridlines::createFromDiscriminatorValue)); });
        deserializerMap.put("minorUnit", (n) -> { this.setMinorUnit(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getObjectValue(WorkbookChartAxisTitle::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of a chart object, which includes line and font formatting. Read-only.
     * @return a {@link WorkbookChartAxisFormat}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartAxisFormat getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the majorGridlines property value. Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
     * @return a {@link WorkbookChartGridlines}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartGridlines getMajorGridlines() {
        return this.backingStore.get("majorGridlines");
    }
    /**
     * Gets the majorUnit property value. Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getMajorUnit() {
        return this.backingStore.get("majorUnit");
    }
    /**
     * Gets the maximum property value. Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getMaximum() {
        return this.backingStore.get("maximum");
    }
    /**
     * Gets the minimum property value. Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getMinimum() {
        return this.backingStore.get("minimum");
    }
    /**
     * Gets the minorGridlines property value. Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
     * @return a {@link WorkbookChartGridlines}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartGridlines getMinorGridlines() {
        return this.backingStore.get("minorGridlines");
    }
    /**
     * Gets the minorUnit property value. Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getMinorUnit() {
        return this.backingStore.get("minorUnit");
    }
    /**
     * Gets the title property value. Represents the axis title. Read-only.
     * @return a {@link WorkbookChartAxisTitle}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartAxisTitle getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeObjectValue("majorGridlines", this.getMajorGridlines());
        writer.writeObjectValue("majorUnit", this.getMajorUnit());
        writer.writeObjectValue("maximum", this.getMaximum());
        writer.writeObjectValue("minimum", this.getMinimum());
        writer.writeObjectValue("minorGridlines", this.getMinorGridlines());
        writer.writeObjectValue("minorUnit", this.getMinorUnit());
        writer.writeObjectValue("title", this.getTitle());
    }
    /**
     * Sets the format property value. Represents the formatting of a chart object, which includes line and font formatting. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartAxisFormat value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the majorGridlines property value. Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
     * @param value Value to set for the majorGridlines property.
     */
    public void setMajorGridlines(@jakarta.annotation.Nullable final WorkbookChartGridlines value) {
        this.backingStore.set("majorGridlines", value);
    }
    /**
     * Sets the majorUnit property value. Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
     * @param value Value to set for the majorUnit property.
     */
    public void setMajorUnit(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("majorUnit", value);
    }
    /**
     * Sets the maximum property value. Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @param value Value to set for the maximum property.
     */
    public void setMaximum(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("maximum", value);
    }
    /**
     * Sets the minimum property value. Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @param value Value to set for the minimum property.
     */
    public void setMinimum(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("minimum", value);
    }
    /**
     * Sets the minorGridlines property value. Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
     * @param value Value to set for the minorGridlines property.
     */
    public void setMinorGridlines(@jakarta.annotation.Nullable final WorkbookChartGridlines value) {
        this.backingStore.set("minorGridlines", value);
    }
    /**
     * Sets the minorUnit property value. Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
     * @param value Value to set for the minorUnit property.
     */
    public void setMinorUnit(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("minorUnit", value);
    }
    /**
     * Sets the title property value. Represents the axis title. Read-only.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final WorkbookChartAxisTitle value) {
        this.backingStore.set("title", value);
    }
}
