package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrainingReminderNotification extends BaseEndUserNotification implements Parsable {
    /**
     * The deliveryFrequency property
     */
    private NotificationDeliveryFrequency deliveryFrequency;
    /**
     * Instantiates a new TrainingReminderNotification and sets the default values.
     */
    public TrainingReminderNotification() {
        super();
        this.setOdataType("#microsoft.graph.trainingReminderNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TrainingReminderNotification
     */
    @jakarta.annotation.Nonnull
    public static TrainingReminderNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrainingReminderNotification();
    }
    /**
     * Gets the deliveryFrequency property value. The deliveryFrequency property
     * @return a NotificationDeliveryFrequency
     */
    @jakarta.annotation.Nullable
    public NotificationDeliveryFrequency getDeliveryFrequency() {
        return this.deliveryFrequency;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deliveryFrequency", (n) -> { this.setDeliveryFrequency(n.getEnumValue(NotificationDeliveryFrequency.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("deliveryFrequency", this.getDeliveryFrequency());
    }
    /**
     * Sets the deliveryFrequency property value. The deliveryFrequency property
     * @param value Value to set for the deliveryFrequency property.
     */
    public void setDeliveryFrequency(@jakarta.annotation.Nullable final NotificationDeliveryFrequency value) {
        this.deliveryFrequency = value;
    }
}
