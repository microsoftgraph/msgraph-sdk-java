package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewScheduleSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AccessReviewScheduleSettings} and sets the default values.
     */
    public AccessReviewScheduleSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewScheduleSettings}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewScheduleSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewScheduleSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the applyActions property value. Optional field. Describes the  actions to take once a review is complete. There are two types that are currently supported: removeAccessApplyAction (default) and disableAndDeleteUserApplyAction. Field only needs to be specified in the case of disableAndDeleteUserApplyAction.
     * @return a {@link java.util.List<AccessReviewApplyAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewApplyAction> getApplyActions() {
        return this.backingStore.get("applyActions");
    }
    /**
     * Gets the autoApplyDecisionsEnabled property value. Indicates whether decisions are automatically applied. When set to false, an admin must apply the decisions manually once the reviewer completes the access review. When set to true, decisions are applied automatically after the access review instance duration ends, whether or not the reviewers have responded. Default value is false.  CAUTION: If both autoApplyDecisionsEnabled and defaultDecisionEnabled are true, all access for the principals to the resource risks being revoked if the reviewers fail to respond.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoApplyDecisionsEnabled() {
        return this.backingStore.get("autoApplyDecisionsEnabled");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the decisionHistoriesForReviewersEnabled property value. Indicates whether decisions on previous access review stages are available for reviewers on an accessReviewInstance with multiple subsequent stages. If not provided, the default is disabled (false).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDecisionHistoriesForReviewersEnabled() {
        return this.backingStore.get("decisionHistoriesForReviewersEnabled");
    }
    /**
     * Gets the defaultDecision property value. Decision chosen if defaultDecisionEnabled is enabled. Can be one of Approve, Deny, or Recommendation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultDecision() {
        return this.backingStore.get("defaultDecision");
    }
    /**
     * Gets the defaultDecisionEnabled property value. Indicates whether the default decision is enabled or disabled when reviewers do not respond. Default value is false.  CAUTION: If both autoApplyDecisionsEnabled and defaultDecisionEnabled are true, all access for the principals to the resource risks being revoked if the reviewers fail to respond.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDefaultDecisionEnabled() {
        return this.backingStore.get("defaultDecisionEnabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("applyActions", (n) -> { this.setApplyActions(n.getCollectionOfObjectValues(AccessReviewApplyAction::createFromDiscriminatorValue)); });
        deserializerMap.put("autoApplyDecisionsEnabled", (n) -> { this.setAutoApplyDecisionsEnabled(n.getBooleanValue()); });
        deserializerMap.put("decisionHistoriesForReviewersEnabled", (n) -> { this.setDecisionHistoriesForReviewersEnabled(n.getBooleanValue()); });
        deserializerMap.put("defaultDecision", (n) -> { this.setDefaultDecision(n.getStringValue()); });
        deserializerMap.put("defaultDecisionEnabled", (n) -> { this.setDefaultDecisionEnabled(n.getBooleanValue()); });
        deserializerMap.put("instanceDurationInDays", (n) -> { this.setInstanceDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("justificationRequiredOnApproval", (n) -> { this.setJustificationRequiredOnApproval(n.getBooleanValue()); });
        deserializerMap.put("mailNotificationsEnabled", (n) -> { this.setMailNotificationsEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendationInsightSettings", (n) -> { this.setRecommendationInsightSettings(n.getCollectionOfObjectValues(AccessReviewRecommendationInsightSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("recommendationLookBackDuration", (n) -> { this.setRecommendationLookBackDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("recommendationsEnabled", (n) -> { this.setRecommendationsEnabled(n.getBooleanValue()); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("reminderNotificationsEnabled", (n) -> { this.setReminderNotificationsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instanceDurationInDays property value. Duration of an access review instance in days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its durationInDays setting will be used instead of the value of this property.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInstanceDurationInDays() {
        return this.backingStore.get("instanceDurationInDays");
    }
    /**
     * Gets the justificationRequiredOnApproval property value. Indicates whether reviewers are required to provide justification with their decision. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getJustificationRequiredOnApproval() {
        return this.backingStore.get("justificationRequiredOnApproval");
    }
    /**
     * Gets the mailNotificationsEnabled property value. Indicates whether emails are enabled or disabled. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMailNotificationsEnabled() {
        return this.backingStore.get("mailNotificationsEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the recommendationInsightSettings property value. Optional. Describes the types of insights that aid reviewers to make access review decisions. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationInsightSettings setting will be used instead of the value of this property.
     * @return a {@link java.util.List<AccessReviewRecommendationInsightSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewRecommendationInsightSetting> getRecommendationInsightSettings() {
        return this.backingStore.get("recommendationInsightSettings");
    }
    /**
     * Gets the recommendationLookBackDuration property value. Optional field. Indicates the period of inactivity (with respect to the start date of the review instance) that recommendations will be configured from. The recommendation will be to deny if the user is inactive during the look-back duration. For reviews of groups and Microsoft Entra roles, any duration is accepted. For reviews of applications, 30 days is the maximum duration. If not specified, the duration is 30 days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationLookBackDuration setting will be used instead of the value of this property.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getRecommendationLookBackDuration() {
        return this.backingStore.get("recommendationLookBackDuration");
    }
    /**
     * Gets the recommendationsEnabled property value. Indicates whether decision recommendations are enabled or disabled. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationsEnabled setting will be used instead of the value of this property.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRecommendationsEnabled() {
        return this.backingStore.get("recommendationsEnabled");
    }
    /**
     * Gets the recurrence property value. Detailed settings for recurrence using the standard Outlook recurrence object. Note: Only dayOfMonth, interval, and type (weekly, absoluteMonthly) properties are supported. Use the property startDate on recurrenceRange to determine the day the review starts.
     * @return a {@link PatternedRecurrence}
     */
    @jakarta.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this.backingStore.get("recurrence");
    }
    /**
     * Gets the reminderNotificationsEnabled property value. Indicates whether reminders are enabled or disabled. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReminderNotificationsEnabled() {
        return this.backingStore.get("reminderNotificationsEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeCollectionOfObjectValues("recommendationInsightSettings", this.getRecommendationInsightSettings());
        writer.writePeriodAndDurationValue("recommendationLookBackDuration", this.getRecommendationLookBackDuration());
        writer.writeBooleanValue("recommendationsEnabled", this.getRecommendationsEnabled());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeBooleanValue("reminderNotificationsEnabled", this.getReminderNotificationsEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the applyActions property value. Optional field. Describes the  actions to take once a review is complete. There are two types that are currently supported: removeAccessApplyAction (default) and disableAndDeleteUserApplyAction. Field only needs to be specified in the case of disableAndDeleteUserApplyAction.
     * @param value Value to set for the applyActions property.
     */
    public void setApplyActions(@jakarta.annotation.Nullable final java.util.List<AccessReviewApplyAction> value) {
        this.backingStore.set("applyActions", value);
    }
    /**
     * Sets the autoApplyDecisionsEnabled property value. Indicates whether decisions are automatically applied. When set to false, an admin must apply the decisions manually once the reviewer completes the access review. When set to true, decisions are applied automatically after the access review instance duration ends, whether or not the reviewers have responded. Default value is false.  CAUTION: If both autoApplyDecisionsEnabled and defaultDecisionEnabled are true, all access for the principals to the resource risks being revoked if the reviewers fail to respond.
     * @param value Value to set for the autoApplyDecisionsEnabled property.
     */
    public void setAutoApplyDecisionsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoApplyDecisionsEnabled", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the decisionHistoriesForReviewersEnabled property value. Indicates whether decisions on previous access review stages are available for reviewers on an accessReviewInstance with multiple subsequent stages. If not provided, the default is disabled (false).
     * @param value Value to set for the decisionHistoriesForReviewersEnabled property.
     */
    public void setDecisionHistoriesForReviewersEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("decisionHistoriesForReviewersEnabled", value);
    }
    /**
     * Sets the defaultDecision property value. Decision chosen if defaultDecisionEnabled is enabled. Can be one of Approve, Deny, or Recommendation.
     * @param value Value to set for the defaultDecision property.
     */
    public void setDefaultDecision(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultDecision", value);
    }
    /**
     * Sets the defaultDecisionEnabled property value. Indicates whether the default decision is enabled or disabled when reviewers do not respond. Default value is false.  CAUTION: If both autoApplyDecisionsEnabled and defaultDecisionEnabled are true, all access for the principals to the resource risks being revoked if the reviewers fail to respond.
     * @param value Value to set for the defaultDecisionEnabled property.
     */
    public void setDefaultDecisionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defaultDecisionEnabled", value);
    }
    /**
     * Sets the instanceDurationInDays property value. Duration of an access review instance in days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its durationInDays setting will be used instead of the value of this property.
     * @param value Value to set for the instanceDurationInDays property.
     */
    public void setInstanceDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("instanceDurationInDays", value);
    }
    /**
     * Sets the justificationRequiredOnApproval property value. Indicates whether reviewers are required to provide justification with their decision. Default value is false.
     * @param value Value to set for the justificationRequiredOnApproval property.
     */
    public void setJustificationRequiredOnApproval(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("justificationRequiredOnApproval", value);
    }
    /**
     * Sets the mailNotificationsEnabled property value. Indicates whether emails are enabled or disabled. Default value is false.
     * @param value Value to set for the mailNotificationsEnabled property.
     */
    public void setMailNotificationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("mailNotificationsEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recommendationInsightSettings property value. Optional. Describes the types of insights that aid reviewers to make access review decisions. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationInsightSettings setting will be used instead of the value of this property.
     * @param value Value to set for the recommendationInsightSettings property.
     */
    public void setRecommendationInsightSettings(@jakarta.annotation.Nullable final java.util.List<AccessReviewRecommendationInsightSetting> value) {
        this.backingStore.set("recommendationInsightSettings", value);
    }
    /**
     * Sets the recommendationLookBackDuration property value. Optional field. Indicates the period of inactivity (with respect to the start date of the review instance) that recommendations will be configured from. The recommendation will be to deny if the user is inactive during the look-back duration. For reviews of groups and Microsoft Entra roles, any duration is accepted. For reviews of applications, 30 days is the maximum duration. If not specified, the duration is 30 days. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationLookBackDuration setting will be used instead of the value of this property.
     * @param value Value to set for the recommendationLookBackDuration property.
     */
    public void setRecommendationLookBackDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("recommendationLookBackDuration", value);
    }
    /**
     * Sets the recommendationsEnabled property value. Indicates whether decision recommendations are enabled or disabled. NOTE: If the stageSettings of the accessReviewScheduleDefinition object is defined, its recommendationsEnabled setting will be used instead of the value of this property.
     * @param value Value to set for the recommendationsEnabled property.
     */
    public void setRecommendationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("recommendationsEnabled", value);
    }
    /**
     * Sets the recurrence property value. Detailed settings for recurrence using the standard Outlook recurrence object. Note: Only dayOfMonth, interval, and type (weekly, absoluteMonthly) properties are supported. Use the property startDate on recurrenceRange to determine the day the review starts.
     * @param value Value to set for the recurrence property.
     */
    public void setRecurrence(@jakarta.annotation.Nullable final PatternedRecurrence value) {
        this.backingStore.set("recurrence", value);
    }
    /**
     * Sets the reminderNotificationsEnabled property value. Indicates whether reminders are enabled or disabled. Default value is false.
     * @param value Value to set for the reminderNotificationsEnabled property.
     */
    public void setReminderNotificationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("reminderNotificationsEnabled", value);
    }
}
