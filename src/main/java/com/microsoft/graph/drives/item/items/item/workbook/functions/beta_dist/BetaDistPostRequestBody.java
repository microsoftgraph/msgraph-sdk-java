package com.microsoft.graph.drives.item.items.item.workbook.functions.beta_dist;

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
public class BetaDistPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new BetaDistPostRequestBody and sets the default values.
     */
    public BetaDistPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BetaDistPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static BetaDistPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BetaDistPostRequestBody();
    }
    /**
     * Gets the A property value. The A property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getA() {
        return this.getBackingStore().get("a");
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
     * Gets the alpha property value. The alpha property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getAlpha() {
        return this.getBackingStore().get("alpha");
    }
    /**
     * Gets the B property value. The B property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getB() {
        return this.getBackingStore().get("b");
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
     * Gets the beta property value. The beta property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getBeta() {
        return this.getBackingStore().get("beta");
    }
    /**
     * Gets the cumulative property value. The cumulative property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCumulative() {
        return this.getBackingStore().get("cumulative");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("A", (n) -> { this.setA(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("alpha", (n) -> { this.setAlpha(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("B", (n) -> { this.setB(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("beta", (n) -> { this.setBeta(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("cumulative", (n) -> { this.setCumulative(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("x", (n) -> { this.setX(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the x property value. The x property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getX() {
        return this.getBackingStore().get("x");
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
        writer.writeObjectValue("cumulative", this.getCumulative());
        writer.writeObjectValue("x", this.getX());
    }
    /**
     * Sets the A property value. The A property
     * @param value Value to set for the A property.
     */
    public void setA(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("a", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the alpha property value. The alpha property
     * @param value Value to set for the alpha property.
     */
    public void setAlpha(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("alpha", value);
    }
    /**
     * Sets the B property value. The B property
     * @param value Value to set for the B property.
     */
    public void setB(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("b", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the beta property value. The beta property
     * @param value Value to set for the beta property.
     */
    public void setBeta(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("beta", value);
    }
    /**
     * Sets the cumulative property value. The cumulative property
     * @param value Value to set for the cumulative property.
     */
    public void setCumulative(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("cumulative", value);
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     */
    public void setX(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("x", value);
    }
}
