package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimelineEvent implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TimelineEvent} and sets the default values.
     */
    public TimelineEvent() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TimelineEvent}
     */
    @jakarta.annotation.Nonnull
    public static TimelineEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimelineEvent();
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
     * Gets the eventDateTime property value. The date and time when the event occurred.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * Gets the eventDetails property value. Additional details or context about the event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventDetails() {
        return this.backingStore.get("eventDetails");
    }
    /**
     * Gets the eventResult property value. The outcome or result of the event, such as delivery location or action taken.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventResult() {
        return this.backingStore.get("eventResult");
    }
    /**
     * Gets the eventSource property value. The origin or actor that triggered the event. The possible values are: system, admin, user, unknownFutureValue.
     * @return a {@link EventSource}
     */
    @jakarta.annotation.Nullable
    public EventSource getEventSource() {
        return this.backingStore.get("eventSource");
    }
    /**
     * Gets the eventThreats property value. Collection of threats identified or associated with this event.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEventThreats() {
        return this.backingStore.get("eventThreats");
    }
    /**
     * Gets the eventType property value. The type of event that occurred. The possible values are: originalDelivery, systemTimeTravel, dynamicDelivery, userUrlClick, reprocessed, zap, quarantineRelease, air, unknown, unknownFutureValue.
     * @return a {@link TimelineEventType}
     */
    @jakarta.annotation.Nullable
    public TimelineEventType getEventType() {
        return this.backingStore.get("eventType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("eventDetails", (n) -> { this.setEventDetails(n.getStringValue()); });
        deserializerMap.put("eventResult", (n) -> { this.setEventResult(n.getStringValue()); });
        deserializerMap.put("eventSource", (n) -> { this.setEventSource(n.getEnumValue(EventSource::forValue)); });
        deserializerMap.put("eventThreats", (n) -> { this.setEventThreats(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getEnumValue(TimelineEventType::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("eventDetails", this.getEventDetails());
        writer.writeStringValue("eventResult", this.getEventResult());
        writer.writeEnumValue("eventSource", this.getEventSource());
        writer.writeCollectionOfPrimitiveValues("eventThreats", this.getEventThreats());
        writer.writeEnumValue("eventType", this.getEventType());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the eventDateTime property value. The date and time when the event occurred.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the eventDetails property value. Additional details or context about the event.
     * @param value Value to set for the eventDetails property.
     */
    public void setEventDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventDetails", value);
    }
    /**
     * Sets the eventResult property value. The outcome or result of the event, such as delivery location or action taken.
     * @param value Value to set for the eventResult property.
     */
    public void setEventResult(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("eventResult", value);
    }
    /**
     * Sets the eventSource property value. The origin or actor that triggered the event. The possible values are: system, admin, user, unknownFutureValue.
     * @param value Value to set for the eventSource property.
     */
    public void setEventSource(@jakarta.annotation.Nullable final EventSource value) {
        this.backingStore.set("eventSource", value);
    }
    /**
     * Sets the eventThreats property value. Collection of threats identified or associated with this event.
     * @param value Value to set for the eventThreats property.
     */
    public void setEventThreats(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("eventThreats", value);
    }
    /**
     * Sets the eventType property value. The type of event that occurred. The possible values are: originalDelivery, systemTimeTravel, dynamicDelivery, userUrlClick, reprocessed, zap, quarantineRelease, air, unknown, unknownFutureValue.
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final TimelineEventType value) {
        this.backingStore.set("eventType", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
