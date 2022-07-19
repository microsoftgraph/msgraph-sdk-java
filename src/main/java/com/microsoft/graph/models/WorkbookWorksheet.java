package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookWorksheet extends Entity implements Parsable {
    /** Returns collection of charts that are part of the worksheet. Read-only. */
    private java.util.List<WorkbookChart> _charts;
    /** The display name of the worksheet. */
    private String _name;
    /** Returns collection of names that are associated with the worksheet. Read-only. */
    private java.util.List<WorkbookNamedItem> _names;
    /** Collection of PivotTables that are part of the worksheet. */
    private java.util.List<WorkbookPivotTable> _pivotTables;
    /** The zero-based position of the worksheet within the workbook. */
    private Integer _position;
    /** Returns sheet protection object for a worksheet. Read-only. */
    private WorkbookWorksheetProtection _protection;
    /** Collection of tables that are part of the worksheet. Read-only. */
    private java.util.List<WorkbookTable> _tables;
    /** The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden. */
    private String _visibility;
    /**
     * Instantiates a new workbookWorksheet and sets the default values.
     * @return a void
     */
    public WorkbookWorksheet() {
        super();
        this.setOdataType("#microsoft.graph.workbookWorksheet");
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
        return this._charts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookWorksheet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("charts", (n) -> { currentObject.setCharts(n.getCollectionOfObjectValues(WorkbookChart::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("names", (n) -> { currentObject.setNames(n.getCollectionOfObjectValues(WorkbookNamedItem::createFromDiscriminatorValue)); });
            this.put("pivotTables", (n) -> { currentObject.setPivotTables(n.getCollectionOfObjectValues(WorkbookPivotTable::createFromDiscriminatorValue)); });
            this.put("position", (n) -> { currentObject.setPosition(n.getIntegerValue()); });
            this.put("protection", (n) -> { currentObject.setProtection(n.getObjectValue(WorkbookWorksheetProtection::createFromDiscriminatorValue)); });
            this.put("tables", (n) -> { currentObject.setTables(n.getCollectionOfObjectValues(WorkbookTable::createFromDiscriminatorValue)); });
            this.put("visibility", (n) -> { currentObject.setVisibility(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. The display name of the worksheet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the names property value. Returns collection of names that are associated with the worksheet. Read-only.
     * @return a workbookNamedItem
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookNamedItem> getNames() {
        return this._names;
    }
    /**
     * Gets the pivotTables property value. Collection of PivotTables that are part of the worksheet.
     * @return a workbookPivotTable
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookPivotTable> getPivotTables() {
        return this._pivotTables;
    }
    /**
     * Gets the position property value. The zero-based position of the worksheet within the workbook.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPosition() {
        return this._position;
    }
    /**
     * Gets the protection property value. Returns sheet protection object for a worksheet. Read-only.
     * @return a workbookWorksheetProtection
     */
    @javax.annotation.Nullable
    public WorkbookWorksheetProtection getProtection() {
        return this._protection;
    }
    /**
     * Gets the tables property value. Collection of tables that are part of the worksheet. Read-only.
     * @return a workbookTable
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookTable> getTables() {
        return this._tables;
    }
    /**
     * Gets the visibility property value. The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVisibility() {
        return this._visibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setCharts(@javax.annotation.Nullable final java.util.List<WorkbookChart> value) {
        this._charts = value;
    }
    /**
     * Sets the name property value. The display name of the worksheet.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the names property value. Returns collection of names that are associated with the worksheet. Read-only.
     * @param value Value to set for the names property.
     * @return a void
     */
    public void setNames(@javax.annotation.Nullable final java.util.List<WorkbookNamedItem> value) {
        this._names = value;
    }
    /**
     * Sets the pivotTables property value. Collection of PivotTables that are part of the worksheet.
     * @param value Value to set for the pivotTables property.
     * @return a void
     */
    public void setPivotTables(@javax.annotation.Nullable final java.util.List<WorkbookPivotTable> value) {
        this._pivotTables = value;
    }
    /**
     * Sets the position property value. The zero-based position of the worksheet within the workbook.
     * @param value Value to set for the position property.
     * @return a void
     */
    public void setPosition(@javax.annotation.Nullable final Integer value) {
        this._position = value;
    }
    /**
     * Sets the protection property value. Returns sheet protection object for a worksheet. Read-only.
     * @param value Value to set for the protection property.
     * @return a void
     */
    public void setProtection(@javax.annotation.Nullable final WorkbookWorksheetProtection value) {
        this._protection = value;
    }
    /**
     * Sets the tables property value. Collection of tables that are part of the worksheet. Read-only.
     * @param value Value to set for the tables property.
     * @return a void
     */
    public void setTables(@javax.annotation.Nullable final java.util.List<WorkbookTable> value) {
        this._tables = value;
    }
    /**
     * Sets the visibility property value. The Visibility of the worksheet. The possible values are: Visible, Hidden, VeryHidden.
     * @param value Value to set for the visibility property.
     * @return a void
     */
    public void setVisibility(@javax.annotation.Nullable final String value) {
        this._visibility = value;
    }
}
