package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookWorksheetProtectionOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Represents the worksheet protection option of allowing using auto filter feature. */
    private Boolean allowAutoFilter;
    /** Represents the worksheet protection option of allowing deleting columns. */
    private Boolean allowDeleteColumns;
    /** Represents the worksheet protection option of allowing deleting rows. */
    private Boolean allowDeleteRows;
    /** Represents the worksheet protection option of allowing formatting cells. */
    private Boolean allowFormatCells;
    /** Represents the worksheet protection option of allowing formatting columns. */
    private Boolean allowFormatColumns;
    /** Represents the worksheet protection option of allowing formatting rows. */
    private Boolean allowFormatRows;
    /** Represents the worksheet protection option of allowing inserting columns. */
    private Boolean allowInsertColumns;
    /** Represents the worksheet protection option of allowing inserting hyperlinks. */
    private Boolean allowInsertHyperlinks;
    /** Represents the worksheet protection option of allowing inserting rows. */
    private Boolean allowInsertRows;
    /** Represents the worksheet protection option of allowing using pivot table feature. */
    private Boolean allowPivotTables;
    /** Represents the worksheet protection option of allowing using sort feature. */
    private Boolean allowSort;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new workbookWorksheetProtectionOptions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.additionalData;
    }
    /**
     * Gets the allowAutoFilter property value. Represents the worksheet protection option of allowing using auto filter feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAutoFilter() {
        return this.allowAutoFilter;
    }
    /**
     * Gets the allowDeleteColumns property value. Represents the worksheet protection option of allowing deleting columns.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeleteColumns() {
        return this.allowDeleteColumns;
    }
    /**
     * Gets the allowDeleteRows property value. Represents the worksheet protection option of allowing deleting rows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDeleteRows() {
        return this.allowDeleteRows;
    }
    /**
     * Gets the allowFormatCells property value. Represents the worksheet protection option of allowing formatting cells.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowFormatCells() {
        return this.allowFormatCells;
    }
    /**
     * Gets the allowFormatColumns property value. Represents the worksheet protection option of allowing formatting columns.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowFormatColumns() {
        return this.allowFormatColumns;
    }
    /**
     * Gets the allowFormatRows property value. Represents the worksheet protection option of allowing formatting rows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowFormatRows() {
        return this.allowFormatRows;
    }
    /**
     * Gets the allowInsertColumns property value. Represents the worksheet protection option of allowing inserting columns.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowInsertColumns() {
        return this.allowInsertColumns;
    }
    /**
     * Gets the allowInsertHyperlinks property value. Represents the worksheet protection option of allowing inserting hyperlinks.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowInsertHyperlinks() {
        return this.allowInsertHyperlinks;
    }
    /**
     * Gets the allowInsertRows property value. Represents the worksheet protection option of allowing inserting rows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowInsertRows() {
        return this.allowInsertRows;
    }
    /**
     * Gets the allowPivotTables property value. Represents the worksheet protection option of allowing using pivot table feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowPivotTables() {
        return this.allowPivotTables;
    }
    /**
     * Gets the allowSort property value. Represents the worksheet protection option of allowing using sort feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowSort() {
        return this.allowSort;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("allowAutoFilter", (n) -> { this.setAllowAutoFilter(n.getBooleanValue()); });
        deserializerMap.put("allowDeleteColumns", (n) -> { this.setAllowDeleteColumns(n.getBooleanValue()); });
        deserializerMap.put("allowDeleteRows", (n) -> { this.setAllowDeleteRows(n.getBooleanValue()); });
        deserializerMap.put("allowFormatCells", (n) -> { this.setAllowFormatCells(n.getBooleanValue()); });
        deserializerMap.put("allowFormatColumns", (n) -> { this.setAllowFormatColumns(n.getBooleanValue()); });
        deserializerMap.put("allowFormatRows", (n) -> { this.setAllowFormatRows(n.getBooleanValue()); });
        deserializerMap.put("allowInsertColumns", (n) -> { this.setAllowInsertColumns(n.getBooleanValue()); });
        deserializerMap.put("allowInsertHyperlinks", (n) -> { this.setAllowInsertHyperlinks(n.getBooleanValue()); });
        deserializerMap.put("allowInsertRows", (n) -> { this.setAllowInsertRows(n.getBooleanValue()); });
        deserializerMap.put("allowPivotTables", (n) -> { this.setAllowPivotTables(n.getBooleanValue()); });
        deserializerMap.put("allowSort", (n) -> { this.setAllowSort(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowAutoFilter property value. Represents the worksheet protection option of allowing using auto filter feature.
     * @param value Value to set for the allowAutoFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowAutoFilter(@javax.annotation.Nullable final Boolean value) {
        this.allowAutoFilter = value;
    }
    /**
     * Sets the allowDeleteColumns property value. Represents the worksheet protection option of allowing deleting columns.
     * @param value Value to set for the allowDeleteColumns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowDeleteColumns(@javax.annotation.Nullable final Boolean value) {
        this.allowDeleteColumns = value;
    }
    /**
     * Sets the allowDeleteRows property value. Represents the worksheet protection option of allowing deleting rows.
     * @param value Value to set for the allowDeleteRows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowDeleteRows(@javax.annotation.Nullable final Boolean value) {
        this.allowDeleteRows = value;
    }
    /**
     * Sets the allowFormatCells property value. Represents the worksheet protection option of allowing formatting cells.
     * @param value Value to set for the allowFormatCells property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowFormatCells(@javax.annotation.Nullable final Boolean value) {
        this.allowFormatCells = value;
    }
    /**
     * Sets the allowFormatColumns property value. Represents the worksheet protection option of allowing formatting columns.
     * @param value Value to set for the allowFormatColumns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowFormatColumns(@javax.annotation.Nullable final Boolean value) {
        this.allowFormatColumns = value;
    }
    /**
     * Sets the allowFormatRows property value. Represents the worksheet protection option of allowing formatting rows.
     * @param value Value to set for the allowFormatRows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowFormatRows(@javax.annotation.Nullable final Boolean value) {
        this.allowFormatRows = value;
    }
    /**
     * Sets the allowInsertColumns property value. Represents the worksheet protection option of allowing inserting columns.
     * @param value Value to set for the allowInsertColumns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowInsertColumns(@javax.annotation.Nullable final Boolean value) {
        this.allowInsertColumns = value;
    }
    /**
     * Sets the allowInsertHyperlinks property value. Represents the worksheet protection option of allowing inserting hyperlinks.
     * @param value Value to set for the allowInsertHyperlinks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowInsertHyperlinks(@javax.annotation.Nullable final Boolean value) {
        this.allowInsertHyperlinks = value;
    }
    /**
     * Sets the allowInsertRows property value. Represents the worksheet protection option of allowing inserting rows.
     * @param value Value to set for the allowInsertRows property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowInsertRows(@javax.annotation.Nullable final Boolean value) {
        this.allowInsertRows = value;
    }
    /**
     * Sets the allowPivotTables property value. Represents the worksheet protection option of allowing using pivot table feature.
     * @param value Value to set for the allowPivotTables property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowPivotTables(@javax.annotation.Nullable final Boolean value) {
        this.allowPivotTables = value;
    }
    /**
     * Sets the allowSort property value. Represents the worksheet protection option of allowing using sort feature.
     * @param value Value to set for the allowSort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowSort(@javax.annotation.Nullable final Boolean value) {
        this.allowSort = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
