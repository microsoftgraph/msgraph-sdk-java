package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OptionalClaims implements AdditionalDataHolder, Parsable {
    /**
     * The optional claims returned in the JWT access token.
     */
    private java.util.List<OptionalClaim> accessToken;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The optional claims returned in the JWT ID token.
     */
    private java.util.List<OptionalClaim> idToken;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The optional claims returned in the SAML token.
     */
    private java.util.List<OptionalClaim> saml2Token;
    /**
     * Instantiates a new optionalClaims and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OptionalClaims() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a optionalClaims
     */
    @javax.annotation.Nonnull
    public static OptionalClaims createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OptionalClaims();
    }
    /**
     * Gets the accessToken property value. The optional claims returned in the JWT access token.
     * @return a optionalClaim
     */
    @javax.annotation.Nullable
    public java.util.List<OptionalClaim> getAccessToken() {
        return this.accessToken;
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
        deserializerMap.put("accessToken", (n) -> { this.setAccessToken(n.getCollectionOfObjectValues(OptionalClaim::createFromDiscriminatorValue)); });
        deserializerMap.put("idToken", (n) -> { this.setIdToken(n.getCollectionOfObjectValues(OptionalClaim::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("saml2Token", (n) -> { this.setSaml2Token(n.getCollectionOfObjectValues(OptionalClaim::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the idToken property value. The optional claims returned in the JWT ID token.
     * @return a optionalClaim
     */
    @javax.annotation.Nullable
    public java.util.List<OptionalClaim> getIdToken() {
        return this.idToken;
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
     * Gets the saml2Token property value. The optional claims returned in the SAML token.
     * @return a optionalClaim
     */
    @javax.annotation.Nullable
    public java.util.List<OptionalClaim> getSaml2Token() {
        return this.saml2Token;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("accessToken", this.getAccessToken());
        writer.writeCollectionOfObjectValues("idToken", this.getIdToken());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("saml2Token", this.getSaml2Token());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessToken property value. The optional claims returned in the JWT access token.
     * @param value Value to set for the accessToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessToken(@javax.annotation.Nullable final java.util.List<OptionalClaim> value) {
        this.accessToken = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the idToken property value. The optional claims returned in the JWT ID token.
     * @param value Value to set for the idToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdToken(@javax.annotation.Nullable final java.util.List<OptionalClaim> value) {
        this.idToken = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the saml2Token property value. The optional claims returned in the SAML token.
     * @param value Value to set for the saml2Token property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSaml2Token(@javax.annotation.Nullable final java.util.List<OptionalClaim> value) {
        this.saml2Token = value;
    }
}
