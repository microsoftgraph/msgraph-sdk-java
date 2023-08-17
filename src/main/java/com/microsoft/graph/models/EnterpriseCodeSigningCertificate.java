package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EnterpriseCodeSigningCertificate extends Entity implements Parsable {
    /**
     * The Windows Enterprise Code-Signing Certificate in the raw data format. Set to null once certificate has been uploaded and other properties have been populated.
     */
    private byte[] content;
    /**
     * The cert expiration date and time (using ISO 8601 format, in UTC time). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The issuer value for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     */
    private String issuer;
    /**
     * The issuer name for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     */
    private String issuerName;
    /**
     * The status property
     */
    private CertificateStatus status;
    /**
     * The subject value for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     */
    private String subject;
    /**
     * The subject name for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     */
    private String subjectName;
    /**
     * The date time of CodeSigning Cert when it is uploaded (using ISO 8601 format, in UTC time). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     */
    private OffsetDateTime uploadDateTime;
    /**
     * Instantiates a new enterpriseCodeSigningCertificate and sets the default values.
     */
    public EnterpriseCodeSigningCertificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a enterpriseCodeSigningCertificate
     */
    @jakarta.annotation.Nonnull
    public static EnterpriseCodeSigningCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnterpriseCodeSigningCertificate();
    }
    /**
     * Gets the content property value. The Windows Enterprise Code-Signing Certificate in the raw data format. Set to null once certificate has been uploaded and other properties have been populated.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the expirationDateTime property value. The cert expiration date and time (using ISO 8601 format, in UTC time). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
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
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("issuerName", (n) -> { this.setIssuerName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CertificateStatus.class)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("subjectName", (n) -> { this.setSubjectName(n.getStringValue()); });
        deserializerMap.put("uploadDateTime", (n) -> { this.setUploadDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuer property value. The issuer value for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Gets the issuerName property value. The issuer name for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuerName() {
        return this.issuerName;
    }
    /**
     * Gets the status property value. The status property
     * @return a certificateStatus
     */
    @jakarta.annotation.Nullable
    public CertificateStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subject property value. The subject value for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the subjectName property value. The subject name for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubjectName() {
        return this.subjectName;
    }
    /**
     * Gets the uploadDateTime property value. The date time of CodeSigning Cert when it is uploaded (using ISO 8601 format, in UTC time). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUploadDateTime() {
        return this.uploadDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("issuerName", this.getIssuerName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("subjectName", this.getSubjectName());
        writer.writeOffsetDateTimeValue("uploadDateTime", this.getUploadDateTime());
    }
    /**
     * Sets the content property value. The Windows Enterprise Code-Signing Certificate in the raw data format. Set to null once certificate has been uploaded and other properties have been populated.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the expirationDateTime property value. The cert expiration date and time (using ISO 8601 format, in UTC time). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the issuer property value. The issuer value for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.issuer = value;
    }
    /**
     * Sets the issuerName property value. The issuer name for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @param value Value to set for the issuerName property.
     */
    public void setIssuerName(@jakarta.annotation.Nullable final String value) {
        this.issuerName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CertificateStatus value) {
        this.status = value;
    }
    /**
     * Sets the subject property value. The subject value for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the subjectName property value. The subject name for the cert. This might contain information such as country (C), state or province (S), locality (L), common name of the cert (CN), organization (O), and organizational unit (OU). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @param value Value to set for the subjectName property.
     */
    public void setSubjectName(@jakarta.annotation.Nullable final String value) {
        this.subjectName = value;
    }
    /**
     * Sets the uploadDateTime property value. The date time of CodeSigning Cert when it is uploaded (using ISO 8601 format, in UTC time). Uploading a valid cert file through the Intune admin console will automatically populate this value in the HTTP response. Supports: $filter, $select, $top, $OrderBy, $skip. $Search is not supported.
     * @param value Value to set for the uploadDateTime property.
     */
    public void setUploadDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.uploadDateTime = value;
    }
}
