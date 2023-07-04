package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartAxisFormat extends Entity implements Parsable {
    /**
     * Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
     */
    private WorkbookChartFont font;
    /**
     * Represents chart line formatting. Read-only.
     */
    private WorkbookChartLineFormat line;
    /**
     * Instantiates a new workbookChartAxisFormat and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartAxisFormat
     */
    @javax.annotation.Nonnull
    public static WorkbookChartAxisFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxisFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("font", (n) -> { this.setFont(n.getObjectValue(WorkbookChartFont::createFromDiscriminatorValue)); });
        deserializerMap.put("line", (n) -> { this.setLine(n.getObjectValue(WorkbookChartLineFormat::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the font property value. Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
     * @return a workbookChartFont
     */
    @javax.annotation.Nullable
    public WorkbookChartFont getFont() {
        return this.font;
    }
    /**
     * Gets the line property value. Represents chart line formatting. Read-only.
     * @return a workbookChartLineFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartLineFormat getLine() {
        return this.line;
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
        writer.writeObjectValue("font", this.getFont());
        writer.writeObjectValue("line", this.getLine());
    }
    /**
     * Sets the font property value. Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
     * @param value Value to set for the font property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFont(@javax.annotation.Nullable final WorkbookChartFont value) {
        this.font = value;
    }
    /**
     * Sets the line property value. Represents chart line formatting. Read-only.
     * @param value Value to set for the line property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLine(@javax.annotation.Nullable final WorkbookChartLineFormat value) {
        this.line = value;
    }
}
