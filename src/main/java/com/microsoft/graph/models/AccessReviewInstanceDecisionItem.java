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
public class AccessReviewInstanceDecisionItem extends Entity implements Parsable {
    /** The identifier of the accessReviewInstance parent. Supports $select. Read-only. */
    private String _accessReviewId;
    /** The identifier of the user who applied the decision. Read-only. */
    private UserIdentity _appliedBy;
    /** The timestamp when the approval decision was applied.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't applied the decision or it was automatically applied. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $select. Read-only. */
    private OffsetDateTime _appliedDateTime;
    /** The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure, AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only). Read-only. */
    private String _applyResult;
    /** Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter (eq only). */
    private String _decision;
    /** Justification left by the reviewer when they made the decision. */
    private String _justification;
    /** Every decision item in an access review represents a principal's access to a resource. This property represents details of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports $select. Read-only. */
    private Identity _principal;
    /** A link to the principal object. For example, https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only. */
    private String _principalLink;
    /** A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. Recommend approve if sign-in is within thirty days of start of review. Recommend deny if sign-in is greater than thirty days of start of review. Recommendation not available otherwise. Possible values: Approve, Deny, or NoInfoAvailable. Supports $select, $orderby, and $filter (eq only). Read-only. */
    private String _recommendation;
    /** Every decision item in an access review represents a principal's access to a resource. This property represents details of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource. Read-only. */
    private AccessReviewInstanceDecisionItemResource _resource;
    /** A link to the resource. For example, https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only. */
    private String _resourceLink;
    /** The identifier of the reviewer.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports $select. Read-only. */
    private UserIdentity _reviewedBy;
    /** The timestamp when the review decision occurred. Supports $select. Read-only. */
    private OffsetDateTime _reviewedDateTime;
    /**
     * Instantiates a new accessReviewInstanceDecisionItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewInstanceDecisionItem() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewInstanceDecisionItem
     */
    @javax.annotation.Nonnull
    public static AccessReviewInstanceDecisionItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItem();
    }
    /**
     * Gets the accessReviewId property value. The identifier of the accessReviewInstance parent. Supports $select. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccessReviewId() {
        return this._accessReviewId;
    }
    /**
     * Gets the appliedBy property value. The identifier of the user who applied the decision. Read-only.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getAppliedBy() {
        return this._appliedBy;
    }
    /**
     * Gets the appliedDateTime property value. The timestamp when the approval decision was applied.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't applied the decision or it was automatically applied. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAppliedDateTime() {
        return this._appliedDateTime;
    }
    /**
     * Gets the applyResult property value. The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure, AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplyResult() {
        return this._applyResult;
    }
    /**
     * Gets the decision property value. Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter (eq only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecision() {
        return this._decision;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewInstanceDecisionItem currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessReviewId", (n) -> { currentObject.setAccessReviewId(n.getStringValue()); });
        deserializerMap.put("appliedBy", (n) -> { currentObject.setAppliedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("appliedDateTime", (n) -> { currentObject.setAppliedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("applyResult", (n) -> { currentObject.setApplyResult(n.getStringValue()); });
        deserializerMap.put("decision", (n) -> { currentObject.setDecision(n.getStringValue()); });
        deserializerMap.put("justification", (n) -> { currentObject.setJustification(n.getStringValue()); });
        deserializerMap.put("principal", (n) -> { currentObject.setPrincipal(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("principalLink", (n) -> { currentObject.setPrincipalLink(n.getStringValue()); });
        deserializerMap.put("recommendation", (n) -> { currentObject.setRecommendation(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(AccessReviewInstanceDecisionItemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceLink", (n) -> { currentObject.setResourceLink(n.getStringValue()); });
        deserializerMap.put("reviewedBy", (n) -> { currentObject.setReviewedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewedDateTime", (n) -> { currentObject.setReviewedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap
    }
    /**
     * Gets the justification property value. Justification left by the reviewer when they made the decision.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
    }
    /**
     * Gets the principal property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports $select. Read-only.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getPrincipal() {
        return this._principal;
    }
    /**
     * Gets the principalLink property value. A link to the principal object. For example, https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrincipalLink() {
        return this._principalLink;
    }
    /**
     * Gets the recommendation property value. A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. Recommend approve if sign-in is within thirty days of start of review. Recommend deny if sign-in is greater than thirty days of start of review. Recommendation not available otherwise. Possible values: Approve, Deny, or NoInfoAvailable. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecommendation() {
        return this._recommendation;
    }
    /**
     * Gets the resource property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource. Read-only.
     * @return a accessReviewInstanceDecisionItemResource
     */
    @javax.annotation.Nullable
    public AccessReviewInstanceDecisionItemResource getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceLink property value. A link to the resource. For example, https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceLink() {
        return this._resourceLink;
    }
    /**
     * Gets the reviewedBy property value. The identifier of the reviewer.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports $select. Read-only.
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getReviewedBy() {
        return this._reviewedBy;
    }
    /**
     * Gets the reviewedDateTime property value. The timestamp when the review decision occurred. Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewedDateTime() {
        return this._reviewedDateTime;
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
        writer.writeStringValue("accessReviewId", this.getAccessReviewId());
        writer.writeObjectValue("appliedBy", this.getAppliedBy());
        writer.writeOffsetDateTimeValue("appliedDateTime", this.getAppliedDateTime());
        writer.writeStringValue("applyResult", this.getApplyResult());
        writer.writeStringValue("decision", this.getDecision());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeObjectValue("principal", this.getPrincipal());
        writer.writeStringValue("principalLink", this.getPrincipalLink());
        writer.writeStringValue("recommendation", this.getRecommendation());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resourceLink", this.getResourceLink());
        writer.writeObjectValue("reviewedBy", this.getReviewedBy());
        writer.writeOffsetDateTimeValue("reviewedDateTime", this.getReviewedDateTime());
    }
    /**
     * Sets the accessReviewId property value. The identifier of the accessReviewInstance parent. Supports $select. Read-only.
     * @param value Value to set for the accessReviewId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessReviewId(@javax.annotation.Nullable final String value) {
        this._accessReviewId = value;
    }
    /**
     * Sets the appliedBy property value. The identifier of the user who applied the decision. Read-only.
     * @param value Value to set for the appliedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._appliedBy = value;
    }
    /**
     * Sets the appliedDateTime property value. The timestamp when the approval decision was applied.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't applied the decision or it was automatically applied. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $select. Read-only.
     * @param value Value to set for the appliedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._appliedDateTime = value;
    }
    /**
     * Sets the applyResult property value. The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure, AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the applyResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplyResult(@javax.annotation.Nullable final String value) {
        this._applyResult = value;
    }
    /**
     * Sets the decision property value. Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter (eq only).
     * @param value Value to set for the decision property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDecision(@javax.annotation.Nullable final String value) {
        this._decision = value;
    }
    /**
     * Sets the justification property value. Justification left by the reviewer when they made the decision.
     * @param value Value to set for the justification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
    }
    /**
     * Sets the principal property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports $select. Read-only.
     * @param value Value to set for the principal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipal(@javax.annotation.Nullable final Identity value) {
        this._principal = value;
    }
    /**
     * Sets the principalLink property value. A link to the principal object. For example, https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only.
     * @param value Value to set for the principalLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrincipalLink(@javax.annotation.Nullable final String value) {
        this._principalLink = value;
    }
    /**
     * Sets the recommendation property value. A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. Recommend approve if sign-in is within thirty days of start of review. Recommend deny if sign-in is greater than thirty days of start of review. Recommendation not available otherwise. Possible values: Approve, Deny, or NoInfoAvailable. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the recommendation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecommendation(@javax.annotation.Nullable final String value) {
        this._recommendation = value;
    }
    /**
     * Sets the resource property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource. Read-only.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final AccessReviewInstanceDecisionItemResource value) {
        this._resource = value;
    }
    /**
     * Sets the resourceLink property value. A link to the resource. For example, https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only.
     * @param value Value to set for the resourceLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceLink(@javax.annotation.Nullable final String value) {
        this._resourceLink = value;
    }
    /**
     * Sets the reviewedBy property value. The identifier of the reviewer.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports $select. Read-only.
     * @param value Value to set for the reviewedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._reviewedBy = value;
    }
    /**
     * Sets the reviewedDateTime property value. The timestamp when the review decision occurred. Supports $select. Read-only.
     * @param value Value to set for the reviewedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewedDateTime = value;
    }
}
