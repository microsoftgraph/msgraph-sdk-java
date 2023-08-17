package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartTitle extends Entity implements Parsable {
    /**
     * Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
     */
    private WorkbookChartTitleFormat format;
    /**
     * Boolean value representing if the chart title will overlay the chart or not.
     */
    private Boolean overlay;
    /**
     * Represents the title text of a chart.
     */
    private String text;
    /**
     * A boolean value the represents the visibility of a chart title object.
     */
    private Boolean visible;
    /**
     * Instantiates a new workbookChartTitle and sets the default values.
     */
    public WorkbookChartTitle() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartTitle
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartTitle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartTitle();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartTitleFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("overlay", (n) -> { this.setOverlay(n.getBooleanValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("visible", (n) -> { this.setVisible(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
     * @return a workbookChartTitleFormat
     */
    @jakarta.annotation.Nullable
    public WorkbookChartTitleFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the overlay property value. Boolean value representing if the chart title will overlay the chart or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOverlay() {
        return this.overlay;
    }
    /**
     * Gets the text property value. Represents the title text of a chart.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Gets the visible property value. A boolean value the represents the visibility of a chart title object.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVisible() {
        return this.visible;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartTitleFormat value) {
        this.format = value;
    }
    /**
     * Sets the overlay property value. Boolean value representing if the chart title will overlay the chart or not.
     * @param value Value to set for the overlay property.
     */
    public void setOverlay(@jakarta.annotation.Nullable final Boolean value) {
        this.overlay = value;
    }
    /**
     * Sets the text property value. Represents the title text of a chart.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the visible property value. A boolean value the represents the visibility of a chart title object.
     * @param value Value to set for the visible property.
     */
    public void setVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.visible = value;
    }
}
