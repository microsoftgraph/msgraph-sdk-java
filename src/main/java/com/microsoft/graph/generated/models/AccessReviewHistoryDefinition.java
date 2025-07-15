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
     * Instantiates a new {@link AccessReviewHistoryDefinition} and sets the default values.
     */
    public AccessReviewHistoryDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewHistoryDefinition}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewHistoryDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewHistoryDefinition();
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Timestamp when the access review definition was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the decisions property value. Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions are included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDecisions() {
        return this.backingStore.get("decisions");
    }
    /**
     * Gets the displayName property value. Name for the access review history data collection. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("decisions", (n) -> { this.setDecisions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("instances", (n) -> { this.setInstances(n.getCollectionOfObjectValues(AccessReviewHistoryInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewHistoryPeriodEndDateTime", (n) -> { this.setReviewHistoryPeriodEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewHistoryPeriodStartDateTime", (n) -> { this.setReviewHistoryPeriodStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduleSettings", (n) -> { this.setScheduleSettings(n.getObjectValue(AccessReviewHistoryScheduleSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfObjectValues(AccessReviewScope::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AccessReviewHistoryStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the instances property value. If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that doesn&apos;t recur will have exactly one instance.
     * @return a {@link java.util.List<AccessReviewHistoryInstance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewHistoryInstance> getInstances() {
        return this.backingStore.get("instances");
    }
    /**
     * Gets the reviewHistoryPeriodEndDateTime property value. A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if scheduleSettings isn&apos;t defined.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodEndDateTime() {
        return this.backingStore.get("reviewHistoryPeriodEndDateTime");
    }
    /**
     * Gets the reviewHistoryPeriodStartDateTime property value. A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if scheduleSettings isn&apos;t defined.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodStartDateTime() {
        return this.backingStore.get("reviewHistoryPeriodStartDateTime");
    }
    /**
     * Gets the scheduleSettings property value. The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime or reviewHistoryPeriodEndDateTime aren&apos;t defined. Not supported yet.
     * @return a {@link AccessReviewHistoryScheduleSettings}
     */
    @jakarta.annotation.Nullable
    public AccessReviewHistoryScheduleSettings getScheduleSettings() {
        return this.backingStore.get("scheduleSettings");
    }
    /**
     * Gets the scopes property value. Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.
     * @return a {@link java.util.List<AccessReviewScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewScope> getScopes() {
        return this.backingStore.get("scopes");
    }
    /**
     * Gets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue.
     * @return a {@link AccessReviewHistoryStatus}
     */
    @jakarta.annotation.Nullable
    public AccessReviewHistoryStatus getStatus() {
        return this.backingStore.get("status");
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
        writer.writeCollectionOfPrimitiveValues("decisions", this.getDecisions());
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
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp when the access review definition was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the decisions property value. Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions are included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.
     * @param value Value to set for the decisions property.
     */
    public void setDecisions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("decisions", value);
    }
    /**
     * Sets the displayName property value. Name for the access review history data collection. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the instances property value. If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that doesn&apos;t recur will have exactly one instance.
     * @param value Value to set for the instances property.
     */
    public void setInstances(@jakarta.annotation.Nullable final java.util.List<AccessReviewHistoryInstance> value) {
        this.backingStore.set("instances", value);
    }
    /**
     * Sets the reviewHistoryPeriodEndDateTime property value. A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if scheduleSettings isn&apos;t defined.
     * @param value Value to set for the reviewHistoryPeriodEndDateTime property.
     */
    public void setReviewHistoryPeriodEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewHistoryPeriodEndDateTime", value);
    }
    /**
     * Sets the reviewHistoryPeriodStartDateTime property value. A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if scheduleSettings isn&apos;t defined.
     * @param value Value to set for the reviewHistoryPeriodStartDateTime property.
     */
    public void setReviewHistoryPeriodStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewHistoryPeriodStartDateTime", value);
    }
    /**
     * Sets the scheduleSettings property value. The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime or reviewHistoryPeriodEndDateTime aren&apos;t defined. Not supported yet.
     * @param value Value to set for the scheduleSettings property.
     */
    public void setScheduleSettings(@jakarta.annotation.Nullable final AccessReviewHistoryScheduleSettings value) {
        this.backingStore.set("scheduleSettings", value);
    }
    /**
     * Sets the scopes property value. Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final java.util.List<AccessReviewScope> value) {
        this.backingStore.set("scopes", value);
    }
    /**
     * Sets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AccessReviewHistoryStatus value) {
        this.backingStore.set("status", value);
    }
}
