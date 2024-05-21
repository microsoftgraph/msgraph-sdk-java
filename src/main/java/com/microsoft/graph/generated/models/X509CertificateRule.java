package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class X509CertificateRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link X509CertificateRule} and sets the default values.
     */
    public X509CertificateRule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link X509CertificateRule}
     */
    @jakarta.annotation.Nonnull
    public static X509CertificateRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateRule();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("issuerSubjectIdentifier", (n) -> { this.setIssuerSubjectIdentifier(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyOidIdentifier", (n) -> { this.setPolicyOidIdentifier(n.getStringValue()); });
        deserializerMap.put("x509CertificateAuthenticationMode", (n) -> { this.setX509CertificateAuthenticationMode(n.getEnumValue(X509CertificateAuthenticationMode::forValue)); });
        deserializerMap.put("x509CertificateRequiredAffinityLevel", (n) -> { this.setX509CertificateRequiredAffinityLevel(n.getEnumValue(X509CertificateAffinityLevel::forValue)); });
        deserializerMap.put("x509CertificateRuleType", (n) -> { this.setX509CertificateRuleType(n.getEnumValue(X509CertificateRuleType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identifier property value. The identifier of the X.509 certificate. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.backingStore.get("identifier");
    }
    /**
     * Gets the issuerSubjectIdentifier property value. The issuerSubjectIdentifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuerSubjectIdentifier() {
        return this.backingStore.get("issuerSubjectIdentifier");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the policyOidIdentifier property value. The policyOidIdentifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPolicyOidIdentifier() {
        return this.backingStore.get("policyOidIdentifier");
    }
    /**
     * Gets the x509CertificateAuthenticationMode property value. The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue. Required.
     * @return a {@link X509CertificateAuthenticationMode}
     */
    @jakarta.annotation.Nullable
    public X509CertificateAuthenticationMode getX509CertificateAuthenticationMode() {
        return this.backingStore.get("x509CertificateAuthenticationMode");
    }
    /**
     * Gets the x509CertificateRequiredAffinityLevel property value. The x509CertificateRequiredAffinityLevel property
     * @return a {@link X509CertificateAffinityLevel}
     */
    @jakarta.annotation.Nullable
    public X509CertificateAffinityLevel getX509CertificateRequiredAffinityLevel() {
        return this.backingStore.get("x509CertificateRequiredAffinityLevel");
    }
    /**
     * Gets the x509CertificateRuleType property value. The type of the X.509 certificate mode configuration rule. The possible values are: issuerSubject, policyOID, unknownFutureValue. Required.
     * @return a {@link X509CertificateRuleType}
     */
    @jakarta.annotation.Nullable
    public X509CertificateRuleType getX509CertificateRuleType() {
        return this.backingStore.get("x509CertificateRuleType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeStringValue("issuerSubjectIdentifier", this.getIssuerSubjectIdentifier());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyOidIdentifier", this.getPolicyOidIdentifier());
        writer.writeEnumValue("x509CertificateAuthenticationMode", this.getX509CertificateAuthenticationMode());
        writer.writeEnumValue("x509CertificateRequiredAffinityLevel", this.getX509CertificateRequiredAffinityLevel());
        writer.writeEnumValue("x509CertificateRuleType", this.getX509CertificateRuleType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the identifier property value. The identifier of the X.509 certificate. Required.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identifier", value);
    }
    /**
     * Sets the issuerSubjectIdentifier property value. The issuerSubjectIdentifier property
     * @param value Value to set for the issuerSubjectIdentifier property.
     */
    public void setIssuerSubjectIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuerSubjectIdentifier", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyOidIdentifier property value. The policyOidIdentifier property
     * @param value Value to set for the policyOidIdentifier property.
     */
    public void setPolicyOidIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyOidIdentifier", value);
    }
    /**
     * Sets the x509CertificateAuthenticationMode property value. The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue. Required.
     * @param value Value to set for the x509CertificateAuthenticationMode property.
     */
    public void setX509CertificateAuthenticationMode(@jakarta.annotation.Nullable final X509CertificateAuthenticationMode value) {
        this.backingStore.set("x509CertificateAuthenticationMode", value);
    }
    /**
     * Sets the x509CertificateRequiredAffinityLevel property value. The x509CertificateRequiredAffinityLevel property
     * @param value Value to set for the x509CertificateRequiredAffinityLevel property.
     */
    public void setX509CertificateRequiredAffinityLevel(@jakarta.annotation.Nullable final X509CertificateAffinityLevel value) {
        this.backingStore.set("x509CertificateRequiredAffinityLevel", value);
    }
    /**
     * Sets the x509CertificateRuleType property value. The type of the X.509 certificate mode configuration rule. The possible values are: issuerSubject, policyOID, unknownFutureValue. Required.
     * @param value Value to set for the x509CertificateRuleType property.
     */
    public void setX509CertificateRuleType(@jakarta.annotation.Nullable final X509CertificateRuleType value) {
        this.backingStore.set("x509CertificateRuleType", value);
    }
}
