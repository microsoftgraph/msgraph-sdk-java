package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewHistoryDefinition extends Entity implements Parsable {
    /**
     * The createdBy property
     */
    private UserIdentity createdBy;
    /**
     * Timestamp when the access review definition was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions will be included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.
     */
    private java.util.List<AccessReviewHistoryDecisionFilter> decisions;
    /**
     * Name for the access review history data collection. Required.
     */
    private String displayName;
    /**
     * If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that does not recur will have exactly one instance.
     */
    private java.util.List<AccessReviewHistoryInstance> instances;
    /**
     * A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     */
    private OffsetDateTime reviewHistoryPeriodEndDateTime;
    /**
     * A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     */
    private OffsetDateTime reviewHistoryPeriodStartDateTime;
    /**
     * The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime or reviewHistoryPeriodEndDateTime are not defined. Not supported yet.
     */
    private AccessReviewHistoryScheduleSettings scheduleSettings;
    /**
     * Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.
     */
    private java.util.List<AccessReviewScope> scopes;
    /**
     * Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue.
     */
    private AccessReviewHistoryStatus status;
    /**
     * Instantiates a new accessReviewHistoryDefinition and sets the default values.
     */
    public AccessReviewHistoryDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewHistoryDefinition
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewHistoryDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewHistoryDefinition();
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a userIdentity
     */
    @jakarta.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Timestamp when the access review definition was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the decisions property value. Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions will be included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.
     * @return a accessReviewHistoryDecisionFilter
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewHistoryDecisionFilter> getDecisions() {
        return this.decisions;
    }
    /**
     * Gets the displayName property value. Name for the access review history data collection. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("decisions", (n) -> { this.setDecisions(n.getCollectionOfEnumValues(AccessReviewHistoryDecisionFilter.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("instances", (n) -> { this.setInstances(n.getCollectionOfObjectValues(AccessReviewHistoryInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewHistoryPeriodEndDateTime", (n) -> { this.setReviewHistoryPeriodEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewHistoryPeriodStartDateTime", (n) -> { this.setReviewHistoryPeriodStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduleSettings", (n) -> { this.setScheduleSettings(n.getObjectValue(AccessReviewHistoryScheduleSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfObjectValues(AccessReviewScope::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AccessReviewHistoryStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the instances property value. If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that does not recur will have exactly one instance.
     * @return a accessReviewHistoryInstance
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewHistoryInstance> getInstances() {
        return this.instances;
    }
    /**
     * Gets the reviewHistoryPeriodEndDateTime property value. A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodEndDateTime() {
        return this.reviewHistoryPeriodEndDateTime;
    }
    /**
     * Gets the reviewHistoryPeriodStartDateTime property value. A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodStartDateTime() {
        return this.reviewHistoryPeriodStartDateTime;
    }
    /**
     * Gets the scheduleSettings property value. The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime or reviewHistoryPeriodEndDateTime are not defined. Not supported yet.
     * @return a accessReviewHistoryScheduleSettings
     */
    @jakarta.annotation.Nullable
    public AccessReviewHistoryScheduleSettings getScheduleSettings() {
        return this.scheduleSettings;
    }
    /**
     * Gets the scopes property value. Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.
     * @return a accessReviewScope
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewScope> getScopes() {
        return this.scopes;
    }
    /**
     * Gets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue.
     * @return a accessReviewHistoryStatus
     */
    @jakarta.annotation.Nullable
    public AccessReviewHistoryStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfEnumValues("decisions", this.getDecisions());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("instances", this.getInstances());
        writer.writeOffsetDateTimeValue("reviewHistoryPeriodEndDateTime", this.getReviewHistoryPeriodEndDateTime());
        writer.writeOffsetDateTimeValue("reviewHistoryPeriodStartDateTime", this.getReviewHistoryPeriodStartDateTime());
        writer.writeObjectValue("scheduleSettings", this.getScheduleSettings());
        writer.writeCollectionOfObjectValues("scopes", this.getScopes());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp when the access review definition was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the decisions property value. Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions will be included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.
     * @param value Value to set for the decisions property.
     */
    public void setDecisions(@jakarta.annotation.Nullable final java.util.List<AccessReviewHistoryDecisionFilter> value) {
        this.decisions = value;
    }
    /**
     * Sets the displayName property value. Name for the access review history data collection. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the instances property value. If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that does not recur will have exactly one instance.
     * @param value Value to set for the instances property.
     */
    public void setInstances(@jakarta.annotation.Nullable final java.util.List<AccessReviewHistoryInstance> value) {
        this.instances = value;
    }
    /**
     * Sets the reviewHistoryPeriodEndDateTime property value. A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     * @param value Value to set for the reviewHistoryPeriodEndDateTime property.
     */
    public void setReviewHistoryPeriodEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reviewHistoryPeriodEndDateTime = value;
    }
    /**
     * Sets the reviewHistoryPeriodStartDateTime property value. A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     * @param value Value to set for the reviewHistoryPeriodStartDateTime property.
     */
    public void setReviewHistoryPeriodStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reviewHistoryPeriodStartDateTime = value;
    }
    /**
     * Sets the scheduleSettings property value. The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime or reviewHistoryPeriodEndDateTime are not defined. Not supported yet.
     * @param value Value to set for the scheduleSettings property.
     */
    public void setScheduleSettings(@jakarta.annotation.Nullable final AccessReviewHistoryScheduleSettings value) {
        this.scheduleSettings = value;
    }
    /**
     * Sets the scopes property value. Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final java.util.List<AccessReviewScope> value) {
        this.scopes = value;
    }
    /**
     * Sets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AccessReviewHistoryStatus value) {
        this.status = value;
    }
}
