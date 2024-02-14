package com.microsoft.graph.drives.item.items.item.workbook.functions.beta_inv;

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
public class BetaInvPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link BetaInvPostRequestBody} and sets the default values.
     */
    public BetaInvPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BetaInvPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static BetaInvPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BetaInvPostRequestBody();
    }
    /**
     * Gets the A property value. The A property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getA() {
        return this.backingStore.get("a");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the alpha property value. The alpha property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getAlpha() {
        return this.backingStore.get("alpha");
    }
    /**
     * Gets the B property value. The B property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getB() {
        return this.backingStore.get("b");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the beta property value. The beta property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getBeta() {
        return this.backingStore.get("beta");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("A", (n) -> { this.setA(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("alpha", (n) -> { this.setAlpha(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("B", (n) -> { this.setB(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("beta", (n) -> { this.setBeta(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probability", (n) -> { this.setProbability(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the probability property value. The probability property
     * @return a {@link Json}
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
        writer.writeObjectValue("A", this.getA());
        writer.writeObjectValue("alpha", this.getAlpha());
        writer.writeObjectValue("B", this.getB());
        writer.writeObjectValue("beta", this.getBeta());
        writer.writeObjectValue("probability", this.getProbability());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the A property value. The A property
     * @param value Value to set for the A property.
     */
    public void setA(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("a", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the alpha property value. The alpha property
     * @param value Value to set for the alpha property.
     */
    public void setAlpha(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("alpha", value);
    }
    /**
     * Sets the B property value. The B property
     * @param value Value to set for the B property.
     */
    public void setB(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("b", value);
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
     * Sets the beta property value. The beta property
     * @param value Value to set for the beta property.
     */
    public void setBeta(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("beta", value);
    }
    /**
     * Sets the probability property value. The probability property
     * @param value Value to set for the probability property.
     */
    public void setProbability(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("probability", value);
    }
}
