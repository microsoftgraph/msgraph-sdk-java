package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartSeriesFormat extends Entity implements Parsable {
    /** Represents the fill format of a chart series, which includes background formating information. Read-only. */
    private WorkbookChartFill fill;
    /** Represents line formatting. Read-only. */
    private WorkbookChartLineFormat line;
    /**
     * Instantiates a new workbookChartSeriesFormat and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartSeriesFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartSeriesFormat
     */
    @javax.annotation.Nonnull
    public static WorkbookChartSeriesFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartSeriesFormat();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fill", (n) -> { this.setFill(n.getObjectValue(WorkbookChartFill::createFromDiscriminatorValue)); });
        deserializerMap.put("line", (n) -> { this.setLine(n.getObjectValue(WorkbookChartLineFormat::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fill property value. Represents the fill format of a chart series, which includes background formating information. Read-only.
     * @return a workbookChartFill
     */
    @javax.annotation.Nullable
    public WorkbookChartFill getFill() {
        return this.fill;
    }
    /**
     * Gets the line property value. Represents line formatting. Read-only.
     * @return a workbookChartLineFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartLineFormat getLine() {
        return this.line;
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
        writer.writeObjectValue("line", this.getLine());
    }
    /**
     * Sets the fill property value. Represents the fill format of a chart series, which includes background formating information. Read-only.
     * @param value Value to set for the fill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFill(@javax.annotation.Nullable final WorkbookChartFill value) {
        this.fill = value;
    }
    /**
     * Sets the line property value. Represents line formatting. Read-only.
     * @param value Value to set for the line property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLine(@javax.annotation.Nullable final WorkbookChartLineFormat value) {
        this.line = value;
    }
}
