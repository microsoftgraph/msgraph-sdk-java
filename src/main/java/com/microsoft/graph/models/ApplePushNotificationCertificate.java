package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Apple push notification certificate.
 */
public class ApplePushNotificationCertificate extends Entity implements Parsable {
    /**
     * Apple Id of the account used to create the MDM push certificate.
     */
    private String appleIdentifier;
    /**
     * Not yet documented
     */
    private String certificate;
    /**
     * Certificate serial number. This property is read-only.
     */
    private String certificateSerialNumber;
    /**
     * The reason the certificate upload failed.
     */
    private String certificateUploadFailureReason;
    /**
     * The certificate upload status.
     */
    private String certificateUploadStatus;
    /**
     * The expiration date and time for Apple push notification certificate.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * Last modified date and time for Apple push notification certificate.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Topic Id.
     */
    private String topicIdentifier;
    /**
     * Instantiates a new applePushNotificationCertificate and sets the default values.
     */
    public ApplePushNotificationCertificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a applePushNotificationCertificate
     */
    @jakarta.annotation.Nonnull
    public static ApplePushNotificationCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplePushNotificationCertificate();
    }
    /**
     * Gets the appleIdentifier property value. Apple Id of the account used to create the MDM push certificate.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppleIdentifier() {
        return this.appleIdentifier;
    }
    /**
     * Gets the certificate property value. Not yet documented
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * Gets the certificateSerialNumber property value. Certificate serial number. This property is read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this.certificateSerialNumber;
    }
    /**
     * Gets the certificateUploadFailureReason property value. The reason the certificate upload failed.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateUploadFailureReason() {
        return this.certificateUploadFailureReason;
    }
    /**
     * Gets the certificateUploadStatus property value. The certificate upload status.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateUploadStatus() {
        return this.certificateUploadStatus;
    }
    /**
     * Gets the expirationDateTime property value. The expiration date and time for Apple push notification certificate.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appleIdentifier", (n) -> { this.setAppleIdentifier(n.getStringValue()); });
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getStringValue()); });
        deserializerMap.put("certificateSerialNumber", (n) -> { this.setCertificateSerialNumber(n.getStringValue()); });
        deserializerMap.put("certificateUploadFailureReason", (n) -> { this.setCertificateUploadFailureReason(n.getStringValue()); });
        deserializerMap.put("certificateUploadStatus", (n) -> { this.setCertificateUploadStatus(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("topicIdentifier", (n) -> { this.setTopicIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified date and time for Apple push notification certificate.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the topicIdentifier property value. Topic Id.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTopicIdentifier() {
        return this.topicIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appleIdentifier", this.getAppleIdentifier());
        writer.writeStringValue("certificate", this.getCertificate());
        writer.writeStringValue("certificateUploadFailureReason", this.getCertificateUploadFailureReason());
        writer.writeStringValue("certificateUploadStatus", this.getCertificateUploadStatus());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("topicIdentifier", this.getTopicIdentifier());
    }
    /**
     * Sets the appleIdentifier property value. Apple Id of the account used to create the MDM push certificate.
     * @param value Value to set for the appleIdentifier property.
     */
    public void setAppleIdentifier(@jakarta.annotation.Nullable final String value) {
        this.appleIdentifier = value;
    }
    /**
     * Sets the certificate property value. Not yet documented
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final String value) {
        this.certificate = value;
    }
    /**
     * Sets the certificateSerialNumber property value. Certificate serial number. This property is read-only.
     * @param value Value to set for the certificateSerialNumber property.
     */
    public void setCertificateSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.certificateSerialNumber = value;
    }
    /**
     * Sets the certificateUploadFailureReason property value. The reason the certificate upload failed.
     * @param value Value to set for the certificateUploadFailureReason property.
     */
    public void setCertificateUploadFailureReason(@jakarta.annotation.Nullable final String value) {
        this.certificateUploadFailureReason = value;
    }
    /**
     * Sets the certificateUploadStatus property value. The certificate upload status.
     * @param value Value to set for the certificateUploadStatus property.
     */
    public void setCertificateUploadStatus(@jakarta.annotation.Nullable final String value) {
        this.certificateUploadStatus = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration date and time for Apple push notification certificate.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified date and time for Apple push notification certificate.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the topicIdentifier property value. Topic Id.
     * @param value Value to set for the topicIdentifier property.
     */
    public void setTopicIdentifier(@jakarta.annotation.Nullable final String value) {
        this.topicIdentifier = value;
    }
}
