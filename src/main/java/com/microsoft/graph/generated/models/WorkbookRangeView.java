package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookRangeView extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WorkbookRangeView} and sets the default values.
     */
    public WorkbookRangeView() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WorkbookRangeView}
     */
    @jakarta.annotation.Nonnull
    public static WorkbookRangeView createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookRangeView();
    }
    /**
     * Gets the cellAddresses property value. Represents the cell addresses
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getCellAddresses() {
        return this.backingStore.get("cellAddresses");
    }
    /**
     * Gets the columnCount property value. Returns the number of visible columns. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getColumnCount() {
        return this.backingStore.get("columnCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cellAddresses", (n) -> { this.setCellAddresses(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("columnCount", (n) -> { this.setColumnCount(n.getIntegerValue()); });
        deserializerMap.put("formulas", (n) -> { this.setFormulas(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("formulasLocal", (n) -> { this.setFormulasLocal(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("formulasR1C1", (n) -> { this.setFormulasR1C1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("index", (n) -> { this.setIndex(n.getIntegerValue()); });
        deserializerMap.put("numberFormat", (n) -> { this.setNumberFormat(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rowCount", (n) -> { this.setRowCount(n.getIntegerValue()); });
        deserializerMap.put("rows", (n) -> { this.setRows(n.getCollectionOfObjectValues(WorkbookRangeView::createFromDiscriminatorValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("valueTypes", (n) -> { this.setValueTypes(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the formulas property value. Represents the formula in A1-style notation.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getFormulas() {
        return this.backingStore.get("formulas");
    }
    /**
     * Gets the formulasLocal property value. Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getFormulasLocal() {
        return this.backingStore.get("formulasLocal");
    }
    /**
     * Gets the formulasR1C1 property value. Represents the formula in R1C1-style notation.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getFormulasR1C1() {
        return this.backingStore.get("formulasR1C1");
    }
    /**
     * Gets the index property value. Index of the range.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIndex() {
        return this.backingStore.get("index");
    }
    /**
     * Gets the numberFormat property value. Represents Excel's number format code for the given cell. Read-only.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getNumberFormat() {
        return this.backingStore.get("numberFormat");
    }
    /**
     * Gets the rowCount property value. Returns the number of visible rows. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRowCount() {
        return this.backingStore.get("rowCount");
    }
    /**
     * Gets the rows property value. Represents a collection of range views associated with the range. Read-only. Read-only.
     * @return a {@link java.util.List<WorkbookRangeView>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkbookRangeView> getRows() {
        return this.backingStore.get("rows");
    }
    /**
     * Gets the text property value. Text values of the specified range. The Text value won't depend on the cell width. The # sign substitution that happens in Excel UI won't affect the text value returned by the API. Read-only.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getText() {
        return this.backingStore.get("text");
    }
    /**
     * Gets the values property value. Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cell that contains an error returns the error string.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getValues() {
        return this.backingStore.get("values");
    }
    /**
     * Gets the valueTypes property value. Represents the type of data of each cell. Read-only. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error.
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getValueTypes() {
        return this.backingStore.get("valueTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCellAddresses(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("cellAddresses", value);
    }
    /**
     * Sets the columnCount property value. Returns the number of visible columns. Read-only.
     * @param value Value to set for the columnCount property.
     */
    public void setColumnCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("columnCount", value);
    }
    /**
     * Sets the formulas property value. Represents the formula in A1-style notation.
     * @param value Value to set for the formulas property.
     */
    public void setFormulas(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("formulas", value);
    }
    /**
     * Sets the formulasLocal property value. Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     * @param value Value to set for the formulasLocal property.
     */
    public void setFormulasLocal(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("formulasLocal", value);
    }
    /**
     * Sets the formulasR1C1 property value. Represents the formula in R1C1-style notation.
     * @param value Value to set for the formulasR1C1 property.
     */
    public void setFormulasR1C1(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("formulasR1C1", value);
    }
    /**
     * Sets the index property value. Index of the range.
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("index", value);
    }
    /**
     * Sets the numberFormat property value. Represents Excel's number format code for the given cell. Read-only.
     * @param value Value to set for the numberFormat property.
     */
    public void setNumberFormat(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("numberFormat", value);
    }
    /**
     * Sets the rowCount property value. Returns the number of visible rows. Read-only.
     * @param value Value to set for the rowCount property.
     */
    public void setRowCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("rowCount", value);
    }
    /**
     * Sets the rows property value. Represents a collection of range views associated with the range. Read-only. Read-only.
     * @param value Value to set for the rows property.
     */
    public void setRows(@jakarta.annotation.Nullable final java.util.List<WorkbookRangeView> value) {
        this.backingStore.set("rows", value);
    }
    /**
     * Sets the text property value. Text values of the specified range. The Text value won't depend on the cell width. The # sign substitution that happens in Excel UI won't affect the text value returned by the API. Read-only.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("text", value);
    }
    /**
     * Sets the values property value. Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cell that contains an error returns the error string.
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("values", value);
    }
    /**
     * Sets the valueTypes property value. Represents the type of data of each cell. Read-only. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error.
     * @param value Value to set for the valueTypes property.
     */
    public void setValueTypes(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("valueTypes", value);
    }
}
