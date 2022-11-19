package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartAxisTitleFormat extends Entity implements Parsable {
    /** Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only. */
    private WorkbookChartFont _font;
    /**
     * Instantiates a new workbookChartAxisTitleFormat and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartAxisTitleFormat() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartAxisTitleFormat");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartAxisTitleFormat
     */
    @javax.annotation.Nonnull
    public static WorkbookChartAxisTitleFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxisTitleFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartAxisTitleFormat currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("font", (n) -> { currentObject.setFont(n.getObjectValue(WorkbookChartFont::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the font property value. Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
     * @return a workbookChartFont
     */
    @javax.annotation.Nullable
    public WorkbookChartFont getFont() {
        return this._font;
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
    }
    /**
     * Sets the font property value. Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
     * @param value Value to set for the font property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFont(@javax.annotation.Nullable final WorkbookChartFont value) {
        this._font = value;
    }
}
