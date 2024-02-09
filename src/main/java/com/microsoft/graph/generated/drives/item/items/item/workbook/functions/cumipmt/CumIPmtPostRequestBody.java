package com.microsoft.graph.drives.item.items.item.workbook.functions.cumipmt;

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
public class CumIPmtPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CumIPmtPostRequestBody} and sets the default values.
     */
    public CumIPmtPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CumIPmtPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static CumIPmtPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CumIPmtPostRequestBody();
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
     * Gets the endPeriod property value. The endPeriod property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getEndPeriod() {
        return this.backingStore.get("endPeriod");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("endPeriod", (n) -> { this.setEndPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("nper", (n) -> { this.setNper(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("pv", (n) -> { this.setPv(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startPeriod", (n) -> { this.setStartPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the nper property value. The nper property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getNper() {
        return this.backingStore.get("nper");
    }
    /**
     * Gets the pv property value. The pv property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getPv() {
        return this.backingStore.get("pv");
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
     * Gets the startPeriod property value. The startPeriod property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getStartPeriod() {
        return this.backingStore.get("startPeriod");
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endPeriod", this.getEndPeriod());
        writer.writeObjectValue("nper", this.getNper());
        writer.writeObjectValue("pv", this.getPv());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("startPeriod", this.getStartPeriod());
        writer.writeObjectValue("type", this.getType());
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
     * Sets the endPeriod property value. The endPeriod property
     * @param value Value to set for the endPeriod property.
     */
    public void setEndPeriod(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("endPeriod", value);
    }
    /**
     * Sets the nper property value. The nper property
     * @param value Value to set for the nper property.
     */
    public void setNper(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("nper", value);
    }
    /**
     * Sets the pv property value. The pv property
     * @param value Value to set for the pv property.
     */
    public void setPv(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("pv", value);
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("rate", value);
    }
    /**
     * Sets the startPeriod property value. The startPeriod property
     * @param value Value to set for the startPeriod property.
     */
    public void setStartPeriod(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("startPeriod", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("type", value);
    }
}
