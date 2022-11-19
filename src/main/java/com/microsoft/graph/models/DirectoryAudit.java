package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the admin singleton. */
public class DirectoryAudit extends Entity implements Parsable {
    /** Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _activityDateTime;
    /** Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list, see Azure AD activity list. */
    private String _activityDisplayName;
    /** Indicates additional details on the activity. */
    private java.util.List<KeyValue> _additionalDetails;
    /** Indicates which resource category that's targeted by the activity. For example: UserManagement, GroupManagement, ApplicationManagement, RoleManagement. */
    private String _category;
    /** Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs across services. */
    private String _correlationId;
    /** The initiatedBy property */
    private AuditActivityInitiator _initiatedBy;
    /** Indicates information on which service initiated the activity (For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management. */
    private String _loggedByService;
    /** Indicates the type of operation that was performed. The possible values include but are not limited to the following: Add, Assign, Update, Unassign, and Delete. */
    private String _operationType;
    /** Indicates the result of the activity. Possible values are: success, failure, timeout, unknownFutureValue. */
    private OperationResult _result;
    /** Indicates the reason for failure if the result is failure or timeout. */
    private String _resultReason;
    /** Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device, Directory, App, Role, Group, Policy or Other. */
    private java.util.List<TargetResource> _targetResources;
    /**
     * Instantiates a new directoryAudit and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DirectoryAudit() {
        super();
        this.setOdataType("#microsoft.graph.directoryAudit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directoryAudit
     */
    @javax.annotation.Nonnull
    public static DirectoryAudit createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryAudit();
    }
    /**
     * Gets the activityDateTime property value. Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this._activityDateTime;
    }
    /**
     * Gets the activityDisplayName property value. Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list, see Azure AD activity list.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivityDisplayName() {
        return this._activityDisplayName;
    }
    /**
     * Gets the additionalDetails property value. Indicates additional details on the activity.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getAdditionalDetails() {
        return this._additionalDetails;
    }
    /**
     * Gets the category property value. Indicates which resource category that's targeted by the activity. For example: UserManagement, GroupManagement, ApplicationManagement, RoleManagement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return this._category;
    }
    /**
     * Gets the correlationId property value. Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs across services.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this._correlationId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DirectoryAudit currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityDateTime", (n) -> { currentObject.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("activityDisplayName", (n) -> { currentObject.setActivityDisplayName(n.getStringValue()); });
        deserializerMap.put("additionalDetails", (n) -> { currentObject.setAdditionalDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { currentObject.setCategory(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { currentObject.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("initiatedBy", (n) -> { currentObject.setInitiatedBy(n.getObjectValue(AuditActivityInitiator::createFromDiscriminatorValue)); });
        deserializerMap.put("loggedByService", (n) -> { currentObject.setLoggedByService(n.getStringValue()); });
        deserializerMap.put("operationType", (n) -> { currentObject.setOperationType(n.getStringValue()); });
        deserializerMap.put("result", (n) -> { currentObject.setResult(n.getEnumValue(OperationResult.class)); });
        deserializerMap.put("resultReason", (n) -> { currentObject.setResultReason(n.getStringValue()); });
        deserializerMap.put("targetResources", (n) -> { currentObject.setTargetResources(n.getCollectionOfObjectValues(TargetResource::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the initiatedBy property value. The initiatedBy property
     * @return a auditActivityInitiator
     */
    @javax.annotation.Nullable
    public AuditActivityInitiator getInitiatedBy() {
        return this._initiatedBy;
    }
    /**
     * Gets the loggedByService property value. Indicates information on which service initiated the activity (For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoggedByService() {
        return this._loggedByService;
    }
    /**
     * Gets the operationType property value. Indicates the type of operation that was performed. The possible values include but are not limited to the following: Add, Assign, Update, Unassign, and Delete.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperationType() {
        return this._operationType;
    }
    /**
     * Gets the result property value. Indicates the result of the activity. Possible values are: success, failure, timeout, unknownFutureValue.
     * @return a operationResult
     */
    @javax.annotation.Nullable
    public OperationResult getResult() {
        return this._result;
    }
    /**
     * Gets the resultReason property value. Indicates the reason for failure if the result is failure or timeout.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResultReason() {
        return this._resultReason;
    }
    /**
     * Gets the targetResources property value. Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device, Directory, App, Role, Group, Policy or Other.
     * @return a targetResource
     */
    @javax.annotation.Nullable
    public java.util.List<TargetResource> getTargetResources() {
        return this._targetResources;
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
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("activityDisplayName", this.getActivityDisplayName());
        writer.writeCollectionOfObjectValues("additionalDetails", this.getAdditionalDetails());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeObjectValue("initiatedBy", this.getInitiatedBy());
        writer.writeStringValue("loggedByService", this.getLoggedByService());
        writer.writeStringValue("operationType", this.getOperationType());
        writer.writeEnumValue("result", this.getResult());
        writer.writeStringValue("resultReason", this.getResultReason());
        writer.writeCollectionOfObjectValues("targetResources", this.getTargetResources());
    }
    /**
     * Sets the activityDateTime property value. Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._activityDateTime = value;
    }
    /**
     * Sets the activityDisplayName property value. Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list, see Azure AD activity list.
     * @param value Value to set for the activityDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDisplayName(@javax.annotation.Nullable final String value) {
        this._activityDisplayName = value;
    }
    /**
     * Sets the additionalDetails property value. Indicates additional details on the activity.
     * @param value Value to set for the additionalDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalDetails(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._additionalDetails = value;
    }
    /**
     * Sets the category property value. Indicates which resource category that's targeted by the activity. For example: UserManagement, GroupManagement, ApplicationManagement, RoleManagement.
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final String value) {
        this._category = value;
    }
    /**
     * Sets the correlationId property value. Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs across services.
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this._correlationId = value;
    }
    /**
     * Sets the initiatedBy property value. The initiatedBy property
     * @param value Value to set for the initiatedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiatedBy(@javax.annotation.Nullable final AuditActivityInitiator value) {
        this._initiatedBy = value;
    }
    /**
     * Sets the loggedByService property value. Indicates information on which service initiated the activity (For example: Self-service Password Management, Core Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
     * @param value Value to set for the loggedByService property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLoggedByService(@javax.annotation.Nullable final String value) {
        this._loggedByService = value;
    }
    /**
     * Sets the operationType property value. Indicates the type of operation that was performed. The possible values include but are not limited to the following: Add, Assign, Update, Unassign, and Delete.
     * @param value Value to set for the operationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationType(@javax.annotation.Nullable final String value) {
        this._operationType = value;
    }
    /**
     * Sets the result property value. Indicates the result of the activity. Possible values are: success, failure, timeout, unknownFutureValue.
     * @param value Value to set for the result property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResult(@javax.annotation.Nullable final OperationResult value) {
        this._result = value;
    }
    /**
     * Sets the resultReason property value. Indicates the reason for failure if the result is failure or timeout.
     * @param value Value to set for the resultReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResultReason(@javax.annotation.Nullable final String value) {
        this._resultReason = value;
    }
    /**
     * Sets the targetResources property value. Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device, Directory, App, Role, Group, Policy or Other.
     * @param value Value to set for the targetResources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetResources(@javax.annotation.Nullable final java.util.List<TargetResource> value) {
        this._targetResources = value;
    }
}
