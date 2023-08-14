package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DelegatedAdminAccessAssignment extends Entity implements Parsable {
    /**
     * The accessContainer property
     */
    private DelegatedAdminAccessContainer accessContainer;
    /**
     * The accessDetails property
     */
    private DelegatedAdminAccessDetails accessDetails;
    /**
     * The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The date and time in ISO 8601 and in UTC time when this access assignment was last modified. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error, unknownFutureValue.
     */
    private DelegatedAdminAccessAssignmentStatus status;
    /**
     * Instantiates a new delegatedAdminAccessAssignment and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminAccessAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedAdminAccessAssignment
     */
    @jakarta.annotation.Nonnull
    public static DelegatedAdminAccessAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminAccessAssignment();
    }
    /**
     * Gets the accessContainer property value. The accessContainer property
     * @return a delegatedAdminAccessContainer
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminAccessContainer getAccessContainer() {
        return this.accessContainer;
    }
    /**
     * Gets the accessDetails property value. The accessDetails property
     * @return a delegatedAdminAccessDetails
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminAccessDetails getAccessDetails() {
        return this.accessDetails;
    }
    /**
     * Gets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
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
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the status property value. The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error, unknownFutureValue.
     * @return a delegatedAdminAccessAssignmentStatus
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminAccessAssignmentStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAccessContainer(@jakarta.annotation.Nullable final DelegatedAdminAccessContainer value) {
        this.accessContainer = value;
    }
    /**
     * Sets the accessDetails property value. The accessDetails property
     * @param value Value to set for the accessDetails property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAccessDetails(@jakarta.annotation.Nullable final DelegatedAdminAccessDetails value) {
        this.accessDetails = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time in ISO 8601 format and in UTC time when the access assignment was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time in ISO 8601 and in UTC time when this access assignment was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the status property value. The status of the access assignment. Read-only. The possible values are: pending, active, deleting, deleted, error, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final DelegatedAdminAccessAssignmentStatus value) {
        this.status = value;
    }
}
