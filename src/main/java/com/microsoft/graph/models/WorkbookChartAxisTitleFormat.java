package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartAxisTitleFormat extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookChartAxisTitleFormat and sets the default values.
     */
    public WorkbookChartAxisTitleFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookChartAxisTitleFormat
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartAxisTitleFormat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxisTitleFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("font", (n) -> { this.setFont(n.getObjectValue(WorkbookChartFont::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the font property value. Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
     * @return a WorkbookChartFont
     */
    @jakarta.annotation.Nullable
    public WorkbookChartFont getFont() {
        return this.backingStore.get("font");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("font", this.getFont());
    }
    /**
     * Sets the font property value. Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
     * @param value Value to set for the font property.
     */
    public void setFont(@jakarta.annotation.Nullable final WorkbookChartFont value) {
        this.backingStore.set("font", value);
    }
}
