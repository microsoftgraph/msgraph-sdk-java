package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookRangeFormat extends Entity implements Parsable {
    /** Collection of border objects that apply to the overall range selected Read-only. */
    private java.util.List<WorkbookRangeBorder> _borders;
    /** Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned. */
    private Double _columnWidth;
    /** Returns the fill object defined on the overall range. Read-only. */
    private WorkbookRangeFill _fill;
    /** Returns the font object defined on the overall range selected Read-only. */
    private WorkbookRangeFont _font;
    /** Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right, Fill, Justify, CenterAcrossSelection, Distributed. */
    private String _horizontalAlignment;
    /** Returns the format protection object for a range. Read-only. */
    private WorkbookFormatProtection _protection;
    /** Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned. */
    private Double _rowHeight;
    /** Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify, Distributed. */
    private String _verticalAlignment;
    /** Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting */
    private Boolean _wrapText;
    /**
     * Instantiates a new workbookRangeFormat and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookRangeFormat() {
        super();
        this.setOdataType("#microsoft.graph.workbookRangeFormat");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookRangeFormat
     */
    @javax.annotation.Nonnull
    public static WorkbookRangeFormat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeFormat();
    }
    /**
     * Gets the borders property value. Collection of border objects that apply to the overall range selected Read-only.
     * @return a workbookRangeBorder
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookRangeBorder> getBorders() {
        return this._borders;
    }
    /**
     * Gets the columnWidth property value. Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getColumnWidth() {
        return this._columnWidth;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookRangeFormat currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("borders", (n) -> { currentObject.setBorders(n.getCollectionOfObjectValues(WorkbookRangeBorder::createFromDiscriminatorValue)); });
        deserializerMap.put("columnWidth", (n) -> { currentObject.setColumnWidth(n.getDoubleValue()); });
        deserializerMap.put("fill", (n) -> { currentObject.setFill(n.getObjectValue(WorkbookRangeFill::createFromDiscriminatorValue)); });
        deserializerMap.put("font", (n) -> { currentObject.setFont(n.getObjectValue(WorkbookRangeFont::createFromDiscriminatorValue)); });
        deserializerMap.put("horizontalAlignment", (n) -> { currentObject.setHorizontalAlignment(n.getStringValue()); });
        deserializerMap.put("protection", (n) -> { currentObject.setProtection(n.getObjectValue(WorkbookFormatProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("rowHeight", (n) -> { currentObject.setRowHeight(n.getDoubleValue()); });
        deserializerMap.put("verticalAlignment", (n) -> { currentObject.setVerticalAlignment(n.getStringValue()); });
        deserializerMap.put("wrapText", (n) -> { currentObject.setWrapText(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fill property value. Returns the fill object defined on the overall range. Read-only.
     * @return a workbookRangeFill
     */
    @javax.annotation.Nullable
    public WorkbookRangeFill getFill() {
        return this._fill;
    }
    /**
     * Gets the font property value. Returns the font object defined on the overall range selected Read-only.
     * @return a workbookRangeFont
     */
    @javax.annotation.Nullable
    public WorkbookRangeFont getFont() {
        return this._font;
    }
    /**
     * Gets the horizontalAlignment property value. Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right, Fill, Justify, CenterAcrossSelection, Distributed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHorizontalAlignment() {
        return this._horizontalAlignment;
    }
    /**
     * Gets the protection property value. Returns the format protection object for a range. Read-only.
     * @return a workbookFormatProtection
     */
    @javax.annotation.Nullable
    public WorkbookFormatProtection getProtection() {
        return this._protection;
    }
    /**
     * Gets the rowHeight property value. Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getRowHeight() {
        return this._rowHeight;
    }
    /**
     * Gets the verticalAlignment property value. Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify, Distributed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVerticalAlignment() {
        return this._verticalAlignment;
    }
    /**
     * Gets the wrapText property value. Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWrapText() {
        return this._wrapText;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBorders(@javax.annotation.Nullable final java.util.List<WorkbookRangeBorder> value) {
        this._borders = value;
    }
    /**
     * Sets the columnWidth property value. Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
     * @param value Value to set for the columnWidth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnWidth(@javax.annotation.Nullable final Double value) {
        this._columnWidth = value;
    }
    /**
     * Sets the fill property value. Returns the fill object defined on the overall range. Read-only.
     * @param value Value to set for the fill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFill(@javax.annotation.Nullable final WorkbookRangeFill value) {
        this._fill = value;
    }
    /**
     * Sets the font property value. Returns the font object defined on the overall range selected Read-only.
     * @param value Value to set for the font property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFont(@javax.annotation.Nullable final WorkbookRangeFont value) {
        this._font = value;
    }
    /**
     * Sets the horizontalAlignment property value. Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right, Fill, Justify, CenterAcrossSelection, Distributed.
     * @param value Value to set for the horizontalAlignment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHorizontalAlignment(@javax.annotation.Nullable final String value) {
        this._horizontalAlignment = value;
    }
    /**
     * Sets the protection property value. Returns the format protection object for a range. Read-only.
     * @param value Value to set for the protection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProtection(@javax.annotation.Nullable final WorkbookFormatProtection value) {
        this._protection = value;
    }
    /**
     * Sets the rowHeight property value. Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned.
     * @param value Value to set for the rowHeight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRowHeight(@javax.annotation.Nullable final Double value) {
        this._rowHeight = value;
    }
    /**
     * Sets the verticalAlignment property value. Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify, Distributed.
     * @param value Value to set for the verticalAlignment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerticalAlignment(@javax.annotation.Nullable final String value) {
        this._verticalAlignment = value;
    }
    /**
     * Sets the wrapText property value. Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
     * @param value Value to set for the wrapText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWrapText(@javax.annotation.Nullable final Boolean value) {
        this._wrapText = value;
    }
}
