package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookChartAxisTitle extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookChartAxisTitle} and sets the default values.
     */
    public WorkbookChartAxisTitle() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookChartAxisTitle}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookChartAxisTitle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookChartAxisTitle();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookChartAxisTitleFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("visible", (n) -> { this.setVisible(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Represents the formatting of chart axis title. Read-only.
     * @return a {@link WorkbookChartAxisTitleFormat}
     */
    @jakarta.annotation.Nullable
    public WorkbookChartAxisTitleFormat getFormat() {
        return this.backingStore.get("format");
    }
    /**
     * Gets the text property value. Represents the axis title.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.backingStore.get("text");
    }
    /**
     * Gets the visible property value. A boolean that specifies the visibility of an axis title.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVisible() {
        return this.backingStore.get("visible");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("format", this.getFormat());
        writer.writeStringValue("text", this.getText());
        writer.writeBooleanValue("visible", this.getVisible());
    }
    /**
     * Sets the format property value. Represents the formatting of chart axis title. Read-only.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final WorkbookChartAxisTitleFormat value) {
        this.backingStore.set("format", value);
    }
    /**
     * Sets the text property value. Represents the axis title.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("text", value);
    }
    /**
     * Sets the visible property value. A boolean that specifies the visibility of an axis title.
     * @param value Value to set for the visible property.
     */
    public void setVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("visible", value);
    }
}
