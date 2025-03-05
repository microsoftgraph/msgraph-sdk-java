package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewStage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewStage} and sets the default values.
     */
    public AccessReviewStage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewStage}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewStage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewStage();
    }
    /**
     * Gets the decisions property value. Each user reviewed in an accessReviewStage has a decision item representing if they were approved, denied, or not yet reviewed.
     * @return a {@link java.util.List<AccessReviewInstanceDecisionItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewInstanceDecisionItem> getDecisions() {
        return this.backingStore.get("decisions");
    }
    /**
     * Gets the endDateTime property value. The date and time in ISO 8601 format and UTC time when the review stage is scheduled to end. This property is the cumulative total of the durationInDays for all stages. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers are notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner doesn&apos;t exist, or manager is specified as reviewer but a user&apos;s manager doesn&apos;t exist.
     * @return a {@link java.util.List<AccessReviewReviewerScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getFallbackReviewers() {
        return this.backingStore.get("fallbackReviewers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("decisions", (n) -> { this.setDecisions(n.getCollectionOfObjectValues(AccessReviewInstanceDecisionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fallbackReviewers", (n) -> { this.setFallbackReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewers", (n) -> { this.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reviewers property value. This collection of access review scopes is used to define who the reviewers are. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     * @return a {@link java.util.List<AccessReviewReviewerScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getReviewers() {
        return this.backingStore.get("reviewers");
    }
    /**
     * Gets the startDateTime property value. The date and time in ISO 8601 format and UTC time when the review stage is scheduled to start. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. Specifies the status of an accessReviewStage. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $orderby, and $filter (eq only). Read-only.
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
     */
    public void setDecisions(@jakarta.annotation.Nullable final java.util.List<AccessReviewInstanceDecisionItem> value) {
        this.backingStore.set("decisions", value);
    }
    /**
     * Sets the endDateTime property value. The date and time in ISO 8601 format and UTC time when the review stage is scheduled to end. This property is the cumulative total of the durationInDays for all stages. Read-only.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers are notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner doesn&apos;t exist, or manager is specified as reviewer but a user&apos;s manager doesn&apos;t exist.
     * @param value Value to set for the fallbackReviewers property.
     */
    public void setFallbackReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.backingStore.set("fallbackReviewers", value);
    }
    /**
     * Sets the reviewers property value. This collection of access review scopes is used to define who the reviewers are. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
     * @param value Value to set for the reviewers property.
     */
    public void setReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.backingStore.set("reviewers", value);
    }
    /**
     * Sets the startDateTime property value. The date and time in ISO 8601 format and UTC time when the review stage is scheduled to start. Read-only.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. Specifies the status of an accessReviewStage. Possible values: Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed. Supports $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
}
