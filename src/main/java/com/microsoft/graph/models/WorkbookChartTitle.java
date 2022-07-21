package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartTitle extends Entity implements Parsable {
    /** Represents the formatting of a chart title, which includes fill and font formatting. Read-only. */
    private WorkbookChartTitleFormat _format;
    /** Boolean value representing if the chart title will overlay the chart or not. */
    private Boolean _overlay;
    /** Represents the title text of a chart. */
    private String _text;
    /** A boolean value the represents the visibility of a chart title object. */
    private Boolean _visible;
    /**
     * Instantiates a new workbookChartTitle and sets the default values.
     * @return a void
     */
    public WorkbookChartTitle() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartTitle");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartTitle
     */
    @javax.annotation.Nonnull
    public static WorkbookChartTitle createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartTitle();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartTitle currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartTitleFormat::createFromDiscriminatorValue)); });
            this.put("overlay", (n) -> { currentObject.setOverlay(n.getBooleanValue()); });
            this.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
            this.put("visible", (n) -> { currentObject.setVisible(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the format property value. Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
     * @return a workbookChartTitleFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartTitleFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the overlay property value. Boolean value representing if the chart title will overlay the chart or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOverlay() {
        return this._overlay;
    }
    /**
     * Gets the text property value. Represents the title text of a chart.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Gets the visible property value. A boolean value the represents the visibility of a chart title object.
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
        writer.writeStringValue("text", this.getText());
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final WorkbookChartTitleFormat value) {
        this._format = value;
    }
    /**
     * Sets the overlay property value. Boolean value representing if the chart title will overlay the chart or not.
     * @param value Value to set for the overlay property.
     * @return a void
     */
    public void setOverlay(@javax.annotation.Nullable final Boolean value) {
        this._overlay = value;
    }
    /**
     * Sets the text property value. Represents the title text of a chart.
     * @param value Value to set for the text property.
     * @return a void
     */
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
    /**
     * Sets the visible property value. A boolean value the represents the visibility of a chart title object.
     * @param value Value to set for the visible property.
     * @return a void
     */
    public void setVisible(@javax.annotation.Nullable final Boolean value) {
        this._visible = value;
    }
}
