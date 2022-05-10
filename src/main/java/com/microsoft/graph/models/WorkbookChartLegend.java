package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartLegend extends Entity implements Parsable {
    /** Represents the formatting of a chart legend, which includes fill and font formatting. Read-only. */
    private WorkbookChartLegendFormat _format;
    /** Boolean value for whether the chart legend should overlap with the main body of the chart. */
    private Boolean _overlay;
    /** Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom. */
    private String _position;
    /** A boolean value the represents the visibility of a ChartLegend object. */
    private Boolean _visible;
    /**
     * Instantiates a new workbookChartLegend and sets the default values.
     * @return a void
     */
    public WorkbookChartLegend() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartLegend
     */
    @javax.annotation.Nonnull
    public static WorkbookChartLegend createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartLegend();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartLegend currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartLegendFormat::createFromDiscriminatorValue)); });
            this.put("overlay", (n) -> { currentObject.setOverlay(n.getBooleanValue()); });
            this.put("position", (n) -> { currentObject.setPosition(n.getStringValue()); });
            this.put("visible", (n) -> { currentObject.setVisible(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the format property value. Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
     * @return a workbookChartLegendFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartLegendFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the overlay property value. Boolean value for whether the chart legend should overlap with the main body of the chart.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOverlay() {
        return this._overlay;
    }
    /**
     * Gets the position property value. Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPosition() {
        return this._position;
    }
    /**
     * Gets the visible property value. A boolean value the represents the visibility of a ChartLegend object.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVisible() {
        return this._visible;
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
        writer.writeBooleanValue("overlay", this.getOverlay());
        writer.writeStringValue("position", this.getPosition());
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final WorkbookChartLegendFormat value) {
        this._format = value;
    }
    /**
     * Sets the overlay property value. Boolean value for whether the chart legend should overlap with the main body of the chart.
     * @param value Value to set for the overlay property.
     * @return a void
     */
    public void setOverlay(@javax.annotation.Nullable final Boolean value) {
        this._overlay = value;
    }
    /**
     * Sets the position property value. Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom.
     * @param value Value to set for the position property.
     * @return a void
     */
    public void setPosition(@javax.annotation.Nullable final String value) {
        this._position = value;
    }
    /**
     * Sets the visible property value. A boolean value the represents the visibility of a ChartLegend object.
     * @param value Value to set for the visible property.
     * @return a void
     */
    public void setVisible(@javax.annotation.Nullable final Boolean value) {
        this._visible = value;
    }
}
