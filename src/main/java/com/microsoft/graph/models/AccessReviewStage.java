package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreementAcceptance entities. */
public class AccessReviewStage extends Entity implements Parsable {
    /** Each user reviewed in an accessReviewStage has a decision item representing if they were approved, denied, or not yet reviewed. */
    private java.util.List<AccessReviewInstanceDecisionItem> _decisions;
    /** The date and time in ISO 8601 format and UTC time when the review stage is scheduled to end. This property is the cumulative total of the durationInDays for all stages. Read-only. */
    private OffsetDateTime _endDateTime;
    /** This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist. */
    private java.util.List<AccessReviewReviewerScope> _fallbackReviewers;
    /** This collection of access review scopes is used to define who the reviewers are. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API. */
    private java.util.List<AccessReviewReviewerScope> _reviewers;
    /** The date and time in ISO 8601 format and UTC time when the review stage is scheduled to start. Read-only. */
    private OffsetDateTime _startDateTime;
    /** Specifies the status of an accessReviewStage. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $orderby, and $filter (eq only). Read-only. */
    private String _status;
    /**
     * Instantiates a new accessReviewStage and sets the default values.
     * @return a void
     */
    public AccessReviewStage() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewStage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewStage
     */
    @javax.annotation.Nonnull
    public static AccessReviewStage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewStage();
    }
    /**
     * Gets the decisions property value. Each user reviewed in an accessReviewStage has a decision item representing if they were approved, denied, or not yet reviewed.
     * @return a accessReviewInstanceDecisionItem
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewInstanceDecisionItem> getDecisions() {
        return this._decisions;
    }
    /**
     * Gets the endDateTime property value. The date and time in ISO 8601 format and UTC time when the review stage is scheduled to end. This property is the cumulative total of the durationInDays for all stages. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist.
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
        final AccessReviewStage currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("decisions", (n) -> { currentObject.setDecisions(n.getCollectionOfObjectValues(AccessReviewInstanceDecisionItem::createFromDiscriminatorValue)); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("fallbackReviewers", (n) -> { currentObject.setFallbackReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
            this.put("reviewers", (n) -> { currentObject.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        }};
    }
    /**
     * Gets the reviewers property value. This collection of access review scopes is used to define who the reviewers are. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     * @return a accessReviewReviewerScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getReviewers() {
        return this._reviewers;
    }
    /**
     * Gets the startDateTime property value. The date and time in ISO 8601 format and UTC time when the review stage is scheduled to start. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. Specifies the status of an accessReviewStage. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $orderby, and $filter (eq only). Read-only.
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
        writer.writeCollectionOfObjectValues("decisions", this.getDecisions());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeCollectionOfObjectValues("fallbackReviewers", this.getFallbackReviewers());
        writer.writeCollectionOfObjectValues("reviewers", this.getReviewers());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the decisions property value. Each user reviewed in an accessReviewStage has a decision item representing if they were approved, denied, or not yet reviewed.
     * @param value Value to set for the decisions property.
     * @return a void
     */
    public void setDecisions(@javax.annotation.Nullable final java.util.List<AccessReviewInstanceDecisionItem> value) {
        this._decisions = value;
    }
    /**
     * Sets the endDateTime property value. The date and time in ISO 8601 format and UTC time when the review stage is scheduled to end. This property is the cumulative total of the durationInDays for all stages. Read-only.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a user's manager does not exist.
     * @param value Value to set for the fallbackReviewers property.
     * @return a void
     */
    public void setFallbackReviewers(@javax.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this._fallbackReviewers = value;
    }
    /**
     * Sets the reviewers property value. This collection of access review scopes is used to define who the reviewers are. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     * @param value Value to set for the reviewers property.
     * @return a void
     */
    public void setReviewers(@javax.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this._reviewers = value;
    }
    /**
     * Sets the startDateTime property value. The date and time in ISO 8601 format and UTC time when the review stage is scheduled to start. Read-only.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. Specifies the status of an accessReviewStage. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
}
