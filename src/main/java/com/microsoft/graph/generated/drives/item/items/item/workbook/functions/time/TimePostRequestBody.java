package com.microsoft.graph.drives.item.items.item.workbook.functions.time;

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
public class TimePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TimePostRequestBody} and sets the default values.
     */
    public TimePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TimePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static TimePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimePostRequestBody();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("hour", (n) -> { this.setHour(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("minute", (n) -> { this.setMinute(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("second", (n) -> { this.setSecond(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hour property value. The hour property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getHour() {
        return this.backingStore.get("hour");
    }
    /**
     * Gets the minute property value. The minute property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getMinute() {
        return this.backingStore.get("minute");
    }
    /**
     * Gets the second property value. The second property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getSecond() {
        return this.backingStore.get("second");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("hour", this.getHour());
        writer.writeObjectValue("minute", this.getMinute());
        writer.writeObjectValue("second", this.getSecond());
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
     * Sets the hour property value. The hour property
     * @param value Value to set for the hour property.
     */
    public void setHour(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("hour", value);
    }
    /**
     * Sets the minute property value. The minute property
     * @param value Value to set for the minute property.
     */
    public void setMinute(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("minute", value);
    }
    /**
     * Sets the second property value. The second property
     * @param value Value to set for the second property.
     */
    public void setSecond(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("second", value);
    }
}
