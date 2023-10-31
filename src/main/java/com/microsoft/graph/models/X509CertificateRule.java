package com.microsoft.graph.models;

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
    private BackingStore BackingStore;
    /**
     * Instantiates a new X509CertificateRule and sets the default values.
     */
    public X509CertificateRule() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a X509CertificateRule
     */
    @jakarta.annotation.Nonnull
    public static X509CertificateRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateRule();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.getBackingStore().get("identifier");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the x509CertificateAuthenticationMode property value. The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue. Required.
     * @return a X509CertificateAuthenticationMode
     */
    @jakarta.annotation.Nullable
    public X509CertificateAuthenticationMode getX509CertificateAuthenticationMode() {
        return this.getBackingStore().get("x509CertificateAuthenticationMode");
    }
    /**
     * Gets the x509CertificateRuleType property value. The type of the X.509 certificate mode configuration rule. The possible values are: issuerSubject, policyOID, unknownFutureValue. Required.
     * @return a X509CertificateRuleType
     */
    @jakarta.annotation.Nullable
    public X509CertificateRuleType getX509CertificateRuleType() {
        return this.getBackingStore().get("x509CertificateRuleType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("x509CertificateAuthenticationMode", this.getX509CertificateAuthenticationMode());
        writer.writeEnumValue("x509CertificateRuleType", this.getX509CertificateRuleType());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the identifier property value. The identifier of the X.509 certificate. Required.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("identifier", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the x509CertificateAuthenticationMode property value. The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue. Required.
     * @param value Value to set for the x509CertificateAuthenticationMode property.
     */
    public void setX509CertificateAuthenticationMode(@jakarta.annotation.Nullable final X509CertificateAuthenticationMode value) {
        this.getBackingStore().set("x509CertificateAuthenticationMode", value);
    }
    /**
     * Sets the x509CertificateRuleType property value. The type of the X.509 certificate mode configuration rule. The possible values are: issuerSubject, policyOID, unknownFutureValue. Required.
     * @param value Value to set for the x509CertificateRuleType property.
     */
    public void setX509CertificateRuleType(@jakarta.annotation.Nullable final X509CertificateRuleType value) {
        this.getBackingStore().set("x509CertificateRuleType", value);
    }
}
