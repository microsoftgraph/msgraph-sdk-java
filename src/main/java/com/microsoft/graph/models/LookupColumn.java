package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
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
public class LookupColumn implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new LookupColumn and sets the default values.
     */
    public LookupColumn() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LookupColumn
     */
    @jakarta.annotation.Nonnull
    public static LookupColumn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupColumn();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the allowMultipleValues property value. Indicates whether multiple values can be selected from the source.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowMultipleValues() {
        return this.backingStore.get("allowMultipleValues");
    }
    /**
     * Gets the allowUnlimitedLength property value. Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUnlimitedLength() {
        return this.backingStore.get("allowUnlimitedLength");
    }
    /**
     * Gets the columnName property value. The name of the lookup source column.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getColumnName() {
        return this.backingStore.get("columnName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowMultipleValues", (n) -> { this.setAllowMultipleValues(n.getBooleanValue()); });
        deserializerMap.put("allowUnlimitedLength", (n) -> { this.setAllowUnlimitedLength(n.getBooleanValue()); });
        deserializerMap.put("columnName", (n) -> { this.setColumnName(n.getStringValue()); });
        deserializerMap.put("listId", (n) -> { this.setListId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryLookupColumnId", (n) -> { this.setPrimaryLookupColumnId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listId property value. The unique identifier of the lookup source list.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getListId() {
        return this.backingStore.get("listId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the primaryLookupColumnId property value. If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the primary lookup. Use the list item looked up by the primary as the source for the column named here.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryLookupColumnId() {
        return this.backingStore.get("primaryLookupColumnId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowMultipleValues", this.getAllowMultipleValues());
        writer.writeBooleanValue("allowUnlimitedLength", this.getAllowUnlimitedLength());
        writer.writeStringValue("columnName", this.getColumnName());
        writer.writeStringValue("listId", this.getListId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("primaryLookupColumnId", this.getPrimaryLookupColumnId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the allowMultipleValues property value. Indicates whether multiple values can be selected from the source.
     * @param value Value to set for the allowMultipleValues property.
     */
    public void setAllowMultipleValues(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowMultipleValues", value);
    }
    /**
     * Sets the allowUnlimitedLength property value. Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
     * @param value Value to set for the allowUnlimitedLength property.
     */
    public void setAllowUnlimitedLength(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUnlimitedLength", value);
    }
    /**
     * Sets the columnName property value. The name of the lookup source column.
     * @param value Value to set for the columnName property.
     */
    public void setColumnName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("columnName", value);
    }
    /**
     * Sets the listId property value. The unique identifier of the lookup source list.
     * @param value Value to set for the listId property.
     */
    public void setListId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("listId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the primaryLookupColumnId property value. If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the primary lookup. Use the list item looked up by the primary as the source for the column named here.
     * @param value Value to set for the primaryLookupColumnId property.
     */
    public void setPrimaryLookupColumnId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryLookupColumnId", value);
    }
}
