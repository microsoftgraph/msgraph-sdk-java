package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailNotificationsSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EmailNotificationsSetting} and sets the default values.
     */
    public EmailNotificationsSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmailNotificationsSetting}
     */
    @jakarta.annotation.Nonnull
    public static EmailNotificationsSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailNotificationsSetting();
    }
    /**
     * Gets the additionalEvents property value. The additionalEvents property
     * @return a {@link EnumSet<NotificationEventsType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<NotificationEventsType> getAdditionalEvents() {
        return this.backingStore.get("additionalEvents");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalEvents", (n) -> { this.setAdditionalEvents(n.getEnumSetValue(NotificationEventsType::forValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getObjectValue(NotificationRecipients::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether notifications are enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a {@link NotificationRecipients}
     */
    @jakarta.annotation.Nullable
    public NotificationRecipients getRecipients() {
        return this.backingStore.get("recipients");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("additionalEvents", this.getAdditionalEvents());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("recipients", this.getRecipients());
    }
    /**
     * Sets the additionalEvents property value. The additionalEvents property
     * @param value Value to set for the additionalEvents property.
     */
    public void setAdditionalEvents(@jakarta.annotation.Nullable final EnumSet<NotificationEventsType> value) {
        this.backingStore.set("additionalEvents", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether notifications are enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final NotificationRecipients value) {
        this.backingStore.set("recipients", value);
    }
}
