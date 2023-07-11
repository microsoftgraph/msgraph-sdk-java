package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DelegatedAdminRelationshipOperation extends Entity implements Parsable {
    /**
     * The time in ISO 8601 format and in UTC time when the long-running operation was created. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The data (payload) for the operation. Read-only.
     */
    private String data;
    /**
     * The time in ISO 8601 format and in UTC time when the long-running operation was last modified. Read-only.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The operationType property
     */
    private DelegatedAdminRelationshipOperationType operationType;
    /**
     * The status property
     */
    private LongRunningOperationStatus status;
    /**
     * Instantiates a new delegatedAdminRelationshipOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DelegatedAdminRelationshipOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a delegatedAdminRelationshipOperation
     */
    @javax.annotation.Nonnull
    public static DelegatedAdminRelationshipOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminRelationshipOperation();
    }
    /**
     * Gets the createdDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was created. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the data property value. The data (payload) for the operation. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("data", (n) -> { this.setData(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(DelegatedAdminRelationshipOperationType.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(LongRunningOperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was last modified. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the operationType property value. The operationType property
     * @return a delegatedAdminRelationshipOperationType
     */
    @javax.annotation.Nullable
    public DelegatedAdminRelationshipOperationType getOperationType() {
        return this.operationType;
    }
    /**
     * Gets the status property value. The status property
     * @return a longRunningOperationStatus
     */
    @javax.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this.status;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("data", this.getData());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the data property value. The data (payload) for the operation. Read-only.
     * @param value Value to set for the data property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setData(@javax.annotation.Nullable final String value) {
        this.data = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the operationType property value. The operationType property
     * @param value Value to set for the operationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationType(@javax.annotation.Nullable final DelegatedAdminRelationshipOperationType value) {
        this.operationType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final LongRunningOperationStatus value) {
        this.status = value;
    }
}
