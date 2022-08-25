package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApplePushNotificationCertificate extends Entity implements Parsable {
    /** Apple Id of the account used to create the MDM push certificate. */
    private String _appleIdentifier;
    /** Not yet documented */
    private String _certificate;
    /** Certificate serial number. This property is read-only. */
    private String _certificateSerialNumber;
    /** The expiration date and time for Apple push notification certificate. */
    private OffsetDateTime _expirationDateTime;
    /** Last modified date and time for Apple push notification certificate. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Topic Id. */
    private String _topicIdentifier;
    /**
     * Instantiates a new applePushNotificationCertificate and sets the default values.
     * @return a void
     */
    public ApplePushNotificationCertificate() {
        super();
        this.setOdataType("#microsoft.graph.applePushNotificationCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applePushNotificationCertificate
     */
    @javax.annotation.Nonnull
    public static ApplePushNotificationCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplePushNotificationCertificate();
    }
    /**
     * Gets the appleIdentifier property value. Apple Id of the account used to create the MDM push certificate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppleIdentifier() {
        return this._appleIdentifier;
    }
    /**
     * Gets the certificate property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificate() {
        return this._certificate;
    }
    /**
     * Gets the certificateSerialNumber property value. Certificate serial number. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this._certificateSerialNumber;
    }
    /**
     * Gets the expirationDateTime property value. The expiration date and time for Apple push notification certificate.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ApplePushNotificationCertificate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appleIdentifier", (n) -> { currentObject.setAppleIdentifier(n.getStringValue()); });
            this.put("certificate", (n) -> { currentObject.setCertificate(n.getStringValue()); });
            this.put("certificateSerialNumber", (n) -> { currentObject.setCertificateSerialNumber(n.getStringValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("topicIdentifier", (n) -> { currentObject.setTopicIdentifier(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified date and time for Apple push notification certificate.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the topicIdentifier property value. Topic Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTopicIdentifier() {
        return this._topicIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appleIdentifier", this.getAppleIdentifier());
        writer.writeStringValue("certificate", this.getCertificate());
        writer.writeStringValue("certificateSerialNumber", this.getCertificateSerialNumber());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("topicIdentifier", this.getTopicIdentifier());
    }
    /**
     * Sets the appleIdentifier property value. Apple Id of the account used to create the MDM push certificate.
     * @param value Value to set for the appleIdentifier property.
     * @return a void
     */
    public void setAppleIdentifier(@javax.annotation.Nullable final String value) {
        this._appleIdentifier = value;
    }
    /**
     * Sets the certificate property value. Not yet documented
     * @param value Value to set for the certificate property.
     * @return a void
     */
    public void setCertificate(@javax.annotation.Nullable final String value) {
        this._certificate = value;
    }
    /**
     * Sets the certificateSerialNumber property value. Certificate serial number. This property is read-only.
     * @param value Value to set for the certificateSerialNumber property.
     * @return a void
     */
    public void setCertificateSerialNumber(@javax.annotation.Nullable final String value) {
        this._certificateSerialNumber = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration date and time for Apple push notification certificate.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified date and time for Apple push notification certificate.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the topicIdentifier property value. Topic Id.
     * @param value Value to set for the topicIdentifier property.
     * @return a void
     */
    public void setTopicIdentifier(@javax.annotation.Nullable final String value) {
        this._topicIdentifier = value;
    }
}
