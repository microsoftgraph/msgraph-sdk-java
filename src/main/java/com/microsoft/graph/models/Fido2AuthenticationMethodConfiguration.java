package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Fido2AuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /** A collection of users or groups who are enabled to use the authentication method. */
    private java.util.List<AuthenticationMethodTarget> _includeTargets;
    /** Determines whether attestation must be enforced for FIDO2 security key registration. */
    private Boolean _isAttestationEnforced;
    /** Determines if users can register new FIDO2 security keys. */
    private Boolean _isSelfServiceRegistrationAllowed;
    /** Controls whether key restrictions are enforced on FIDO2 security keys, either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (e.g. make and model) of the authenticator. */
    private Fido2KeyRestrictions _keyRestrictions;
    /**
     * Instantiates a new Fido2AuthenticationMethodConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Fido2AuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.fido2AuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Fido2AuthenticationMethodConfiguration
     */
    @javax.annotation.Nonnull
    public static Fido2AuthenticationMethodConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2AuthenticationMethodConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("isAttestationEnforced", (n) -> { this.setIsAttestationEnforced(n.getBooleanValue()); });
        deserializerMap.put("isSelfServiceRegistrationAllowed", (n) -> { this.setIsSelfServiceRegistrationAllowed(n.getBooleanValue()); });
        deserializerMap.put("keyRestrictions", (n) -> { this.setKeyRestrictions(n.getObjectValue(Fido2KeyRestrictions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method.
     * @return a authenticationMethodTarget
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this._includeTargets;
    }
    /**
     * Gets the isAttestationEnforced property value. Determines whether attestation must be enforced for FIDO2 security key registration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAttestationEnforced() {
        return this._isAttestationEnforced;
    }
    /**
     * Gets the isSelfServiceRegistrationAllowed property value. Determines if users can register new FIDO2 security keys.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSelfServiceRegistrationAllowed() {
        return this._isSelfServiceRegistrationAllowed;
    }
    /**
     * Gets the keyRestrictions property value. Controls whether key restrictions are enforced on FIDO2 security keys, either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (e.g. make and model) of the authenticator.
     * @return a fido2KeyRestrictions
     */
    @javax.annotation.Nullable
    public Fido2KeyRestrictions getKeyRestrictions() {
        return this._keyRestrictions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeBooleanValue("isAttestationEnforced", this.getIsAttestationEnforced());
        writer.writeBooleanValue("isSelfServiceRegistrationAllowed", this.getIsSelfServiceRegistrationAllowed());
        writer.writeObjectValue("keyRestrictions", this.getKeyRestrictions());
    }
    /**
     * Sets the includeTargets property value. A collection of users or groups who are enabled to use the authentication method.
     * @param value Value to set for the includeTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeTargets(@javax.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this._includeTargets = value;
    }
    /**
     * Sets the isAttestationEnforced property value. Determines whether attestation must be enforced for FIDO2 security key registration.
     * @param value Value to set for the isAttestationEnforced property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAttestationEnforced(@javax.annotation.Nullable final Boolean value) {
        this._isAttestationEnforced = value;
    }
    /**
     * Sets the isSelfServiceRegistrationAllowed property value. Determines if users can register new FIDO2 security keys.
     * @param value Value to set for the isSelfServiceRegistrationAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSelfServiceRegistrationAllowed(@javax.annotation.Nullable final Boolean value) {
        this._isSelfServiceRegistrationAllowed = value;
    }
    /**
     * Sets the keyRestrictions property value. Controls whether key restrictions are enforced on FIDO2 security keys, either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (e.g. make and model) of the authenticator.
     * @param value Value to set for the keyRestrictions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyRestrictions(@javax.annotation.Nullable final Fido2KeyRestrictions value) {
        this._keyRestrictions = value;
    }
}
