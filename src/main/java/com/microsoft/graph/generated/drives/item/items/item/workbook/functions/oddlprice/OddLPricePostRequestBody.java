package com.microsoft.graph.drives.item.items.item.workbook.functions.oddlprice;

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
public class OddLPricePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OddLPricePostRequestBody} and sets the default values.
     */
    public OddLPricePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OddLPricePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static OddLPricePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OddLPricePostRequestBody();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the basis property value. The basis property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getBasis() {
        return this.backingStore.get("basis");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("frequency", (n) -> { this.setFrequency(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("lastInterest", (n) -> { this.setLastInterest(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("maturity", (n) -> { this.setMaturity(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("redemption", (n) -> { this.setRedemption(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("yld", (n) -> { this.setYld(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the frequency property value. The frequency property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getFrequency() {
        return this.backingStore.get("frequency");
    }
    /**
     * Gets the lastInterest property value. The lastInterest property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getLastInterest() {
        return this.backingStore.get("lastInterest");
    }
    /**
     * Gets the maturity property value. The maturity property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getMaturity() {
        return this.backingStore.get("maturity");
    }
    /**
     * Gets the rate property value. The rate property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getRate() {
        return this.backingStore.get("rate");
    }
    /**
     * Gets the redemption property value. The redemption property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getRedemption() {
        return this.backingStore.get("redemption");
    }
    /**
     * Gets the settlement property value. The settlement property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getSettlement() {
        return this.backingStore.get("settlement");
    }
    /**
     * Gets the yld property value. The yld property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getYld() {
        return this.backingStore.get("yld");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("frequency", this.getFrequency());
        writer.writeObjectValue("lastInterest", this.getLastInterest());
        writer.writeObjectValue("maturity", this.getMaturity());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("redemption", this.getRedemption());
        writer.writeObjectValue("settlement", this.getSettlement());
        writer.writeObjectValue("yld", this.getYld());
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
     * Sets the basis property value. The basis property
     * @param value Value to set for the basis property.
     */
    public void setBasis(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("basis", value);
    }
    /**
     * Sets the frequency property value. The frequency property
     * @param value Value to set for the frequency property.
     */
    public void setFrequency(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("frequency", value);
    }
    /**
     * Sets the lastInterest property value. The lastInterest property
     * @param value Value to set for the lastInterest property.
     */
    public void setLastInterest(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("lastInterest", value);
    }
    /**
     * Sets the maturity property value. The maturity property
     * @param value Value to set for the maturity property.
     */
    public void setMaturity(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("maturity", value);
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("rate", value);
    }
    /**
     * Sets the redemption property value. The redemption property
     * @param value Value to set for the redemption property.
     */
    public void setRedemption(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("redemption", value);
    }
    /**
     * Sets the settlement property value. The settlement property
     * @param value Value to set for the settlement property.
     */
    public void setSettlement(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("settlement", value);
    }
    /**
     * Sets the yld property value. The yld property
     * @param value Value to set for the yld property.
     */
    public void setYld(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("yld", value);
    }
}
