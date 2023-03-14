package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsAsyncOperation extends Entity implements Parsable {
    /** Number of times the operation was attempted before being marked successful or failed. */
    private Integer attemptsCount;
    /** Time when the operation was created. */
    private OffsetDateTime createdDateTime;
    /** Any error that causes the async operation to fail. */
    private OperationError error;
    /** Time when the async operation was last updated. */
    private OffsetDateTime lastActionDateTime;
    /** The operationType property */
    private TeamsAsyncOperationType operationType;
    /** The status property */
    private TeamsAsyncOperationStatus status;
    /** The ID of the object that's created or modified as result of this async operation, typically a team. */
    private String targetResourceId;
    /** The location of the object that's created or modified as result of this async operation. This URL should be treated as an opaque value and not parsed into its component paths. */
    private String targetResourceLocation;
    /**
     * Instantiates a new teamsAsyncOperation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamsAsyncOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsAsyncOperation
     */
    @javax.annotation.Nonnull
    public static TeamsAsyncOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsAsyncOperation();
    }
    /**
     * Gets the attemptsCount property value. Number of times the operation was attempted before being marked successful or failed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAttemptsCount() {
        return this.attemptsCount;
    }
    /**
     * Gets the createdDateTime property value. Time when the operation was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the error property value. Any error that causes the async operation to fail.
     * @return a operationError
     */
    @javax.annotation.Nullable
    public OperationError getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
    /**
     * Gets the operationType property value. The operationType property
     * @return a teamsAsyncOperationType
     */
    @javax.annotation.Nullable
    public TeamsAsyncOperationType getOperationType() {
        return this.operationType;
    }
    /**
     * Gets the status property value. The status property
     * @return a teamsAsyncOperationStatus
     */
    @javax.annotation.Nullable
    public TeamsAsyncOperationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the targetResourceId property value. The ID of the object that's created or modified as result of this async operation, typically a team.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetResourceId() {
        return this.targetResourceId;
    }
    /**
     * Gets the targetResourceLocation property value. The location of the object that's created or modified as result of this async operation. This URL should be treated as an opaque value and not parsed into its component paths.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetResourceLocation() {
        return this.targetResourceLocation;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttemptsCount(@javax.annotation.Nullable final Integer value) {
        this.attemptsCount = value;
    }
    /**
     * Sets the createdDateTime property value. Time when the operation was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the error property value. Any error that causes the async operation to fail.
     * @param value Value to set for the error property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setError(@javax.annotation.Nullable final OperationError value) {
        this.error = value;
    }
    /**
     * Sets the lastActionDateTime property value. Time when the async operation was last updated.
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastActionDateTime = value;
    }
    /**
     * Sets the operationType property value. The operationType property
     * @param value Value to set for the operationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationType(@javax.annotation.Nullable final TeamsAsyncOperationType value) {
        this.operationType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final TeamsAsyncOperationStatus value) {
        this.status = value;
    }
    /**
     * Sets the targetResourceId property value. The ID of the object that's created or modified as result of this async operation, typically a team.
     * @param value Value to set for the targetResourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetResourceId(@javax.annotation.Nullable final String value) {
        this.targetResourceId = value;
    }
    /**
     * Sets the targetResourceLocation property value. The location of the object that's created or modified as result of this async operation. This URL should be treated as an opaque value and not parsed into its component paths.
     * @param value Value to set for the targetResourceLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetResourceLocation(@javax.annotation.Nullable final String value) {
        this.targetResourceLocation = value;
    }
}
