package com.microsoft.graph.models;

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
public class CallRoute implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new CallRoute and sets the default values.
     */
    public CallRoute() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallRoute
     */
    @jakarta.annotation.Nonnull
    public static CallRoute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallRoute();
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
        deserializerMap.put("final", (n) -> { this.setFinal(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("original", (n) -> { this.setOriginal(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("routingType", (n) -> { this.setRoutingType(n.getEnumValue(RoutingType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the final property value. The final property
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getFinal() {
        return this.backingStore.get("final");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the original property value. The original property
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getOriginal() {
        return this.backingStore.get("original");
    }
    /**
     * Gets the routingType property value. The routingType property
     * @return a RoutingType
     */
    @jakarta.annotation.Nullable
    public RoutingType getRoutingType() {
        return this.backingStore.get("routingType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("final", this.getFinal());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("original", this.getOriginal());
        writer.writeEnumValue("routingType", this.getRoutingType());
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
     * Sets the final property value. The final property
     * @param value Value to set for the final property.
     */
    public void setFinal(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("final", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the original property value. The original property
     * @param value Value to set for the original property.
     */
    public void setOriginal(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("original", value);
    }
    /**
     * Sets the routingType property value. The routingType property
     * @param value Value to set for the routingType property.
     */
    public void setRoutingType(@jakarta.annotation.Nullable final RoutingType value) {
        this.backingStore.set("routingType", value);
    }
}
