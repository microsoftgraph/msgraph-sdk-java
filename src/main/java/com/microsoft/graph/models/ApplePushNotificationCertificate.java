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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplePushNotificationCertificate extends Entity implements Parsable {
    /**
     * Instantiates a new ApplePushNotificationCertificate and sets the default values.
     */
    public ApplePushNotificationCertificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ApplePushNotificationCertificate
     */
    @jakarta.annotation.Nonnull
    public static ApplePushNotificationCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplePushNotificationCertificate();
    }
    /**
     * Gets the appleIdentifier property value. Apple Id of the account used to create the MDM push certificate.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppleIdentifier() {
        return this.backingStore.get("appleIdentifier");
    }
    /**
     * Gets the certificate property value. Not yet documented
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificate() {
        return this.backingStore.get("certificate");
    }
    /**
     * Gets the certificateSerialNumber property value. Certificate serial number. This property is read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateSerialNumber() {
        return this.backingStore.get("certificateSerialNumber");
    }
    /**
     * Gets the certificateUploadFailureReason property value. The reason the certificate upload failed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateUploadFailureReason() {
        return this.backingStore.get("certificateUploadFailureReason");
    }
    /**
     * Gets the certificateUploadStatus property value. The certificate upload status.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateUploadStatus() {
        return this.backingStore.get("certificateUploadStatus");
    }
    /**
     * Gets the expirationDateTime property value. The expiration date and time for Apple push notification certificate.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
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
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the topicIdentifier property value. Topic Id.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTopicIdentifier() {
        return this.backingStore.get("topicIdentifier");
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
        this.backingStore.set("appleIdentifier", value);
    }
    /**
     * Sets the certificate property value. Not yet documented
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificate", value);
    }
    /**
     * Sets the certificateSerialNumber property value. Certificate serial number. This property is read-only.
     * @param value Value to set for the certificateSerialNumber property.
     */
    public void setCertificateSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateSerialNumber", value);
    }
    /**
     * Sets the certificateUploadFailureReason property value. The reason the certificate upload failed.
     * @param value Value to set for the certificateUploadFailureReason property.
     */
    public void setCertificateUploadFailureReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateUploadFailureReason", value);
    }
    /**
     * Sets the certificateUploadStatus property value. The certificate upload status.
     * @param value Value to set for the certificateUploadStatus property.
     */
    public void setCertificateUploadStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateUploadStatus", value);
    }
    /**
     * Sets the expirationDateTime property value. The expiration date and time for Apple push notification certificate.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified date and time for Apple push notification certificate.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the topicIdentifier property value. Topic Id.
     * @param value Value to set for the topicIdentifier property.
     */
    public void setTopicIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("topicIdentifier", value);
    }
}
