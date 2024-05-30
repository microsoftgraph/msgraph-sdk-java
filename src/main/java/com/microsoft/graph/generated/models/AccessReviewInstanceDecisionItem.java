package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewInstanceDecisionItem extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewInstanceDecisionItem} and sets the default values.
     */
    public AccessReviewInstanceDecisionItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewInstanceDecisionItem}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInstanceDecisionItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItem();
    }
    /**
     * Gets the accessReviewId property value. The identifier of the accessReviewInstance parent. Supports $select. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessReviewId() {
        return this.backingStore.get("accessReviewId");
    }
    /**
     * Gets the appliedBy property value. The identifier of the user who applied the decision. Read-only.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getAppliedBy() {
        return this.backingStore.get("appliedBy");
    }
    /**
     * Gets the appliedDateTime property value. The timestamp when the approval decision was applied.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't applied the decision or it was automatically applied. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $select. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppliedDateTime() {
        return this.backingStore.get("appliedDateTime");
    }
    /**
     * Gets the applyResult property value. The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure, AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplyResult() {
        return this.backingStore.get("applyResult");
    }
    /**
     * Gets the decision property value. Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter (eq only).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDecision() {
        return this.backingStore.get("decision");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessReviewId", (n) -> { this.setAccessReviewId(n.getStringValue()); });
        deserializerMap.put("appliedBy", (n) -> { this.setAppliedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("appliedDateTime", (n) -> { this.setAppliedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("applyResult", (n) -> { this.setApplyResult(n.getStringValue()); });
        deserializerMap.put("decision", (n) -> { this.setDecision(n.getStringValue()); });
        deserializerMap.put("insights", (n) -> { this.setInsights(n.getCollectionOfObjectValues(GovernanceInsight::createFromDiscriminatorValue)); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("principal", (n) -> { this.setPrincipal(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("principalLink", (n) -> { this.setPrincipalLink(n.getStringValue()); });
        deserializerMap.put("recommendation", (n) -> { this.setRecommendation(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(AccessReviewInstanceDecisionItemResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceLink", (n) -> { this.setResourceLink(n.getStringValue()); });
        deserializerMap.put("reviewedBy", (n) -> { this.setReviewedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewedDateTime", (n) -> { this.setReviewedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the insights property value. Insights are recommendations to reviewers on whether to approve or deny a decision. There can be multiple insights associated with an accessReviewInstanceDecisionItem.
     * @return a {@link java.util.List<GovernanceInsight>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceInsight> getInsights() {
        return this.backingStore.get("insights");
    }
    /**
     * Gets the justification property value. Justification left by the reviewer when they made the decision.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.backingStore.get("justification");
    }
    /**
     * Gets the principal property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports $select. Read-only.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getPrincipal() {
        return this.backingStore.get("principal");
    }
    /**
     * Gets the principalLink property value. A link to the principal object. For example, https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalLink() {
        return this.backingStore.get("principalLink");
    }
    /**
     * Gets the recommendation property value. A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. The value is Approve if the sign-in is fewer than 30 days after the start of review, Deny if the sign-in is greater than 30 days after, or NoInfoAvailable. Possible values: Approve, Deny, or NoInfoAvailable. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecommendation() {
        return this.backingStore.get("recommendation");
    }
    /**
     * Gets the resource property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource. Read-only.
     * @return a {@link AccessReviewInstanceDecisionItemResource}
     */
    @jakarta.annotation.Nullable
    public AccessReviewInstanceDecisionItemResource getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Gets the resourceLink property value. A link to the resource. For example, https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceLink() {
        return this.backingStore.get("resourceLink");
    }
    /**
     * Gets the reviewedBy property value. The identifier of the reviewer.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports $select. Read-only.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getReviewedBy() {
        return this.backingStore.get("reviewedBy");
    }
    /**
     * Gets the reviewedDateTime property value. The timestamp when the review decision occurred. Supports $select. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewedDateTime() {
        return this.backingStore.get("reviewedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessReviewId", this.getAccessReviewId());
        writer.writeObjectValue("appliedBy", this.getAppliedBy());
        writer.writeOffsetDateTimeValue("appliedDateTime", this.getAppliedDateTime());
        writer.writeStringValue("applyResult", this.getApplyResult());
        writer.writeStringValue("decision", this.getDecision());
        writer.writeCollectionOfObjectValues("insights", this.getInsights());
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
     */
    public void setAccessReviewId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessReviewId", value);
    }
    /**
     * Sets the appliedBy property value. The identifier of the user who applied the decision. Read-only.
     * @param value Value to set for the appliedBy property.
     */
    public void setAppliedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("appliedBy", value);
    }
    /**
     * Sets the appliedDateTime property value. The timestamp when the approval decision was applied.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't applied the decision or it was automatically applied. The DatetimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $select. Read-only.
     * @param value Value to set for the appliedDateTime property.
     */
    public void setAppliedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("appliedDateTime", value);
    }
    /**
     * Sets the applyResult property value. The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure, AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the applyResult property.
     */
    public void setApplyResult(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applyResult", value);
    }
    /**
     * Sets the decision property value. Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter (eq only).
     * @param value Value to set for the decision property.
     */
    public void setDecision(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("decision", value);
    }
    /**
     * Sets the insights property value. Insights are recommendations to reviewers on whether to approve or deny a decision. There can be multiple insights associated with an accessReviewInstanceDecisionItem.
     * @param value Value to set for the insights property.
     */
    public void setInsights(@jakarta.annotation.Nullable final java.util.List<GovernanceInsight> value) {
        this.backingStore.set("insights", value);
    }
    /**
     * Sets the justification property value. Justification left by the reviewer when they made the decision.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("justification", value);
    }
    /**
     * Sets the principal property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports $select. Read-only.
     * @param value Value to set for the principal property.
     */
    public void setPrincipal(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("principal", value);
    }
    /**
     * Sets the principalLink property value. A link to the principal object. For example, https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only.
     * @param value Value to set for the principalLink property.
     */
    public void setPrincipalLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalLink", value);
    }
    /**
     * Sets the recommendation property value. A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. The value is Approve if the sign-in is fewer than 30 days after the start of review, Deny if the sign-in is greater than 30 days after, or NoInfoAvailable. Possible values: Approve, Deny, or NoInfoAvailable. Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the recommendation property.
     */
    public void setRecommendation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendation", value);
    }
    /**
     * Sets the resource property value. Every decision item in an access review represents a principal's access to a resource. This property represents details of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource. Read-only.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final AccessReviewInstanceDecisionItemResource value) {
        this.backingStore.set("resource", value);
    }
    /**
     * Sets the resourceLink property value. A link to the resource. For example, https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only.
     * @param value Value to set for the resourceLink property.
     */
    public void setResourceLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceLink", value);
    }
    /**
     * Sets the reviewedBy property value. The identifier of the reviewer.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports $select. Read-only.
     * @param value Value to set for the reviewedBy property.
     */
    public void setReviewedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("reviewedBy", value);
    }
    /**
     * Sets the reviewedDateTime property value. The timestamp when the review decision occurred. Supports $select. Read-only.
     * @param value Value to set for the reviewedDateTime property.
     */
    public void setReviewedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewedDateTime", value);
    }
}
