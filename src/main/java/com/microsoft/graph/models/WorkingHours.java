package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkingHours implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new WorkingHours and sets the default values.
     */
    public WorkingHours() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WorkingHours
     */
    @jakarta.annotation.Nonnull
    public static WorkingHours createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkingHours();
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
     * Gets the daysOfWeek property value. The days of the week on which the user works.
     * @return a java.util.List<DayOfWeek>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DayOfWeek> getDaysOfWeek() {
        return this.backingStore.get("daysOfWeek");
    }
    /**
     * Gets the endTime property value. The time of the day that the user stops working.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getEndTime() {
        return this.backingStore.get("endTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("daysOfWeek", (n) -> { this.setDaysOfWeek(n.getCollectionOfEnumValues(DayOfWeek.class)); });
        deserializerMap.put("endTime", (n) -> { this.setEndTime(n.getLocalTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startTime", (n) -> { this.setStartTime(n.getLocalTimeValue()); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getObjectValue(TimeZoneBase::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the startTime property value. The time of the day that the user starts working.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getStartTime() {
        return this.backingStore.get("startTime");
    }
    /**
     * Gets the timeZone property value. The time zone to which the working hours apply.
     * @return a TimeZoneBase
     */
    @jakarta.annotation.Nullable
    public TimeZoneBase getTimeZone() {
        return this.backingStore.get("timeZone");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("daysOfWeek", this.getDaysOfWeek());
        writer.writeLocalTimeValue("endTime", this.getEndTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalTimeValue("startTime", this.getStartTime());
        writer.writeObjectValue("timeZone", this.getTimeZone());
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
     * Sets the daysOfWeek property value. The days of the week on which the user works.
     * @param value Value to set for the daysOfWeek property.
     */
    public void setDaysOfWeek(@jakarta.annotation.Nullable final java.util.List<DayOfWeek> value) {
        this.backingStore.set("daysOfWeek", value);
    }
    /**
     * Sets the endTime property value. The time of the day that the user stops working.
     * @param value Value to set for the endTime property.
     */
    public void setEndTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("endTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the startTime property value. The time of the day that the user starts working.
     * @param value Value to set for the startTime property.
     */
    public void setStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("startTime", value);
    }
    /**
     * Sets the timeZone property value. The time zone to which the working hours apply.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final TimeZoneBase value) {
        this.backingStore.set("timeZone", value);
    }
}
