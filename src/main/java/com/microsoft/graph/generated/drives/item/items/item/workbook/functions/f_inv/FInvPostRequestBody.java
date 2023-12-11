package com.microsoft.graph.drives.item.items.item.workbook.functions.f_inv;

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
public class FInvPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new FInvPostRequestBody and sets the default values.
     */
    public FInvPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FInvPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static FInvPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FInvPostRequestBody();
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
     * Gets the degFreedom1 property value. The degFreedom1 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDegFreedom1() {
        return this.backingStore.get("degFreedom1");
    }
    /**
     * Gets the degFreedom2 property value. The degFreedom2 property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDegFreedom2() {
        return this.backingStore.get("degFreedom2");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("degFreedom1", (n) -> { this.setDegFreedom1(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("degFreedom2", (n) -> { this.setDegFreedom2(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probability", (n) -> { this.setProbability(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the probability property value. The probability property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getProbability() {
        return this.backingStore.get("probability");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("degFreedom1", this.getDegFreedom1());
        writer.writeObjectValue("degFreedom2", this.getDegFreedom2());
        writer.writeObjectValue("probability", this.getProbability());
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
     * Sets the degFreedom1 property value. The degFreedom1 property
     * @param value Value to set for the degFreedom1 property.
     */
    public void setDegFreedom1(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("degFreedom1", value);
    }
    /**
     * Sets the degFreedom2 property value. The degFreedom2 property
     * @param value Value to set for the degFreedom2 property.
     */
    public void setDegFreedom2(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("degFreedom2", value);
    }
    /**
     * Sets the probability property value. The probability property
     * @param value Value to set for the probability property.
     */
    public void setProbability(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("probability", value);
    }
}
