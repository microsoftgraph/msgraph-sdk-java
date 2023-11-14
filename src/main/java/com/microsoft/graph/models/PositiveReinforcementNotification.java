package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PositiveReinforcementNotification extends BaseEndUserNotification implements Parsable {
    /**
     * Delivery preference. Possible values are: unknown, deliverImmedietly, deliverAfterCampaignEnd, unknownFutureValue.
     */
    private NotificationDeliveryPreference deliveryPreference;
    /**
     * Instantiates a new PositiveReinforcementNotification and sets the default values.
     */
    public PositiveReinforcementNotification() {
        super();
        this.setOdataType("#microsoft.graph.positiveReinforcementNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PositiveReinforcementNotification
     */
    @jakarta.annotation.Nonnull
    public static PositiveReinforcementNotification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PositiveReinforcementNotification();
    }
    /**
     * Gets the deliveryPreference property value. Delivery preference. Possible values are: unknown, deliverImmedietly, deliverAfterCampaignEnd, unknownFutureValue.
     * @return a NotificationDeliveryPreference
     */
    @jakarta.annotation.Nullable
    public NotificationDeliveryPreference getDeliveryPreference() {
        return this.deliveryPreference;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deliveryPreference", (n) -> { this.setDeliveryPreference(n.getEnumValue(NotificationDeliveryPreference.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("deliveryPreference", this.getDeliveryPreference());
    }
    /**
     * Sets the deliveryPreference property value. Delivery preference. Possible values are: unknown, deliverImmedietly, deliverAfterCampaignEnd, unknownFutureValue.
     * @param value Value to set for the deliveryPreference property.
     */
    public void setDeliveryPreference(@jakarta.annotation.Nullable final NotificationDeliveryPreference value) {
        this.deliveryPreference = value;
    }
}
