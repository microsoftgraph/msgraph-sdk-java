package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewInstance extends Entity implements Parsable {
    /**
     * Returns the collection of reviewers who were contacted to complete this review. While the reviewers and fallbackReviewers properties of the accessReviewScheduleDefinition might specify group owners or managers as reviewers, contactedReviewers returns their individual identities. Supports $select. Read-only.
     */
    private java.util.List<AccessReviewReviewer> contactedReviewers;
    /**
     * Each user reviewed in an accessReviewInstance has a decision item representing if they were approved, denied, or not yet reviewed.
     */
    private java.util.List<AccessReviewInstanceDecisionItem> decisions;
    /**
     * DateTime when review instance is scheduled to end.The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     */
    private OffsetDateTime endDateTime;
    /**
     * This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist. Supports $select.
     */
    private java.util.List<AccessReviewReviewerScope> fallbackReviewers;
    /**
     * This collection of access review scopes is used to define who the reviewers are. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     */
    private java.util.List<AccessReviewReviewerScope> reviewers;
    /**
     * Created based on scope and instanceEnumerationScope at the accessReviewScheduleDefinition level. Defines the scope of users reviewed in a group. Supports $select and $filter (contains only). Read-only.
     */
    private AccessReviewScope scope;
    /**
     * If the instance has multiple stages, this returns the collection of stages. A new stage will only be created when the previous stage ends. The existence, number, and settings of stages on a review instance are created based on the accessReviewStageSettings on the parent accessReviewScheduleDefinition.
     */
    private java.util.List<AccessReviewStage> stages;
    /**
     * DateTime when review instance is scheduled to start. May be in the future. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     */
    private OffsetDateTime startDateTime;
    /**
     * Specifies the status of an accessReview. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $select, $orderby, and $filter (eq only). Read-only.
     */
    private String status;
    /**
     * Instantiates a new AccessReviewInstance and sets the default values.
     */
    public AccessReviewInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewInstance
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstance();
    }
    /**
     * Gets the contactedReviewers property value. Returns the collection of reviewers who were contacted to complete this review. While the reviewers and fallbackReviewers properties of the accessReviewScheduleDefinition might specify group owners or managers as reviewers, contactedReviewers returns their individual identities. Supports $select. Read-only.
     * @return a java.util.List<AccessReviewReviewer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewer> getContactedReviewers() {
        return this.contactedReviewers;
    }
    /**
     * Gets the decisions property value. Each user reviewed in an accessReviewInstance has a decision item representing if they were approved, denied, or not yet reviewed.
     * @return a java.util.List<AccessReviewInstanceDecisionItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewInstanceDecisionItem> getDecisions() {
        return this.decisions;
    }
    /**
     * Gets the endDateTime property value. DateTime when review instance is scheduled to end.The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * Gets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist. Supports $select.
     * @return a java.util.List<AccessReviewReviewerScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getFallbackReviewers() {
        return this.fallbackReviewers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("contactedReviewers", (n) -> { this.setContactedReviewers(n.getCollectionOfObjectValues(AccessReviewReviewer::createFromDiscriminatorValue)); });
        deserializerMap.put("decisions", (n) -> { this.setDecisions(n.getCollectionOfObjectValues(AccessReviewInstanceDecisionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fallbackReviewers", (n) -> { this.setFallbackReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewers", (n) -> { this.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getObjectValue(AccessReviewScope::createFromDiscriminatorValue)); });
        deserializerMap.put("stages", (n) -> { this.setStages(n.getCollectionOfObjectValues(AccessReviewStage::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reviewers property value. This collection of access review scopes is used to define who the reviewers are. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     * @return a java.util.List<AccessReviewReviewerScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getReviewers() {
        return this.reviewers;
    }
    /**
     * Gets the scope property value. Created based on scope and instanceEnumerationScope at the accessReviewScheduleDefinition level. Defines the scope of users reviewed in a group. Supports $select and $filter (contains only). Read-only.
     * @return a AccessReviewScope
     */
    @jakarta.annotation.Nullable
    public AccessReviewScope getScope() {
        return this.scope;
    }
    /**
     * Gets the stages property value. If the instance has multiple stages, this returns the collection of stages. A new stage will only be created when the previous stage ends. The existence, number, and settings of stages on a review instance are created based on the accessReviewStageSettings on the parent accessReviewScheduleDefinition.
     * @return a java.util.List<AccessReviewStage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewStage> getStages() {
        return this.stages;
    }
    /**
     * Gets the startDateTime property value. DateTime when review instance is scheduled to start. May be in the future. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the status property value. Specifies the status of an accessReview. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("contactedReviewers", this.getContactedReviewers());
        writer.writeCollectionOfObjectValues("decisions", this.getDecisions());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeCollectionOfObjectValues("fallbackReviewers", this.getFallbackReviewers());
        writer.writeCollectionOfObjectValues("reviewers", this.getReviewers());
        writer.writeObjectValue("scope", this.getScope());
        writer.writeCollectionOfObjectValues("stages", this.getStages());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the contactedReviewers property value. Returns the collection of reviewers who were contacted to complete this review. While the reviewers and fallbackReviewers properties of the accessReviewScheduleDefinition might specify group owners or managers as reviewers, contactedReviewers returns their individual identities. Supports $select. Read-only.
     * @param value Value to set for the contactedReviewers property.
     */
    public void setContactedReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewer> value) {
        this.contactedReviewers = value;
    }
    /**
     * Sets the decisions property value. Each user reviewed in an accessReviewInstance has a decision item representing if they were approved, denied, or not yet reviewed.
     * @param value Value to set for the decisions property.
     */
    public void setDecisions(@jakarta.annotation.Nullable final java.util.List<AccessReviewInstanceDecisionItem> value) {
        this.decisions = value;
    }
    /**
     * Sets the endDateTime property value. DateTime when review instance is scheduled to end.The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist. Supports $select.
     * @param value Value to set for the fallbackReviewers property.
     */
    public void setFallbackReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.fallbackReviewers = value;
    }
    /**
     * Sets the reviewers property value. This collection of access review scopes is used to define who the reviewers are. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     * @param value Value to set for the reviewers property.
     */
    public void setReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.reviewers = value;
    }
    /**
     * Sets the scope property value. Created based on scope and instanceEnumerationScope at the accessReviewScheduleDefinition level. Defines the scope of users reviewed in a group. Supports $select and $filter (contains only). Read-only.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final AccessReviewScope value) {
        this.scope = value;
    }
    /**
     * Sets the stages property value. If the instance has multiple stages, this returns the collection of stages. A new stage will only be created when the previous stage ends. The existence, number, and settings of stages on a review instance are created based on the accessReviewStageSettings on the parent accessReviewScheduleDefinition.
     * @param value Value to set for the stages property.
     */
    public void setStages(@jakarta.annotation.Nullable final java.util.List<AccessReviewStage> value) {
        this.stages = value;
    }
    /**
     * Sets the startDateTime property value. DateTime when review instance is scheduled to start. May be in the future. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the status property value. Specifies the status of an accessReview. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
