package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartAxisTitle extends Entity implements Parsable {
    /** Represents the formatting of chart axis title. Read-only. */
    private WorkbookChartAxisTitleFormat format;
    /** Represents the axis title. */
    private String text;
    /** A boolean that specifies the visibility of an axis title. */
    private Boolean visible;
    /**
     * Instantiates a new workbookChartAxisTitle and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisTitle() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartAxisTitle
     */
    @javax.annotation.Nonnull
    public static WorkbookChartAxisTitle createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxisTitle();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartAxisTitleFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("visible", (n) -> { this.setVisible(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of chart axis title. Read-only.
     * @return a workbookChartAxisTitleFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisTitleFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the text property value. Represents the axis title.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Gets the visible property value. A boolean that specifies the visibility of an axis title.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVisible() {
        return this.visible;
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
        writer.writeStringValue("text", this.getText());
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of chart axis title. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final WorkbookChartAxisTitleFormat value) {
        this.format = value;
    }
    /**
     * Sets the text property value. Represents the axis title.
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the visible property value. A boolean that specifies the visibility of an axis title.
     * @param value Value to set for the visible property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisible(@javax.annotation.Nullable final Boolean value) {
        this.visible = value;
    }
}
