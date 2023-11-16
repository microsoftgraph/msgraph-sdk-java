package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartPoint extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookChartPoint and sets the default values.
     */
    public WorkbookChartPoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookChartPoint
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartPoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartPoint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartPointFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Encapsulates the format properties chart point. Read-only.
     * @return a WorkbookChartPointFormat
     */
    @jakarta.annotation.Nullable
    public WorkbookChartPointFormat getFormat() {
        return this.BackingStore.get("format");
    }
    /**
     * Gets the value property value. Returns the value of a chart point. Read-only.
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getValue() {
        return this.BackingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeObjectValue("value", this.getValue());
    }
    /**
     * Sets the format property value. Encapsulates the format properties chart point. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartPointFormat value) {
        this.BackingStore.set("format", value);
    }
    /**
     * Sets the value property value. Returns the value of a chart point. Read-only.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Json value) {
        this.BackingStore.set("value", value);
    }
}
