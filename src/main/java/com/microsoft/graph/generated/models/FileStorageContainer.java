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
public class FileStorageContainer extends Entity implements Parsable {
    /**
     * Instantiates a new {@link FileStorageContainer} and sets the default values.
     */
    public FileStorageContainer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileStorageContainer}
     */
    @jakarta.annotation.Nonnull
    public static FileStorageContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileStorageContainer();
    }
    /**
     * Gets the containerTypeId property value. Container type ID of the fileStorageContainer. For details about container types, see Container Types. Each container must have only one container type. Read-only.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getContainerTypeId() {
        return this.backingStore.get("containerTypeId");
    }
    /**
     * Gets the createdDateTime property value. Date and time of the fileStorageContainer creation. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customProperties property value. Custom property collection for the fileStorageContainer. Read-write.
     * @return a {@link FileStorageContainerCustomPropertyDictionary}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerCustomPropertyDictionary getCustomProperties() {
        return this.backingStore.get("customProperties");
    }
    /**
     * Gets the description property value. Provides a user-visible description of the fileStorageContainer. Read-write.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the fileStorageContainer. Read-write.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the drive property value. The drive of the resource fileStorageContainer. Read-only.
     * @return a {@link Drive}
     */
    @jakarta.annotation.Nullable
    public Drive getDrive() {
        return this.backingStore.get("drive");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("containerTypeId", (n) -> { this.setContainerTypeId(n.getUUIDValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customProperties", (n) -> { this.setCustomProperties(n.getObjectValue(FileStorageContainerCustomPropertyDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("drive", (n) -> { this.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfObjectValues(Permission::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FileStorageContainerStatus::forValue)); });
        deserializerMap.put("viewpoint", (n) -> { this.setViewpoint(n.getObjectValue(FileStorageContainerViewpoint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the permissions property value. The set of permissions for users in the fileStorageContainer. Permission for each user is set by the roles property. The possible values are: reader, writer, manager, and owner. Read-write.
     * @return a {@link java.util.List<Permission>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Permission> getPermissions() {
        return this.backingStore.get("permissions");
    }
    /**
     * Gets the status property value. Status of the fileStorageContainer. Containers are created as inactive and require activation. Inactive containers are subjected to automatic deletion in 24 hours. The possible values are: inactive, active. Read-only.
     * @return a {@link FileStorageContainerStatus}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the viewpoint property value. Data specific to the current user. Read-only.
     * @return a {@link FileStorageContainerViewpoint}
     */
    @jakarta.annotation.Nullable
    public FileStorageContainerViewpoint getViewpoint() {
        return this.backingStore.get("viewpoint");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeUUIDValue("containerTypeId", this.getContainerTypeId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("customProperties", this.getCustomProperties());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("permissions", this.getPermissions());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("viewpoint", this.getViewpoint());
    }
    /**
     * Sets the containerTypeId property value. Container type ID of the fileStorageContainer. For details about container types, see Container Types. Each container must have only one container type. Read-only.
     * @param value Value to set for the containerTypeId property.
     */
    public void setContainerTypeId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("containerTypeId", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time of the fileStorageContainer creation. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customProperties property value. Custom property collection for the fileStorageContainer. Read-write.
     * @param value Value to set for the customProperties property.
     */
    public void setCustomProperties(@jakarta.annotation.Nullable final FileStorageContainerCustomPropertyDictionary value) {
        this.backingStore.set("customProperties", value);
    }
    /**
     * Sets the description property value. Provides a user-visible description of the fileStorageContainer. Read-write.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the fileStorageContainer. Read-write.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the drive property value. The drive of the resource fileStorageContainer. Read-only.
     * @param value Value to set for the drive property.
     */
    public void setDrive(@jakarta.annotation.Nullable final Drive value) {
        this.backingStore.set("drive", value);
    }
    /**
     * Sets the permissions property value. The set of permissions for users in the fileStorageContainer. Permission for each user is set by the roles property. The possible values are: reader, writer, manager, and owner. Read-write.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<Permission> value) {
        this.backingStore.set("permissions", value);
    }
    /**
     * Sets the status property value. Status of the fileStorageContainer. Containers are created as inactive and require activation. Inactive containers are subjected to automatic deletion in 24 hours. The possible values are: inactive, active. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FileStorageContainerStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the viewpoint property value. Data specific to the current user. Read-only.
     * @param value Value to set for the viewpoint property.
     */
    public void setViewpoint(@jakarta.annotation.Nullable final FileStorageContainerViewpoint value) {
        this.backingStore.set("viewpoint", value);
    }
}
