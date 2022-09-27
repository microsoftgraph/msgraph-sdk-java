package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartAxisFormat extends Entity implements Parsable {
    /** Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only. */
    private WorkbookChartFont _font;
    /** Represents chart line formatting. Read-only. */
    private WorkbookChartLineFormat _line;
    /**
     * Instantiates a new workbookChartAxisFormat and sets the default values.
     * @return a void
     */
    public WorkbookChartAxisFormat() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartAxisFormat");
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartAxisFormat currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("font", (n) -> { currentObject.setFont(n.getObjectValue(WorkbookChartFont::createFromDiscriminatorValue)); });
            this.put("line", (n) -> { currentObject.setLine(n.getObjectValue(WorkbookChartLineFormat::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the font property value. Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
     * @return a workbookChartFont
     */
    @javax.annotation.Nullable
    public WorkbookChartFont getFont() {
        return this._font;
    }
    /**
     * Gets the line property value. Represents chart line formatting. Read-only.
     * @return a workbookChartLineFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartLineFormat getLine() {
        return this._line;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setFont(@javax.annotation.Nullable final WorkbookChartFont value) {
        this._font = value;
    }
    /**
     * Sets the line property value. Represents chart line formatting. Read-only.
     * @param value Value to set for the line property.
     * @return a void
     */
    public void setLine(@javax.annotation.Nullable final WorkbookChartLineFormat value) {
        this._line = value;
    }
}
