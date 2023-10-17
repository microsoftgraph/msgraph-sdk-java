package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CertificateAuthority implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Required. The base64 encoded string representing the public certificate.
     */
    private byte[] certificate;
    /**
     * The URL of the certificate revocation list.
     */
    private String certificateRevocationListUrl;
    /**
     * The URL contains the list of all revoked certificates since the last time a full certificate revocaton list was created.
     */
    private String deltaCertificateRevocationListUrl;
    /**
     * Required. true if the trusted certificate is a root authority, false if the trusted certificate is an intermediate authority.
     */
    private Boolean isRootAuthority;
    /**
     * The issuer of the certificate, calculated from the certificate value. Read-only.
     */
    private String issuer;
    /**
     * The subject key identifier of the certificate, calculated from the certificate value. Read-only.
     */
    private String issuerSki;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new CertificateAuthority and sets the default values.
     */
    public CertificateAuthority() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CertificateAuthority
     */
    @jakarta.annotation.Nonnull
    public static CertificateAuthority createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateAuthority();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the certificate property value. Required. The base64 encoded string representing the public certificate.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getCertificate() {
        return this.certificate;
    }
    /**
     * Gets the certificateRevocationListUrl property value. The URL of the certificate revocation list.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertificateRevocationListUrl() {
        return this.certificateRevocationListUrl;
    }
    /**
     * Gets the deltaCertificateRevocationListUrl property value. The URL contains the list of all revoked certificates since the last time a full certificate revocaton list was created.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeltaCertificateRevocationListUrl() {
        return this.deltaCertificateRevocationListUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getByteArrayValue()); });
        deserializerMap.put("certificateRevocationListUrl", (n) -> { this.setCertificateRevocationListUrl(n.getStringValue()); });
        deserializerMap.put("deltaCertificateRevocationListUrl", (n) -> { this.setDeltaCertificateRevocationListUrl(n.getStringValue()); });
        deserializerMap.put("isRootAuthority", (n) -> { this.setIsRootAuthority(n.getBooleanValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("issuerSki", (n) -> { this.setIssuerSki(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRootAuthority property value. Required. true if the trusted certificate is a root authority, false if the trusted certificate is an intermediate authority.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRootAuthority() {
        return this.isRootAuthority;
    }
    /**
     * Gets the issuer property value. The issuer of the certificate, calculated from the certificate value. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Gets the issuerSki property value. The subject key identifier of the certificate, calculated from the certificate value. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuerSki() {
        return this.issuerSki;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("certificate", this.getCertificate());
        writer.writeStringValue("certificateRevocationListUrl", this.getCertificateRevocationListUrl());
        writer.writeStringValue("deltaCertificateRevocationListUrl", this.getDeltaCertificateRevocationListUrl());
        writer.writeBooleanValue("isRootAuthority", this.getIsRootAuthority());
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("issuerSki", this.getIssuerSki());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the certificate property value. Required. The base64 encoded string representing the public certificate.
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.certificate = value;
    }
    /**
     * Sets the certificateRevocationListUrl property value. The URL of the certificate revocation list.
     * @param value Value to set for the certificateRevocationListUrl property.
     */
    public void setCertificateRevocationListUrl(@jakarta.annotation.Nullable final String value) {
        this.certificateRevocationListUrl = value;
    }
    /**
     * Sets the deltaCertificateRevocationListUrl property value. The URL contains the list of all revoked certificates since the last time a full certificate revocaton list was created.
     * @param value Value to set for the deltaCertificateRevocationListUrl property.
     */
    public void setDeltaCertificateRevocationListUrl(@jakarta.annotation.Nullable final String value) {
        this.deltaCertificateRevocationListUrl = value;
    }
    /**
     * Sets the isRootAuthority property value. Required. true if the trusted certificate is a root authority, false if the trusted certificate is an intermediate authority.
     * @param value Value to set for the isRootAuthority property.
     */
    public void setIsRootAuthority(@jakarta.annotation.Nullable final Boolean value) {
        this.isRootAuthority = value;
    }
    /**
     * Sets the issuer property value. The issuer of the certificate, calculated from the certificate value. Read-only.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.issuer = value;
    }
    /**
     * Sets the issuerSki property value. The subject key identifier of the certificate, calculated from the certificate value. Read-only.
     * @param value Value to set for the issuerSki property.
     */
    public void setIssuerSki(@jakarta.annotation.Nullable final String value) {
        this.issuerSki = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
