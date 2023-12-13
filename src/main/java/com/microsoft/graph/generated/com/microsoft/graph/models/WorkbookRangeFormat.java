package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookRangeFormat extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookRangeFormat and sets the default values.
     */
    public WorkbookRangeFormat() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookRangeFormat
     */
    @jakarta.annotation.Nonnull
    public static WorkbookRangeFormat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeFormat();
    }
    /**
     * Gets the borders property value. Collection of border objects that apply to the overall range selected Read-only.
     * @return a java.util.List<WorkbookRangeBorder>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookRangeBorder> getBorders() {
        return this.backingStore.get("borders");
    }
    /**
     * Gets the columnWidth property value. Gets or sets the width of all columns within the range. If the column widths aren't uniform, null will be returned.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getColumnWidth() {
        return this.backingStore.get("columnWidth");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("borders", (n) -> { this.setBorders(n.getCollectionOfObjectValues(WorkbookRangeBorder::createFromDiscriminatorValue)); });
        deserializerMap.put("columnWidth", (n) -> { this.setColumnWidth(n.getDoubleValue()); });
        deserializerMap.put("fill", (n) -> { this.setFill(n.getObjectValue(WorkbookRangeFill::createFromDiscriminatorValue)); });
        deserializerMap.put("font", (n) -> { this.setFont(n.getObjectValue(WorkbookRangeFont::createFromDiscriminatorValue)); });
        deserializerMap.put("horizontalAlignment", (n) -> { this.setHorizontalAlignment(n.getStringValue()); });
        deserializerMap.put("protection", (n) -> { this.setProtection(n.getObjectValue(WorkbookFormatProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("rowHeight", (n) -> { this.setRowHeight(n.getDoubleValue()); });
        deserializerMap.put("verticalAlignment", (n) -> { this.setVerticalAlignment(n.getStringValue()); });
        deserializerMap.put("wrapText", (n) -> { this.setWrapText(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fill property value. Returns the fill object defined on the overall range. Read-only.
     * @return a WorkbookRangeFill
     */
    @jakarta.annotation.Nullable
    public WorkbookRangeFill getFill() {
        return this.backingStore.get("fill");
    }
    /**
     * Gets the font property value. Returns the font object defined on the overall range selected Read-only.
     * @return a WorkbookRangeFont
     */
    @jakarta.annotation.Nullable
    public WorkbookRangeFont getFont() {
        return this.backingStore.get("font");
    }
    /**
     * Gets the horizontalAlignment property value. Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right, Fill, Justify, CenterAcrossSelection, Distributed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHorizontalAlignment() {
        return this.backingStore.get("horizontalAlignment");
    }
    /**
     * Gets the protection property value. Returns the format protection object for a range. Read-only.
     * @return a WorkbookFormatProtection
     */
    @jakarta.annotation.Nullable
    public WorkbookFormatProtection getProtection() {
        return this.backingStore.get("protection");
    }
    /**
     * Gets the rowHeight property value. Gets or sets the height of all rows in the range. If the row heights aren't uniform null will be returned.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getRowHeight() {
        return this.backingStore.get("rowHeight");
    }
    /**
     * Gets the verticalAlignment property value. Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify, Distributed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVerticalAlignment() {
        return this.backingStore.get("verticalAlignment");
    }
    /**
     * Gets the wrapText property value. Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWrapText() {
        return this.backingStore.get("wrapText");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("borders", this.getBorders());
        writer.writeDoubleValue("columnWidth", this.getColumnWidth());
        writer.writeObjectValue("fill", this.getFill());
        writer.writeObjectValue("font", this.getFont());
        writer.writeStringValue("horizontalAlignment", this.getHorizontalAlignment());
        writer.writeObjectValue("protection", this.getProtection());
        writer.writeDoubleValue("rowHeight", this.getRowHeight());
        writer.writeStringValue("verticalAlignment", this.getVerticalAlignment());
        writer.writeBooleanValue("wrapText", this.getWrapText());
    }
    /**
     * Sets the borders property value. Collection of border objects that apply to the overall range selected Read-only.
     * @param value Value to set for the borders property.
     */
    public void setBorders(@jakarta.annotation.Nullable final java.util.List<WorkbookRangeBorder> value) {
        this.backingStore.set("borders", value);
    }
    /**
     * Sets the columnWidth property value. Gets or sets the width of all columns within the range. If the column widths aren't uniform, null will be returned.
     * @param value Value to set for the columnWidth property.
     */
    public void setColumnWidth(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("columnWidth", value);
    }
    /**
     * Sets the fill property value. Returns the fill object defined on the overall range. Read-only.
     * @param value Value to set for the fill property.
     */
    public void setFill(@jakarta.annotation.Nullable final WorkbookRangeFill value) {
        this.backingStore.set("fill", value);
    }
    /**
     * Sets the font property value. Returns the font object defined on the overall range selected Read-only.
     * @param value Value to set for the font property.
     */
    public void setFont(@jakarta.annotation.Nullable final WorkbookRangeFont value) {
        this.backingStore.set("font", value);
    }
    /**
     * Sets the horizontalAlignment property value. Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right, Fill, Justify, CenterAcrossSelection, Distributed.
     * @param value Value to set for the horizontalAlignment property.
     */
    public void setHorizontalAlignment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("horizontalAlignment", value);
    }
    /**
     * Sets the protection property value. Returns the format protection object for a range. Read-only.
     * @param value Value to set for the protection property.
     */
    public void setProtection(@jakarta.annotation.Nullable final WorkbookFormatProtection value) {
        this.backingStore.set("protection", value);
    }
    /**
     * Sets the rowHeight property value. Gets or sets the height of all rows in the range. If the row heights aren't uniform null will be returned.
     * @param value Value to set for the rowHeight property.
     */
    public void setRowHeight(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("rowHeight", value);
    }
    /**
     * Sets the verticalAlignment property value. Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify, Distributed.
     * @param value Value to set for the verticalAlignment property.
     */
    public void setVerticalAlignment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("verticalAlignment", value);
    }
    /**
     * Sets the wrapText property value. Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
     * @param value Value to set for the wrapText property.
     */
    public void setWrapText(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wrapText", value);
    }
}
