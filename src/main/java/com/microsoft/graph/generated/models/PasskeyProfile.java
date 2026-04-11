package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasskeyProfile extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PasskeyProfile} and sets the default values.
     */
    public PasskeyProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PasskeyProfile}
     */
    @jakarta.annotation.Nonnull
    public static PasskeyProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasskeyProfile();
    }
    /**
     * Gets the attestationEnforcement property value. The attestationEnforcement property
     * @return a {@link AttestationEnforcement}
     */
    @jakarta.annotation.Nullable
    public AttestationEnforcement getAttestationEnforcement() {
        return this.backingStore.get("attestationEnforcement");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attestationEnforcement", (n) -> { this.setAttestationEnforcement(n.getEnumValue(AttestationEnforcement::forValue)); });
        deserializerMap.put("keyRestrictions", (n) -> { this.setKeyRestrictions(n.getObjectValue(Fido2KeyRestrictions::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("passkeyTypes", (n) -> { this.setPasskeyTypes(n.getEnumSetValue(PasskeyTypes::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keyRestrictions property value. Controls whether key restrictions are enforced on passkeys (FIDO2), either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (for example, make and model) of the authenticator. Required.
     * @return a {@link Fido2KeyRestrictions}
     */
    @jakarta.annotation.Nullable
    public Fido2KeyRestrictions getKeyRestrictions() {
        return this.backingStore.get("keyRestrictions");
    }
    /**
     * Gets the name property value. Name of the passkey profile. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the passkeyTypes property value. Specifies which types of passkeys are targeted in this passkey profile. Required. The possible values are: deviceBound, synced, unknownFutureValue.
     * @return a {@link EnumSet<PasskeyTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<PasskeyTypes> getPasskeyTypes() {
        return this.backingStore.get("passkeyTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("attestationEnforcement", this.getAttestationEnforcement());
        writer.writeObjectValue("keyRestrictions", this.getKeyRestrictions());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumSetValue("passkeyTypes", this.getPasskeyTypes());
    }
    /**
     * Sets the attestationEnforcement property value. The attestationEnforcement property
     * @param value Value to set for the attestationEnforcement property.
     */
    public void setAttestationEnforcement(@jakarta.annotation.Nullable final AttestationEnforcement value) {
        this.backingStore.set("attestationEnforcement", value);
    }
    /**
     * Sets the keyRestrictions property value. Controls whether key restrictions are enforced on passkeys (FIDO2), either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (for example, make and model) of the authenticator. Required.
     * @param value Value to set for the keyRestrictions property.
     */
    public void setKeyRestrictions(@jakarta.annotation.Nullable final Fido2KeyRestrictions value) {
        this.backingStore.set("keyRestrictions", value);
    }
    /**
     * Sets the name property value. Name of the passkey profile. Required.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the passkeyTypes property value. Specifies which types of passkeys are targeted in this passkey profile. Required. The possible values are: deviceBound, synced, unknownFutureValue.
     * @param value Value to set for the passkeyTypes property.
     */
    public void setPasskeyTypes(@jakarta.annotation.Nullable final EnumSet<PasskeyTypes> value) {
        this.backingStore.set("passkeyTypes", value);
    }
}
