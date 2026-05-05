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
public class WebauthnPublicKeyCredentialCreationOptions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WebauthnPublicKeyCredentialCreationOptions} and sets the default values.
     */
    public WebauthnPublicKeyCredentialCreationOptions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebauthnPublicKeyCredentialCreationOptions}
     */
    @jakarta.annotation.Nonnull
    public static WebauthnPublicKeyCredentialCreationOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebauthnPublicKeyCredentialCreationOptions();
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
     * Gets the attestation property value. The attestation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAttestation() {
        return this.backingStore.get("attestation");
    }
    /**
     * Gets the authenticatorSelection property value. The authenticatorSelection property
     * @return a {@link WebauthnAuthenticatorSelectionCriteria}
     */
    @jakarta.annotation.Nullable
    public WebauthnAuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.backingStore.get("authenticatorSelection");
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
     * Gets the challenge property value. The challenge property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChallenge() {
        return this.backingStore.get("challenge");
    }
    /**
     * Gets the excludeCredentials property value. The excludeCredentials property
     * @return a {@link java.util.List<WebauthnPublicKeyCredentialDescriptor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebauthnPublicKeyCredentialDescriptor> getExcludeCredentials() {
        return this.backingStore.get("excludeCredentials");
    }
    /**
     * Gets the extensions property value. The extensions property
     * @return a {@link WebauthnAuthenticationExtensionsClientInputs}
     */
    @jakarta.annotation.Nullable
    public WebauthnAuthenticationExtensionsClientInputs getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("attestation", (n) -> { this.setAttestation(n.getStringValue()); });
        deserializerMap.put("authenticatorSelection", (n) -> { this.setAuthenticatorSelection(n.getObjectValue(WebauthnAuthenticatorSelectionCriteria::createFromDiscriminatorValue)); });
        deserializerMap.put("challenge", (n) -> { this.setChallenge(n.getStringValue()); });
        deserializerMap.put("excludeCredentials", (n) -> { this.setExcludeCredentials(n.getCollectionOfObjectValues(WebauthnPublicKeyCredentialDescriptor::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getObjectValue(WebauthnAuthenticationExtensionsClientInputs::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pubKeyCredParams", (n) -> { this.setPubKeyCredParams(n.getCollectionOfObjectValues(WebauthnPublicKeyCredentialParameters::createFromDiscriminatorValue)); });
        deserializerMap.put("rp", (n) -> { this.setRp(n.getObjectValue(WebauthnPublicKeyCredentialRpEntity::createFromDiscriminatorValue)); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getIntegerValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(WebauthnPublicKeyCredentialUserEntity::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the pubKeyCredParams property value. The pubKeyCredParams property
     * @return a {@link java.util.List<WebauthnPublicKeyCredentialParameters>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebauthnPublicKeyCredentialParameters> getPubKeyCredParams() {
        return this.backingStore.get("pubKeyCredParams");
    }
    /**
     * Gets the rp property value. The rp property
     * @return a {@link WebauthnPublicKeyCredentialRpEntity}
     */
    @jakarta.annotation.Nullable
    public WebauthnPublicKeyCredentialRpEntity getRp() {
        return this.backingStore.get("rp");
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimeout() {
        return this.backingStore.get("timeout");
    }
    /**
     * Gets the user property value. The user property
     * @return a {@link WebauthnPublicKeyCredentialUserEntity}
     */
    @jakarta.annotation.Nullable
    public WebauthnPublicKeyCredentialUserEntity getUser() {
        return this.backingStore.get("user");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("attestation", this.getAttestation());
        writer.writeObjectValue("authenticatorSelection", this.getAuthenticatorSelection());
        writer.writeStringValue("challenge", this.getChallenge());
        writer.writeCollectionOfObjectValues("excludeCredentials", this.getExcludeCredentials());
        writer.writeObjectValue("extensions", this.getExtensions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("pubKeyCredParams", this.getPubKeyCredParams());
        writer.writeObjectValue("rp", this.getRp());
        writer.writeIntegerValue("timeout", this.getTimeout());
        writer.writeObjectValue("user", this.getUser());
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
     * Sets the attestation property value. The attestation property
     * @param value Value to set for the attestation property.
     */
    public void setAttestation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("attestation", value);
    }
    /**
     * Sets the authenticatorSelection property value. The authenticatorSelection property
     * @param value Value to set for the authenticatorSelection property.
     */
    public void setAuthenticatorSelection(@jakarta.annotation.Nullable final WebauthnAuthenticatorSelectionCriteria value) {
        this.backingStore.set("authenticatorSelection", value);
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
     * Sets the challenge property value. The challenge property
     * @param value Value to set for the challenge property.
     */
    public void setChallenge(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("challenge", value);
    }
    /**
     * Sets the excludeCredentials property value. The excludeCredentials property
     * @param value Value to set for the excludeCredentials property.
     */
    public void setExcludeCredentials(@jakarta.annotation.Nullable final java.util.List<WebauthnPublicKeyCredentialDescriptor> value) {
        this.backingStore.set("excludeCredentials", value);
    }
    /**
     * Sets the extensions property value. The extensions property
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final WebauthnAuthenticationExtensionsClientInputs value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pubKeyCredParams property value. The pubKeyCredParams property
     * @param value Value to set for the pubKeyCredParams property.
     */
    public void setPubKeyCredParams(@jakarta.annotation.Nullable final java.util.List<WebauthnPublicKeyCredentialParameters> value) {
        this.backingStore.set("pubKeyCredParams", value);
    }
    /**
     * Sets the rp property value. The rp property
     * @param value Value to set for the rp property.
     */
    public void setRp(@jakarta.annotation.Nullable final WebauthnPublicKeyCredentialRpEntity value) {
        this.backingStore.set("rp", value);
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("timeout", value);
    }
    /**
     * Sets the user property value. The user property
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final WebauthnPublicKeyCredentialUserEntity value) {
        this.backingStore.set("user", value);
    }
}
