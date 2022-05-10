package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookTable extends Entity implements Parsable {
    /** Represents a collection of all the columns in the table. Read-only. */
    private java.util.List<WorkbookTableColumn> _columns;
    /** Indicates whether the first column contains special formatting. */
    private Boolean _highlightFirstColumn;
    /** Indicates whether the last column contains special formatting. */
    private Boolean _highlightLastColumn;
    /** Legacy Id used in older Excle clients. The value of the identifier remains the same even when the table is renamed. This property should be interpreted as an opaque string value and should not be parsed to any other type. Read-only. */
    private String _legacyId;
    /** Name of the table. */
    private String _name;
    /** Represents a collection of all the rows in the table. Read-only. */
    private java.util.List<WorkbookTableRow> _rows;
    /** Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier. */
    private Boolean _showBandedColumns;
    /** Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier. */
    private Boolean _showBandedRows;
    /** Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row. */
    private Boolean _showFilterButton;
    /** Indicates whether the header row is visible or not. This value can be set to show or remove the header row. */
    private Boolean _showHeaders;
    /** Indicates whether the total row is visible or not. This value can be set to show or remove the total row. */
    private Boolean _showTotals;
    /** Represents the sorting for the table. Read-only. */
    private WorkbookTableSort _sort;
    /** Constant value that represents the Table style. Possible values are: TableStyleLight1 thru TableStyleLight21, TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style present in the workbook can also be specified. */
    private String _style;
    /** The worksheet containing the current table. Read-only. */
    private WorkbookWorksheet _worksheet;
    /**
     * Instantiates a new workbookTable and sets the default values.
     * @return a void
     */
    public WorkbookTable() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookTable
     */
    @javax.annotation.Nonnull
    public static WorkbookTable createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookTable();
    }
    /**
     * Gets the columns property value. Represents a collection of all the columns in the table. Read-only.
     * @return a workbookTableColumn
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookTableColumn> getColumns() {
        return this._columns;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookTable currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("columns", (n) -> { currentObject.setColumns(n.getCollectionOfObjectValues(WorkbookTableColumn::createFromDiscriminatorValue)); });
            this.put("highlightFirstColumn", (n) -> { currentObject.setHighlightFirstColumn(n.getBooleanValue()); });
            this.put("highlightLastColumn", (n) -> { currentObject.setHighlightLastColumn(n.getBooleanValue()); });
            this.put("legacyId", (n) -> { currentObject.setLegacyId(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("rows", (n) -> { currentObject.setRows(n.getCollectionOfObjectValues(WorkbookTableRow::createFromDiscriminatorValue)); });
            this.put("showBandedColumns", (n) -> { currentObject.setShowBandedColumns(n.getBooleanValue()); });
            this.put("showBandedRows", (n) -> { currentObject.setShowBandedRows(n.getBooleanValue()); });
            this.put("showFilterButton", (n) -> { currentObject.setShowFilterButton(n.getBooleanValue()); });
            this.put("showHeaders", (n) -> { currentObject.setShowHeaders(n.getBooleanValue()); });
            this.put("showTotals", (n) -> { currentObject.setShowTotals(n.getBooleanValue()); });
            this.put("sort", (n) -> { currentObject.setSort(n.getObjectValue(WorkbookTableSort::createFromDiscriminatorValue)); });
            this.put("style", (n) -> { currentObject.setStyle(n.getStringValue()); });
            this.put("worksheet", (n) -> { currentObject.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the highlightFirstColumn property value. Indicates whether the first column contains special formatting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHighlightFirstColumn() {
        return this._highlightFirstColumn;
    }
    /**
     * Gets the highlightLastColumn property value. Indicates whether the last column contains special formatting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHighlightLastColumn() {
        return this._highlightLastColumn;
    }
    /**
     * Gets the legacyId property value. Legacy Id used in older Excle clients. The value of the identifier remains the same even when the table is renamed. This property should be interpreted as an opaque string value and should not be parsed to any other type. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLegacyId() {
        return this._legacyId;
    }
    /**
     * Gets the name property value. Name of the table.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the rows property value. Represents a collection of all the rows in the table. Read-only.
     * @return a workbookTableRow
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookTableRow> getRows() {
        return this._rows;
    }
    /**
     * Gets the showBandedColumns property value. Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowBandedColumns() {
        return this._showBandedColumns;
    }
    /**
     * Gets the showBandedRows property value. Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowBandedRows() {
        return this._showBandedRows;
    }
    /**
     * Gets the showFilterButton property value. Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowFilterButton() {
        return this._showFilterButton;
    }
    /**
     * Gets the showHeaders property value. Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowHeaders() {
        return this._showHeaders;
    }
    /**
     * Gets the showTotals property value. Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getShowTotals() {
        return this._showTotals;
    }
    /**
     * Gets the sort property value. Represents the sorting for the table. Read-only.
     * @return a workbookTableSort
     */
    @javax.annotation.Nullable
    public WorkbookTableSort getSort() {
        return this._sort;
    }
    /**
     * Gets the style property value. Constant value that represents the Table style. Possible values are: TableStyleLight1 thru TableStyleLight21, TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style present in the workbook can also be specified.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStyle() {
        return this._style;
    }
    /**
     * Gets the worksheet property value. The worksheet containing the current table. Read-only.
     * @return a workbookWorksheet
     */
    @javax.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this._worksheet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setColumns(@javax.annotation.Nullable final java.util.List<WorkbookTableColumn> value) {
        this._columns = value;
    }
    /**
     * Sets the highlightFirstColumn property value. Indicates whether the first column contains special formatting.
     * @param value Value to set for the highlightFirstColumn property.
     * @return a void
     */
    public void setHighlightFirstColumn(@javax.annotation.Nullable final Boolean value) {
        this._highlightFirstColumn = value;
    }
    /**
     * Sets the highlightLastColumn property value. Indicates whether the last column contains special formatting.
     * @param value Value to set for the highlightLastColumn property.
     * @return a void
     */
    public void setHighlightLastColumn(@javax.annotation.Nullable final Boolean value) {
        this._highlightLastColumn = value;
    }
    /**
     * Sets the legacyId property value. Legacy Id used in older Excle clients. The value of the identifier remains the same even when the table is renamed. This property should be interpreted as an opaque string value and should not be parsed to any other type. Read-only.
     * @param value Value to set for the legacyId property.
     * @return a void
     */
    public void setLegacyId(@javax.annotation.Nullable final String value) {
        this._legacyId = value;
    }
    /**
     * Sets the name property value. Name of the table.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the rows property value. Represents a collection of all the rows in the table. Read-only.
     * @param value Value to set for the rows property.
     * @return a void
     */
    public void setRows(@javax.annotation.Nullable final java.util.List<WorkbookTableRow> value) {
        this._rows = value;
    }
    /**
     * Sets the showBandedColumns property value. Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
     * @param value Value to set for the showBandedColumns property.
     * @return a void
     */
    public void setShowBandedColumns(@javax.annotation.Nullable final Boolean value) {
        this._showBandedColumns = value;
    }
    /**
     * Sets the showBandedRows property value. Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
     * @param value Value to set for the showBandedRows property.
     * @return a void
     */
    public void setShowBandedRows(@javax.annotation.Nullable final Boolean value) {
        this._showBandedRows = value;
    }
    /**
     * Sets the showFilterButton property value. Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
     * @param value Value to set for the showFilterButton property.
     * @return a void
     */
    public void setShowFilterButton(@javax.annotation.Nullable final Boolean value) {
        this._showFilterButton = value;
    }
    /**
     * Sets the showHeaders property value. Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
     * @param value Value to set for the showHeaders property.
     * @return a void
     */
    public void setShowHeaders(@javax.annotation.Nullable final Boolean value) {
        this._showHeaders = value;
    }
    /**
     * Sets the showTotals property value. Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
     * @param value Value to set for the showTotals property.
     * @return a void
     */
    public void setShowTotals(@javax.annotation.Nullable final Boolean value) {
        this._showTotals = value;
    }
    /**
     * Sets the sort property value. Represents the sorting for the table. Read-only.
     * @param value Value to set for the sort property.
     * @return a void
     */
    public void setSort(@javax.annotation.Nullable final WorkbookTableSort value) {
        this._sort = value;
    }
    /**
     * Sets the style property value. Constant value that represents the Table style. Possible values are: TableStyleLight1 thru TableStyleLight21, TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style present in the workbook can also be specified.
     * @param value Value to set for the style property.
     * @return a void
     */
    public void setStyle(@javax.annotation.Nullable final String value) {
        this._style = value;
    }
    /**
     * Sets the worksheet property value. The worksheet containing the current table. Read-only.
     * @param value Value to set for the worksheet property.
     * @return a void
     */
    public void setWorksheet(@javax.annotation.Nullable final WorkbookWorksheet value) {
        this._worksheet = value;
    }
}
