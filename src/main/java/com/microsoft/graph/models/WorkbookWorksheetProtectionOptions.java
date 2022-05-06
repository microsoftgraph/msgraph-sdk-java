package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookWorksheetProtectionOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Represents the worksheet protection option of allowing using auto filter feature.  */
    private Boolean _allowAutoFilter;
    /** Represents the worksheet protection option of allowing deleting columns.  */
    private Boolean _allowDeleteColumns;
    /** Represents the worksheet protection option of allowing deleting rows.  */
    private Boolean _allowDeleteRows;
    /** Represents the worksheet protection option of allowing formatting cells.  */
    private Boolean _allowFormatCells;
    /** Represents the worksheet protection option of allowing formatting columns.  */
    private Boolean _allowFormatColumns;
    /** Represents the worksheet protection option of allowing formatting rows.  */
    private Boolean _allowFormatRows;
    /** Represents the worksheet protection option of allowing inserting columns.  */
    private Boolean _allowInsertColumns;
    /** Represents the worksheet protection option of allowing inserting hyperlinks.  */
    private Boolean _allowInsertHyperlinks;
    /** Represents the worksheet protection option of allowing inserting rows.  */
    private Boolean _allowInsertRows;
    /** Represents the worksheet protection option of allowing using pivot table feature.  */
    private Boolean _allowPivotTables;
    /** Represents the worksheet protection option of allowing using sort feature.  */
    private Boolean _allowSort;
    /**
     * Instantiates a new workbookWorksheetProtectionOptions and sets the default values.
     * @return a void
     */
    public WorkbookWorksheetProtectionOptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookWorksheetProtectionOptions
     */
    @javax.annotation.Nonnull
    public static WorkbookWorksheetProtectionOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookWorksheetProtectionOptions();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the allowAutoFilter property value. Represents the worksheet protection option of allowing using auto filter feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAutoFilter() {
        return this._allowAutoFilter;
    }
    /**
     * Gets the allowDeleteColumns property value. Represents the worksheet protection option of allowing deleting columns.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeleteColumns() {
        return this._allowDeleteColumns;
    }
    /**
     * Gets the allowDeleteRows property value. Represents the worksheet protection option of allowing deleting rows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeleteRows() {
        return this._allowDeleteRows;
    }
    /**
     * Gets the allowFormatCells property value. Represents the worksheet protection option of allowing formatting cells.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowFormatCells() {
        return this._allowFormatCells;
    }
    /**
     * Gets the allowFormatColumns property value. Represents the worksheet protection option of allowing formatting columns.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowFormatColumns() {
        return this._allowFormatColumns;
    }
    /**
     * Gets the allowFormatRows property value. Represents the worksheet protection option of allowing formatting rows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowFormatRows() {
        return this._allowFormatRows;
    }
    /**
     * Gets the allowInsertColumns property value. Represents the worksheet protection option of allowing inserting columns.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowInsertColumns() {
        return this._allowInsertColumns;
    }
    /**
     * Gets the allowInsertHyperlinks property value. Represents the worksheet protection option of allowing inserting hyperlinks.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowInsertHyperlinks() {
        return this._allowInsertHyperlinks;
    }
    /**
     * Gets the allowInsertRows property value. Represents the worksheet protection option of allowing inserting rows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowInsertRows() {
        return this._allowInsertRows;
    }
    /**
     * Gets the allowPivotTables property value. Represents the worksheet protection option of allowing using pivot table feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowPivotTables() {
        return this._allowPivotTables;
    }
    /**
     * Gets the allowSort property value. Represents the worksheet protection option of allowing using sort feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowSort() {
        return this._allowSort;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookWorksheetProtectionOptions currentObject = this;
        return new HashMap<>(11) {{
            this.put("allowAutoFilter", (n) -> { currentObject.setAllowAutoFilter(n.getBooleanValue()); });
            this.put("allowDeleteColumns", (n) -> { currentObject.setAllowDeleteColumns(n.getBooleanValue()); });
            this.put("allowDeleteRows", (n) -> { currentObject.setAllowDeleteRows(n.getBooleanValue()); });
            this.put("allowFormatCells", (n) -> { currentObject.setAllowFormatCells(n.getBooleanValue()); });
            this.put("allowFormatColumns", (n) -> { currentObject.setAllowFormatColumns(n.getBooleanValue()); });
            this.put("allowFormatRows", (n) -> { currentObject.setAllowFormatRows(n.getBooleanValue()); });
            this.put("allowInsertColumns", (n) -> { currentObject.setAllowInsertColumns(n.getBooleanValue()); });
            this.put("allowInsertHyperlinks", (n) -> { currentObject.setAllowInsertHyperlinks(n.getBooleanValue()); });
            this.put("allowInsertRows", (n) -> { currentObject.setAllowInsertRows(n.getBooleanValue()); });
            this.put("allowPivotTables", (n) -> { currentObject.setAllowPivotTables(n.getBooleanValue()); });
            this.put("allowSort", (n) -> { currentObject.setAllowSort(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowAutoFilter", this.getAllowAutoFilter());
        writer.writeBooleanValue("allowDeleteColumns", this.getAllowDeleteColumns());
        writer.writeBooleanValue("allowDeleteRows", this.getAllowDeleteRows());
        writer.writeBooleanValue("allowFormatCells", this.getAllowFormatCells());
        writer.writeBooleanValue("allowFormatColumns", this.getAllowFormatColumns());
        writer.writeBooleanValue("allowFormatRows", this.getAllowFormatRows());
        writer.writeBooleanValue("allowInsertColumns", this.getAllowInsertColumns());
        writer.writeBooleanValue("allowInsertHyperlinks", this.getAllowInsertHyperlinks());
        writer.writeBooleanValue("allowInsertRows", this.getAllowInsertRows());
        writer.writeBooleanValue("allowPivotTables", this.getAllowPivotTables());
        writer.writeBooleanValue("allowSort", this.getAllowSort());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the allowAutoFilter property value. Represents the worksheet protection option of allowing using auto filter feature.
     * @param value Value to set for the allowAutoFilter property.
     * @return a void
     */
    public void setAllowAutoFilter(@javax.annotation.Nullable final Boolean value) {
        this._allowAutoFilter = value;
    }
    /**
     * Sets the allowDeleteColumns property value. Represents the worksheet protection option of allowing deleting columns.
     * @param value Value to set for the allowDeleteColumns property.
     * @return a void
     */
    public void setAllowDeleteColumns(@javax.annotation.Nullable final Boolean value) {
        this._allowDeleteColumns = value;
    }
    /**
     * Sets the allowDeleteRows property value. Represents the worksheet protection option of allowing deleting rows.
     * @param value Value to set for the allowDeleteRows property.
     * @return a void
     */
    public void setAllowDeleteRows(@javax.annotation.Nullable final Boolean value) {
        this._allowDeleteRows = value;
    }
    /**
     * Sets the allowFormatCells property value. Represents the worksheet protection option of allowing formatting cells.
     * @param value Value to set for the allowFormatCells property.
     * @return a void
     */
    public void setAllowFormatCells(@javax.annotation.Nullable final Boolean value) {
        this._allowFormatCells = value;
    }
    /**
     * Sets the allowFormatColumns property value. Represents the worksheet protection option of allowing formatting columns.
     * @param value Value to set for the allowFormatColumns property.
     * @return a void
     */
    public void setAllowFormatColumns(@javax.annotation.Nullable final Boolean value) {
        this._allowFormatColumns = value;
    }
    /**
     * Sets the allowFormatRows property value. Represents the worksheet protection option of allowing formatting rows.
     * @param value Value to set for the allowFormatRows property.
     * @return a void
     */
    public void setAllowFormatRows(@javax.annotation.Nullable final Boolean value) {
        this._allowFormatRows = value;
    }
    /**
     * Sets the allowInsertColumns property value. Represents the worksheet protection option of allowing inserting columns.
     * @param value Value to set for the allowInsertColumns property.
     * @return a void
     */
    public void setAllowInsertColumns(@javax.annotation.Nullable final Boolean value) {
        this._allowInsertColumns = value;
    }
    /**
     * Sets the allowInsertHyperlinks property value. Represents the worksheet protection option of allowing inserting hyperlinks.
     * @param value Value to set for the allowInsertHyperlinks property.
     * @return a void
     */
    public void setAllowInsertHyperlinks(@javax.annotation.Nullable final Boolean value) {
        this._allowInsertHyperlinks = value;
    }
    /**
     * Sets the allowInsertRows property value. Represents the worksheet protection option of allowing inserting rows.
     * @param value Value to set for the allowInsertRows property.
     * @return a void
     */
    public void setAllowInsertRows(@javax.annotation.Nullable final Boolean value) {
        this._allowInsertRows = value;
    }
    /**
     * Sets the allowPivotTables property value. Represents the worksheet protection option of allowing using pivot table feature.
     * @param value Value to set for the allowPivotTables property.
     * @return a void
     */
    public void setAllowPivotTables(@javax.annotation.Nullable final Boolean value) {
        this._allowPivotTables = value;
    }
    /**
     * Sets the allowSort property value. Represents the worksheet protection option of allowing using sort feature.
     * @param value Value to set for the allowSort property.
     * @return a void
     */
    public void setAllowSort(@javax.annotation.Nullable final Boolean value) {
        this._allowSort = value;
    }
}
