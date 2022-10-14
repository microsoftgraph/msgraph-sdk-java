package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class WorkbookChartPoint extends Entity implements Parsable {
    /** Encapsulates the format properties chart point. Read-only. */
    private WorkbookChartPointFormat _format;
    /** Returns the value of a chart point. Read-only. */
    private Json _value;
    /**
     * Instantiates a new workbookChartPoint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartPoint() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartPoint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartPoint
     */
    @javax.annotation.Nonnull
    public static WorkbookChartPoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartPoint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartPoint currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartPointFormat::createFromDiscriminatorValue)); });
            this.put("value", (n) -> { currentObject.setValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the format property value. Encapsulates the format properties chart point. Read-only.
     * @return a workbookChartPointFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartPointFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the value property value. Returns the value of a chart point. Read-only.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValue() {
        return this._value;
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
        writer.writeObjectValue("format", this.getFormat());
        writer.writeObjectValue("value", this.getValue());
    }
    /**
     * Sets the format property value. Encapsulates the format properties chart point. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final WorkbookChartPointFormat value) {
        this._format = value;
    }
    /**
     * Sets the value property value. Returns the value of a chart point. Read-only.
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final Json value) {
        this._value = value;
    }
}
