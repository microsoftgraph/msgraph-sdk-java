package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Notification messages are messages that are sent to end users who are determined to be not-compliant with the compliance policies defined by the administrator. Administrators choose notifications and configure them in the Intune Admin Console using the compliance policy creation page under the “Actions for non-compliance” section. Use the notificationMessageTemplate object to create your own custom notifications for administrators to choose while configuring actions for non-compliance. */
public class NotificationMessageTemplate extends Entity implements Parsable {
    /** Branding Options for the Message Template. Branding is defined in the Intune Admin Console. */
    private NotificationTemplateBrandingOptions _brandingOptions;
    /** The default locale to fallback onto when the requested locale is not available. */
    private String _defaultLocale;
    /** Display name for the Notification Message Template. */
    private String _displayName;
    /** DateTime the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The list of localized messages for this Notification Message Template. */
    private java.util.List<LocalizedNotificationMessage> _localizedNotificationMessages;
    /**
     * Instantiates a new notificationMessageTemplate and sets the default values.
     * @return a void
     */
    public NotificationMessageTemplate() {
        super();
        this.setOdataType("#microsoft.graph.notificationMessageTemplate");
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
     * @return a notificationTemplateBrandingOptions
     */
    @javax.annotation.Nullable
    public NotificationTemplateBrandingOptions getBrandingOptions() {
        return this._brandingOptions;
    }
    /**
     * Gets the defaultLocale property value. The default locale to fallback onto when the requested locale is not available.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLocale() {
        return this._defaultLocale;
    }
    /**
     * Gets the displayName property value. Display name for the Notification Message Template.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NotificationMessageTemplate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("brandingOptions", (n) -> { currentObject.setBrandingOptions(n.getEnumValue(NotificationTemplateBrandingOptions.class)); });
            this.put("defaultLocale", (n) -> { currentObject.setDefaultLocale(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("localizedNotificationMessages", (n) -> { currentObject.setLocalizedNotificationMessages(n.getCollectionOfObjectValues(LocalizedNotificationMessage::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the localizedNotificationMessages property value. The list of localized messages for this Notification Message Template.
     * @return a localizedNotificationMessage
     */
    @javax.annotation.Nullable
    public java.util.List<LocalizedNotificationMessage> getLocalizedNotificationMessages() {
        return this._localizedNotificationMessages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("brandingOptions", this.getBrandingOptions());
        writer.writeStringValue("defaultLocale", this.getDefaultLocale());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("localizedNotificationMessages", this.getLocalizedNotificationMessages());
    }
    /**
     * Sets the brandingOptions property value. Branding Options for the Message Template. Branding is defined in the Intune Admin Console.
     * @param value Value to set for the brandingOptions property.
     * @return a void
     */
    public void setBrandingOptions(@javax.annotation.Nullable final NotificationTemplateBrandingOptions value) {
        this._brandingOptions = value;
    }
    /**
     * Sets the defaultLocale property value. The default locale to fallback onto when the requested locale is not available.
     * @param value Value to set for the defaultLocale property.
     * @return a void
     */
    public void setDefaultLocale(@javax.annotation.Nullable final String value) {
        this._defaultLocale = value;
    }
    /**
     * Sets the displayName property value. Display name for the Notification Message Template.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the localizedNotificationMessages property value. The list of localized messages for this Notification Message Template.
     * @param value Value to set for the localizedNotificationMessages property.
     * @return a void
     */
    public void setLocalizedNotificationMessages(@javax.annotation.Nullable final java.util.List<LocalizedNotificationMessage> value) {
        this._localizedNotificationMessages = value;
    }
}
