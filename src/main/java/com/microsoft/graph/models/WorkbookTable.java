package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookTable extends Entity implements Parsable {
    /**
     * Instantiates a new WorkbookTable and sets the default values.
     */
    public WorkbookTable() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookTable
     */
    @jakarta.annotation.Nonnull
    public static WorkbookTable createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookTable();
    }
    /**
     * Gets the columns property value. Represents a collection of all the columns in the table. Read-only.
     * @return a java.util.List<WorkbookTableColumn>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookTableColumn> getColumns() {
        return this.getBackingStore().get("columns");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("columns", (n) -> { this.setColumns(n.getCollectionOfObjectValues(WorkbookTableColumn::createFromDiscriminatorValue)); });
        deserializerMap.put("highlightFirstColumn", (n) -> { this.setHighlightFirstColumn(n.getBooleanValue()); });
        deserializerMap.put("highlightLastColumn", (n) -> { this.setHighlightLastColumn(n.getBooleanValue()); });
        deserializerMap.put("legacyId", (n) -> { this.setLegacyId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("rows", (n) -> { this.setRows(n.getCollectionOfObjectValues(WorkbookTableRow::createFromDiscriminatorValue)); });
        deserializerMap.put("showBandedColumns", (n) -> { this.setShowBandedColumns(n.getBooleanValue()); });
        deserializerMap.put("showBandedRows", (n) -> { this.setShowBandedRows(n.getBooleanValue()); });
        deserializerMap.put("showFilterButton", (n) -> { this.setShowFilterButton(n.getBooleanValue()); });
        deserializerMap.put("showHeaders", (n) -> { this.setShowHeaders(n.getBooleanValue()); });
        deserializerMap.put("showTotals", (n) -> { this.setShowTotals(n.getBooleanValue()); });
        deserializerMap.put("sort", (n) -> { this.setSort(n.getObjectValue(WorkbookTableSort::createFromDiscriminatorValue)); });
        deserializerMap.put("style", (n) -> { this.setStyle(n.getStringValue()); });
        deserializerMap.put("worksheet", (n) -> { this.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the highlightFirstColumn property value. Indicates whether the first column contains special formatting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHighlightFirstColumn() {
        return this.getBackingStore().get("highlightFirstColumn");
    }
    /**
     * Gets the highlightLastColumn property value. Indicates whether the last column contains special formatting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHighlightLastColumn() {
        return this.getBackingStore().get("highlightLastColumn");
    }
    /**
     * Gets the legacyId property value. Legacy ID used in older Excel clients. The value of the identifier remains the same even when the table is renamed. This property should be interpreted as an opaque string value and shouldn't be parsed to any other type. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLegacyId() {
        return this.getBackingStore().get("legacyId");
    }
    /**
     * Gets the name property value. Name of the table.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.getBackingStore().get("name");
    }
    /**
     * Gets the rows property value. Represents a collection of all the rows in the table. Read-only.
     * @return a java.util.List<WorkbookTableRow>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookTableRow> getRows() {
        return this.getBackingStore().get("rows");
    }
    /**
     * Gets the showBandedColumns property value. Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowBandedColumns() {
        return this.getBackingStore().get("showBandedColumns");
    }
    /**
     * Gets the showBandedRows property value. Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowBandedRows() {
        return this.getBackingStore().get("showBandedRows");
    }
    /**
     * Gets the showFilterButton property value. Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowFilterButton() {
        return this.getBackingStore().get("showFilterButton");
    }
    /**
     * Gets the showHeaders property value. Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowHeaders() {
        return this.getBackingStore().get("showHeaders");
    }
    /**
     * Gets the showTotals property value. Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getShowTotals() {
        return this.getBackingStore().get("showTotals");
    }
    /**
     * Gets the sort property value. Represents the sorting for the table. Read-only.
     * @return a WorkbookTableSort
     */
    @jakarta.annotation.Nullable
    public WorkbookTableSort getSort() {
        return this.getBackingStore().get("sort");
    }
    /**
     * Gets the style property value. Constant value that represents the Table style. The possible values are: TableStyleLight1 through TableStyleLight21, TableStyleMedium1 through TableStyleMedium28, TableStyleStyleDark1 through TableStyleStyleDark11. A custom user-defined style present in the workbook can also be specified.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStyle() {
        return this.getBackingStore().get("style");
    }
    /**
     * Gets the worksheet property value. The worksheet containing the current table. Read-only.
     * @return a WorkbookWorksheet
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this.getBackingStore().get("worksheet");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("columns", this.getColumns());
        writer.writeBooleanValue("highlightFirstColumn", this.getHighlightFirstColumn());
        writer.writeBooleanValue("highlightLastColumn", this.getHighlightLastColumn());
        writer.writeStringValue("legacyId", this.getLegacyId());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("rows", this.getRows());
        writer.writeBooleanValue("showBandedColumns", this.getShowBandedColumns());
        writer.writeBooleanValue("showBandedRows", this.getShowBandedRows());
        writer.writeBooleanValue("showFilterButton", this.getShowFilterButton());
        writer.writeBooleanValue("showHeaders", this.getShowHeaders());
        writer.writeBooleanValue("showTotals", this.getShowTotals());
        writer.writeObjectValue("sort", this.getSort());
        writer.writeStringValue("style", this.getStyle());
        writer.writeObjectValue("worksheet", this.getWorksheet());
    }
    /**
     * Sets the columns property value. Represents a collection of all the columns in the table. Read-only.
     * @param value Value to set for the columns property.
     */
    public void setColumns(@jakarta.annotation.Nullable final java.util.List<WorkbookTableColumn> value) {
        this.getBackingStore().set("columns", value);
    }
    /**
     * Sets the highlightFirstColumn property value. Indicates whether the first column contains special formatting.
     * @param value Value to set for the highlightFirstColumn property.
     */
    public void setHighlightFirstColumn(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("highlightFirstColumn", value);
    }
    /**
     * Sets the highlightLastColumn property value. Indicates whether the last column contains special formatting.
     * @param value Value to set for the highlightLastColumn property.
     */
    public void setHighlightLastColumn(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("highlightLastColumn", value);
    }
    /**
     * Sets the legacyId property value. Legacy ID used in older Excel clients. The value of the identifier remains the same even when the table is renamed. This property should be interpreted as an opaque string value and shouldn't be parsed to any other type. Read-only.
     * @param value Value to set for the legacyId property.
     */
    public void setLegacyId(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("legacyId", value);
    }
    /**
     * Sets the name property value. Name of the table.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("name", value);
    }
    /**
     * Sets the rows property value. Represents a collection of all the rows in the table. Read-only.
     * @param value Value to set for the rows property.
     */
    public void setRows(@jakarta.annotation.Nullable final java.util.List<WorkbookTableRow> value) {
        this.getBackingStore().set("rows", value);
    }
    /**
     * Sets the showBandedColumns property value. Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
     * @param value Value to set for the showBandedColumns property.
     */
    public void setShowBandedColumns(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("showBandedColumns", value);
    }
    /**
     * Sets the showBandedRows property value. Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
     * @param value Value to set for the showBandedRows property.
     */
    public void setShowBandedRows(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("showBandedRows", value);
    }
    /**
     * Sets the showFilterButton property value. Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
     * @param value Value to set for the showFilterButton property.
     */
    public void setShowFilterButton(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("showFilterButton", value);
    }
    /**
     * Sets the showHeaders property value. Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
     * @param value Value to set for the showHeaders property.
     */
    public void setShowHeaders(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("showHeaders", value);
    }
    /**
     * Sets the showTotals property value. Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
     * @param value Value to set for the showTotals property.
     */
    public void setShowTotals(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("showTotals", value);
    }
    /**
     * Sets the sort property value. Represents the sorting for the table. Read-only.
     * @param value Value to set for the sort property.
     */
    public void setSort(@jakarta.annotation.Nullable final WorkbookTableSort value) {
        this.getBackingStore().set("sort", value);
    }
    /**
     * Sets the style property value. Constant value that represents the Table style. The possible values are: TableStyleLight1 through TableStyleLight21, TableStyleMedium1 through TableStyleMedium28, TableStyleStyleDark1 through TableStyleStyleDark11. A custom user-defined style present in the workbook can also be specified.
     * @param value Value to set for the style property.
     */
    public void setStyle(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("style", value);
    }
    /**
     * Sets the worksheet property value. The worksheet containing the current table. Read-only.
     * @param value Value to set for the worksheet property.
     */
    public void setWorksheet(@jakarta.annotation.Nullable final WorkbookWorksheet value) {
        this.getBackingStore().set("worksheet", value);
    }
}
