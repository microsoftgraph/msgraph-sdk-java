package com.microsoft.graph.communications.onlinemeetings.item.sendvirtualappointmentsms;

import com.microsoft.graph.models.AttendeeNotificationInfo;
import com.microsoft.graph.models.VirtualAppointmentMessageType;
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
public class SendVirtualAppointmentSmsPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SendVirtualAppointmentSmsPostRequestBody} and sets the default values.
     */
    public SendVirtualAppointmentSmsPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendVirtualAppointmentSmsPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static SendVirtualAppointmentSmsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendVirtualAppointmentSmsPostRequestBody();
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
     * Gets the attendees property value. The attendees property
     * @return a {@link java.util.List<AttendeeNotificationInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttendeeNotificationInfo> getAttendees() {
        return this.backingStore.get("attendees");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("attendees", (n) -> { this.setAttendees(n.getCollectionOfObjectValues(AttendeeNotificationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("messageType", (n) -> { this.setMessageType(n.getEnumValue(VirtualAppointmentMessageType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the messageType property value. The messageType property
     * @return a {@link VirtualAppointmentMessageType}
     */
    @jakarta.annotation.Nullable
    public VirtualAppointmentMessageType getMessageType() {
        return this.backingStore.get("messageType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("attendees", this.getAttendees());
        writer.writeEnumValue("messageType", this.getMessageType());
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
     * Sets the attendees property value. The attendees property
     * @param value Value to set for the attendees property.
     */
    public void setAttendees(@jakarta.annotation.Nullable final java.util.List<AttendeeNotificationInfo> value) {
        this.backingStore.set("attendees", value);
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
     * Sets the messageType property value. The messageType property
     * @param value Value to set for the messageType property.
     */
    public void setMessageType(@jakarta.annotation.Nullable final VirtualAppointmentMessageType value) {
        this.backingStore.set("messageType", value);
    }
}
