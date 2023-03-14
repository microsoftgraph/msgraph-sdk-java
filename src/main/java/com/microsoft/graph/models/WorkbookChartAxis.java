package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartAxis extends Entity implements Parsable {
    /** Represents the formatting of a chart object, which includes line and font formatting. Read-only. */
    private WorkbookChartAxisFormat format;
    /** Returns a gridlines object that represents the major gridlines for the specified axis. Read-only. */
    private WorkbookChartGridlines majorGridlines;
    /** Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number. */
    private Json majorUnit;
    /** Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number. */
    private Json maximum;
    /** Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number. */
    private Json minimum;
    /** Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only. */
    private WorkbookChartGridlines minorGridlines;
    /** Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number. */
    private Json minorUnit;
    /** Represents the axis title. Read-only. */
    private WorkbookChartAxisTitle title;
    /**
     * Instantiates a new workbookChartAxis and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartAxis() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartAxis
     */
    @javax.annotation.Nonnull
    public static WorkbookChartAxis createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxis();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a workbookChartAxisFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the majorGridlines property value. Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
     * @return a workbookChartGridlines
     */
    @javax.annotation.Nullable
    public WorkbookChartGridlines getMajorGridlines() {
        return this.majorGridlines;
    }
    /**
     * Gets the majorUnit property value. Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMajorUnit() {
        return this.majorUnit;
    }
    /**
     * Gets the maximum property value. Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMaximum() {
        return this.maximum;
    }
    /**
     * Gets the minimum property value. Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMinimum() {
        return this.minimum;
    }
    /**
     * Gets the minorGridlines property value. Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
     * @return a workbookChartGridlines
     */
    @javax.annotation.Nullable
    public WorkbookChartGridlines getMinorGridlines() {
        return this.minorGridlines;
    }
    /**
     * Gets the minorUnit property value. Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMinorUnit() {
        return this.minorUnit;
    }
    /**
     * Gets the title property value. Represents the axis title. Read-only.
     * @return a workbookChartAxisTitle
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisTitle getTitle() {
        return this.title;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final WorkbookChartAxisFormat value) {
        this.format = value;
    }
    /**
     * Sets the majorGridlines property value. Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
     * @param value Value to set for the majorGridlines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMajorGridlines(@javax.annotation.Nullable final WorkbookChartGridlines value) {
        this.majorGridlines = value;
    }
    /**
     * Sets the majorUnit property value. Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
     * @param value Value to set for the majorUnit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMajorUnit(@javax.annotation.Nullable final Json value) {
        this.majorUnit = value;
    }
    /**
     * Sets the maximum property value. Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @param value Value to set for the maximum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximum(@javax.annotation.Nullable final Json value) {
        this.maximum = value;
    }
    /**
     * Sets the minimum property value. Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @param value Value to set for the minimum property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimum(@javax.annotation.Nullable final Json value) {
        this.minimum = value;
    }
    /**
     * Sets the minorGridlines property value. Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
     * @param value Value to set for the minorGridlines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinorGridlines(@javax.annotation.Nullable final WorkbookChartGridlines value) {
        this.minorGridlines = value;
    }
    /**
     * Sets the minorUnit property value. Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
     * @param value Value to set for the minorUnit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinorUnit(@javax.annotation.Nullable final Json value) {
        this.minorUnit = value;
    }
    /**
     * Sets the title property value. Represents the axis title. Read-only.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final WorkbookChartAxisTitle value) {
        this.title = value;
    }
}
