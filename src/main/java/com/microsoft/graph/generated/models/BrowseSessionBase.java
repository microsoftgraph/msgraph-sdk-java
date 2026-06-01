package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BrowseSessionBase extends Entity implements Parsable {
    /**
     * Instantiates a new {@link BrowseSessionBase} and sets the default values.
     */
    public BrowseSessionBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BrowseSessionBase}
     */
    @jakarta.annotation.Nonnull
    public static BrowseSessionBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.oneDriveForBusinessBrowseSession": return new OneDriveForBusinessBrowseSession();
                case "#microsoft.graph.sharePointBrowseSession": return new SharePointBrowseSession();
            }
        }
        return new BrowseSessionBase();
    }
    /**
     * Gets the backupSizeInBytes property value. The size of the backup in bytes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBackupSizeInBytes() {
        return this.backingStore.get("backupSizeInBytes");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the browse session was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the error property value. Contains the error details if the browse session creation fails.
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * Gets the expirationDateTime property value. The date and time after which the browse session is deleted automatically.
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
        deserializerMap.put("backupSizeInBytes", (n) -> { this.setBackupSizeInBytes(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("restorePointDateTime", (n) -> { this.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("restorePointId", (n) -> { this.setRestorePointId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BrowseSessionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the restorePointDateTime property value. The date and time of the restore point on which the browse session is created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this.backingStore.get("restorePointDateTime");
    }
    /**
     * Gets the restorePointId property value. The restorePointId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestorePointId() {
        return this.backingStore.get("restorePointId");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link BrowseSessionStatus}
     */
    @jakarta.annotation.Nullable
    public BrowseSessionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("backupSizeInBytes", this.getBackupSizeInBytes());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeStringValue("restorePointId", this.getRestorePointId());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the backupSizeInBytes property value. The size of the backup in bytes.
     * @param value Value to set for the backupSizeInBytes property.
     */
    public void setBackupSizeInBytes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("backupSizeInBytes", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the browse session was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the error property value. Contains the error details if the browse session creation fails.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the expirationDateTime property value. The date and time after which the browse session is deleted automatically.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the restorePointDateTime property value. The date and time of the restore point on which the browse session is created.
     * @param value Value to set for the restorePointDateTime property.
     */
    public void setRestorePointDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restorePointDateTime", value);
    }
    /**
     * Sets the restorePointId property value. The restorePointId property
     * @param value Value to set for the restorePointId property.
     */
    public void setRestorePointId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restorePointId", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BrowseSessionStatus value) {
        this.backingStore.set("status", value);
    }
}
