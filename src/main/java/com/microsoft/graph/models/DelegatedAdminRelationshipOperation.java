package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
     * Instantiates a new DelegatedAdminRelationshipOperation and sets the default values.
     */
    public DelegatedAdminRelationshipOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DelegatedAdminRelationshipOperation
     */
    @jakarta.annotation.Nonnull
    public static DelegatedAdminRelationshipOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegatedAdminRelationshipOperation();
    }
    /**
     * Gets the createdDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was created. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the data property value. The data (payload) for the operation. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the operationType property value. The operationType property
     * @return a DelegatedAdminRelationshipOperationType
     */
    @jakarta.annotation.Nullable
    public DelegatedAdminRelationshipOperationType getOperationType() {
        return this.operationType;
    }
    /**
     * Gets the status property value. The status property
     * @return a LongRunningOperationStatus
     */
    @jakarta.annotation.Nullable
    public LongRunningOperationStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the data property value. The data (payload) for the operation. Read-only.
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final String value) {
        this.data = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The time in ISO 8601 format and in UTC time when the long-running operation was last modified. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the operationType property value. The operationType property
     * @param value Value to set for the operationType property.
     */
    public void setOperationType(@jakarta.annotation.Nullable final DelegatedAdminRelationshipOperationType value) {
        this.operationType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final LongRunningOperationStatus value) {
        this.status = value;
    }
}
