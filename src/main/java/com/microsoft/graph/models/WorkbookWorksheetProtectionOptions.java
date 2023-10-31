package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookWorksheetProtectionOptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new WorkbookWorksheetProtectionOptions and sets the default values.
     */
    public WorkbookWorksheetProtectionOptions() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkbookWorksheetProtectionOptions
     */
    @jakarta.annotation.Nonnull
    public static WorkbookWorksheetProtectionOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookWorksheetProtectionOptions();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the allowAutoFilter property value. Represents the worksheet protection option of allowing using auto filter feature.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAutoFilter() {
        return this.getBackingStore().get("allowAutoFilter");
    }
    /**
     * Gets the allowDeleteColumns property value. Represents the worksheet protection option of allowing deleting columns.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeleteColumns() {
        return this.getBackingStore().get("allowDeleteColumns");
    }
    /**
     * Gets the allowDeleteRows property value. Represents the worksheet protection option of allowing deleting rows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDeleteRows() {
        return this.getBackingStore().get("allowDeleteRows");
    }
    /**
     * Gets the allowFormatCells property value. Represents the worksheet protection option of allowing formatting cells.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowFormatCells() {
        return this.getBackingStore().get("allowFormatCells");
    }
    /**
     * Gets the allowFormatColumns property value. Represents the worksheet protection option of allowing formatting columns.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowFormatColumns() {
        return this.getBackingStore().get("allowFormatColumns");
    }
    /**
     * Gets the allowFormatRows property value. Represents the worksheet protection option of allowing formatting rows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowFormatRows() {
        return this.getBackingStore().get("allowFormatRows");
    }
    /**
     * Gets the allowInsertColumns property value. Represents the worksheet protection option of allowing inserting columns.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowInsertColumns() {
        return this.getBackingStore().get("allowInsertColumns");
    }
    /**
     * Gets the allowInsertHyperlinks property value. Represents the worksheet protection option of allowing inserting hyperlinks.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowInsertHyperlinks() {
        return this.getBackingStore().get("allowInsertHyperlinks");
    }
    /**
     * Gets the allowInsertRows property value. Represents the worksheet protection option of allowing inserting rows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowInsertRows() {
        return this.getBackingStore().get("allowInsertRows");
    }
    /**
     * Gets the allowPivotTables property value. Represents the worksheet protection option of allowing using pivot table feature.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowPivotTables() {
        return this.getBackingStore().get("allowPivotTables");
    }
    /**
     * Gets the allowSort property value. Represents the worksheet protection option of allowing using sort feature.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowSort() {
        return this.getBackingStore().get("allowSort");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the allowAutoFilter property value. Represents the worksheet protection option of allowing using auto filter feature.
     * @param value Value to set for the allowAutoFilter property.
     */
    public void setAllowAutoFilter(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowAutoFilter", value);
    }
    /**
     * Sets the allowDeleteColumns property value. Represents the worksheet protection option of allowing deleting columns.
     * @param value Value to set for the allowDeleteColumns property.
     */
    public void setAllowDeleteColumns(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowDeleteColumns", value);
    }
    /**
     * Sets the allowDeleteRows property value. Represents the worksheet protection option of allowing deleting rows.
     * @param value Value to set for the allowDeleteRows property.
     */
    public void setAllowDeleteRows(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowDeleteRows", value);
    }
    /**
     * Sets the allowFormatCells property value. Represents the worksheet protection option of allowing formatting cells.
     * @param value Value to set for the allowFormatCells property.
     */
    public void setAllowFormatCells(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowFormatCells", value);
    }
    /**
     * Sets the allowFormatColumns property value. Represents the worksheet protection option of allowing formatting columns.
     * @param value Value to set for the allowFormatColumns property.
     */
    public void setAllowFormatColumns(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowFormatColumns", value);
    }
    /**
     * Sets the allowFormatRows property value. Represents the worksheet protection option of allowing formatting rows.
     * @param value Value to set for the allowFormatRows property.
     */
    public void setAllowFormatRows(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowFormatRows", value);
    }
    /**
     * Sets the allowInsertColumns property value. Represents the worksheet protection option of allowing inserting columns.
     * @param value Value to set for the allowInsertColumns property.
     */
    public void setAllowInsertColumns(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowInsertColumns", value);
    }
    /**
     * Sets the allowInsertHyperlinks property value. Represents the worksheet protection option of allowing inserting hyperlinks.
     * @param value Value to set for the allowInsertHyperlinks property.
     */
    public void setAllowInsertHyperlinks(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowInsertHyperlinks", value);
    }
    /**
     * Sets the allowInsertRows property value. Represents the worksheet protection option of allowing inserting rows.
     * @param value Value to set for the allowInsertRows property.
     */
    public void setAllowInsertRows(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowInsertRows", value);
    }
    /**
     * Sets the allowPivotTables property value. Represents the worksheet protection option of allowing using pivot table feature.
     * @param value Value to set for the allowPivotTables property.
     */
    public void setAllowPivotTables(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowPivotTables", value);
    }
    /**
     * Sets the allowSort property value. Represents the worksheet protection option of allowing using sort feature.
     * @param value Value to set for the allowSort property.
     */
    public void setAllowSort(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowSort", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
}
