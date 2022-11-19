package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Fido2AuthenticationMethod extends AuthenticationMethod implements Parsable {
    /** Authenticator Attestation GUID, an identifier that indicates the type (e.g. make and model) of the authenticator. */
    private String _aaGuid;
    /** The attestation certificate(s) attached to this security key. */
    private java.util.List<String> _attestationCertificates;
    /** The attestation level of this FIDO2 security key. Possible values are: attested, or notAttested. */
    private AttestationLevel _attestationLevel;
    /** The timestamp when this key was registered to the user. */
    private OffsetDateTime _createdDateTime;
    /** The display name of the key as given by the user. */
    private String _displayName;
    /** The manufacturer-assigned model of the FIDO2 security key. */
    private String _model;
    /**
     * Instantiates a new Fido2AuthenticationMethod and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Fido2AuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.fido2AuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Fido2AuthenticationMethod
     */
    @javax.annotation.Nonnull
    public static Fido2AuthenticationMethod createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Fido2AuthenticationMethod();
    }
    /**
     * Gets the aaGuid property value. Authenticator Attestation GUID, an identifier that indicates the type (e.g. make and model) of the authenticator.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAaGuid() {
        return this._aaGuid;
    }
    /**
     * Gets the attestationCertificates property value. The attestation certificate(s) attached to this security key.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAttestationCertificates() {
        return this._attestationCertificates;
    }
    /**
     * Gets the attestationLevel property value. The attestation level of this FIDO2 security key. Possible values are: attested, or notAttested.
     * @return a attestationLevel
     */
    @javax.annotation.Nullable
    public AttestationLevel getAttestationLevel() {
        return this._attestationLevel;
    }
    /**
     * Gets the createdDateTime property value. The timestamp when this key was registered to the user.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the displayName property value. The display name of the key as given by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Fido2AuthenticationMethod currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aaGuid", (n) -> { currentObject.setAaGuid(n.getStringValue()); });
        deserializerMap.put("attestationCertificates", (n) -> { currentObject.setAttestationCertificates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("attestationLevel", (n) -> { currentObject.setAttestationLevel(n.getEnumValue(AttestationLevel.class)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the model property value. The manufacturer-assigned model of the FIDO2 security key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAaGuid(@javax.annotation.Nullable final String value) {
        this._aaGuid = value;
    }
    /**
     * Sets the attestationCertificates property value. The attestation certificate(s) attached to this security key.
     * @param value Value to set for the attestationCertificates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttestationCertificates(@javax.annotation.Nullable final java.util.List<String> value) {
        this._attestationCertificates = value;
    }
    /**
     * Sets the attestationLevel property value. The attestation level of this FIDO2 security key. Possible values are: attested, or notAttested.
     * @param value Value to set for the attestationLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttestationLevel(@javax.annotation.Nullable final AttestationLevel value) {
        this._attestationLevel = value;
    }
    /**
     * Sets the createdDateTime property value. The timestamp when this key was registered to the user.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The display name of the key as given by the user.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the model property value. The manufacturer-assigned model of the FIDO2 security key.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
}
