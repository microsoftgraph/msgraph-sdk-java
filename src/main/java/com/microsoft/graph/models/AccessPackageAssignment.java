package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignment extends Entity implements Parsable {
    /**
     * Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     */
    private AccessPackage accessPackage;
    /**
     * Read-only. Supports $filter (eq) on the id property and $expand query parameters.
     */
    private AccessPackageAssignmentPolicy assignmentPolicy;
    /**
     * Information about all the custom extension calls that were made during the access package assignment workflow.
     */
    private java.util.List<CustomExtensionCalloutInstance> customExtensionCalloutInstances;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime expiredDateTime;
    /**
     * When the access assignment is to be in place. Read-only.
     */
    private EntitlementManagementSchedule schedule;
    /**
     * The state of the access package assignment. The possible values are: delivering, partiallyDelivered, delivered, expired, deliveryFailed, unknownFutureValue. Read-only. Supports $filter (eq).
     */
    private AccessPackageAssignmentState state;
    /**
     * More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     */
    private String status;
    /**
     * The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     */
    private AccessPackageSubject target;
    /**
     * Instantiates a new accessPackageAssignment and sets the default values.
     */
    public AccessPackageAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignment
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignment();
    }
    /**
     * Gets the accessPackage property value. Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @return a accessPackage
     */
    @jakarta.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this.accessPackage;
    }
    /**
     * Gets the assignmentPolicy property value. Read-only. Supports $filter (eq) on the id property and $expand query parameters.
     * @return a accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentPolicy getAssignmentPolicy() {
        return this.assignmentPolicy;
    }
    /**
     * Gets the customExtensionCalloutInstances property value. Information about all the custom extension calls that were made during the access package assignment workflow.
     * @return a customExtensionCalloutInstance
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionCalloutInstance> getCustomExtensionCalloutInstances() {
        return this.customExtensionCalloutInstances;
    }
    /**
     * Gets the expiredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiredDateTime() {
        return this.expiredDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentPolicy", (n) -> { this.setAssignmentPolicy(n.getObjectValue(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtensionCalloutInstances", (n) -> { this.setCustomExtensionCalloutInstances(n.getCollectionOfObjectValues(CustomExtensionCalloutInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("expiredDateTime", (n) -> { this.setExpiredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(EntitlementManagementSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AccessPackageAssignmentState.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("target", (n) -> { this.setTarget(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the schedule property value. When the access assignment is to be in place. Read-only.
     * @return a entitlementManagementSchedule
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the state property value. The state of the access package assignment. The possible values are: delivering, partiallyDelivered, delivered, expired, deliveryFailed, unknownFutureValue. Read-only. Supports $filter (eq).
     * @return a accessPackageAssignmentState
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentState getState() {
        return this.state;
    }
    /**
     * Gets the status property value. More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the target property value. The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     * @return a accessPackageSubject
     */
    @jakarta.annotation.Nullable
    public AccessPackageSubject getTarget() {
        return this.target;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeObjectValue("assignmentPolicy", this.getAssignmentPolicy());
        writer.writeCollectionOfObjectValues("customExtensionCalloutInstances", this.getCustomExtensionCalloutInstances());
        writer.writeOffsetDateTimeValue("expiredDateTime", this.getExpiredDateTime());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("status", this.getStatus());
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the accessPackage property value. Read-only. Nullable. Supports $filter (eq) on the id property and $expand query parameters.
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final AccessPackage value) {
        this.accessPackage = value;
    }
    /**
     * Sets the assignmentPolicy property value. Read-only. Supports $filter (eq) on the id property and $expand query parameters.
     * @param value Value to set for the assignmentPolicy property.
     */
    public void setAssignmentPolicy(@jakarta.annotation.Nullable final AccessPackageAssignmentPolicy value) {
        this.assignmentPolicy = value;
    }
    /**
     * Sets the customExtensionCalloutInstances property value. Information about all the custom extension calls that were made during the access package assignment workflow.
     * @param value Value to set for the customExtensionCalloutInstances property.
     */
    public void setCustomExtensionCalloutInstances(@jakarta.annotation.Nullable final java.util.List<CustomExtensionCalloutInstance> value) {
        this.customExtensionCalloutInstances = value;
    }
    /**
     * Sets the expiredDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the expiredDateTime property.
     */
    public void setExpiredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiredDateTime = value;
    }
    /**
     * Sets the schedule property value. When the access assignment is to be in place. Read-only.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final EntitlementManagementSchedule value) {
        this.schedule = value;
    }
    /**
     * Sets the state property value. The state of the access package assignment. The possible values are: delivering, partiallyDelivered, delivered, expired, deliveryFailed, unknownFutureValue. Read-only. Supports $filter (eq).
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AccessPackageAssignmentState value) {
        this.state = value;
    }
    /**
     * Sets the status property value. More information about the assignment lifecycle.  Possible values include Delivering, Delivered, NearExpiry1DayNotificationTriggered, or ExpiredNotificationTriggered.  Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the target property value. The subject of the access package assignment. Read-only. Nullable. Supports $expand. Supports $filter (eq) on objectId.
     * @param value Value to set for the target property.
     */
    public void setTarget(@jakarta.annotation.Nullable final AccessPackageSubject value) {
        this.target = value;
    }
}
