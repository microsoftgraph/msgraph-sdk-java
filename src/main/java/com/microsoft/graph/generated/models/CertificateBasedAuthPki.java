package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CertificateBasedAuthPki extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link CertificateBasedAuthPki} and sets the default values.
     */
    public CertificateBasedAuthPki() {
        super();
        this.setOdataType("#microsoft.graph.certificateBasedAuthPki");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CertificateBasedAuthPki}
     */
    @jakarta.annotation.Nonnull
    public static CertificateBasedAuthPki createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateBasedAuthPki();
    }
    /**
     * Gets the certificateAuthorities property value. The collection of certificate authorities contained in this public key infrastructure resource.
     * @return a {@link java.util.List<CertificateAuthorityDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CertificateAuthorityDetail> getCertificateAuthorities() {
        return this.backingStore.get("certificateAuthorities");
    }
    /**
     * Gets the displayName property value. The name of the object. Maximum length is 256 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateAuthorities", (n) -> { this.setCertificateAuthorities(n.getCollectionOfObjectValues(CertificateAuthorityDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("statusDetails", (n) -> { this.setStatusDetails(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the object was created or last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the status property value. The status of any asynchronous jobs runs on the object which can be upload or delete.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the statusDetails property value. The status details of the upload/deleted operation of PKI (Public Key Infrastructure).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusDetails() {
        return this.backingStore.get("statusDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("certificateAuthorities", this.getCertificateAuthorities());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("statusDetails", this.getStatusDetails());
    }
    /**
     * Sets the certificateAuthorities property value. The collection of certificate authorities contained in this public key infrastructure resource.
     * @param value Value to set for the certificateAuthorities property.
     */
    public void setCertificateAuthorities(@jakarta.annotation.Nullable final java.util.List<CertificateAuthorityDetail> value) {
        this.backingStore.set("certificateAuthorities", value);
    }
    /**
     * Sets the displayName property value. The name of the object. Maximum length is 256 characters.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the object was created or last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the status property value. The status of any asynchronous jobs runs on the object which can be upload or delete.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the statusDetails property value. The status details of the upload/deleted operation of PKI (Public Key Infrastructure).
     * @param value Value to set for the statusDetails property.
     */
    public void setStatusDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statusDetails", value);
    }
}
