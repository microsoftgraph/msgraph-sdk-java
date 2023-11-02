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
public class ShiftAvailability implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ShiftAvailability and sets the default values.
     */
    public ShiftAvailability() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ShiftAvailability
     */
    @jakarta.annotation.Nonnull
    public static ShiftAvailability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShiftAvailability();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("timeSlots", (n) -> { this.setTimeSlots(n.getCollectionOfObjectValues(TimeRange::createFromDiscriminatorValue)); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the recurrence property value. Specifies the pattern for recurrence
     * @return a PatternedRecurrence
     */
    @jakarta.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this.getBackingStore().get("recurrence");
    }
    /**
     * Gets the timeSlots property value. The time slot(s) preferred by the user.
     * @return a java.util.List<TimeRange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeRange> getTimeSlots() {
        return this.getBackingStore().get("timeSlots");
    }
    /**
     * Gets the timeZone property value. Specifies the time zone for the indicated time.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.getBackingStore().get("timeZone");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeCollectionOfObjectValues("timeSlots", this.getTimeSlots());
        writer.writeStringValue("timeZone", this.getTimeZone());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the recurrence property value. Specifies the pattern for recurrence
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PatternedRecurrence value) {
        this.getBackingStore().set("recurrence", value);
    }
    /**
     * Sets the timeSlots property value. The time slot(s) preferred by the user.
     * @param value Value to set for the timeSlots property.
     */
    public void setTimeSlots(@jakarta.annotation.Nullable final java.util.List<TimeRange> value) {
        this.getBackingStore().set("timeSlots", value);
    }
    /**
     * Sets the timeZone property value. Specifies the time zone for the indicated time.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("timeZone", value);
    }
}
