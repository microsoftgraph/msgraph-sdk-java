package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookRangeFill extends Entity implements Parsable {
    /**
     * HTML color code representing the color of the border line, of the form #RRGGBB (for example 'FFA500') or as a named HTML color (for example 'orange')
     */
    private String color;
    /**
     * Instantiates a new WorkbookRangeFill and sets the default values.
     */
    public WorkbookRangeFill() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookRangeFill
     */
    @jakarta.annotation.Nonnull
    public static WorkbookRangeFill createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeFill();
    }
    /**
     * Gets the color property value. HTML color code representing the color of the border line, of the form #RRGGBB (for example 'FFA500') or as a named HTML color (for example 'orange')
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getColor() {
        return this.color;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("color", (n) -> { this.setColor(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("color", this.getColor());
    }
    /**
     * Sets the color property value. HTML color code representing the color of the border line, of the form #RRGGBB (for example 'FFA500') or as a named HTML color (for example 'orange')
     * @param value Value to set for the color property.
     */
    public void setColor(@jakarta.annotation.Nullable final String value) {
        this.color = value;
    }
}
