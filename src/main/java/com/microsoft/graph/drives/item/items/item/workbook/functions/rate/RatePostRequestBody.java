package com.microsoft.graph.drives.item.items.item.workbook.functions.rate;

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
public class RatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new RatePostRequestBody and sets the default values.
     */
    public RatePostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static RatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RatePostRequestBody();
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
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("fv", (n) -> { this.setFv(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("guess", (n) -> { this.setGuess(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("nper", (n) -> { this.setNper(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("pmt", (n) -> { this.setPmt(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("pv", (n) -> { this.setPv(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fv property value. The fv property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFv() {
        return this.getBackingStore().get("fv");
    }
    /**
     * Gets the guess property value. The guess property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getGuess() {
        return this.getBackingStore().get("guess");
    }
    /**
     * Gets the nper property value. The nper property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getNper() {
        return this.getBackingStore().get("nper");
    }
    /**
     * Gets the pmt property value. The pmt property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getPmt() {
        return this.getBackingStore().get("pmt");
    }
    /**
     * Gets the pv property value. The pv property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getPv() {
        return this.getBackingStore().get("pv");
    }
    /**
     * Gets the type property value. The type property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getType() {
        return this.getBackingStore().get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fv", this.getFv());
        writer.writeObjectValue("guess", this.getGuess());
        writer.writeObjectValue("nper", this.getNper());
        writer.writeObjectValue("pmt", this.getPmt());
        writer.writeObjectValue("pv", this.getPv());
        writer.writeObjectValue("type", this.getType());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the fv property value. The fv property
     * @param value Value to set for the fv property.
     */
    public void setFv(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("fv", value);
    }
    /**
     * Sets the guess property value. The guess property
     * @param value Value to set for the guess property.
     */
    public void setGuess(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("guess", value);
    }
    /**
     * Sets the nper property value. The nper property
     * @param value Value to set for the nper property.
     */
    public void setNper(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("nper", value);
    }
    /**
     * Sets the pmt property value. The pmt property
     * @param value Value to set for the pmt property.
     */
    public void setPmt(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("pmt", value);
    }
    /**
     * Sets the pv property value. The pv property
     * @param value Value to set for the pv property.
     */
    public void setPv(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("pv", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final Json value) {
        this.getBackingStore().set("type", value);
    }
}
