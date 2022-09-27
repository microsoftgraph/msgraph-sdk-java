package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartTitleFormat extends Entity implements Parsable {
    /** Represents the fill format of an object, which includes background formatting information. Read-only. */
    private WorkbookChartFill _fill;
    /** Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only. */
    private WorkbookChartFont _font;
    /**
     * Instantiates a new workbookChartTitleFormat and sets the default values.
     * @return a void
     */
    public WorkbookChartTitleFormat() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartTitleFormat");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartTitleFormat
     */
    @javax.annotation.Nonnull
    public static WorkbookChartTitleFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartTitleFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartTitleFormat currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("fill", (n) -> { currentObject.setFill(n.getObjectValue(WorkbookChartFill::createFromDiscriminatorValue)); });
            this.put("font", (n) -> { currentObject.setFont(n.getObjectValue(WorkbookChartFont::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the fill property value. Represents the fill format of an object, which includes background formatting information. Read-only.
     * @return a workbookChartFill
     */
    @javax.annotation.Nullable
    public WorkbookChartFill getFill() {
        return this._fill;
    }
    /**
     * Gets the font property value. Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fill", this.getFill());
        writer.writeObjectValue("font", this.getFont());
    }
    /**
     * Sets the fill property value. Represents the fill format of an object, which includes background formatting information. Read-only.
     * @param value Value to set for the fill property.
     * @return a void
     */
    public void setFill(@javax.annotation.Nullable final WorkbookChartFill value) {
        this._fill = value;
    }
    /**
     * Sets the font property value. Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
     * @param value Value to set for the font property.
     * @return a void
     */
    public void setFont(@javax.annotation.Nullable final WorkbookChartFont value) {
        this._font = value;
    }
}
