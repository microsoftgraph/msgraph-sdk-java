package com.microsoft.graph.drives.item.items.item.workbook.functions.intrate;

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
public class IntRatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new IntRatePostRequestBody and sets the default values.
     */
    public IntRatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IntRatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static IntRatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IntRatePostRequestBody();
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
     * Gets the basis property value. The basis property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getBasis() {
        return this.backingStore.get("basis");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("basis", (n) -> { this.setBasis(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("investment", (n) -> { this.setInvestment(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("maturity", (n) -> { this.setMaturity(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("redemption", (n) -> { this.setRedemption(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("settlement", (n) -> { this.setSettlement(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the investment property value. The investment property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getInvestment() {
        return this.backingStore.get("investment");
    }
    /**
     * Gets the maturity property value. The maturity property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getMaturity() {
        return this.backingStore.get("maturity");
    }
    /**
     * Gets the redemption property value. The redemption property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getRedemption() {
        return this.backingStore.get("redemption");
    }
    /**
     * Gets the settlement property value. The settlement property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSettlement() {
        return this.backingStore.get("settlement");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("basis", this.getBasis());
        writer.writeObjectValue("investment", this.getInvestment());
        writer.writeObjectValue("maturity", this.getMaturity());
        writer.writeObjectValue("redemption", this.getRedemption());
        writer.writeObjectValue("settlement", this.getSettlement());
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
     * Sets the investment property value. The investment property
     * @param value Value to set for the investment property.
     */
    public void setInvestment(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("investment", value);
    }
    /**
     * Sets the maturity property value. The maturity property
     * @param value Value to set for the maturity property.
     */
    public void setMaturity(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("maturity", value);
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
}
