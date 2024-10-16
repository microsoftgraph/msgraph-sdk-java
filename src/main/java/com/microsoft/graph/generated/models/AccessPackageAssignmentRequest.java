package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessPackageAssignmentRequest} and sets the default values.
     */
    public AccessPackageAssignmentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageAssignmentRequest}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentRequest();
    }
    /**
     * Gets the accessPackage property value. The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable.  Supports $expand.
     * @return a {@link AccessPackage}
     */
    @jakarta.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this.backingStore.get("accessPackage");
    }
    /**
     * Gets the answers property value. Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     * @return a {@link java.util.List<AccessPackageAnswer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAnswer> getAnswers() {
        return this.backingStore.get("answers");
    }
    /**
     * Gets the assignment property value. For a requestType of userAdd or adminAdd, this is an access package assignment requested to be created. For a requestType of userRemove, adminRemove or systemRemove, this has the id property of an existing assignment to be removed.   Supports $expand.
     * @return a {@link AccessPackageAssignment}
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignment getAssignment() {
        return this.backingStore.get("assignment");
    }
    /**
     * Gets the completedDateTime property value. The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customExtensionCalloutInstances property value. Information about all the custom extension calls that were made during the access package assignment workflow.
     * @return a {@link java.util.List<CustomExtensionCalloutInstance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionCalloutInstance> getCustomExtensionCalloutInstances() {
        return this.backingStore.get("customExtensionCalloutInstances");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("answers", (n) -> { this.setAnswers(n.getCollectionOfObjectValues(AccessPackageAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("assignment", (n) -> { this.setAssignment(n.getObjectValue(AccessPackageAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customExtensionCalloutInstances", (n) -> { this.setCustomExtensionCalloutInstances(n.getCollectionOfObjectValues(CustomExtensionCalloutInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("requestor", (n) -> { this.setRequestor(n.getObjectValue(AccessPackageSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("requestType", (n) -> { this.setRequestType(n.getEnumValue(AccessPackageRequestType::forValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(EntitlementManagementSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AccessPackageRequestState::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the requestor property value. The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     * @return a {@link AccessPackageSubject}
     */
    @jakarta.annotation.Nullable
    public AccessPackageSubject getRequestor() {
        return this.backingStore.get("requestor");
    }
    /**
     * Gets the requestType property value. The type of the request. The possible values are: notSpecified, userAdd, UserExtend, userUpdate, userRemove, adminAdd, adminUpdate, adminRemove, systemAdd, systemUpdate, systemRemove, onBehalfAdd (not supported), unknownFutureValue. Requests from the user have a requestType of userAdd, userUpdate, or userRemove. This property can't be changed once set.
     * @return a {@link AccessPackageRequestType}
     */
    @jakarta.annotation.Nullable
    public AccessPackageRequestType getRequestType() {
        return this.backingStore.get("requestType");
    }
    /**
     * Gets the schedule property value. The range of dates that access is to be assigned to the requestor. This property can't be changed once set, but a new schedule for an assignment can be included in another userUpdate or UserExtend or adminUpdate assignment request.
     * @return a {@link EntitlementManagementSchedule}
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Gets the state property value. The state of the request. The possible values are: submitted, pendingApproval, delivering, delivered, deliveryFailed, denied, scheduled, canceled, partiallyDelivered, unknownFutureValue. Read-only. Supports $filter (eq).
     * @return a {@link AccessPackageRequestState}
     */
    @jakarta.annotation.Nullable
    public AccessPackageRequestState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the status property value. More information on the request processing status. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeCollectionOfObjectValues("answers", this.getAnswers());
        writer.writeObjectValue("assignment", this.getAssignment());
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customExtensionCalloutInstances", this.getCustomExtensionCalloutInstances());
        writer.writeObjectValue("requestor", this.getRequestor());
        writer.writeEnumValue("requestType", this.getRequestType());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the accessPackage property value. The access package associated with the accessPackageAssignmentRequest. An access package defines the collections of resource roles and the policies for how one or more users can get access to those resources. Read-only. Nullable.  Supports $expand.
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final AccessPackage value) {
        this.backingStore.set("accessPackage", value);
    }
    /**
     * Sets the answers property value. Answers provided by the requestor to accessPackageQuestions asked of them at the time of request.
     * @param value Value to set for the answers property.
     */
    public void setAnswers(@jakarta.annotation.Nullable final java.util.List<AccessPackageAnswer> value) {
        this.backingStore.set("answers", value);
    }
    /**
     * Sets the assignment property value. For a requestType of userAdd or adminAdd, this is an access package assignment requested to be created. For a requestType of userRemove, adminRemove or systemRemove, this has the id property of an existing assignment to be removed.   Supports $expand.
     * @param value Value to set for the assignment property.
     */
    public void setAssignment(@jakarta.annotation.Nullable final AccessPackageAssignment value) {
        this.backingStore.set("assignment", value);
    }
    /**
     * Sets the completedDateTime property value. The date of the end of processing, either successful or failure, of a request. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customExtensionCalloutInstances property value. Information about all the custom extension calls that were made during the access package assignment workflow.
     * @param value Value to set for the customExtensionCalloutInstances property.
     */
    public void setCustomExtensionCalloutInstances(@jakarta.annotation.Nullable final java.util.List<CustomExtensionCalloutInstance> value) {
        this.backingStore.set("customExtensionCalloutInstances", value);
    }
    /**
     * Sets the requestor property value. The subject who requested or, if a direct assignment, was assigned. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the requestor property.
     */
    public void setRequestor(@jakarta.annotation.Nullable final AccessPackageSubject value) {
        this.backingStore.set("requestor", value);
    }
    /**
     * Sets the requestType property value. The type of the request. The possible values are: notSpecified, userAdd, UserExtend, userUpdate, userRemove, adminAdd, adminUpdate, adminRemove, systemAdd, systemUpdate, systemRemove, onBehalfAdd (not supported), unknownFutureValue. Requests from the user have a requestType of userAdd, userUpdate, or userRemove. This property can't be changed once set.
     * @param value Value to set for the requestType property.
     */
    public void setRequestType(@jakarta.annotation.Nullable final AccessPackageRequestType value) {
        this.backingStore.set("requestType", value);
    }
    /**
     * Sets the schedule property value. The range of dates that access is to be assigned to the requestor. This property can't be changed once set, but a new schedule for an assignment can be included in another userUpdate or UserExtend or adminUpdate assignment request.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final EntitlementManagementSchedule value) {
        this.backingStore.set("schedule", value);
    }
    /**
     * Sets the state property value. The state of the request. The possible values are: submitted, pendingApproval, delivering, delivered, deliveryFailed, denied, scheduled, canceled, partiallyDelivered, unknownFutureValue. Read-only. Supports $filter (eq).
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AccessPackageRequestState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the status property value. More information on the request processing status. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
}
