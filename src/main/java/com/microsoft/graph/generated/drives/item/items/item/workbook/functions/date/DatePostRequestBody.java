package com.microsoft.graph.drives.item.items.item.workbook.functions.date;

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
public class DatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DatePostRequestBody and sets the default values.
     */
    public DatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DatePostRequestBody();
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
     * Gets the day property value. The day property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getDay() {
        return this.backingStore.get("day");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("day", (n) -> { this.setDay(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("month", (n) -> { this.setMonth(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("year", (n) -> { this.setYear(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the month property value. The month property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getMonth() {
        return this.backingStore.get("month");
    }
    /**
     * Gets the year property value. The year property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getYear() {
        return this.backingStore.get("year");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("day", this.getDay());
        writer.writeObjectValue("month", this.getMonth());
        writer.writeObjectValue("year", this.getYear());
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
     * Sets the day property value. The day property
     * @param value Value to set for the day property.
     */
    public void setDay(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("day", value);
    }
    /**
     * Sets the month property value. The month property
     * @param value Value to set for the month property.
     */
    public void setMonth(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("month", value);
    }
    /**
     * Sets the year property value. The year property
     * @param value Value to set for the year property.
     */
    public void setYear(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("year", value);
    }
}
