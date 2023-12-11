package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartSeriesFormat extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookChartSeriesFormat and sets the default values.
     */
    public WorkbookChartSeriesFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookChartSeriesFormat
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartSeriesFormat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartSeriesFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fill", (n) -> { this.setFill(n.getObjectValue(WorkbookChartFill::createFromDiscriminatorValue)); });
        deserializerMap.put("line", (n) -> { this.setLine(n.getObjectValue(WorkbookChartLineFormat::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fill property value. Represents the fill format of a chart series, which includes background formatting information. Read-only.
     * @return a WorkbookChartFill
     */
    @jakarta.annotation.Nullable
    public WorkbookChartFill getFill() {
        return this.backingStore.get("fill");
    }
    /**
     * Gets the line property value. Represents line formatting. Read-only.
     * @return a WorkbookChartLineFormat
     */
    @jakarta.annotation.Nullable
    public WorkbookChartLineFormat getLine() {
        return this.backingStore.get("line");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("fill", this.getFill());
        writer.writeObjectValue("line", this.getLine());
    }
    /**
     * Sets the fill property value. Represents the fill format of a chart series, which includes background formatting information. Read-only.
     * @param value Value to set for the fill property.
     */
    public void setFill(@jakarta.annotation.Nullable final WorkbookChartFill value) {
        this.backingStore.set("fill", value);
    }
    /**
     * Sets the line property value. Represents line formatting. Read-only.
     * @param value Value to set for the line property.
     */
    public void setLine(@jakarta.annotation.Nullable final WorkbookChartLineFormat value) {
        this.backingStore.set("line", value);
    }
}
