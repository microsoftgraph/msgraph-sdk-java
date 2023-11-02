package com.microsoft.graph.groups.item.calendar.getschedule;

import com.microsoft.graph.models.DateTimeTimeZone;
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
public class GetSchedulePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new GetSchedulePostRequestBody and sets the default values.
     */
    public GetSchedulePostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GetSchedulePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetSchedulePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetSchedulePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the AvailabilityViewInterval property value. The AvailabilityViewInterval property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAvailabilityViewInterval() {
        return this.getBackingStore().get("availabilityViewInterval");
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
     * Gets the EndTime property value. The EndTime property
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getEndTime() {
        return this.getBackingStore().get("endTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("AvailabilityViewInterval", (n) -> { this.setAvailabilityViewInterval(n.getIntegerValue()); });
        deserializerMap.put("EndTime", (n) -> { this.setEndTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("Schedules", (n) -> { this.setSchedules(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("StartTime", (n) -> { this.setStartTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the Schedules property value. The Schedules property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSchedules() {
        return this.getBackingStore().get("schedules");
    }
    /**
     * Gets the StartTime property value. The StartTime property
     * @return a DateTimeTimeZone
     */
    @jakarta.annotation.Nullable
    public DateTimeTimeZone getStartTime() {
        return this.getBackingStore().get("startTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("AvailabilityViewInterval", this.getAvailabilityViewInterval());
        writer.writeObjectValue("EndTime", this.getEndTime());
        writer.writeCollectionOfPrimitiveValues("Schedules", this.getSchedules());
        writer.writeObjectValue("StartTime", this.getStartTime());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the AvailabilityViewInterval property value. The AvailabilityViewInterval property
     * @param value Value to set for the AvailabilityViewInterval property.
     */
    public void setAvailabilityViewInterval(@jakarta.annotation.Nullable final Integer value) {
        this.getBackingStore().set("availabilityViewInterval", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the EndTime property value. The EndTime property
     * @param value Value to set for the EndTime property.
     */
    public void setEndTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.getBackingStore().set("endTime", value);
    }
    /**
     * Sets the Schedules property value. The Schedules property
     * @param value Value to set for the Schedules property.
     */
    public void setSchedules(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("schedules", value);
    }
    /**
     * Sets the StartTime property value. The StartTime property
     * @param value Value to set for the StartTime property.
     */
    public void setStartTime(@jakarta.annotation.Nullable final DateTimeTimeZone value) {
        this.getBackingStore().set("startTime", value);
    }
}
