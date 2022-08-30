package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartLineFormat extends Entity implements Parsable {
    /** HTML color code representing the color of lines in the chart. */
    private String _color;
    /**
     * Instantiates a new workbookChartLineFormat and sets the default values.
     * @return a void
     */
    public WorkbookChartLineFormat() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartLineFormat");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartLineFormat
     */
    @javax.annotation.Nonnull
    public static WorkbookChartLineFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartLineFormat();
    }
    /**
     * Gets the color property value. HTML color code representing the color of lines in the chart.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getColor() {
        return this._color;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartLineFormat currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("color", this.getColor());
    }
    /**
     * Sets the color property value. HTML color code representing the color of lines in the chart.
     * @param value Value to set for the color property.
     * @return a void
     */
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
    }
}
