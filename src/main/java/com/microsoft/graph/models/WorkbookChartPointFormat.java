package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartPointFormat extends Entity implements Parsable {
    /**
     * Represents the fill format of a chart, which includes background formating information. Read-only.
     */
    private WorkbookChartFill fill;
    /**
     * Instantiates a new workbookChartPointFormat and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartPointFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartPointFormat
     */
    @javax.annotation.Nonnull
    public static WorkbookChartPointFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartPointFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fill", (n) -> { this.setFill(n.getObjectValue(WorkbookChartFill::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fill property value. Represents the fill format of a chart, which includes background formating information. Read-only.
     * @return a workbookChartFill
     */
    @javax.annotation.Nullable
    public WorkbookChartFill getFill() {
        return this.fill;
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
        writer.writeObjectValue("fill", this.getFill());
    }
    /**
     * Sets the fill property value. Represents the fill format of a chart, which includes background formating information. Read-only.
     * @param value Value to set for the fill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFill(@javax.annotation.Nullable final WorkbookChartFill value) {
        this.fill = value;
    }
}
