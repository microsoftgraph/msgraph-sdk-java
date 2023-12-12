package com.microsoft.graph.drives.item.items.item.workbook.functions.binom_dist_range;

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
public class BinomDistRangePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new BinomDistRangePostRequestBody and sets the default values.
     */
    public BinomDistRangePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BinomDistRangePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static BinomDistRangePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BinomDistRangePostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("numberS", (n) -> { this.setNumberS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numberS2", (n) -> { this.setNumberS2(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probabilityS", (n) -> { this.setProbabilityS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("trials", (n) -> { this.setTrials(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the numberS property value. The numberS property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumberS() {
        return this.backingStore.get("numberS");
    }
    /**
     * Gets the numberS2 property value. The numberS2 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumberS2() {
        return this.backingStore.get("numberS2");
    }
    /**
     * Gets the probabilityS property value. The probabilityS property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getProbabilityS() {
        return this.backingStore.get("probabilityS");
    }
    /**
     * Gets the trials property value. The trials property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getTrials() {
        return this.backingStore.get("trials");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("numberS", this.getNumberS());
        writer.writeObjectValue("numberS2", this.getNumberS2());
        writer.writeObjectValue("probabilityS", this.getProbabilityS());
        writer.writeObjectValue("trials", this.getTrials());
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
     * Sets the numberS property value. The numberS property
     * @param value Value to set for the numberS property.
     */
    public void setNumberS(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("numberS", value);
    }
    /**
     * Sets the numberS2 property value. The numberS2 property
     * @param value Value to set for the numberS2 property.
     */
    public void setNumberS2(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("numberS2", value);
    }
    /**
     * Sets the probabilityS property value. The probabilityS property
     * @param value Value to set for the probabilityS property.
     */
    public void setProbabilityS(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("probabilityS", value);
    }
    /**
     * Sets the trials property value. The trials property
     * @param value Value to set for the trials property.
     */
    public void setTrials(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("trials", value);
    }
}
