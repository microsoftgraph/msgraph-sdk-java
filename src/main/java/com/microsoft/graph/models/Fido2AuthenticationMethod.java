package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Fido2AuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Authenticator Attestation GUID, an identifier that indicates the type (e.g. make and model) of the authenticator.
     */
    private String aaGuid;
    /**
     * The attestation certificate(s) attached to this security key.
     */
    private java.util.List<String> attestationCertificates;
    /**
     * The attestation level of this FIDO2 security key. Possible values are: attested, or notAttested.
     */
    private AttestationLevel attestationLevel;
    /**
     * The timestamp when this key was registered to the user.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The display name of the key as given by the user.
     */
    private String displayName;
    /**
     * The manufacturer-assigned model of the FIDO2 security key.
     */
    private String model;
    /**
     * Instantiates a new Fido2AuthenticationMethod and sets the default values.
     */
    public Fido2AuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.fido2AuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Fido2AuthenticationMethod
     */
    @jakarta.annotation.Nonnull
    public static Fido2AuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2AuthenticationMethod();
    }
    /**
     * Gets the aaGuid property value. Authenticator Attestation GUID, an identifier that indicates the type (e.g. make and model) of the authenticator.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAaGuid() {
        return this.aaGuid;
    }
    /**
     * Gets the attestationCertificates property value. The attestation certificate(s) attached to this security key.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAttestationCertificates() {
        return this.attestationCertificates;
    }
    /**
     * Gets the attestationLevel property value. The attestation level of this FIDO2 security key. Possible values are: attested, or notAttested.
     * @return a AttestationLevel
     */
    @jakarta.annotation.Nullable
    public AttestationLevel getAttestationLevel() {
        return this.attestationLevel;
    }
    /**
     * Gets the createdDateTime property value. The timestamp when this key was registered to the user.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. The display name of the key as given by the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aaGuid", (n) -> { this.setAaGuid(n.getStringValue()); });
        deserializerMap.put("attestationCertificates", (n) -> { this.setAttestationCertificates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("attestationLevel", (n) -> { this.setAttestationLevel(n.getEnumValue(AttestationLevel.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the model property value. The manufacturer-assigned model of the FIDO2 security key.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("aaGuid", this.getAaGuid());
        writer.writeCollectionOfPrimitiveValues("attestationCertificates", this.getAttestationCertificates());
        writer.writeEnumValue("attestationLevel", this.getAttestationLevel());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("model", this.getModel());
    }
    /**
     * Sets the aaGuid property value. Authenticator Attestation GUID, an identifier that indicates the type (e.g. make and model) of the authenticator.
     * @param value Value to set for the aaGuid property.
     */
    public void setAaGuid(@jakarta.annotation.Nullable final String value) {
        this.aaGuid = value;
    }
    /**
     * Sets the attestationCertificates property value. The attestation certificate(s) attached to this security key.
     * @param value Value to set for the attestationCertificates property.
     */
    public void setAttestationCertificates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.attestationCertificates = value;
    }
    /**
     * Sets the attestationLevel property value. The attestation level of this FIDO2 security key. Possible values are: attested, or notAttested.
     * @param value Value to set for the attestationLevel property.
     */
    public void setAttestationLevel(@jakarta.annotation.Nullable final AttestationLevel value) {
        this.attestationLevel = value;
    }
    /**
     * Sets the createdDateTime property value. The timestamp when this key was registered to the user.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The display name of the key as given by the user.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the model property value. The manufacturer-assigned model of the FIDO2 security key.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
}
