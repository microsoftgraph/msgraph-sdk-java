package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartDataLabelFormat extends Entity implements Parsable {
    /**
     * Represents the fill format of the current chart data label. Read-only.
     */
    private WorkbookChartFill fill;
    /**
     * Represents the font attributes (font name, font size, color, etc.) for a chart data label. Read-only.
     */
    private WorkbookChartFont font;
    /**
     * Instantiates a new workbookChartDataLabelFormat and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WorkbookChartDataLabelFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartDataLabelFormat
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartDataLabelFormat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartDataLabelFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fill", (n) -> { this.setFill(n.getObjectValue(WorkbookChartFill::createFromDiscriminatorValue)); });
        deserializerMap.put("font", (n) -> { this.setFont(n.getObjectValue(WorkbookChartFont::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fill property value. Represents the fill format of the current chart data label. Read-only.
     * @return a workbookChartFill
     */
    @jakarta.annotation.Nullable
    public WorkbookChartFill getFill() {
        return this.fill;
    }
    /**
     * Gets the font property value. Represents the font attributes (font name, font size, color, etc.) for a chart data label. Read-only.
     * @return a workbookChartFont
     */
    @jakarta.annotation.Nullable
    public WorkbookChartFont getFont() {
        return this.font;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fill", this.getFill());
        writer.writeObjectValue("font", this.getFont());
    }
    /**
     * Sets the fill property value. Represents the fill format of the current chart data label. Read-only.
     * @param value Value to set for the fill property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFill(@jakarta.annotation.Nullable final WorkbookChartFill value) {
        this.fill = value;
    }
    /**
     * Sets the font property value. Represents the font attributes (font name, font size, color, etc.) for a chart data label. Read-only.
     * @param value Value to set for the font property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFont(@jakarta.annotation.Nullable final WorkbookChartFont value) {
        this.font = value;
    }
}
