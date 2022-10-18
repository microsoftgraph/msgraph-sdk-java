package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class X509CertificateAuthenticationModeConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Rules are configured in addition to the authentication mode to bind a specific x509CertificateRuleType to an x509CertificateAuthenticationMode. For example, bind the policyOID with identifier 1.32.132.343 to x509CertificateMultiFactor authentication mode. */
    private java.util.List<X509CertificateRule> _rules;
    /** The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue. */
    private X509CertificateAuthenticationMode _x509CertificateAuthenticationDefaultMode;
    /**
     * Instantiates a new x509CertificateAuthenticationModeConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public X509CertificateAuthenticationModeConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.x509CertificateAuthenticationModeConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a x509CertificateAuthenticationModeConfiguration
     */
    @javax.annotation.Nonnull
    public static X509CertificateAuthenticationModeConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateAuthenticationModeConfiguration();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final X509CertificateAuthenticationModeConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("rules", (n) -> { currentObject.setRules(n.getCollectionOfObjectValues(X509CertificateRule::createFromDiscriminatorValue)); });
            this.put("x509CertificateAuthenticationDefaultMode", (n) -> { currentObject.setX509CertificateAuthenticationDefaultMode(n.getEnumValue(X509CertificateAuthenticationMode.class)); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the rules property value. Rules are configured in addition to the authentication mode to bind a specific x509CertificateRuleType to an x509CertificateAuthenticationMode. For example, bind the policyOID with identifier 1.32.132.343 to x509CertificateMultiFactor authentication mode.
     * @return a x509CertificateRule
     */
    @javax.annotation.Nullable
    public java.util.List<X509CertificateRule> getRules() {
        return this._rules;
    }
    /**
     * Gets the x509CertificateAuthenticationDefaultMode property value. The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue.
     * @return a x509CertificateAuthenticationMode
     */
    @javax.annotation.Nullable
    public X509CertificateAuthenticationMode getX509CertificateAuthenticationDefaultMode() {
        return this._x509CertificateAuthenticationDefaultMode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeEnumValue("x509CertificateAuthenticationDefaultMode", this.getX509CertificateAuthenticationDefaultMode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the rules property value. Rules are configured in addition to the authentication mode to bind a specific x509CertificateRuleType to an x509CertificateAuthenticationMode. For example, bind the policyOID with identifier 1.32.132.343 to x509CertificateMultiFactor authentication mode.
     * @param value Value to set for the rules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRules(@javax.annotation.Nullable final java.util.List<X509CertificateRule> value) {
        this._rules = value;
    }
    /**
     * Sets the x509CertificateAuthenticationDefaultMode property value. The type of strong authentication mode. The possible values are: x509CertificateSingleFactor, x509CertificateMultiFactor, unknownFutureValue.
     * @param value Value to set for the x509CertificateAuthenticationDefaultMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setX509CertificateAuthenticationDefaultMode(@javax.annotation.Nullable final X509CertificateAuthenticationMode value) {
        this._x509CertificateAuthenticationDefaultMode = value;
    }
}
