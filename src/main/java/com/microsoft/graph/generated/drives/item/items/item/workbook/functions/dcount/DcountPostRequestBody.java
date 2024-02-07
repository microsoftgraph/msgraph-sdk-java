package com.microsoft.graph.drives.item.items.item.workbook.functions.dcount;

import com.microsoft.graph.models.Json;
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
public class DcountPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DcountPostRequestBody and sets the default values.
     */
    public DcountPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DcountPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DcountPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DcountPostRequestBody();
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the criteria property value. The criteria property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCriteria() {
        return this.backingStore.get("criteria");
    }
    /**
     * Gets the database property value. The database property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDatabase() {
        return this.backingStore.get("database");
    }
    /**
     * Gets the field property value. The field property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getField() {
        return this.backingStore.get("field");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("criteria", (n) -> { this.setCriteria(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("database", (n) -> { this.setDatabase(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("field", (n) -> { this.setField(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("criteria", this.getCriteria());
        writer.writeObjectValue("database", this.getDatabase());
        writer.writeObjectValue("field", this.getField());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the criteria property value. The criteria property
     * @param value Value to set for the criteria property.
     */
    public void setCriteria(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("criteria", value);
    }
    /**
     * Sets the database property value. The database property
     * @param value Value to set for the database property.
     */
    public void setDatabase(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("database", value);
    }
    /**
     * Sets the field property value. The field property
     * @param value Value to set for the field property.
     */
    public void setField(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("field", value);
    }
}
