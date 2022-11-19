package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookRangeFill extends Entity implements Parsable {
    /** HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange') */
    private String _color;
    /**
     * Instantiates a new workbookRangeFill and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookRangeFill() {
        super();
        this.setOdataType("#microsoft.graph.workbookRangeFill");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookRangeFill
     */
    @javax.annotation.Nonnull
    public static WorkbookRangeFill createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeFill();
    }
    /**
     * Gets the color property value. HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange')
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
        final WorkbookRangeFill currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("color", (n) -> { currentObject.setColor(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeStringValue("color", this.getColor());
    }
    /**
     * Sets the color property value. HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange')
     * @param value Value to set for the color property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColor(@javax.annotation.Nullable final String value) {
        this._color = value;
    }
}
