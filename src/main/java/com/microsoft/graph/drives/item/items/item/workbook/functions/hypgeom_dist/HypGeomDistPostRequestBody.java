package com.microsoft.graph.drives.item.items.item.workbook.functions.hypgeom_dist;

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
public class HypGeomDistPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new HypGeomDistPostRequestBody and sets the default values.
     */
    public HypGeomDistPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HypGeomDistPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static HypGeomDistPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HypGeomDistPostRequestBody();
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
     * Gets the cumulative property value. The cumulative property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCumulative() {
        return this.backingStore.get("cumulative");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("cumulative", (n) -> { this.setCumulative(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numberPop", (n) -> { this.setNumberPop(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numberSample", (n) -> { this.setNumberSample(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("populationS", (n) -> { this.setPopulationS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("sampleS", (n) -> { this.setSampleS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the numberPop property value. The numberPop property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumberPop() {
        return this.backingStore.get("numberPop");
    }
    /**
     * Gets the numberSample property value. The numberSample property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNumberSample() {
        return this.backingStore.get("numberSample");
    }
    /**
     * Gets the populationS property value. The populationS property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getPopulationS() {
        return this.backingStore.get("populationS");
    }
    /**
     * Gets the sampleS property value. The sampleS property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSampleS() {
        return this.backingStore.get("sampleS");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cumulative", this.getCumulative());
        writer.writeObjectValue("numberPop", this.getNumberPop());
        writer.writeObjectValue("numberSample", this.getNumberSample());
        writer.writeObjectValue("populationS", this.getPopulationS());
        writer.writeObjectValue("sampleS", this.getSampleS());
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
     * Sets the cumulative property value. The cumulative property
     * @param value Value to set for the cumulative property.
     */
    public void setCumulative(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("cumulative", value);
    }
    /**
     * Sets the numberPop property value. The numberPop property
     * @param value Value to set for the numberPop property.
     */
    public void setNumberPop(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("numberPop", value);
    }
    /**
     * Sets the numberSample property value. The numberSample property
     * @param value Value to set for the numberSample property.
     */
    public void setNumberSample(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("numberSample", value);
    }
    /**
     * Sets the populationS property value. The populationS property
     * @param value Value to set for the populationS property.
     */
    public void setPopulationS(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("populationS", value);
    }
    /**
     * Sets the sampleS property value. The sampleS property
     * @param value Value to set for the sampleS property.
     */
    public void setSampleS(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("sampleS", value);
    }
}
