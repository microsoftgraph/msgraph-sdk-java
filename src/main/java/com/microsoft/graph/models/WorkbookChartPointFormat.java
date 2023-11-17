package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartPointFormat extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookChartPointFormat and sets the default values.
     */
    public WorkbookChartPointFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookChartPointFormat
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartPointFormat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartPointFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fill", (n) -> { this.setFill(n.getObjectValue(WorkbookChartFill::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fill property value. Represents the fill format of a chart, which includes background formatting information. Read-only.
     * @return a WorkbookChartFill
     */
    @jakarta.annotation.Nullable
    public WorkbookChartFill getFill() {
        return this.backingStore.get("fill");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fill", this.getFill());
    }
    /**
     * Sets the fill property value. Represents the fill format of a chart, which includes background formatting information. Read-only.
     * @param value Value to set for the fill property.
     */
    public void setFill(@jakarta.annotation.Nullable final WorkbookChartFill value) {
        this.backingStore.set("fill", value);
    }
}
