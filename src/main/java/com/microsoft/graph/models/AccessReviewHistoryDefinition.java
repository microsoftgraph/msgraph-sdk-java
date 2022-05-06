package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewHistoryDefinition extends Entity implements Parsable {
    /** The createdBy property  */
    private UserIdentity _createdBy;
    /** Timestamp when the access review definition was created.  */
    private OffsetDateTime _createdDateTime;
    /** Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions will be included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.  */
    private java.util.List<AccessReviewHistoryDecisionFilter> _decisions;
    /** Name for the access review history data collection. Required.  */
    private String _displayName;
    /** If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that does not recur will have exactly one instance.  */
    private java.util.List<AccessReviewHistoryInstance> _instances;
    /** A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.  */
    private OffsetDateTime _reviewHistoryPeriodEndDateTime;
    /** A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.  */
    private OffsetDateTime _reviewHistoryPeriodStartDateTime;
    /** The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime or reviewHistoryPeriodEndDateTime are not defined. Not supported yet.  */
    private AccessReviewHistoryScheduleSettings _scheduleSettings;
    /** Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.  */
    private java.util.List<AccessReviewScope> _scopes;
    /** Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue.  */
    private AccessReviewHistoryStatus _status;
    /**
     * Instantiates a new accessReviewHistoryDefinition and sets the default values.
     * @return a void
     */
    public AccessReviewHistoryDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewHistoryDefinition
     */
    @javax.annotation.Nonnull
    public static AccessReviewHistoryDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewHistoryDefinition();
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a userIdentity
     */
    @javax.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Timestamp when the access review definition was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the decisions property value. Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions will be included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.
     * @return a accessReviewHistoryDecisionFilter
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewHistoryDecisionFilter> getDecisions() {
        return this._decisions;
    }
    /**
     * Gets the displayName property value. Name for the access review history data collection. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewHistoryDefinition currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("decisions", (n) -> { currentObject.setDecisions(n.getCollectionOfEnumValues(AccessReviewHistoryDecisionFilter.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("instances", (n) -> { currentObject.setInstances(n.getCollectionOfObjectValues(AccessReviewHistoryInstance::createFromDiscriminatorValue)); });
            this.put("reviewHistoryPeriodEndDateTime", (n) -> { currentObject.setReviewHistoryPeriodEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("reviewHistoryPeriodStartDateTime", (n) -> { currentObject.setReviewHistoryPeriodStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("scheduleSettings", (n) -> { currentObject.setScheduleSettings(n.getObjectValue(AccessReviewHistoryScheduleSettings::createFromDiscriminatorValue)); });
            this.put("scopes", (n) -> { currentObject.setScopes(n.getCollectionOfObjectValues(AccessReviewScope::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AccessReviewHistoryStatus.class)); });
        }};
    }
    /**
     * Gets the instances property value. If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that does not recur will have exactly one instance.
     * @return a accessReviewHistoryInstance
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewHistoryInstance> getInstances() {
        return this._instances;
    }
    /**
     * Gets the reviewHistoryPeriodEndDateTime property value. A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodEndDateTime() {
        return this._reviewHistoryPeriodEndDateTime;
    }
    /**
     * Gets the reviewHistoryPeriodStartDateTime property value. A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReviewHistoryPeriodStartDateTime() {
        return this._reviewHistoryPeriodStartDateTime;
    }
    /**
     * Gets the scheduleSettings property value. The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime or reviewHistoryPeriodEndDateTime are not defined. Not supported yet.
     * @return a accessReviewHistoryScheduleSettings
     */
    @javax.annotation.Nullable
    public AccessReviewHistoryScheduleSettings getScheduleSettings() {
        return this._scheduleSettings;
    }
    /**
     * Gets the scopes property value. Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.
     * @return a accessReviewScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewScope> getScopes() {
        return this._scopes;
    }
    /**
     * Gets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue.
     * @return a accessReviewHistoryStatus
     */
    @javax.annotation.Nullable
    public AccessReviewHistoryStatus getStatus() {
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
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final UserIdentity value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp when the access review definition was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the decisions property value. Determines which review decisions will be included in the fetched review history data if specified. Optional on create. All decisions will be included by default if no decisions are provided on create. Possible values are: approve, deny, dontKnow, notReviewed, and notNotified.
     * @param value Value to set for the decisions property.
     * @return a void
     */
    public void setDecisions(@javax.annotation.Nullable final java.util.List<AccessReviewHistoryDecisionFilter> value) {
        this._decisions = value;
    }
    /**
     * Sets the displayName property value. Name for the access review history data collection. Required.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the instances property value. If the accessReviewHistoryDefinition is a recurring definition, instances represent each recurrence. A definition that does not recur will have exactly one instance.
     * @param value Value to set for the instances property.
     * @return a void
     */
    public void setInstances(@javax.annotation.Nullable final java.util.List<AccessReviewHistoryInstance> value) {
        this._instances = value;
    }
    /**
     * Sets the reviewHistoryPeriodEndDateTime property value. A timestamp. Reviews ending on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     * @param value Value to set for the reviewHistoryPeriodEndDateTime property.
     * @return a void
     */
    public void setReviewHistoryPeriodEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewHistoryPeriodEndDateTime = value;
    }
    /**
     * Sets the reviewHistoryPeriodStartDateTime property value. A timestamp. Reviews starting on or before this date will be included in the fetched history data. Only required if scheduleSettings is not defined.
     * @param value Value to set for the reviewHistoryPeriodStartDateTime property.
     * @return a void
     */
    public void setReviewHistoryPeriodStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._reviewHistoryPeriodStartDateTime = value;
    }
    /**
     * Sets the scheduleSettings property value. The settings for a recurring access review history definition series. Only required if reviewHistoryPeriodStartDateTime or reviewHistoryPeriodEndDateTime are not defined. Not supported yet.
     * @param value Value to set for the scheduleSettings property.
     * @return a void
     */
    public void setScheduleSettings(@javax.annotation.Nullable final AccessReviewHistoryScheduleSettings value) {
        this._scheduleSettings = value;
    }
    /**
     * Sets the scopes property value. Used to scope what reviews are included in the fetched history data. Fetches reviews whose scope matches with this provided scope. Required.
     * @param value Value to set for the scopes property.
     * @return a void
     */
    public void setScopes(@javax.annotation.Nullable final java.util.List<AccessReviewScope> value) {
        this._scopes = value;
    }
    /**
     * Sets the status property value. Represents the status of the review history data collection. The possible values are: done, inProgress, error, requested, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final AccessReviewHistoryStatus value) {
        this._status = value;
    }
}
