package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CertificateAuthorityDetail extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link CertificateAuthorityDetail} and sets the default values.
     */
    public CertificateAuthorityDetail() {
        super();
        this.setOdataType("#microsoft.graph.certificateAuthorityDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CertificateAuthorityDetail}
     */
    @jakarta.annotation.Nonnull
    public static CertificateAuthorityDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateAuthorityDetail();
    }
    /**
     * Gets the certificate property value. The public key of the certificate authority.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getCertificate() {
        return this.backingStore.get("certificate");
    }
    /**
     * Gets the certificateAuthorityType property value. The type of certificate authority. The possible values are: root, intermediate, unknownFutureValue. Supports $filter (eq).
     * @return a {@link CertificateAuthorityType}
     */
    @jakarta.annotation.Nullable
    public CertificateAuthorityType getCertificateAuthorityType() {
        return this.backingStore.get("certificateAuthorityType");
    }
    /**
     * Gets the certificateRevocationListUrl property value. The URL to check if the certificate is revoked.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificateRevocationListUrl() {
        return this.backingStore.get("certificateRevocationListUrl");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the certificate authority was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deltaCertificateRevocationListUrl property value. The deltaCertificateRevocationListUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeltaCertificateRevocationListUrl() {
        return this.backingStore.get("deltaCertificateRevocationListUrl");
    }
    /**
     * Gets the displayName property value. The display name of the certificate authority.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the expirationDateTime property value. The date and time when the certificate authority expires. Supports $filter (eq) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getByteArrayValue()); });
        deserializerMap.put("certificateAuthorityType", (n) -> { this.setCertificateAuthorityType(n.getEnumValue(CertificateAuthorityType::forValue)); });
        deserializerMap.put("certificateRevocationListUrl", (n) -> { this.setCertificateRevocationListUrl(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deltaCertificateRevocationListUrl", (n) -> { this.setDeltaCertificateRevocationListUrl(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isIssuerHintEnabled", (n) -> { this.setIsIssuerHintEnabled(n.getBooleanValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("issuerSubjectKeyIdentifier", (n) -> { this.setIssuerSubjectKeyIdentifier(n.getStringValue()); });
        deserializerMap.put("thumbprint", (n) -> { this.setThumbprint(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isIssuerHintEnabled property value. Indicates whether the certificate picker presents the certificate authority to the user to use for authentication. Default value is false. Optional.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsIssuerHintEnabled() {
        return this.backingStore.get("isIssuerHintEnabled");
    }
    /**
     * Gets the issuer property value. The issuer of the certificate authority.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.backingStore.get("issuer");
    }
    /**
     * Gets the issuerSubjectKeyIdentifier property value. The subject key identifier of certificate authority.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuerSubjectKeyIdentifier() {
        return this.backingStore.get("issuerSubjectKeyIdentifier");
    }
    /**
     * Gets the thumbprint property value. The thumbprint of certificate authority certificate. Supports $filter (eq, startswith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getThumbprint() {
        return this.backingStore.get("thumbprint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("certificate", this.getCertificate());
        writer.writeEnumValue("certificateAuthorityType", this.getCertificateAuthorityType());
        writer.writeStringValue("certificateRevocationListUrl", this.getCertificateRevocationListUrl());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deltaCertificateRevocationListUrl", this.getDeltaCertificateRevocationListUrl());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeBooleanValue("isIssuerHintEnabled", this.getIsIssuerHintEnabled());
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("issuerSubjectKeyIdentifier", this.getIssuerSubjectKeyIdentifier());
        writer.writeStringValue("thumbprint", this.getThumbprint());
    }
    /**
     * Sets the certificate property value. The public key of the certificate authority.
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("certificate", value);
    }
    /**
     * Sets the certificateAuthorityType property value. The type of certificate authority. The possible values are: root, intermediate, unknownFutureValue. Supports $filter (eq).
     * @param value Value to set for the certificateAuthorityType property.
     */
    public void setCertificateAuthorityType(@jakarta.annotation.Nullable final CertificateAuthorityType value) {
        this.backingStore.set("certificateAuthorityType", value);
    }
    /**
     * Sets the certificateRevocationListUrl property value. The URL to check if the certificate is revoked.
     * @param value Value to set for the certificateRevocationListUrl property.
     */
    public void setCertificateRevocationListUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateRevocationListUrl", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the certificate authority was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deltaCertificateRevocationListUrl property value. The deltaCertificateRevocationListUrl property
     * @param value Value to set for the deltaCertificateRevocationListUrl property.
     */
    public void setDeltaCertificateRevocationListUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deltaCertificateRevocationListUrl", value);
    }
    /**
     * Sets the displayName property value. The display name of the certificate authority.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the expirationDateTime property value. The date and time when the certificate authority expires. Supports $filter (eq) and $orderby.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the isIssuerHintEnabled property value. Indicates whether the certificate picker presents the certificate authority to the user to use for authentication. Default value is false. Optional.
     * @param value Value to set for the isIssuerHintEnabled property.
     */
    public void setIsIssuerHintEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isIssuerHintEnabled", value);
    }
    /**
     * Sets the issuer property value. The issuer of the certificate authority.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuer", value);
    }
    /**
     * Sets the issuerSubjectKeyIdentifier property value. The subject key identifier of certificate authority.
     * @param value Value to set for the issuerSubjectKeyIdentifier property.
     */
    public void setIssuerSubjectKeyIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuerSubjectKeyIdentifier", value);
    }
    /**
     * Sets the thumbprint property value. The thumbprint of certificate authority certificate. Supports $filter (eq, startswith).
     * @param value Value to set for the thumbprint property.
     */
    public void setThumbprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("thumbprint", value);
    }
}
