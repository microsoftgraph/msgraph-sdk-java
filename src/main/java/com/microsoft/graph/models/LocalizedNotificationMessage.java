package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The text content of a Notification Message Template for the specified locale. */
public class LocalizedNotificationMessage extends Entity implements Parsable {
    /** Flag to indicate whether or not this is the default locale for language fallback. This flag can only be set. To unset, set this property to true on another Localized Notification Message. */
    private Boolean _isDefault;
    /** DateTime the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The Locale for which this message is destined. */
    private String _locale;
    /** The Message Template content. */
    private String _messageTemplate;
    /** The Message Template Subject. */
    private String _subject;
    /**
     * Instantiates a new localizedNotificationMessage and sets the default values.
     * @return a void
     */
    public LocalizedNotificationMessage() {
        super();
        this.setOdataType("#microsoft.graph.localizedNotificationMessage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a localizedNotificationMessage
     */
    @javax.annotation.Nonnull
    public static LocalizedNotificationMessage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocalizedNotificationMessage();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LocalizedNotificationMessage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("isDefault", (n) -> { currentObject.setIsDefault(n.getBooleanValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("locale", (n) -> { currentObject.setLocale(n.getStringValue()); });
            this.put("messageTemplate", (n) -> { currentObject.setMessageTemplate(n.getStringValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDefault property value. Flag to indicate whether or not this is the default locale for language fallback. This flag can only be set. To unset, set this property to true on another Localized Notification Message.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
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
     * Gets the locale property value. The Locale for which this message is destined.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocale() {
        return this._locale;
    }
    /**
     * Gets the messageTemplate property value. The Message Template content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessageTemplate() {
        return this._messageTemplate;
    }
    /**
     * Gets the subject property value. The Message Template Subject.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("locale", this.getLocale());
        writer.writeStringValue("messageTemplate", this.getMessageTemplate());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the isDefault property value. Flag to indicate whether or not this is the default locale for language fallback. This flag can only be set. To unset, set this property to true on another Localized Notification Message.
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
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
     * Sets the locale property value. The Locale for which this message is destined.
     * @param value Value to set for the locale property.
     * @return a void
     */
    public void setLocale(@javax.annotation.Nullable final String value) {
        this._locale = value;
    }
    /**
     * Sets the messageTemplate property value. The Message Template content.
     * @param value Value to set for the messageTemplate property.
     * @return a void
     */
    public void setMessageTemplate(@javax.annotation.Nullable final String value) {
        this._messageTemplate = value;
    }
    /**
     * Sets the subject property value. The Message Template Subject.
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
}
