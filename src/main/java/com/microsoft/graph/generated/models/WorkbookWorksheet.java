package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookWorksheet extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookWorksheet} and sets the default values.
     */
    public WorkbookWorksheet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookWorksheet}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookWorksheet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookWorksheet();
    }
    /**
     * Gets the charts property value. Returns collection of charts that are part of the worksheet. Read-only.
     * @return a {@link java.util.List<WorkbookChart>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookChart> getCharts() {
        return this.backingStore.get("charts");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("charts", (n) -> { this.setCharts(n.getCollectionOfObjectValues(WorkbookChart::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("names", (n) -> { this.setNames(n.getCollectionOfObjectValues(WorkbookNamedItem::createFromDiscriminatorValue)); });
        deserializerMap.put("pivotTables", (n) -> { this.setPivotTables(n.getCollectionOfObjectValues(WorkbookPivotTable::createFromDiscriminatorValue)); });
        deserializerMap.put("position", (n) -> { this.setPosition(n.getIntegerValue()); });
        deserializerMap.put("protection", (n) -> { this.setProtection(n.getObjectValue(WorkbookWorksheetProtection::createFromDiscriminatorValue)); });
        deserializerMap.put("tables", (n) -> { this.setTables(n.getCollectionOfObjectValues(WorkbookTable::createFromDiscriminatorValue)); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The display name of the worksheet.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the names property value. Returns collection of names that are associated with the worksheet. Read-only.
     * @return a {@link java.util.List<WorkbookNamedItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookNamedItem> getNames() {
        return this.backingStore.get("names");
    }
    /**
     * Gets the pivotTables property value. Collection of PivotTables that are part of the worksheet.
     * @return a {@link java.util.List<WorkbookPivotTable>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookPivotTable> getPivotTables() {
        return this.backingStore.get("pivotTables");
    }
    /**
     * Gets the position property value. The zero-based position of the worksheet within the workbook.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPosition() {
        return this.backingStore.get("position");
    }
    /**
     * Gets the protection property value. Returns sheet protection object for a worksheet. Read-only.
     * @return a {@link WorkbookWorksheetProtection}
     */
    @jakarta.annotation.Nullable
    public WorkbookWorksheetProtection getProtection() {
        return this.backingStore.get("protection");
    }
    /**
     * Gets the tables property value. Collection of tables that are part of the worksheet. Read-only.
     * @return a {@link java.util.List<WorkbookTable>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookTable> getTables() {
        return this.backingStore.get("tables");
    }
    /**
     * Gets the visibility property value. The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVisibility() {
        return this.backingStore.get("visibility");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("charts", this.getCharts());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("names", this.getNames());
        writer.writeCollectionOfObjectValues("pivotTables", this.getPivotTables());
        writer.writeIntegerValue("position", this.getPosition());
        writer.writeObjectValue("protection", this.getProtection());
        writer.writeCollectionOfObjectValues("tables", this.getTables());
        writer.writeStringValue("visibility", this.getVisibility());
    }
    /**
     * Sets the charts property value. Returns collection of charts that are part of the worksheet. Read-only.
     * @param value Value to set for the charts property.
     */
    public void setCharts(@jakarta.annotation.Nullable final java.util.List<WorkbookChart> value) {
        this.backingStore.set("charts", value);
    }
    /**
     * Sets the name property value. The display name of the worksheet.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the names property value. Returns collection of names that are associated with the worksheet. Read-only.
     * @param value Value to set for the names property.
     */
    public void setNames(@jakarta.annotation.Nullable final java.util.List<WorkbookNamedItem> value) {
        this.backingStore.set("names", value);
    }
    /**
     * Sets the pivotTables property value. Collection of PivotTables that are part of the worksheet.
     * @param value Value to set for the pivotTables property.
     */
    public void setPivotTables(@jakarta.annotation.Nullable final java.util.List<WorkbookPivotTable> value) {
        this.backingStore.set("pivotTables", value);
    }
    /**
     * Sets the position property value. The zero-based position of the worksheet within the workbook.
     * @param value Value to set for the position property.
     */
    public void setPosition(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("position", value);
    }
    /**
     * Sets the protection property value. Returns sheet protection object for a worksheet. Read-only.
     * @param value Value to set for the protection property.
     */
    public void setProtection(@jakarta.annotation.Nullable final WorkbookWorksheetProtection value) {
        this.backingStore.set("protection", value);
    }
    /**
     * Sets the tables property value. Collection of tables that are part of the worksheet. Read-only.
     * @param value Value to set for the tables property.
     */
    public void setTables(@jakarta.annotation.Nullable final java.util.List<WorkbookTable> value) {
        this.backingStore.set("tables", value);
    }
    /**
     * Sets the visibility property value. The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("visibility", value);
    }
}
