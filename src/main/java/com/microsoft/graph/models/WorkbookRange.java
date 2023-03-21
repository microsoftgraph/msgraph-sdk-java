package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookRange extends Entity implements Parsable {
    /** Represents the range reference in A1-style. Address value will contain the Sheet reference (e.g. Sheet1!A1:B4). Read-only. */
    private String address;
    /** Represents range reference for the specified range in the language of the user. Read-only. */
    private String addressLocal;
    /** Number of cells in the range. Read-only. */
    private Integer cellCount;
    /** Represents the total number of columns in the range. Read-only. */
    private Integer columnCount;
    /** Represents if all columns of the current range are hidden. */
    private Boolean columnHidden;
    /** Represents the column number of the first cell in the range. Zero-indexed. Read-only. */
    private Integer columnIndex;
    /** Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only. */
    private WorkbookRangeFormat format;
    /** Represents the formula in A1-style notation. */
    private Json formulas;
    /** Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German. */
    private Json formulasLocal;
    /** Represents the formula in R1C1-style notation. */
    private Json formulasR1C1;
    /** Represents if all cells of the current range are hidden. Read-only. */
    private Boolean hidden;
    /** Represents Excel's number format code for the given cell. */
    private Json numberFormat;
    /** Returns the total number of rows in the range. Read-only. */
    private Integer rowCount;
    /** Represents if all rows of the current range are hidden. */
    private Boolean rowHidden;
    /** Returns the row number of the first cell in the range. Zero-indexed. Read-only. */
    private Integer rowIndex;
    /** The worksheet containing the current range. Read-only. */
    private WorkbookRangeSort sort;
    /** Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only. */
    private Json text;
    /** Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string. */
    private Json values;
    /** Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only. */
    private Json valueTypes;
    /** The worksheet containing the current range. Read-only. */
    private WorkbookWorksheet worksheet;
    /**
     * Instantiates a new WorkbookRange and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.address;
    }
    /**
     * Gets the addressLocal property value. Represents range reference for the specified range in the language of the user. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddressLocal() {
        return this.addressLocal;
    }
    /**
     * Gets the cellCount property value. Number of cells in the range. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCellCount() {
        return this.cellCount;
    }
    /**
     * Gets the columnCount property value. Represents the total number of columns in the range. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getColumnCount() {
        return this.columnCount;
    }
    /**
     * Gets the columnHidden property value. Represents if all columns of the current range are hidden.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getColumnHidden() {
        return this.columnHidden;
    }
    /**
     * Gets the columnIndex property value. Represents the column number of the first cell in the range. Zero-indexed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getColumnIndex() {
        return this.columnIndex;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("address", (n) -> { this.setAddress(n.getStringValue()); });
        deserializerMap.put("addressLocal", (n) -> { this.setAddressLocal(n.getStringValue()); });
        deserializerMap.put("cellCount", (n) -> { this.setCellCount(n.getIntegerValue()); });
        deserializerMap.put("columnCount", (n) -> { this.setColumnCount(n.getIntegerValue()); });
        deserializerMap.put("columnHidden", (n) -> { this.setColumnHidden(n.getBooleanValue()); });
        deserializerMap.put("columnIndex", (n) -> { this.setColumnIndex(n.getIntegerValue()); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getObjectValue(WorkbookRangeFormat::createFromDiscriminatorValue)); });
        deserializerMap.put("formulas", (n) -> { this.setFormulas(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("formulasLocal", (n) -> { this.setFormulasLocal(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("formulasR1C1", (n) -> { this.setFormulasR1C1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("hidden", (n) -> { this.setHidden(n.getBooleanValue()); });
        deserializerMap.put("numberFormat", (n) -> { this.setNumberFormat(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rowCount", (n) -> { this.setRowCount(n.getIntegerValue()); });
        deserializerMap.put("rowHidden", (n) -> { this.setRowHidden(n.getBooleanValue()); });
        deserializerMap.put("rowIndex", (n) -> { this.setRowIndex(n.getIntegerValue()); });
        deserializerMap.put("sort", (n) -> { this.setSort(n.getObjectValue(WorkbookRangeSort::createFromDiscriminatorValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("valueTypes", (n) -> { this.setValueTypes(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("worksheet", (n) -> { this.setWorksheet(n.getObjectValue(WorkbookWorksheet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the format property value. Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
     * @return a workbookRangeFormat
     */
    @javax.annotation.Nullable
    public WorkbookRangeFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the formulas property value. Represents the formula in A1-style notation.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFormulas() {
        return this.formulas;
    }
    /**
     * Gets the formulasLocal property value. Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFormulasLocal() {
        return this.formulasLocal;
    }
    /**
     * Gets the formulasR1C1 property value. Represents the formula in R1C1-style notation.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFormulasR1C1() {
        return this.formulasR1C1;
    }
    /**
     * Gets the hidden property value. Represents if all cells of the current range are hidden. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHidden() {
        return this.hidden;
    }
    /**
     * Gets the numberFormat property value. Represents Excel's number format code for the given cell.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumberFormat() {
        return this.numberFormat;
    }
    /**
     * Gets the rowCount property value. Returns the total number of rows in the range. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRowCount() {
        return this.rowCount;
    }
    /**
     * Gets the rowHidden property value. Represents if all rows of the current range are hidden.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRowHidden() {
        return this.rowHidden;
    }
    /**
     * Gets the rowIndex property value. Returns the row number of the first cell in the range. Zero-indexed. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRowIndex() {
        return this.rowIndex;
    }
    /**
     * Gets the sort property value. The worksheet containing the current range. Read-only.
     * @return a workbookRangeSort
     */
    @javax.annotation.Nullable
    public WorkbookRangeSort getSort() {
        return this.sort;
    }
    /**
     * Gets the text property value. Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getText() {
        return this.text;
    }
    /**
     * Gets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValues() {
        return this.values;
    }
    /**
     * Gets the valueTypes property value. Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValueTypes() {
        return this.valueTypes;
    }
    /**
     * Gets the worksheet property value. The worksheet containing the current range. Read-only.
     * @return a workbookWorksheet
     */
    @javax.annotation.Nullable
    public WorkbookWorksheet getWorksheet() {
        return this.worksheet;
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
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final String value) {
        this.address = value;
    }
    /**
     * Sets the addressLocal property value. Represents range reference for the specified range in the language of the user. Read-only.
     * @param value Value to set for the addressLocal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddressLocal(@javax.annotation.Nullable final String value) {
        this.addressLocal = value;
    }
    /**
     * Sets the cellCount property value. Number of cells in the range. Read-only.
     * @param value Value to set for the cellCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellCount(@javax.annotation.Nullable final Integer value) {
        this.cellCount = value;
    }
    /**
     * Sets the columnCount property value. Represents the total number of columns in the range. Read-only.
     * @param value Value to set for the columnCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnCount(@javax.annotation.Nullable final Integer value) {
        this.columnCount = value;
    }
    /**
     * Sets the columnHidden property value. Represents if all columns of the current range are hidden.
     * @param value Value to set for the columnHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnHidden(@javax.annotation.Nullable final Boolean value) {
        this.columnHidden = value;
    }
    /**
     * Sets the columnIndex property value. Represents the column number of the first cell in the range. Zero-indexed. Read-only.
     * @param value Value to set for the columnIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setColumnIndex(@javax.annotation.Nullable final Integer value) {
        this.columnIndex = value;
    }
    /**
     * Sets the format property value. Returns a format object, encapsulating the range's font, fill, borders, alignment, and other properties. Read-only.
     * @param value Value to set for the format property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormat(@javax.annotation.Nullable final WorkbookRangeFormat value) {
        this.format = value;
    }
    /**
     * Sets the formulas property value. Represents the formula in A1-style notation.
     * @param value Value to set for the formulas property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormulas(@javax.annotation.Nullable final Json value) {
        this.formulas = value;
    }
    /**
     * Sets the formulasLocal property value. Represents the formula in A1-style notation, in the user's language and number-formatting locale.  For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     * @param value Value to set for the formulasLocal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormulasLocal(@javax.annotation.Nullable final Json value) {
        this.formulasLocal = value;
    }
    /**
     * Sets the formulasR1C1 property value. Represents the formula in R1C1-style notation.
     * @param value Value to set for the formulasR1C1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFormulasR1C1(@javax.annotation.Nullable final Json value) {
        this.formulasR1C1 = value;
    }
    /**
     * Sets the hidden property value. Represents if all cells of the current range are hidden. Read-only.
     * @param value Value to set for the hidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHidden(@javax.annotation.Nullable final Boolean value) {
        this.hidden = value;
    }
    /**
     * Sets the numberFormat property value. Represents Excel's number format code for the given cell.
     * @param value Value to set for the numberFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberFormat(@javax.annotation.Nullable final Json value) {
        this.numberFormat = value;
    }
    /**
     * Sets the rowCount property value. Returns the total number of rows in the range. Read-only.
     * @param value Value to set for the rowCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRowCount(@javax.annotation.Nullable final Integer value) {
        this.rowCount = value;
    }
    /**
     * Sets the rowHidden property value. Represents if all rows of the current range are hidden.
     * @param value Value to set for the rowHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRowHidden(@javax.annotation.Nullable final Boolean value) {
        this.rowHidden = value;
    }
    /**
     * Sets the rowIndex property value. Returns the row number of the first cell in the range. Zero-indexed. Read-only.
     * @param value Value to set for the rowIndex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRowIndex(@javax.annotation.Nullable final Integer value) {
        this.rowIndex = value;
    }
    /**
     * Sets the sort property value. The worksheet containing the current range. Read-only.
     * @param value Value to set for the sort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSort(@javax.annotation.Nullable final WorkbookRangeSort value) {
        this.sort = value;
    }
    /**
     * Sets the text property value. Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final Json value) {
        this.text = value;
    }
    /**
     * Sets the values property value. Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @param value Value to set for the values property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValues(@javax.annotation.Nullable final Json value) {
        this.values = value;
    }
    /**
     * Sets the valueTypes property value. Represents the type of data of each cell. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. Read-only.
     * @param value Value to set for the valueTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValueTypes(@javax.annotation.Nullable final Json value) {
        this.valueTypes = value;
    }
    /**
     * Sets the worksheet property value. The worksheet containing the current range. Read-only.
     * @param value Value to set for the worksheet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorksheet(@javax.annotation.Nullable final WorkbookWorksheet value) {
        this.worksheet = value;
    }
}
