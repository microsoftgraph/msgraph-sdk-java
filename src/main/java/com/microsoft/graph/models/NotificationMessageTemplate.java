package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Notification messages are messages that are sent to end users who are determined to be not-compliant with the compliance policies defined by the administrator. Administrators choose notifications and configure them in the Intune Admin Console using the compliance policy creation page under the Actions for non-compliance section. Use the notificationMessageTemplate object to create your own custom notifications for administrators to choose while configuring actions for non-compliance.
 */
public class NotificationMessageTemplate extends Entity implements Parsable {
    /** Branding Options for the Message Template. Branding is defined in the Intune Admin Console. */
    private NotificationTemplateBrandingOptions brandingOptions;
    /** The default locale to fallback onto when the requested locale is not available. */
    private String defaultLocale;
    /** Display name for the Notification Message Template. */
    private String displayName;
    /** DateTime the object was last modified. */
    private OffsetDateTime lastModifiedDateTime;
    /** The list of localized messages for this Notification Message Template. */
    private java.util.List<LocalizedNotificationMessage> localizedNotificationMessages;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Instantiates a new notificationMessageTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NotificationMessageTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a notificationMessageTemplate
     */
    @javax.annotation.Nonnull
    public static NotificationMessageTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotificationMessageTemplate();
    }
    /**
     * Gets the brandingOptions property value. Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
     * @return a NotificationTemplateBrandingOptions
     */
    @javax.annotation.Nullable
    public NotificationTemplateBrandingOptions getBrandingOptions() {
        return this.brandingOptions;
    }
    /**
     * Gets the defaultLocale property value. The default locale to fallback onto when the requested locale is not available.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLocale() {
        return this.defaultLocale;
    }
    /**
     * Gets the displayName property value. Display name for the Notification Message Template.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("brandingOptions", (n) -> { this.setBrandingOptions(n.getEnumValue(NotificationTemplateBrandingOptions.class)); });
        deserializerMap.put("defaultLocale", (n) -> { this.setDefaultLocale(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("localizedNotificationMessages", (n) -> { this.setLocalizedNotificationMessages(n.getCollectionOfObjectValues(LocalizedNotificationMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the localizedNotificationMessages property value. The list of localized messages for this Notification Message Template.
     * @return a localizedNotificationMessage
     */
    @javax.annotation.Nullable
    public java.util.List<LocalizedNotificationMessage> getLocalizedNotificationMessages() {
        return this.localizedNotificationMessages;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("brandingOptions", this.getBrandingOptions());
        writer.writeStringValue("defaultLocale", this.getDefaultLocale());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("localizedNotificationMessages", this.getLocalizedNotificationMessages());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the brandingOptions property value. Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
     * @param value Value to set for the brandingOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBrandingOptions(@javax.annotation.Nullable final NotificationTemplateBrandingOptions value) {
        this.brandingOptions = value;
    }
    /**
     * Sets the defaultLocale property value. The default locale to fallback onto when the requested locale is not available.
     * @param value Value to set for the defaultLocale property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultLocale(@javax.annotation.Nullable final String value) {
        this.defaultLocale = value;
    }
    /**
     * Sets the displayName property value. Display name for the Notification Message Template.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the localizedNotificationMessages property value. The list of localized messages for this Notification Message Template.
     * @param value Value to set for the localizedNotificationMessages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalizedNotificationMessages(@javax.annotation.Nullable final java.util.List<LocalizedNotificationMessage> value) {
        this.localizedNotificationMessages = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
}
