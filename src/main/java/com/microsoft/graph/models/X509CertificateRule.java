package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class X509CertificateRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier of the X.509 certificate. Required.
     */
    private String identifier;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue. Required.
     */
    private X509CertificateAuthenticationMode x509CertificateAuthenticationMode;
    /**
     * The type of the X.509 certificate mode configuration rule. The possible values are: issuerSubject, policyOID, unknownFutureValue. Required.
     */
    private X509CertificateRuleType x509CertificateRuleType;
    /**
     * Instantiates a new x509CertificateRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public X509CertificateRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a x509CertificateRule
     */
    @javax.annotation.Nonnull
    public static X509CertificateRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateRule();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("x509CertificateAuthenticationMode", (n) -> { this.setX509CertificateAuthenticationMode(n.getEnumValue(X509CertificateAuthenticationMode.class)); });
        deserializerMap.put("x509CertificateRuleType", (n) -> { this.setX509CertificateRuleType(n.getEnumValue(X509CertificateRuleType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier of the X.509 certificate. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return this.identifier;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the x509CertificateAuthenticationMode property value. The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue. Required.
     * @return a x509CertificateAuthenticationMode
     */
    @javax.annotation.Nullable
    public X509CertificateAuthenticationMode getX509CertificateAuthenticationMode() {
        return this.x509CertificateAuthenticationMode;
    }
    /**
     * Gets the x509CertificateRuleType property value. The type of the X.509 certificate mode configuration rule. The possible values are: issuerSubject, policyOID, unknownFutureValue. Required.
     * @return a x509CertificateRuleType
     */
    @javax.annotation.Nullable
    public X509CertificateRuleType getX509CertificateRuleType() {
        return this.x509CertificateRuleType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("x509CertificateAuthenticationMode", this.getX509CertificateAuthenticationMode());
        writer.writeEnumValue("x509CertificateRuleType", this.getX509CertificateRuleType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the identifier property value. The identifier of the X.509 certificate. Required.
     * @param value Value to set for the identifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentifier(@javax.annotation.Nullable final String value) {
        this.identifier = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the x509CertificateAuthenticationMode property value. The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue. Required.
     * @param value Value to set for the x509CertificateAuthenticationMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setX509CertificateAuthenticationMode(@javax.annotation.Nullable final X509CertificateAuthenticationMode value) {
        this.x509CertificateAuthenticationMode = value;
    }
    /**
     * Sets the x509CertificateRuleType property value. The type of the X.509 certificate mode configuration rule. The possible values are: issuerSubject, policyOID, unknownFutureValue. Required.
     * @param value Value to set for the x509CertificateRuleType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setX509CertificateRuleType(@javax.annotation.Nullable final X509CertificateRuleType value) {
        this.x509CertificateRuleType = value;
    }
}
