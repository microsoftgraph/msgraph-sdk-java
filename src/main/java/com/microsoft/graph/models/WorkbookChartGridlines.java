package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookChartGridlines extends Entity implements Parsable {
    /** Represents the formatting of chart gridlines. Read-only. */
    private WorkbookChartGridlinesFormat _format;
    /** Boolean value representing if the axis gridlines are visible or not. */
    private Boolean _visible;
    /**
     * Instantiates a new workbookChartGridlines and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookChartGridlines() {
        super();
        this.setOdataType("#microsoft.graph.workbookChartGridlines");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookChartGridlines
     */
    @javax.annotation.Nonnull
    public static WorkbookChartGridlines createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartGridlines();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookChartGridlines currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookChartGridlinesFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("visible", (n) -> { currentObject.setVisible(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of chart gridlines. Read-only.
     * @return a workbookChartGridlinesFormat
     */
    @javax.annotation.Nullable
    public WorkbookChartGridlinesFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the visible property value. Boolean value representing if the axis gridlines are visible or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVisible() {
        return this._visible;
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
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of chart gridlines. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final WorkbookChartGridlinesFormat value) {
        this._format = value;
    }
    /**
     * Sets the visible property value. Boolean value representing if the axis gridlines are visible or not.
     * @param value Value to set for the visible property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisible(@javax.annotation.Nullable final Boolean value) {
        this._visible = value;
    }
}
