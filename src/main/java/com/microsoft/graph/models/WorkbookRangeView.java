package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookRangeView extends Entity implements Parsable {
    /** Represents the cell addresses */
    private Json _cellAddresses;
    /** Returns the number of visible columns. Read-only. */
    private Integer _columnCount;
    /** Represents the formula in A1-style notation. */
    private Json _formulas;
    /** Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German. */
    private Json _formulasLocal;
    /** Represents the formula in R1C1-style notation. */
    private Json _formulasR1C1;
    /** Index of the range. */
    private Integer _index;
    /** Represents Excel's number format code for the given cell. Read-only. */
    private Json _numberFormat;
    /** Returns the number of visible rows. Read-only. */
    private Integer _rowCount;
    /** Represents a collection of range views associated with the range. Read-only. Read-only. */
    private java.util.List<WorkbookRangeView> _rows;
    /** Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only. */
    private Json _text;
    /** Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string. */
    private Json _values;
    /** Represents the type of data of each cell. Read-only. Possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error. */
    private Json _valueTypes;
    /**
     * Instantiates a new WorkbookRangeView and sets the default values.
     * @return a void
     */
    public WorkbookRangeView() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookRangeView
     */
    @javax.annotation.Nonnull
    public static WorkbookRangeView createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeView();
    }
    /**
     * Gets the cellAddresses property value. Represents the cell addresses
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getCellAddresses() {
        return this._cellAddresses;
    }
    /**
     * Gets the columnCount property value. Returns the number of visible columns. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getColumnCount() {
        return this._columnCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkbookRangeView currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("cellAddresses", (n) -> { currentObject.setCellAddresses(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("columnCount", (n) -> { currentObject.setColumnCount(n.getIntegerValue()); });
            this.put("formulas", (n) -> { currentObject.setFormulas(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("formulasLocal", (n) -> { currentObject.setFormulasLocal(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("formulasR1C1", (n) -> { currentObject.setFormulasR1C1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("index", (n) -> { currentObject.setIndex(n.getIntegerValue()); });
            this.put("numberFormat", (n) -> { currentObject.setNumberFormat(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("rowCount", (n) -> { currentObject.setRowCount(n.getIntegerValue()); });
            this.put("rows", (n) -> { currentObject.setRows(n.getCollectionOfObjectValues(WorkbookRangeView::createFromDiscriminatorValue)); });
            this.put("text", (n) -> { currentObject.setText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("values", (n) -> { currentObject.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
            this.put("valueTypes", (n) -> { currentObject.setValueTypes(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        }};
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
     * Gets the formulasLocal property value. Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
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
     * Gets the index property value. Index of the range.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIndex() {
        return this._index;
    }
    /**
     * Gets the numberFormat property value. Represents Excel's number format code for the given cell. Read-only.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumberFormat() {
        return this._numberFormat;
    }
    /**
     * Gets the rowCount property value. Returns the number of visible rows. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRowCount() {
        return this._rowCount;
    }
    /**
     * Gets the rows property value. Represents a collection of range views associated with the range. Read-only. Read-only.
     * @return a workbookRangeView
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookRangeView> getRows() {
        return this._rows;
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
     * Gets the values property value. Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValues() {
        return this._values;
    }
    /**
     * Gets the valueTypes property value. Represents the type of data of each cell. Read-only. Possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error.
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getValueTypes() {
        return this._valueTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("cellAddresses", this.getCellAddresses());
        writer.writeIntegerValue("columnCount", this.getColumnCount());
        writer.writeObjectValue("formulas", this.getFormulas());
        writer.writeObjectValue("formulasLocal", this.getFormulasLocal());
        writer.writeObjectValue("formulasR1C1", this.getFormulasR1C1());
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeObjectValue("numberFormat", this.getNumberFormat());
        writer.writeIntegerValue("rowCount", this.getRowCount());
        writer.writeCollectionOfObjectValues("rows", this.getRows());
        writer.writeObjectValue("text", this.getText());
        writer.writeObjectValue("values", this.getValues());
        writer.writeObjectValue("valueTypes", this.getValueTypes());
    }
    /**
     * Sets the cellAddresses property value. Represents the cell addresses
     * @param value Value to set for the cellAddresses property.
     * @return a void
     */
    public void setCellAddresses(@javax.annotation.Nullable final Json value) {
        this._cellAddresses = value;
    }
    /**
     * Sets the columnCount property value. Returns the number of visible columns. Read-only.
     * @param value Value to set for the columnCount property.
     * @return a void
     */
    public void setColumnCount(@javax.annotation.Nullable final Integer value) {
        this._columnCount = value;
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
     * Sets the formulasLocal property value. Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
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
     * Sets the index property value. Index of the range.
     * @param value Value to set for the index property.
     * @return a void
     */
    public void setIndex(@javax.annotation.Nullable final Integer value) {
        this._index = value;
    }
    /**
     * Sets the numberFormat property value. Represents Excel's number format code for the given cell. Read-only.
     * @param value Value to set for the numberFormat property.
     * @return a void
     */
    public void setNumberFormat(@javax.annotation.Nullable final Json value) {
        this._numberFormat = value;
    }
    /**
     * Sets the rowCount property value. Returns the number of visible rows. Read-only.
     * @param value Value to set for the rowCount property.
     * @return a void
     */
    public void setRowCount(@javax.annotation.Nullable final Integer value) {
        this._rowCount = value;
    }
    /**
     * Sets the rows property value. Represents a collection of range views associated with the range. Read-only. Read-only.
     * @param value Value to set for the rows property.
     * @return a void
     */
    public void setRows(@javax.annotation.Nullable final java.util.List<WorkbookRangeView> value) {
        this._rows = value;
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
     * Sets the values property value. Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     * @param value Value to set for the values property.
     * @return a void
     */
    public void setValues(@javax.annotation.Nullable final Json value) {
        this._values = value;
    }
    /**
     * Sets the valueTypes property value. Represents the type of data of each cell. Read-only. Possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error.
     * @param value Value to set for the valueTypes property.
     * @return a void
     */
    public void setValueTypes(@javax.annotation.Nullable final Json value) {
        this._valueTypes = value;
    }
}
