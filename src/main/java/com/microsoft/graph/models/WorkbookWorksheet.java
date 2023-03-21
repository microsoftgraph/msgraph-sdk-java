package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookWorksheet extends Entity implements Parsable {
    /** Returns collection of charts that are part of the worksheet. Read-only. */
    private java.util.List<WorkbookChart> charts;
    /** The display name of the worksheet. */
    private String name;
    /** Returns collection of names that are associated with the worksheet. Read-only. */
    private java.util.List<WorkbookNamedItem> names;
    /** Collection of PivotTables that are part of the worksheet. */
    private java.util.List<WorkbookPivotTable> pivotTables;
    /** The zero-based position of the worksheet within the workbook. */
    private Integer position;
    /** Returns sheet protection object for a worksheet. Read-only. */
    private WorkbookWorksheetProtection protection;
    /** Collection of tables that are part of the worksheet. Read-only. */
    private java.util.List<WorkbookTable> tables;
    /** The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden. */
    private String visibility;
    /**
     * Instantiates a new workbookWorksheet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookWorksheet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookWorksheet
     */
    @javax.annotation.Nonnull
    public static WorkbookWorksheet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookWorksheet();
    }
    /**
     * Gets the charts property value. Returns collection of charts that are part of the worksheet. Read-only.
     * @return a workbookChart
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookChart> getCharts() {
        return this.charts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the names property value. Returns collection of names that are associated with the worksheet. Read-only.
     * @return a workbookNamedItem
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookNamedItem> getNames() {
        return this.names;
    }
    /**
     * Gets the pivotTables property value. Collection of PivotTables that are part of the worksheet.
     * @return a workbookPivotTable
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookPivotTable> getPivotTables() {
        return this.pivotTables;
    }
    /**
     * Gets the position property value. The zero-based position of the worksheet within the workbook.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPosition() {
        return this.position;
    }
    /**
     * Gets the protection property value. Returns sheet protection object for a worksheet. Read-only.
     * @return a workbookWorksheetProtection
     */
    @javax.annotation.Nullable
    public WorkbookWorksheetProtection getProtection() {
        return this.protection;
    }
    /**
     * Gets the tables property value. Collection of tables that are part of the worksheet. Read-only.
     * @return a workbookTable
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookTable> getTables() {
        return this.tables;
    }
    /**
     * Gets the visibility property value. The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVisibility() {
        return this.visibility;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCharts(@javax.annotation.Nullable final java.util.List<WorkbookChart> value) {
        this.charts = value;
    }
    /**
     * Sets the name property value. The display name of the worksheet.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the names property value. Returns collection of names that are associated with the worksheet. Read-only.
     * @param value Value to set for the names property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNames(@javax.annotation.Nullable final java.util.List<WorkbookNamedItem> value) {
        this.names = value;
    }
    /**
     * Sets the pivotTables property value. Collection of PivotTables that are part of the worksheet.
     * @param value Value to set for the pivotTables property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPivotTables(@javax.annotation.Nullable final java.util.List<WorkbookPivotTable> value) {
        this.pivotTables = value;
    }
    /**
     * Sets the position property value. The zero-based position of the worksheet within the workbook.
     * @param value Value to set for the position property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPosition(@javax.annotation.Nullable final Integer value) {
        this.position = value;
    }
    /**
     * Sets the protection property value. Returns sheet protection object for a worksheet. Read-only.
     * @param value Value to set for the protection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProtection(@javax.annotation.Nullable final WorkbookWorksheetProtection value) {
        this.protection = value;
    }
    /**
     * Sets the tables property value. Collection of tables that are part of the worksheet. Read-only.
     * @param value Value to set for the tables property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTables(@javax.annotation.Nullable final java.util.List<WorkbookTable> value) {
        this.tables = value;
    }
    /**
     * Sets the visibility property value. The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     * @param value Value to set for the visibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisibility(@javax.annotation.Nullable final String value) {
        this.visibility = value;
    }
}
