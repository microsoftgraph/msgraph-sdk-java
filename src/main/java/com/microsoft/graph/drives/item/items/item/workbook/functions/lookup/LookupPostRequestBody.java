package com.microsoft.graph.drives.item.items.item.workbook.functions.lookup;

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
public class LookupPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new LookupPostRequestBody and sets the default values.
     */
    public LookupPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LookupPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static LookupPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LookupPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("lookupValue", (n) -> { this.setLookupValue(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("lookupVector", (n) -> { this.setLookupVector(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("resultVector", (n) -> { this.setResultVector(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lookupValue property value. The lookupValue property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLookupValue() {
        return this.backingStore.get("lookupValue");
    }
    /**
     * Gets the lookupVector property value. The lookupVector property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getLookupVector() {
        return this.backingStore.get("lookupVector");
    }
    /**
     * Gets the resultVector property value. The resultVector property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getResultVector() {
        return this.backingStore.get("resultVector");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("lookupValue", this.getLookupValue());
        writer.writeObjectValue("lookupVector", this.getLookupVector());
        writer.writeObjectValue("resultVector", this.getResultVector());
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
     * Sets the lookupValue property value. The lookupValue property
     * @param value Value to set for the lookupValue property.
     */
    public void setLookupValue(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("lookupValue", value);
    }
    /**
     * Sets the lookupVector property value. The lookupVector property
     * @param value Value to set for the lookupVector property.
     */
    public void setLookupVector(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("lookupVector", value);
    }
    /**
     * Sets the resultVector property value. The resultVector property
     * @param value Value to set for the resultVector property.
     */
    public void setResultVector(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("resultVector", value);
    }
}
