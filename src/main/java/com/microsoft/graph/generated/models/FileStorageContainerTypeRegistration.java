package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileStorageContainerTypeRegistration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link FileStorageContainerTypeRegistration} and sets the default values.
     */
    public FileStorageContainerTypeRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileStorageContainerTypeRegistration}
     */
    @jakarta.annotation.Nonnull
    public static FileStorageContainerTypeRegistration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileStorageContainerTypeRegistration();
    }
    /**
     * Gets the applicationPermissionGrants property value. Access privileges of applications on containers.
     * @return a {@link java.util.List<FileStorageContainerTypeAppPermissionGrant>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileStorageContainerTypeAppPermissionGrant> getApplicationPermissionGrants() {
        return this.backingStore.get("applicationPermissionGrants");
    }
    /**
     * Gets the billingClassification property value. The billingClassification property
     * @return a {@link FileStorageContainerBillingClassification}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerBillingClassification getBillingClassification() {
        return this.backingStore.get("billingClassification");
    }
    /**
     * Gets the billingStatus property value. The billingStatus property
     * @return a {@link FileStorageContainerBillingStatus}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerBillingStatus getBillingStatus() {
        return this.backingStore.get("billingStatus");
    }
    /**
     * Gets the etag property value. Used in update scenarios for optimistic concurrency control. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEtag() {
        return this.backingStore.get("etag");
    }
    /**
     * Gets the expirationDateTime property value. The expiration date. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationPermissionGrants", (n) -> { this.setApplicationPermissionGrants(n.getCollectionOfObjectValues(FileStorageContainerTypeAppPermissionGrant::createFromDiscriminatorValue)); });
        deserializerMap.put("billingClassification", (n) -> { this.setBillingClassification(n.getEnumValue(FileStorageContainerBillingClassification::forValue)); });
        deserializerMap.put("billingStatus", (n) -> { this.setBillingStatus(n.getEnumValue(FileStorageContainerBillingStatus::forValue)); });
        deserializerMap.put("etag", (n) -> { this.setEtag(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("owningAppId", (n) -> { this.setOwningAppId(n.getUUIDValue()); });
        deserializerMap.put("registeredDateTime", (n) -> { this.setRegisteredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(FileStorageContainerTypeRegistrationSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the fileStorageContainerTypeRegistration. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the owningAppId property value. ID of the application that owns the fileStorageContainerType. Read-only.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getOwningAppId() {
        return this.backingStore.get("owningAppId");
    }
    /**
     * Gets the registeredDateTime property value. The registration date. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegisteredDateTime() {
        return this.backingStore.get("registeredDateTime");
    }
    /**
     * Gets the settings property value. The settings property
     * @return a {@link FileStorageContainerTypeRegistrationSettings}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerTypeRegistrationSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("applicationPermissionGrants", this.getApplicationPermissionGrants());
        writer.writeEnumValue("billingClassification", this.getBillingClassification());
        writer.writeEnumValue("billingStatus", this.getBillingStatus());
        writer.writeStringValue("etag", this.getEtag());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeUUIDValue("owningAppId", this.getOwningAppId());
        writer.writeOffsetDateTimeValue("registeredDateTime", this.getRegisteredDateTime());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the applicationPermissionGrants property value. Access privileges of applications on containers.
     * @param value Value to set for the applicationPermissionGrants property.
     */
    public void setApplicationPermissionGrants(@jakarta.annotation.Nullable final java.util.List<FileStorageContainerTypeAppPermissionGrant> value) {
        this.backingStore.set("applicationPermissionGrants", value);
    }
    /**
     * Sets the billingClassification property value. The billingClassification property
     * @param value Value to set for the billingClassification property.
     */
    public void setBillingClassification(@jakarta.annotation.Nullable final FileStorageContainerBillingClassification value) {
        this.backingStore.set("billingClassification", value);
    }
    /**
     * Sets the billingStatus property value. The billingStatus property
     * @param value Value to set for the billingStatus property.
     */
    public void setBillingStatus(@jakarta.annotation.Nullable final FileStorageContainerBillingStatus value) {
        this.backingStore.set("billingStatus", value);
    }
    /**
     * Sets the etag property value. Used in update scenarios for optimistic concurrency control. Read-only.
     * @param value Value to set for the etag property.
     */
    public void setEtag(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("etag", value);
    }
    /**
     * Sets the expirationDateTime property value. The expiration date. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the name property value. The name of the fileStorageContainerTypeRegistration. Read-only.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the owningAppId property value. ID of the application that owns the fileStorageContainerType. Read-only.
     * @param value Value to set for the owningAppId property.
     */
    public void setOwningAppId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("owningAppId", value);
    }
    /**
     * Sets the registeredDateTime property value. The registration date. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the registeredDateTime property.
     */
    public void setRegisteredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("registeredDateTime", value);
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final FileStorageContainerTypeRegistrationSettings value) {
        this.backingStore.set("settings", value);
    }
}
