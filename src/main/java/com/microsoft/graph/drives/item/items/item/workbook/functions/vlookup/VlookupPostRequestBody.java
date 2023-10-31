package com.microsoft.graph.drives.item.items.item.workbook.functions.vlookup;

import com.microsoft.graph.models.Json;
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
public class VlookupPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new VlookupPostRequestBody and sets the default values.
     */
    public VlookupPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VlookupPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static VlookupPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VlookupPostRequestBody();
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
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the colIndexNum property value. The colIndexNum property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getColIndexNum() {
        return this.getBackingStore().get("colIndexNum");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("colIndexNum", (n) -> { this.setColIndexNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("lookupValue", (n) -> { this.setLookupValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rangeLookup", (n) -> { this.setRangeLookup(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("tableArray", (n) -> { this.setTableArray(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lookupValue property value. The lookupValue property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLookupValue() {
        return this.getBackingStore().get("lookupValue");
    }
    /**
     * Gets the rangeLookup property value. The rangeLookup property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getRangeLookup() {
        return this.getBackingStore().get("rangeLookup");
    }
    /**
     * Gets the tableArray property value. The tableArray property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getTableArray() {
        return this.getBackingStore().get("tableArray");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("colIndexNum", this.getColIndexNum());
        writer.writeObjectValue("lookupValue", this.getLookupValue());
        writer.writeObjectValue("rangeLookup", this.getRangeLookup());
        writer.writeObjectValue("tableArray", this.getTableArray());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the colIndexNum property value. The colIndexNum property
     * @param value Value to set for the colIndexNum property.
     */
    public void setColIndexNum(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("colIndexNum", value);
    }
    /**
     * Sets the lookupValue property value. The lookupValue property
     * @param value Value to set for the lookupValue property.
     */
    public void setLookupValue(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("lookupValue", value);
    }
    /**
     * Sets the rangeLookup property value. The rangeLookup property
     * @param value Value to set for the rangeLookup property.
     */
    public void setRangeLookup(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("rangeLookup", value);
    }
    /**
     * Sets the tableArray property value. The tableArray property
     * @param value Value to set for the tableArray property.
     */
    public void setTableArray(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("tableArray", value);
    }
}
