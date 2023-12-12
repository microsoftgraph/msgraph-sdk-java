package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Fido2AuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /**
     * Instantiates a new Fido2AuthenticationMethodConfiguration and sets the default values.
     */
    public Fido2AuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.fido2AuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Fido2AuthenticationMethodConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Fido2AuthenticationMethodConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2AuthenticationMethodConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("isAttestationEnforced", (n) -> { this.setIsAttestationEnforced(n.getBooleanValue()); });
        deserializerMap.put("isSelfServiceRegistrationAllowed", (n) -> { this.setIsSelfServiceRegistrationAllowed(n.getBooleanValue()); });
        deserializerMap.put("keyRestrictions", (n) -> { this.setKeyRestrictions(n.getObjectValue(Fido2KeyRestrictions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of groups that are enabled to use the authentication method.
     * @return a java.util.List<AuthenticationMethodTarget>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this.backingStore.get("includeTargets");
    }
    /**
     * Gets the isAttestationEnforced property value. Determines whether attestation must be enforced for FIDO2 security key registration.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAttestationEnforced() {
        return this.backingStore.get("isAttestationEnforced");
    }
    /**
     * Gets the isSelfServiceRegistrationAllowed property value. Determines if users can register new FIDO2 security keys.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSelfServiceRegistrationAllowed() {
        return this.backingStore.get("isSelfServiceRegistrationAllowed");
    }
    /**
     * Gets the keyRestrictions property value. Controls whether key restrictions are enforced on FIDO2 security keys, either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (e.g. make and model) of the authenticator.
     * @return a Fido2KeyRestrictions
     */
    @jakarta.annotation.Nullable
    public Fido2KeyRestrictions getKeyRestrictions() {
        return this.backingStore.get("keyRestrictions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeBooleanValue("isAttestationEnforced", this.getIsAttestationEnforced());
        writer.writeBooleanValue("isSelfServiceRegistrationAllowed", this.getIsSelfServiceRegistrationAllowed());
        writer.writeObjectValue("keyRestrictions", this.getKeyRestrictions());
    }
    /**
     * Sets the includeTargets property value. A collection of groups that are enabled to use the authentication method.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this.backingStore.set("includeTargets", value);
    }
    /**
     * Sets the isAttestationEnforced property value. Determines whether attestation must be enforced for FIDO2 security key registration.
     * @param value Value to set for the isAttestationEnforced property.
     */
    public void setIsAttestationEnforced(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAttestationEnforced", value);
    }
    /**
     * Sets the isSelfServiceRegistrationAllowed property value. Determines if users can register new FIDO2 security keys.
     * @param value Value to set for the isSelfServiceRegistrationAllowed property.
     */
    public void setIsSelfServiceRegistrationAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSelfServiceRegistrationAllowed", value);
    }
    /**
     * Sets the keyRestrictions property value. Controls whether key restrictions are enforced on FIDO2 security keys, either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (e.g. make and model) of the authenticator.
     * @param value Value to set for the keyRestrictions property.
     */
    public void setKeyRestrictions(@jakarta.annotation.Nullable final Fido2KeyRestrictions value) {
        this.backingStore.set("keyRestrictions", value);
    }
}
