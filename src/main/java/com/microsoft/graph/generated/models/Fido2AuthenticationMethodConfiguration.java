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
     * Instantiates a new {@link Fido2AuthenticationMethodConfiguration} and sets the default values.
     */
    public Fido2AuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.fido2AuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Fido2AuthenticationMethodConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static Fido2AuthenticationMethodConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2AuthenticationMethodConfiguration();
    }
    /**
     * Gets the defaultPasskeyProfile property value. The non-deletable baseline passkey profile, within the passkey profile collection. It&apos;s automatically created when migrating to passkey profiles and initially mirrors the tenant&apos;s legacy global passkey (FIDO2) authentication methods policy settings.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultPasskeyProfile() {
        return this.backingStore.get("defaultPasskeyProfile");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultPasskeyProfile", (n) -> { this.setDefaultPasskeyProfile(n.getStringValue()); });
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(PasskeyAuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("isAttestationEnforced", (n) -> { this.setIsAttestationEnforced(n.getBooleanValue()); });
        deserializerMap.put("isSelfServiceRegistrationAllowed", (n) -> { this.setIsSelfServiceRegistrationAllowed(n.getBooleanValue()); });
        deserializerMap.put("keyRestrictions", (n) -> { this.setKeyRestrictions(n.getObjectValue(Fido2KeyRestrictions::createFromDiscriminatorValue)); });
        deserializerMap.put("passkeyProfiles", (n) -> { this.setPasskeyProfiles(n.getCollectionOfObjectValues(PasskeyProfile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of groups that are enabled to use the authentication method.
     * @return a {@link java.util.List<PasskeyAuthenticationMethodTarget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasskeyAuthenticationMethodTarget> getIncludeTargets() {
        return this.backingStore.get("includeTargets");
    }
    /**
     * Gets the isAttestationEnforced property value. Determines whether attestation must be enforced for passkey (FIDO2) registration. This property is deprecated and will be removed in October 2027. Use passkeyProfiles property.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAttestationEnforced() {
        return this.backingStore.get("isAttestationEnforced");
    }
    /**
     * Gets the isSelfServiceRegistrationAllowed property value. Determines if users can register new passkeys (FIDO2).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSelfServiceRegistrationAllowed() {
        return this.backingStore.get("isSelfServiceRegistrationAllowed");
    }
    /**
     * Gets the keyRestrictions property value. Controls whether key restrictions are enforced on passkeys (FIDO2), either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (for example, make and model) of the authenticator. This property is deprecated and will be removed in October 2027. Use the passkeyProfiles property.
     * @return a {@link Fido2KeyRestrictions}
     */
    @jakarta.annotation.Nullable
    public Fido2KeyRestrictions getKeyRestrictions() {
        return this.backingStore.get("keyRestrictions");
    }
    /**
     * Gets the passkeyProfiles property value. A collection of configuration profiles that control the registration of and authentication with passkeys (FIDO2).
     * @return a {@link java.util.List<PasskeyProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasskeyProfile> getPasskeyProfiles() {
        return this.backingStore.get("passkeyProfiles");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("defaultPasskeyProfile", this.getDefaultPasskeyProfile());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeBooleanValue("isAttestationEnforced", this.getIsAttestationEnforced());
        writer.writeBooleanValue("isSelfServiceRegistrationAllowed", this.getIsSelfServiceRegistrationAllowed());
        writer.writeObjectValue("keyRestrictions", this.getKeyRestrictions());
        writer.writeCollectionOfObjectValues("passkeyProfiles", this.getPasskeyProfiles());
    }
    /**
     * Sets the defaultPasskeyProfile property value. The non-deletable baseline passkey profile, within the passkey profile collection. It&apos;s automatically created when migrating to passkey profiles and initially mirrors the tenant&apos;s legacy global passkey (FIDO2) authentication methods policy settings.
     * @param value Value to set for the defaultPasskeyProfile property.
     */
    public void setDefaultPasskeyProfile(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultPasskeyProfile", value);
    }
    /**
     * Sets the includeTargets property value. A collection of groups that are enabled to use the authentication method.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<PasskeyAuthenticationMethodTarget> value) {
        this.backingStore.set("includeTargets", value);
    }
    /**
     * Sets the isAttestationEnforced property value. Determines whether attestation must be enforced for passkey (FIDO2) registration. This property is deprecated and will be removed in October 2027. Use passkeyProfiles property.
     * @param value Value to set for the isAttestationEnforced property.
     */
    public void setIsAttestationEnforced(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAttestationEnforced", value);
    }
    /**
     * Sets the isSelfServiceRegistrationAllowed property value. Determines if users can register new passkeys (FIDO2).
     * @param value Value to set for the isSelfServiceRegistrationAllowed property.
     */
    public void setIsSelfServiceRegistrationAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSelfServiceRegistrationAllowed", value);
    }
    /**
     * Sets the keyRestrictions property value. Controls whether key restrictions are enforced on passkeys (FIDO2), either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (for example, make and model) of the authenticator. This property is deprecated and will be removed in October 2027. Use the passkeyProfiles property.
     * @param value Value to set for the keyRestrictions property.
     */
    public void setKeyRestrictions(@jakarta.annotation.Nullable final Fido2KeyRestrictions value) {
        this.backingStore.set("keyRestrictions", value);
    }
    /**
     * Sets the passkeyProfiles property value. A collection of configuration profiles that control the registration of and authentication with passkeys (FIDO2).
     * @param value Value to set for the passkeyProfiles property.
     */
    public void setPasskeyProfiles(@jakarta.annotation.Nullable final java.util.List<PasskeyProfile> value) {
        this.backingStore.set("passkeyProfiles", value);
    }
}
