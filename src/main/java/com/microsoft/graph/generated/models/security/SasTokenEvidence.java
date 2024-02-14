package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SasTokenEvidence extends AlertEvidence implements Parsable {
    /**
     * Instantiates a new {@link SasTokenEvidence} and sets the default values.
     */
    public SasTokenEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.sasTokenEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SasTokenEvidence}
     */
    @jakarta.annotation.Nonnull
    public static SasTokenEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SasTokenEvidence();
    }
    /**
     * Gets the allowedIpAddresses property value. The allowedIpAddresses property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAllowedIpAddresses() {
        return this.backingStore.get("allowedIpAddresses");
    }
    /**
     * Gets the allowedResourceTypes property value. The allowedResourceTypes property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedResourceTypes() {
        return this.backingStore.get("allowedResourceTypes");
    }
    /**
     * Gets the allowedServices property value. The allowedServices property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedServices() {
        return this.backingStore.get("allowedServices");
    }
    /**
     * Gets the expiryDateTime property value. The expiryDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiryDateTime() {
        return this.backingStore.get("expiryDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedIpAddresses", (n) -> { this.setAllowedIpAddresses(n.getStringValue()); });
        deserializerMap.put("allowedResourceTypes", (n) -> { this.setAllowedResourceTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedServices", (n) -> { this.setAllowedServices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("expiryDateTime", (n) -> { this.setExpiryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("protocol", (n) -> { this.setProtocol(n.getStringValue()); });
        deserializerMap.put("signatureHash", (n) -> { this.setSignatureHash(n.getStringValue()); });
        deserializerMap.put("signedWith", (n) -> { this.setSignedWith(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("storageResource", (n) -> { this.setStorageResource(n.getObjectValue(AzureResourceEvidence::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissions property value. The permissions property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.backingStore.get("permissions");
    }
    /**
     * Gets the protocol property value. The protocol property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProtocol() {
        return this.backingStore.get("protocol");
    }
    /**
     * Gets the signatureHash property value. The signatureHash property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignatureHash() {
        return this.backingStore.get("signatureHash");
    }
    /**
     * Gets the signedWith property value. The signedWith property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignedWith() {
        return this.backingStore.get("signedWith");
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the storageResource property value. The storageResource property
     * @return a {@link AzureResourceEvidence}
     */
    @jakarta.annotation.Nullable
    public AzureResourceEvidence getStorageResource() {
        return this.backingStore.get("storageResource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("allowedIpAddresses", this.getAllowedIpAddresses());
        writer.writeCollectionOfPrimitiveValues("allowedResourceTypes", this.getAllowedResourceTypes());
        writer.writeCollectionOfPrimitiveValues("allowedServices", this.getAllowedServices());
        writer.writeOffsetDateTimeValue("expiryDateTime", this.getExpiryDateTime());
        writer.writeCollectionOfPrimitiveValues("permissions", this.getPermissions());
        writer.writeStringValue("protocol", this.getProtocol());
        writer.writeStringValue("signatureHash", this.getSignatureHash());
        writer.writeStringValue("signedWith", this.getSignedWith());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeObjectValue("storageResource", this.getStorageResource());
    }
    /**
     * Sets the allowedIpAddresses property value. The allowedIpAddresses property
     * @param value Value to set for the allowedIpAddresses property.
     */
    public void setAllowedIpAddresses(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("allowedIpAddresses", value);
    }
    /**
     * Sets the allowedResourceTypes property value. The allowedResourceTypes property
     * @param value Value to set for the allowedResourceTypes property.
     */
    public void setAllowedResourceTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedResourceTypes", value);
    }
    /**
     * Sets the allowedServices property value. The allowedServices property
     * @param value Value to set for the allowedServices property.
     */
    public void setAllowedServices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedServices", value);
    }
    /**
     * Sets the expiryDateTime property value. The expiryDateTime property
     * @param value Value to set for the expiryDateTime property.
     */
    public void setExpiryDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expiryDateTime", value);
    }
    /**
     * Sets the permissions property value. The permissions property
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("permissions", value);
    }
    /**
     * Sets the protocol property value. The protocol property
     * @param value Value to set for the protocol property.
     */
    public void setProtocol(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("protocol", value);
    }
    /**
     * Sets the signatureHash property value. The signatureHash property
     * @param value Value to set for the signatureHash property.
     */
    public void setSignatureHash(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signatureHash", value);
    }
    /**
     * Sets the signedWith property value. The signedWith property
     * @param value Value to set for the signedWith property.
     */
    public void setSignedWith(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signedWith", value);
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the storageResource property value. The storageResource property
     * @param value Value to set for the storageResource property.
     */
    public void setStorageResource(@jakarta.annotation.Nullable final AzureResourceEvidence value) {
        this.backingStore.set("storageResource", value);
    }
}
