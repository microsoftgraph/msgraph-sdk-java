package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamsAsyncOperation extends Entity implements Parsable {
    /**
     * Instantiates a new TeamsAsyncOperation and sets the default values.
     */
    public TeamsAsyncOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamsAsyncOperation
     */
    @jakarta.annotation.Nonnull
    public static TeamsAsyncOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAsyncOperation();
    }
    /**
     * Gets the attemptsCount property value. Number of times the operation was attempted before being marked successful or failed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAttemptsCount() {
        return this.backingStore.get("attemptsCount");
    }
    /**
     * Gets the createdDateTime property value. Time when the operation was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the error property value. Any error that causes the async operation to fail.
     * @return a OperationError
     */
    @jakarta.annotation.Nullable
    public OperationError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attemptsCount", (n) -> { this.setAttemptsCount(n.getIntegerValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(OperationError::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionDateTime", (n) -> { this.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(TeamsAsyncOperationType.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(TeamsAsyncOperationStatus.class)); });
        deserializerMap.put("targetResourceId", (n) -> { this.setTargetResourceId(n.getStringValue()); });
        deserializerMap.put("targetResourceLocation", (n) -> { this.setTargetResourceLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActionDateTime property value. Time when the async operation was last updated.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.backingStore.get("lastActionDateTime");
    }
    /**
     * Gets the operationType property value. The operationType property
     * @return a TeamsAsyncOperationType
     */
    @jakarta.annotation.Nullable
    public TeamsAsyncOperationType getOperationType() {
        return this.backingStore.get("operationType");
    }
    /**
     * Gets the status property value. The status property
     * @return a TeamsAsyncOperationStatus
     */
    @jakarta.annotation.Nullable
    public TeamsAsyncOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the targetResourceId property value. The ID of the object that's created or modified as result of this async operation, typically a team.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetResourceId() {
        return this.backingStore.get("targetResourceId");
    }
    /**
     * Gets the targetResourceLocation property value. The location of the object that's created or modified as result of this async operation. This URL should be treated as an opaque value and not parsed into its component paths.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTargetResourceLocation() {
        return this.backingStore.get("targetResourceLocation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("attemptsCount", this.getAttemptsCount());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("targetResourceId", this.getTargetResourceId());
        writer.writeStringValue("targetResourceLocation", this.getTargetResourceLocation());
    }
    /**
     * Sets the attemptsCount property value. Number of times the operation was attempted before being marked successful or failed.
     * @param value Value to set for the attemptsCount property.
     */
    public void setAttemptsCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("attemptsCount", value);
    }
    /**
     * Sets the createdDateTime property value. Time when the operation was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the error property value. Any error that causes the async operation to fail.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final OperationError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the lastActionDateTime property value. Time when the async operation was last updated.
     * @param value Value to set for the lastActionDateTime property.
     */
    public void setLastActionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActionDateTime", value);
    }
    /**
     * Sets the operationType property value. The operationType property
     * @param value Value to set for the operationType property.
     */
    public void setOperationType(@jakarta.annotation.Nullable final TeamsAsyncOperationType value) {
        this.backingStore.set("operationType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final TeamsAsyncOperationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the targetResourceId property value. The ID of the object that's created or modified as result of this async operation, typically a team.
     * @param value Value to set for the targetResourceId property.
     */
    public void setTargetResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetResourceId", value);
    }
    /**
     * Sets the targetResourceLocation property value. The location of the object that's created or modified as result of this async operation. This URL should be treated as an opaque value and not parsed into its component paths.
     * @param value Value to set for the targetResourceLocation property.
     */
    public void setTargetResourceLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetResourceLocation", value);
    }
}
