package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementPolicyNotificationRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRoleManagementPolicyNotificationRule} and sets the default values.
     */
    public UnifiedRoleManagementPolicyNotificationRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyNotificationRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoleManagementPolicyNotificationRule}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementPolicyNotificationRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyNotificationRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isDefaultRecipientsEnabled", (n) -> { this.setIsDefaultRecipientsEnabled(n.getBooleanValue()); });
        deserializerMap.put("notificationLevel", (n) -> { this.setNotificationLevel(n.getStringValue()); });
        deserializerMap.put("notificationRecipients", (n) -> { this.setNotificationRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notificationType", (n) -> { this.setNotificationType(n.getStringValue()); });
        deserializerMap.put("recipientType", (n) -> { this.setRecipientType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultRecipientsEnabled property value. Indicates whether a default recipient will receive the notification email.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefaultRecipientsEnabled() {
        return this.backingStore.get("isDefaultRecipientsEnabled");
    }
    /**
     * Gets the notificationLevel property value. The level of notification. The possible values are None, Critical, All.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotificationLevel() {
        return this.backingStore.get("notificationLevel");
    }
    /**
     * Gets the notificationRecipients property value. The list of recipients of the email notifications.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotificationRecipients() {
        return this.backingStore.get("notificationRecipients");
    }
    /**
     * Gets the notificationType property value. The type of notification. Only Email is supported.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotificationType() {
        return this.backingStore.get("notificationType");
    }
    /**
     * Gets the recipientType property value. The type of recipient of the notification. The possible values are Requestor, Approver, Admin.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientType() {
        return this.backingStore.get("recipientType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isDefaultRecipientsEnabled", this.getIsDefaultRecipientsEnabled());
        writer.writeStringValue("notificationLevel", this.getNotificationLevel());
        writer.writeCollectionOfPrimitiveValues("notificationRecipients", this.getNotificationRecipients());
        writer.writeStringValue("notificationType", this.getNotificationType());
        writer.writeStringValue("recipientType", this.getRecipientType());
    }
    /**
     * Sets the isDefaultRecipientsEnabled property value. Indicates whether a default recipient will receive the notification email.
     * @param value Value to set for the isDefaultRecipientsEnabled property.
     */
    public void setIsDefaultRecipientsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefaultRecipientsEnabled", value);
    }
    /**
     * Sets the notificationLevel property value. The level of notification. The possible values are None, Critical, All.
     * @param value Value to set for the notificationLevel property.
     */
    public void setNotificationLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationLevel", value);
    }
    /**
     * Sets the notificationRecipients property value. The list of recipients of the email notifications.
     * @param value Value to set for the notificationRecipients property.
     */
    public void setNotificationRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("notificationRecipients", value);
    }
    /**
     * Sets the notificationType property value. The type of notification. Only Email is supported.
     * @param value Value to set for the notificationType property.
     */
    public void setNotificationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notificationType", value);
    }
    /**
     * Sets the recipientType property value. The type of recipient of the notification. The possible values are Requestor, Approver, Admin.
     * @param value Value to set for the recipientType property.
     */
    public void setRecipientType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recipientType", value);
    }
}
