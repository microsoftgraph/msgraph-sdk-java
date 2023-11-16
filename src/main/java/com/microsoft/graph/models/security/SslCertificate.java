package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SslCertificate extends Artifact implements Parsable {
    /**
     * Instantiates a new SslCertificate and sets the default values.
     */
    public SslCertificate() {
        super();
        this.setOdataType("#microsoft.graph.security.sslCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SslCertificate
     */
    @jakarta.annotation.Nonnull
    public static SslCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SslCertificate();
    }
    /**
     * Gets the expirationDateTime property value. The date and time when a certificate expires. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.BackingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fingerprint", (n) -> { this.setFingerprint(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("issueDateTime", (n) -> { this.setIssueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getObjectValue(SslCertificateEntity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("relatedHosts", (n) -> { this.setRelatedHosts(n.getCollectionOfObjectValues(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("sha1", (n) -> { this.setSha1(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(SslCertificateEntity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprint property value. A hash of the certificate calculated on the data and signature.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFingerprint() {
        return this.BackingStore.get("fingerprint");
    }
    /**
     * Gets the firstSeenDateTime property value. The first date and time when this sslCertificate was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.BackingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the issueDateTime property value. The date and time when a certificate was issued. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getIssueDateTime() {
        return this.BackingStore.get("issueDateTime");
    }
    /**
     * Gets the issuer property value. The entity that grants this certificate.
     * @return a SslCertificateEntity
     */
    @jakarta.annotation.Nullable
    public SslCertificateEntity getIssuer() {
        return this.BackingStore.get("issuer");
    }
    /**
     * Gets the lastSeenDateTime property value. The most recent date and time when this sslCertificate was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.BackingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the relatedHosts property value. The hosts related with this sslCertificate.
     * @return a java.util.List<Host>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Host> getRelatedHosts() {
        return this.BackingStore.get("relatedHosts");
    }
    /**
     * Gets the serialNumber property value. The serial number associated with an SSL certificate.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.BackingStore.get("serialNumber");
    }
    /**
     * Gets the sha1 property value. A SHA-1 hash of the certificate. Note: This is not the signature.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSha1() {
        return this.BackingStore.get("sha1");
    }
    /**
     * Gets the subject property value. The person, site, machine, and so on, this certificate is for.
     * @return a SslCertificateEntity
     */
    @jakarta.annotation.Nullable
    public SslCertificateEntity getSubject() {
        return this.BackingStore.get("subject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("fingerprint", this.getFingerprint());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("issueDateTime", this.getIssueDateTime());
        writer.writeObjectValue("issuer", this.getIssuer());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("relatedHosts", this.getRelatedHosts());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("sha1", this.getSha1());
        writer.writeObjectValue("subject", this.getSubject());
    }
    /**
     * Sets the expirationDateTime property value. The date and time when a certificate expires. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the fingerprint property value. A hash of the certificate calculated on the data and signature.
     * @param value Value to set for the fingerprint property.
     */
    public void setFingerprint(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fingerprint", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The first date and time when this sslCertificate was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the issueDateTime property value. The date and time when a certificate was issued. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the issueDateTime property.
     */
    public void setIssueDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("issueDateTime", value);
    }
    /**
     * Sets the issuer property value. The entity that grants this certificate.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final SslCertificateEntity value) {
        this.BackingStore.set("issuer", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The most recent date and time when this sslCertificate was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the relatedHosts property value. The hosts related with this sslCertificate.
     * @param value Value to set for the relatedHosts property.
     */
    public void setRelatedHosts(@jakarta.annotation.Nullable final java.util.List<Host> value) {
        this.BackingStore.set("relatedHosts", value);
    }
    /**
     * Sets the serialNumber property value. The serial number associated with an SSL certificate.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("serialNumber", value);
    }
    /**
     * Sets the sha1 property value. A SHA-1 hash of the certificate. Note: This is not the signature.
     * @param value Value to set for the sha1 property.
     */
    public void setSha1(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("sha1", value);
    }
    /**
     * Sets the subject property value. The person, site, machine, and so on, this certificate is for.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final SslCertificateEntity value) {
        this.BackingStore.set("subject", value);
    }
}
