package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DelegatedAdminAccessAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new DelegatedAdminAccessAssignment and sets the default values.
     */
    public DelegatedAdminAccessAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DelegatedAdminAccessAssignment
     */
    @jakarta.annotation.Nonnull
    public static DelegatedAdminAccessAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminAccessAssignment();
    }
    /**
     * Gets the accessContainer property value. The accessContainer property
     * @return a DelegatedAdminAccessContainer
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminAccessContainer getAccessContainer() {
        return this.BackingStore.get("accessContainer");
    }
    /**
     * Gets the accessDetails property value. The accessDetails property
     * @return a DelegatedAdminAccessDetails
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminAccessDetails getAccessDetails() {
        return this.BackingStore.get("accessDetails");
    }
    /**
     * Gets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessContainer", (n) -> { this.setAccessContainer(n.getObjectValue(DelegatedAdminAccessContainer::createFromDiscriminatorValue)); });
        deserializerMap.put("accessDetails", (n) -> { this.setAccessDetails(n.getObjectValue(DelegatedAdminAccessDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DelegatedAdminAccessAssignmentStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time in ISO 8601 and in UTC time when this access assignment was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the status property value. The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error, unknownFutureValue.
     * @return a DelegatedAdminAccessAssignmentStatus
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminAccessAssignmentStatus getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessContainer", this.getAccessContainer());
        writer.writeObjectValue("accessDetails", this.getAccessDetails());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the accessContainer property value. The accessContainer property
     * @param value Value to set for the accessContainer property.
     */
    public void setAccessContainer(@jakarta.annotation.Nullable final DelegatedAdminAccessContainer value) {
        this.BackingStore.set("accessContainer", value);
    }
    /**
     * Sets the accessDetails property value. The accessDetails property
     * @param value Value to set for the accessDetails property.
     */
    public void setAccessDetails(@jakarta.annotation.Nullable final DelegatedAdminAccessDetails value) {
        this.BackingStore.set("accessDetails", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time in ISO 8601 and in UTC time when this access assignment was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the status property value. The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DelegatedAdminAccessAssignmentStatus value) {
        this.BackingStore.set("status", value);
    }
}
