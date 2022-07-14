package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartAxis extends Entity implements Parsable {
    /** Represents the formatting of a chart object, which includes line and font formatting. Read-only. */
    private WorkbookChartAxisFormat _format;
    /** Returns a gridlines object that represents the major gridlines for the specified axis. Read-only. */
    private WorkbookChartGridlines _majorGridlines;
    /** Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number. */
    private Json _majorUnit;
    /** Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number. */
    private Json _maximum;
    /** Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number. */
    private Json _minimum;
    /** Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only. */
    private WorkbookChartGridlines _minorGridlines;
    /** Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number. */
    private Json _minorUnit;
    /** Represents the axis title. Read-only. */
    private WorkbookChartAxisTitle _title;
    /**
     * Instantiates a new workbookChartAxis and sets the default values.
     * @return a void
     */
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartAxis currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartAxisFormat::createFromDiscriminatorValue)); });
            this.put("majorGridlines", (n) -> { currentObject.setMajorGridlines(n.getObjectValue(WorkbookChartGridlines::createFromDiscriminatorValue)); });
            this.put("majorUnit", (n) -> { currentObject.setMajorUnit(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("maximum", (n) -> { currentObject.setMaximum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("minimum", (n) -> { currentObject.setMinimum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("minorGridlines", (n) -> { currentObject.setMinorGridlines(n.getObjectValue(WorkbookChartGridlines::createFromDiscriminatorValue)); });
            this.put("minorUnit", (n) -> { currentObject.setMinorUnit(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("title", (n) -> { currentObject.setTitle(n.getObjectValue(WorkbookChartAxisTitle::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the format property value. Represents the formatting of a chart object, which includes line and font formatting. Read-only.
     * @return a workbookChartAxisFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the majorGridlines property value. Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
     * @return a workbookChartGridlines
     */
    @javax.annotation.Nullable
    public WorkbookChartGridlines getMajorGridlines() {
        return this._majorGridlines;
    }
    /**
     * Gets the majorUnit property value. Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMajorUnit() {
        return this._majorUnit;
    }
    /**
     * Gets the maximum property value. Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMaximum() {
        return this._maximum;
    }
    /**
     * Gets the minimum property value. Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMinimum() {
        return this._minimum;
    }
    /**
     * Gets the minorGridlines property value. Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
     * @return a workbookChartGridlines
     */
    @javax.annotation.Nullable
    public WorkbookChartGridlines getMinorGridlines() {
        return this._minorGridlines;
    }
    /**
     * Gets the minorUnit property value. Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMinorUnit() {
        return this._minorUnit;
    }
    /**
     * Gets the title property value. Represents the axis title. Read-only.
     * @return a workbookChartAxisTitle
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisTitle getTitle() {
        return this._title;
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
    public void setFormat(@javax.annotation.Nullable final WorkbookChartAxisFormat value) {
        this._format = value;
    }
    /**
     * Sets the majorGridlines property value. Returns a gridlines object that represents the major gridlines for the specified axis. Read-only.
     * @param value Value to set for the majorGridlines property.
     * @return a void
     */
    public void setMajorGridlines(@javax.annotation.Nullable final WorkbookChartGridlines value) {
        this._majorGridlines = value;
    }
    /**
     * Sets the majorUnit property value. Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
     * @param value Value to set for the majorUnit property.
     * @return a void
     */
    public void setMajorUnit(@javax.annotation.Nullable final Json value) {
        this._majorUnit = value;
    }
    /**
     * Sets the maximum property value. Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @param value Value to set for the maximum property.
     * @return a void
     */
    public void setMaximum(@javax.annotation.Nullable final Json value) {
        this._maximum = value;
    }
    /**
     * Sets the minimum property value. Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
     * @param value Value to set for the minimum property.
     * @return a void
     */
    public void setMinimum(@javax.annotation.Nullable final Json value) {
        this._minimum = value;
    }
    /**
     * Sets the minorGridlines property value. Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
     * @param value Value to set for the minorGridlines property.
     * @return a void
     */
    public void setMinorGridlines(@javax.annotation.Nullable final WorkbookChartGridlines value) {
        this._minorGridlines = value;
    }
    /**
     * Sets the minorUnit property value. Represents the interval between two minor tick marks. 'Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
     * @param value Value to set for the minorUnit property.
     * @return a void
     */
    public void setMinorUnit(@javax.annotation.Nullable final Json value) {
        this._minorUnit = value;
    }
    /**
     * Sets the title property value. Represents the axis title. Read-only.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final WorkbookChartAxisTitle value) {
        this._title = value;
    }
}
