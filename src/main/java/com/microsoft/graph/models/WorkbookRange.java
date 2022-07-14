package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookRange extends Entity implements Parsable {
    /** Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4). Read-only. */
    private String _address;
    /** Represents range reference for the specified range in the language of the user. Read-only. */
    private String _addressLocal;
    /** Number of cells in the range. Read-only. */
    private Integer _cellCount;
    /** Represents the total number of columns in the range. Read-only. */
    private Integer _columnCount;
    /** Represents if all columns of the current range are hidden. */
    private Boolean _columnHidden;
    /** Represents the column number of the first cell in the range. Zero-indexed. Read-only. */
    private Integer _columnIndex;
    /** Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only. */
    private WorkbookRangeFormat _format;
    /** Represents the formula in A1-style notation. */
    private Json _formulas;
    /** Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German. */
    private Json _formulasLocal;
    /** Represents the formula in R1C1-style notation. */
    private Json _formulasR1C1;
    /** Represents if all cells of the current range are hidden. Read-only. */
    private Boolean _hidden;
    /** Represents Excel's number format code for the given cell. */
    private Json _numberFormat;
    /** Returns the total number of rows in the range. Read-only. */
    private Integer _rowCount;
    /** Represents if all rows of the current range are hidden. */
    private Boolean _rowHidden;
    /** Returns the row number of the first cell in the range. Zero-indexed. Read-only. */
    private Integer _rowIndex;
    /** The worksheet containing the current range. Read-only. */
    private WorkbookRangeSort _sort;
    /** Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only. */
    private Json _text;
    /** Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string. */
    private Json _values;
    /** Represents the type of data of each cell. Possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only. */
    private Json _valueTypes;
    /** The worksheet containing the current range. Read-only. */
    private WorkbookWorksheet _worksheet;
    /**
     * Instantiates a new WorkbookRange and sets the default values.
     * @return a void
     */
    public WorkbookRange() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookRange
     */
    @javax.annotation.Nonnull
    public static WorkbookRange createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRange();
    }
    /**
     * Gets the address property value. Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddress() {
        return this._address;
    }
    /**
     * Gets the addressLocal property value. Represents range reference for the specified range in the language of the user. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddressLocal() {
        return this._addressLocal;
    }
    /**
     * Gets the cellCount property value. Number of cells in the range. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCellCount() {
        return this._cellCount;
    }
    /**
     * Gets the columnCount property value. Represents the total number of columns in the range. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getColumnCount() {
        return this._columnCount;
    }
    /**
     * Gets the columnHidden property value. Represents if all columns of the current range are hidden.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getColumnHidden() {
        return this._columnHidden;
    }
    /**
     * Gets the columnIndex property value. Represents the column number of the first cell in the range. Zero-indexed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getColumnIndex() {
        return this._columnIndex;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookRange currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getStringValue()); });
            this.put("addressLocal", (n) -> { currentObject.setAddressLocal(n.getStringValue()); });
            this.put("cellCount", (n) -> { currentObject.setCellCount(n.getIntegerValue()); });
            this.put("columnCount", (n) -> { currentObject.setColumnCount(n.getIntegerValue()); });
            this.put("columnHidden", (n) -> { currentObject.setColumnHidden(n.getBooleanValue()); });
            this.put("columnIndex", (n) -> { currentObject.setColumnIndex(n.getIntegerValue()); });
            this.put("format", (n) -> { currentObject.setFormat(n.getObjectValue(WorkbookRangeFormat::createFromDiscriminatorValue)); });
            this.put("formulas", (n) -> { currentObject.setFormulas(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("formulasLocal", (n) -> { currentObject.setFormulasLocal(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("formulasR1C1", (n) -> { currentObject.setFormulasR1C1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("hidden", (n) -> { currentObject.setHidden(n.getBooleanValue()); });
            this.put("numberFormat", (n) -> { currentObject.setNumberFormat(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("rowCount", (n) -> { currentObject.setRowCount(n.getIntegerValue()); });
            this.put("rowHidden", (n) -> { currentObject.setRowHidden(n.getBooleanValue()); });
            this.put("rowIndex", (n) -> { currentObject.setRowIndex(n.getIntegerValue()); });
            this.put("sort", (n) -> { currentObject.setSort(n.getObjectValue(WorkbookRangeSort::createFromDiscriminatorValue)); });
            this.put("text", (n) -> { currentObject.setText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("values", (n) -> { currentObject.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("valueTypes", (n) -> { currentObject.setValueTypes(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("worksheet", (n) -> { currentObject.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the format property value. Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
     * @return a workbookRangeFormat
     */
    @javax.annotation.Nullable
    public WorkbookRangeFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the formulas property value. Represents the formula in A1-style notation.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFormulas() {
        return this._formulas;
    }
    /**
     * Gets the formulasLocal property value. Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFormulasLocal() {
        return this._formulasLocal;
    }
    /**
     * Gets the formulasR1C1 property value. Represents the formula in R1C1-style notation.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFormulasR1C1() {
        return this._formulasR1C1;
    }
    /**
     * Gets the hidden property value. Represents if all cells of the current range are hidden. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this._hidden;
    }
    /**
     * Gets the numberFormat property value. Represents Excel's number format code for the given cell.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumberFormat() {
        return this._numberFormat;
    }
    /**
     * Gets the rowCount property value. Returns the total number of rows in the range. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRowCount() {
        return this._rowCount;
    }
    /**
     * Gets the rowHidden property value. Represents if all rows of the current range are hidden.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRowHidden() {
        return this._rowHidden;
    }
    /**
     * Gets the rowIndex property value. Returns the row number of the first cell in the range. Zero-indexed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRowIndex() {
        return this._rowIndex;
    }
    /**
     * Gets the sort property value. The worksheet containing the current range. Read-only.
     * @return a workbookRangeSort
     */
    @javax.annotation.Nullable
    public WorkbookRangeSort getSort() {
        return this._sort;
    }
    /**
     * Gets the text property value. Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getText() {
        return this._text;
    }
    /**
     * Gets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValues() {
        return this._values;
    }
    /**
     * Gets the valueTypes property value. Represents the type of data of each cell. Possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValueTypes() {
        return this._valueTypes;
    }
    /**
     * Gets the worksheet property value. The worksheet containing the current range. Read-only.
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
        writer.writeStringValue("address", this.getAddress());
        writer.writeStringValue("addressLocal", this.getAddressLocal());
        writer.writeIntegerValue("cellCount", this.getCellCount());
        writer.writeIntegerValue("columnCount", this.getColumnCount());
        writer.writeBooleanValue("columnHidden", this.getColumnHidden());
        writer.writeIntegerValue("columnIndex", this.getColumnIndex());
        writer.writeObjectValue("format", this.getFormat());
        writer.writeObjectValue("formulas", this.getFormulas());
        writer.writeObjectValue("formulasLocal", this.getFormulasLocal());
        writer.writeObjectValue("formulasR1C1", this.getFormulasR1C1());
        writer.writeBooleanValue("hidden", this.getHidden());
        writer.writeObjectValue("numberFormat", this.getNumberFormat());
        writer.writeIntegerValue("rowCount", this.getRowCount());
        writer.writeBooleanValue("rowHidden", this.getRowHidden());
        writer.writeIntegerValue("rowIndex", this.getRowIndex());
        writer.writeObjectValue("sort", this.getSort());
        writer.writeObjectValue("text", this.getText());
        writer.writeObjectValue("values", this.getValues());
        writer.writeObjectValue("valueTypes", this.getValueTypes());
        writer.writeObjectValue("worksheet", this.getWorksheet());
    }
    /**
     * Sets the address property value. Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4). Read-only.
     * @param value Value to set for the address property.
     * @return a void
     */
    public void setAddress(@javax.annotation.Nullable final String value) {
        this._address = value;
    }
    /**
     * Sets the addressLocal property value. Represents range reference for the specified range in the language of the user. Read-only.
     * @param value Value to set for the addressLocal property.
     * @return a void
     */
    public void setAddressLocal(@javax.annotation.Nullable final String value) {
        this._addressLocal = value;
    }
    /**
     * Sets the cellCount property value. Number of cells in the range. Read-only.
     * @param value Value to set for the cellCount property.
     * @return a void
     */
    public void setCellCount(@javax.annotation.Nullable final Integer value) {
        this._cellCount = value;
    }
    /**
     * Sets the columnCount property value. Represents the total number of columns in the range. Read-only.
     * @param value Value to set for the columnCount property.
     * @return a void
     */
    public void setColumnCount(@javax.annotation.Nullable final Integer value) {
        this._columnCount = value;
    }
    /**
     * Sets the columnHidden property value. Represents if all columns of the current range are hidden.
     * @param value Value to set for the columnHidden property.
     * @return a void
     */
    public void setColumnHidden(@javax.annotation.Nullable final Boolean value) {
        this._columnHidden = value;
    }
    /**
     * Sets the columnIndex property value. Represents the column number of the first cell in the range. Zero-indexed. Read-only.
     * @param value Value to set for the columnIndex property.
     * @return a void
     */
    public void setColumnIndex(@javax.annotation.Nullable final Integer value) {
        this._columnIndex = value;
    }
    /**
     * Sets the format property value. Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final WorkbookRangeFormat value) {
        this._format = value;
    }
    /**
     * Sets the formulas property value. Represents the formula in A1-style notation.
     * @param value Value to set for the formulas property.
     * @return a void
     */
    public void setFormulas(@javax.annotation.Nullable final Json value) {
        this._formulas = value;
    }
    /**
     * Sets the formulasLocal property value. Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     * @param value Value to set for the formulasLocal property.
     * @return a void
     */
    public void setFormulasLocal(@javax.annotation.Nullable final Json value) {
        this._formulasLocal = value;
    }
    /**
     * Sets the formulasR1C1 property value. Represents the formula in R1C1-style notation.
     * @param value Value to set for the formulasR1C1 property.
     * @return a void
     */
    public void setFormulasR1C1(@javax.annotation.Nullable final Json value) {
        this._formulasR1C1 = value;
    }
    /**
     * Sets the hidden property value. Represents if all cells of the current range are hidden. Read-only.
     * @param value Value to set for the hidden property.
     * @return a void
     */
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this._hidden = value;
    }
    /**
     * Sets the numberFormat property value. Represents Excel's number format code for the given cell.
     * @param value Value to set for the numberFormat property.
     * @return a void
     */
    public void setNumberFormat(@javax.annotation.Nullable final Json value) {
        this._numberFormat = value;
    }
    /**
     * Sets the rowCount property value. Returns the total number of rows in the range. Read-only.
     * @param value Value to set for the rowCount property.
     * @return a void
     */
    public void setRowCount(@javax.annotation.Nullable final Integer value) {
        this._rowCount = value;
    }
    /**
     * Sets the rowHidden property value. Represents if all rows of the current range are hidden.
     * @param value Value to set for the rowHidden property.
     * @return a void
     */
    public void setRowHidden(@javax.annotation.Nullable final Boolean value) {
        this._rowHidden = value;
    }
    /**
     * Sets the rowIndex property value. Returns the row number of the first cell in the range. Zero-indexed. Read-only.
     * @param value Value to set for the rowIndex property.
     * @return a void
     */
    public void setRowIndex(@javax.annotation.Nullable final Integer value) {
        this._rowIndex = value;
    }
    /**
     * Sets the sort property value. The worksheet containing the current range. Read-only.
     * @param value Value to set for the sort property.
     * @return a void
     */
    public void setSort(@javax.annotation.Nullable final WorkbookRangeSort value) {
        this._sort = value;
    }
    /**
     * Sets the text property value. Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
     * @param value Value to set for the text property.
     * @return a void
     */
    public void setText(@javax.annotation.Nullable final Json value) {
        this._text = value;
    }
    /**
     * Sets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final Json value) {
        this._values = value;
    }
    /**
     * Sets the valueTypes property value. Represents the type of data of each cell. Possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only.
     * @param value Value to set for the valueTypes property.
     * @return a void
     */
    public void setValueTypes(@javax.annotation.Nullable final Json value) {
        this._valueTypes = value;
    }
    /**
     * Sets the worksheet property value. The worksheet containing the current range. Read-only.
     * @param value Value to set for the worksheet property.
     * @return a void
     */
    public void setWorksheet(@javax.annotation.Nullable final WorkbookWorksheet value) {
        this._worksheet = value;
    }
}
