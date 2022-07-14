package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInstance extends Entity implements Parsable {
    /** Returns the collection of reviewers who were contacted to complete this review. While the reviewers and fallbackReviewers properties of the accessReviewScheduleDefinition might specify group owners or managers as reviewers, contactedReviewers returns their individual identities. Supports $select. Read-only. */
    private java.util.List<AccessReviewReviewer> _contactedReviewers;
    /** Each user reviewed in an accessReviewInstance has a decision item representing if they were approved, denied, or not yet reviewed. */
    private java.util.List<AccessReviewInstanceDecisionItem> _decisions;
    /** DateTime when review instance is scheduled to end.The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only. */
    private OffsetDateTime _endDateTime;
    /** This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist. Supports $select. */
    private java.util.List<AccessReviewReviewerScope> _fallbackReviewers;
    /** This collection of access review scopes is used to define who the reviewers are. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API. */
    private java.util.List<AccessReviewReviewerScope> _reviewers;
    /** Created based on scope and instanceEnumerationScope at the accessReviewScheduleDefinition level. Defines the scope of users reviewed in a group. Supports $select and $filter (contains only). Read-only. */
    private AccessReviewScope _scope;
    /** If the instance has multiple stages, this returns the collection of stages. A new stage will only be created when the previous stage ends. The existence, number, and settings of stages on a review instance are created based on the accessReviewStageSettings on the parent accessReviewScheduleDefinition. */
    private java.util.List<AccessReviewStage> _stages;
    /** DateTime when review instance is scheduled to start. May be in the future. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only. */
    private OffsetDateTime _startDateTime;
    /** Specifies the status of an accessReview. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $select, $orderby, and $filter (eq only). Read-only. */
    private String _status;
    /**
     * Instantiates a new AccessReviewInstance and sets the default values.
     * @return a void
     */
    public AccessReviewInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewInstance
     */
    @javax.annotation.Nonnull
    public static AccessReviewInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstance();
    }
    /**
     * Gets the contactedReviewers property value. Returns the collection of reviewers who were contacted to complete this review. While the reviewers and fallbackReviewers properties of the accessReviewScheduleDefinition might specify group owners or managers as reviewers, contactedReviewers returns their individual identities. Supports $select. Read-only.
     * @return a accessReviewReviewer
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewReviewer> getContactedReviewers() {
        return this._contactedReviewers;
    }
    /**
     * Gets the decisions property value. Each user reviewed in an accessReviewInstance has a decision item representing if they were approved, denied, or not yet reviewed.
     * @return a accessReviewInstanceDecisionItem
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewInstanceDecisionItem> getDecisions() {
        return this._decisions;
    }
    /**
     * Gets the endDateTime property value. DateTime when review instance is scheduled to end.The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist. Supports $select.
     * @return a accessReviewReviewerScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getFallbackReviewers() {
        return this._fallbackReviewers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewInstance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("contactedReviewers", (n) -> { currentObject.setContactedReviewers(n.getCollectionOfObjectValues(AccessReviewReviewer::createFromDiscriminatorValue)); });
            this.put("decisions", (n) -> { currentObject.setDecisions(n.getCollectionOfObjectValues(AccessReviewInstanceDecisionItem::createFromDiscriminatorValue)); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("fallbackReviewers", (n) -> { currentObject.setFallbackReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
            this.put("reviewers", (n) -> { currentObject.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
            this.put("scope", (n) -> { currentObject.setScope(n.getObjectValue(AccessReviewScope::createFromDiscriminatorValue)); });
            this.put("stages", (n) -> { currentObject.setStages(n.getCollectionOfObjectValues(AccessReviewStage::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the reviewers property value. This collection of access review scopes is used to define who the reviewers are. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     * @return a accessReviewReviewerScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getReviewers() {
        return this._reviewers;
    }
    /**
     * Gets the scope property value. Created based on scope and instanceEnumerationScope at the accessReviewScheduleDefinition level. Defines the scope of users reviewed in a group. Supports $select and $filter (contains only). Read-only.
     * @return a accessReviewScope
     */
    @javax.annotation.Nullable
    public AccessReviewScope getScope() {
        return this._scope;
    }
    /**
     * Gets the stages property value. If the instance has multiple stages, this returns the collection of stages. A new stage will only be created when the previous stage ends. The existence, number, and settings of stages on a review instance are created based on the accessReviewStageSettings on the parent accessReviewScheduleDefinition.
     * @return a accessReviewStage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewStage> getStages() {
        return this._stages;
    }
    /**
     * Gets the startDateTime property value. DateTime when review instance is scheduled to start. May be in the future. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. Specifies the status of an accessReview. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setContactedReviewers(@javax.annotation.Nullable final java.util.List<AccessReviewReviewer> value) {
        this._contactedReviewers = value;
    }
    /**
     * Sets the decisions property value. Each user reviewed in an accessReviewInstance has a decision item representing if they were approved, denied, or not yet reviewed.
     * @param value Value to set for the decisions property.
     * @return a void
     */
    public void setDecisions(@javax.annotation.Nullable final java.util.List<AccessReviewInstanceDecisionItem> value) {
        this._decisions = value;
    }
    /**
     * Sets the endDateTime property value. DateTime when review instance is scheduled to end.The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist. Supports $select.
     * @param value Value to set for the fallbackReviewers property.
     * @return a void
     */
    public void setFallbackReviewers(@javax.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this._fallbackReviewers = value;
    }
    /**
     * Sets the reviewers property value. This collection of access review scopes is used to define who the reviewers are. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     * @param value Value to set for the reviewers property.
     * @return a void
     */
    public void setReviewers(@javax.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this._reviewers = value;
    }
    /**
     * Sets the scope property value. Created based on scope and instanceEnumerationScope at the accessReviewScheduleDefinition level. Defines the scope of users reviewed in a group. Supports $select and $filter (contains only). Read-only.
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final AccessReviewScope value) {
        this._scope = value;
    }
    /**
     * Sets the stages property value. If the instance has multiple stages, this returns the collection of stages. A new stage will only be created when the previous stage ends. The existence, number, and settings of stages on a review instance are created based on the accessReviewStageSettings on the parent accessReviewScheduleDefinition.
     * @param value Value to set for the stages property.
     * @return a void
     */
    public void setStages(@javax.annotation.Nullable final java.util.List<AccessReviewStage> value) {
        this._stages = value;
    }
    /**
     * Sets the startDateTime property value. DateTime when review instance is scheduled to start. May be in the future. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $select. Read-only.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. Specifies the status of an accessReview. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
