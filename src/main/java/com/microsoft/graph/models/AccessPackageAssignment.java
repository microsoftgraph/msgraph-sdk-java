package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class AccessPackageAssignment extends Entity implements Parsable {
    /** Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters. */
    private AccessPackage _accessPackage;
    /** Read-only. Supports $filter (eq) on the id property and $expand query parameters. */
    private AccessPackageAssignmentPolicy _assignmentPolicy;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _expiredDateTime;
    /** When the access assignment is to be in place. Read-only. */
    private EntitlementManagementSchedule _schedule;
    /** The state of the access package assignment. The possible values are: delivering, partiallyDelivered, delivered, expired, deliveryFailed, unknownFutureValue. Read-only. Supports $filter (eq). */
    private AccessPackageAssignmentState _state;
    /** More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only. */
    private String _status;
    /** The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId. */
    private AccessPackageSubject _target;
    /**
     * Instantiates a new accessPackageAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignment() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignment
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignment();
    }
    /**
     * Gets the accessPackage property value. Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this._accessPackage;
    }
    /**
     * Gets the assignmentPolicy property value. Read-only. Supports $filter (eq) on the id property and $expand query parameters.
     * @return a accessPackageAssignmentPolicy
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentPolicy getAssignmentPolicy() {
        return this._assignmentPolicy;
    }
    /**
     * Gets the expiredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiredDateTime() {
        return this._expiredDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackage", (n) -> { currentObject.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
            this.put("assignmentPolicy", (n) -> { currentObject.setAssignmentPolicy(n.getObjectValue(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
            this.put("expiredDateTime", (n) -> { currentObject.setExpiredDateTime(n.getOffsetDateTimeValue()); });
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(EntitlementManagementSchedule::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(AccessPackageAssignmentState.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the schedule property value. When the access assignment is to be in place. Read-only.
     * @return a entitlementManagementSchedule
     */
    @javax.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this._schedule;
    }
    /**
     * Gets the state property value. The state of the access package assignment. The possible values are: delivering, partiallyDelivered, delivered, expired, deliveryFailed, unknownFutureValue. Read-only. Supports $filter (eq).
     * @return a accessPackageAssignmentState
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentState getState() {
        return this._state;
    }
    /**
     * Gets the status property value. More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the target property value. The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     * @return a accessPackageSubject
     */
    @javax.annotation.Nullable
    public AccessPackageSubject getTarget() {
        return this._target;
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
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeObjectValue("assignmentPolicy", this.getAssignmentPolicy());
        writer.writeOffsetDateTimeValue("expiredDateTime", this.getExpiredDateTime());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("status", this.getStatus());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the accessPackage property value. Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @param value Value to set for the accessPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackage(@javax.annotation.Nullable final AccessPackage value) {
        this._accessPackage = value;
    }
    /**
     * Sets the assignmentPolicy property value. Read-only. Supports $filter (eq) on the id property and $expand query parameters.
     * @param value Value to set for the assignmentPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentPolicy(@javax.annotation.Nullable final AccessPackageAssignmentPolicy value) {
        this._assignmentPolicy = value;
    }
    /**
     * Sets the expiredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the expiredDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiredDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expiredDateTime = value;
    }
    /**
     * Sets the schedule property value. When the access assignment is to be in place. Read-only.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedule(@javax.annotation.Nullable final EntitlementManagementSchedule value) {
        this._schedule = value;
    }
    /**
     * Sets the state property value. The state of the access package assignment. The possible values are: delivering, partiallyDelivered, delivered, expired, deliveryFailed, unknownFutureValue. Read-only. Supports $filter (eq).
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AccessPackageAssignmentState value) {
        this._state = value;
    }
    /**
     * Sets the status property value. More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the target property value. The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final AccessPackageSubject value) {
        this._target = value;
    }
}
