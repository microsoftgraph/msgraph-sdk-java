package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewScheduleSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Optional field. Describes the  actions to take once a review is complete. There are two types that are currently supported: removeAccessApplyAction (default) and disableAndDeleteUserApplyAction. Field only needs to be specified in the case of disableAndDeleteUserApplyAction. */
    private java.util.List<AccessReviewApplyAction> _applyActions;
    /** Indicates whether decisions are automatically applied. When set to false, an admin must apply the decisions manually once the reviewer completes the access review. When set to true, decisions are applied automatically after the access review instance duration ends, whether or not the reviewers have responded. Default value is false. */
    private Boolean _autoApplyDecisionsEnabled;
    /** Indicates whether decisions on previous access review stages are available for reviewers on an accessReviewInstance with multiple subsequent stages. If not provided, the default is disabled (false). */
    private Boolean _decisionHistoriesForReviewersEnabled;
    /** Decision chosen if defaultDecisionEnabled is enabled. Can be one of Approve, Deny, or Recommendation. */
    private String _defaultDecision;
    /** Indicates whether the default decision is enabled or disabled when reviewers do not respond. Default value is false. */
    private Boolean _defaultDecisionEnabled;
    /** Duration of each recurrence of review (accessReviewInstance) in number of days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its durationInDays setting will be used instead of the value of this property. */
    private Integer _instanceDurationInDays;
    /** Indicates whether reviewers are required to provide justification with their decision. Default value is false. */
    private Boolean _justificationRequiredOnApproval;
    /** Indicates whether emails are enabled or disabled. Default value is false. */
    private Boolean _mailNotificationsEnabled;
    /** The OdataType property */
    private String _odataType;
    /** Indicates whether decision recommendations are enabled or disabled. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationsEnabled setting will be used instead of the value of this property. */
    private Boolean _recommendationsEnabled;
    /** Detailed settings for recurrence using the standard Outlook recurrence object. Note: Only dayOfMonth, interval, and type (weekly, absoluteMonthly) properties are supported. Use the property startDate on recurrenceRange to determine the day the review starts. */
    private PatternedRecurrence _recurrence;
    /** Indicates whether reminders are enabled or disabled. Default value is false. */
    private Boolean _reminderNotificationsEnabled;
    /**
     * Instantiates a new accessReviewScheduleSettings and sets the default values.
     * @return a void
     */
    public AccessReviewScheduleSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessReviewScheduleSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewScheduleSettings
     */
    @javax.annotation.Nonnull
    public static AccessReviewScheduleSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewScheduleSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the applyActions property value. Optional field. Describes the  actions to take once a review is complete. There are two types that are currently supported: removeAccessApplyAction (default) and disableAndDeleteUserApplyAction. Field only needs to be specified in the case of disableAndDeleteUserApplyAction.
     * @return a accessReviewApplyAction
     */
    @javax.annotation.Nullable
    public java.util.List<AccessReviewApplyAction> getApplyActions() {
        return this._applyActions;
    }
    /**
     * Gets the autoApplyDecisionsEnabled property value. Indicates whether decisions are automatically applied. When set to false, an admin must apply the decisions manually once the reviewer completes the access review. When set to true, decisions are applied automatically after the access review instance duration ends, whether or not the reviewers have responded. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoApplyDecisionsEnabled() {
        return this._autoApplyDecisionsEnabled;
    }
    /**
     * Gets the decisionHistoriesForReviewersEnabled property value. Indicates whether decisions on previous access review stages are available for reviewers on an accessReviewInstance with multiple subsequent stages. If not provided, the default is disabled (false).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDecisionHistoriesForReviewersEnabled() {
        return this._decisionHistoriesForReviewersEnabled;
    }
    /**
     * Gets the defaultDecision property value. Decision chosen if defaultDecisionEnabled is enabled. Can be one of Approve, Deny, or Recommendation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultDecision() {
        return this._defaultDecision;
    }
    /**
     * Gets the defaultDecisionEnabled property value. Indicates whether the default decision is enabled or disabled when reviewers do not respond. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefaultDecisionEnabled() {
        return this._defaultDecisionEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewScheduleSettings currentObject = this;
        return new HashMap<>(12) {{
            this.put("applyActions", (n) -> { currentObject.setApplyActions(n.getCollectionOfObjectValues(AccessReviewApplyAction::createFromDiscriminatorValue)); });
            this.put("autoApplyDecisionsEnabled", (n) -> { currentObject.setAutoApplyDecisionsEnabled(n.getBooleanValue()); });
            this.put("decisionHistoriesForReviewersEnabled", (n) -> { currentObject.setDecisionHistoriesForReviewersEnabled(n.getBooleanValue()); });
            this.put("defaultDecision", (n) -> { currentObject.setDefaultDecision(n.getStringValue()); });
            this.put("defaultDecisionEnabled", (n) -> { currentObject.setDefaultDecisionEnabled(n.getBooleanValue()); });
            this.put("instanceDurationInDays", (n) -> { currentObject.setInstanceDurationInDays(n.getIntegerValue()); });
            this.put("justificationRequiredOnApproval", (n) -> { currentObject.setJustificationRequiredOnApproval(n.getBooleanValue()); });
            this.put("mailNotificationsEnabled", (n) -> { currentObject.setMailNotificationsEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("recommendationsEnabled", (n) -> { currentObject.setRecommendationsEnabled(n.getBooleanValue()); });
            this.put("recurrence", (n) -> { currentObject.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
            this.put("reminderNotificationsEnabled", (n) -> { currentObject.setReminderNotificationsEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the instanceDurationInDays property value. Duration of each recurrence of review (accessReviewInstance) in number of days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its durationInDays setting will be used instead of the value of this property.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInstanceDurationInDays() {
        return this._instanceDurationInDays;
    }
    /**
     * Gets the justificationRequiredOnApproval property value. Indicates whether reviewers are required to provide justification with their decision. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getJustificationRequiredOnApproval() {
        return this._justificationRequiredOnApproval;
    }
    /**
     * Gets the mailNotificationsEnabled property value. Indicates whether emails are enabled or disabled. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMailNotificationsEnabled() {
        return this._mailNotificationsEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the recommendationsEnabled property value. Indicates whether decision recommendations are enabled or disabled. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationsEnabled setting will be used instead of the value of this property.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRecommendationsEnabled() {
        return this._recommendationsEnabled;
    }
    /**
     * Gets the recurrence property value. Detailed settings for recurrence using the standard Outlook recurrence object. Note: Only dayOfMonth, interval, and type (weekly, absoluteMonthly) properties are supported. Use the property startDate on recurrenceRange to determine the day the review starts.
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this._recurrence;
    }
    /**
     * Gets the reminderNotificationsEnabled property value. Indicates whether reminders are enabled or disabled. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getReminderNotificationsEnabled() {
        return this._reminderNotificationsEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("applyActions", this.getApplyActions());
        writer.writeBooleanValue("autoApplyDecisionsEnabled", this.getAutoApplyDecisionsEnabled());
        writer.writeBooleanValue("decisionHistoriesForReviewersEnabled", this.getDecisionHistoriesForReviewersEnabled());
        writer.writeStringValue("defaultDecision", this.getDefaultDecision());
        writer.writeBooleanValue("defaultDecisionEnabled", this.getDefaultDecisionEnabled());
        writer.writeIntegerValue("instanceDurationInDays", this.getInstanceDurationInDays());
        writer.writeBooleanValue("justificationRequiredOnApproval", this.getJustificationRequiredOnApproval());
        writer.writeBooleanValue("mailNotificationsEnabled", this.getMailNotificationsEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("recommendationsEnabled", this.getRecommendationsEnabled());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeBooleanValue("reminderNotificationsEnabled", this.getReminderNotificationsEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the applyActions property value. Optional field. Describes the  actions to take once a review is complete. There are two types that are currently supported: removeAccessApplyAction (default) and disableAndDeleteUserApplyAction. Field only needs to be specified in the case of disableAndDeleteUserApplyAction.
     * @param value Value to set for the applyActions property.
     * @return a void
     */
    public void setApplyActions(@javax.annotation.Nullable final java.util.List<AccessReviewApplyAction> value) {
        this._applyActions = value;
    }
    /**
     * Sets the autoApplyDecisionsEnabled property value. Indicates whether decisions are automatically applied. When set to false, an admin must apply the decisions manually once the reviewer completes the access review. When set to true, decisions are applied automatically after the access review instance duration ends, whether or not the reviewers have responded. Default value is false.
     * @param value Value to set for the autoApplyDecisionsEnabled property.
     * @return a void
     */
    public void setAutoApplyDecisionsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._autoApplyDecisionsEnabled = value;
    }
    /**
     * Sets the decisionHistoriesForReviewersEnabled property value. Indicates whether decisions on previous access review stages are available for reviewers on an accessReviewInstance with multiple subsequent stages. If not provided, the default is disabled (false).
     * @param value Value to set for the decisionHistoriesForReviewersEnabled property.
     * @return a void
     */
    public void setDecisionHistoriesForReviewersEnabled(@javax.annotation.Nullable final Boolean value) {
        this._decisionHistoriesForReviewersEnabled = value;
    }
    /**
     * Sets the defaultDecision property value. Decision chosen if defaultDecisionEnabled is enabled. Can be one of Approve, Deny, or Recommendation.
     * @param value Value to set for the defaultDecision property.
     * @return a void
     */
    public void setDefaultDecision(@javax.annotation.Nullable final String value) {
        this._defaultDecision = value;
    }
    /**
     * Sets the defaultDecisionEnabled property value. Indicates whether the default decision is enabled or disabled when reviewers do not respond. Default value is false.
     * @param value Value to set for the defaultDecisionEnabled property.
     * @return a void
     */
    public void setDefaultDecisionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._defaultDecisionEnabled = value;
    }
    /**
     * Sets the instanceDurationInDays property value. Duration of each recurrence of review (accessReviewInstance) in number of days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its durationInDays setting will be used instead of the value of this property.
     * @param value Value to set for the instanceDurationInDays property.
     * @return a void
     */
    public void setInstanceDurationInDays(@javax.annotation.Nullable final Integer value) {
        this._instanceDurationInDays = value;
    }
    /**
     * Sets the justificationRequiredOnApproval property value. Indicates whether reviewers are required to provide justification with their decision. Default value is false.
     * @param value Value to set for the justificationRequiredOnApproval property.
     * @return a void
     */
    public void setJustificationRequiredOnApproval(@javax.annotation.Nullable final Boolean value) {
        this._justificationRequiredOnApproval = value;
    }
    /**
     * Sets the mailNotificationsEnabled property value. Indicates whether emails are enabled or disabled. Default value is false.
     * @param value Value to set for the mailNotificationsEnabled property.
     * @return a void
     */
    public void setMailNotificationsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._mailNotificationsEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the recommendationsEnabled property value. Indicates whether decision recommendations are enabled or disabled. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationsEnabled setting will be used instead of the value of this property.
     * @param value Value to set for the recommendationsEnabled property.
     * @return a void
     */
    public void setRecommendationsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._recommendationsEnabled = value;
    }
    /**
     * Sets the recurrence property value. Detailed settings for recurrence using the standard Outlook recurrence object. Note: Only dayOfMonth, interval, and type (weekly, absoluteMonthly) properties are supported. Use the property startDate on recurrenceRange to determine the day the review starts.
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the reminderNotificationsEnabled property value. Indicates whether reminders are enabled or disabled. Default value is false.
     * @param value Value to set for the reminderNotificationsEnabled property.
     * @return a void
     */
    public void setReminderNotificationsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._reminderNotificationsEnabled = value;
    }
}
