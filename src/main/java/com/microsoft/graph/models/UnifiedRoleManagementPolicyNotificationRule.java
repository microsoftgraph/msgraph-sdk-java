package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyNotificationRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /** Indicates whether a default recipient will receive the notification email. */
    private Boolean _isDefaultRecipientsEnabled;
    /** The level of notification. The possible values are None, Critical, All. */
    private String _notificationLevel;
    /** The list of recipients of the email notifications. */
    private java.util.List<String> _notificationRecipients;
    /** The type of notification. Only Email is supported. */
    private String _notificationType;
    /** The type of recipient of the notification. The possible values are Requestor, Approver, Admin. */
    private String _recipientType;
    /**
     * Instantiates a new UnifiedRoleManagementPolicyNotificationRule and sets the default values.
     * @return a void
     */
    public UnifiedRoleManagementPolicyNotificationRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyNotificationRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementPolicyNotificationRule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyNotificationRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyNotificationRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnifiedRoleManagementPolicyNotificationRule currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("isDefaultRecipientsEnabled", (n) -> { currentObject.setIsDefaultRecipientsEnabled(n.getBooleanValue()); });
            this.put("notificationLevel", (n) -> { currentObject.setNotificationLevel(n.getStringValue()); });
            this.put("notificationRecipients", (n) -> { currentObject.setNotificationRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("notificationType", (n) -> { currentObject.setNotificationType(n.getStringValue()); });
            this.put("recipientType", (n) -> { currentObject.setRecipientType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDefaultRecipientsEnabled property value. Indicates whether a default recipient will receive the notification email.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultRecipientsEnabled() {
        return this._isDefaultRecipientsEnabled;
    }
    /**
     * Gets the notificationLevel property value. The level of notification. The possible values are None, Critical, All.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationLevel() {
        return this._notificationLevel;
    }
    /**
     * Gets the notificationRecipients property value. The list of recipients of the email notifications.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotificationRecipients() {
        return this._notificationRecipients;
    }
    /**
     * Gets the notificationType property value. The type of notification. Only Email is supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationType() {
        return this._notificationType;
    }
    /**
     * Gets the recipientType property value. The type of recipient of the notification. The possible values are Requestor, Approver, Admin.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientType() {
        return this._recipientType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setIsDefaultRecipientsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isDefaultRecipientsEnabled = value;
    }
    /**
     * Sets the notificationLevel property value. The level of notification. The possible values are None, Critical, All.
     * @param value Value to set for the notificationLevel property.
     * @return a void
     */
    public void setNotificationLevel(@javax.annotation.Nullable final String value) {
        this._notificationLevel = value;
    }
    /**
     * Sets the notificationRecipients property value. The list of recipients of the email notifications.
     * @param value Value to set for the notificationRecipients property.
     * @return a void
     */
    public void setNotificationRecipients(@javax.annotation.Nullable final java.util.List<String> value) {
        this._notificationRecipients = value;
    }
    /**
     * Sets the notificationType property value. The type of notification. Only Email is supported.
     * @param value Value to set for the notificationType property.
     * @return a void
     */
    public void setNotificationType(@javax.annotation.Nullable final String value) {
        this._notificationType = value;
    }
    /**
     * Sets the recipientType property value. The type of recipient of the notification. The possible values are Requestor, Approver, Admin.
     * @param value Value to set for the recipientType property.
     * @return a void
     */
    public void setRecipientType(@javax.annotation.Nullable final String value) {
        this._recipientType = value;
    }
}
