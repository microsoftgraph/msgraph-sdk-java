package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewStageSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicate which decisions will go to the next stage. Can be a sub-set of Approve, Deny, Recommendation, or NotReviewed. If not provided, all decisions will go to the next stage. Optional.
     */
    private java.util.List<String> decisionsThatWillMoveToNextStage;
    /**
     * Defines the sequential or parallel order of the stages and depends on the stageId. Only sequential stages are currently supported. For example, if stageId is 2, then dependsOn must be 1. If stageId is 1, do not specify dependsOn. Required if stageId is not 1.
     */
    private java.util.List<String> dependsOn;
    /**
     * The duration of the stage. Required.  NOTE: The cumulative value of this property across all stages  1. Will override the instanceDurationInDays setting on the accessReviewScheduleDefinition object. 2. Cannot exceed the length of one recurrence. That is, if the review recurs weekly, the cumulative durationInDays cannot exceed 7.
     */
    private Integer durationInDays;
    /**
     * If provided, the fallback reviewers are asked to complete a review if the primary reviewers do not exist. For example, if managers are selected as reviewers and a principal under review does not have a manager in Azure AD, the fallback reviewers are asked to review that principal. NOTE: The value of this property will override the corresponding setting on the accessReviewScheduleDefinition object.
     */
    private java.util.List<AccessReviewReviewerScope> fallbackReviewers;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The recommendationInsightSettings property
     */
    private java.util.List<AccessReviewRecommendationInsightSetting> recommendationInsightSettings;
    /**
     * Indicates whether showing recommendations to reviewers is enabled. Required. NOTE: The value of this property will override override the corresponding setting on the accessReviewScheduleDefinition object.
     */
    private Boolean recommendationsEnabled;
    /**
     * Defines who the reviewers are. If none are specified, the review is a self-review (users review their own access).  For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API. NOTE: The value of this property will override the corresponding setting on the accessReviewScheduleDefinition.
     */
    private java.util.List<AccessReviewReviewerScope> reviewers;
    /**
     * Unique identifier of the accessReviewStageSettings object. The stageId will be used by the dependsOn property to indicate the order of the stages. Required.
     */
    private String stageId;
    /**
     * Instantiates a new accessReviewStageSettings and sets the default values.
     */
    public AccessReviewStageSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewStageSettings
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewStageSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewStageSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the decisionsThatWillMoveToNextStage property value. Indicate which decisions will go to the next stage. Can be a sub-set of Approve, Deny, Recommendation, or NotReviewed. If not provided, all decisions will go to the next stage. Optional.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDecisionsThatWillMoveToNextStage() {
        return this.decisionsThatWillMoveToNextStage;
    }
    /**
     * Gets the dependsOn property value. Defines the sequential or parallel order of the stages and depends on the stageId. Only sequential stages are currently supported. For example, if stageId is 2, then dependsOn must be 1. If stageId is 1, do not specify dependsOn. Required if stageId is not 1.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDependsOn() {
        return this.dependsOn;
    }
    /**
     * Gets the durationInDays property value. The duration of the stage. Required.  NOTE: The cumulative value of this property across all stages  1. Will override the instanceDurationInDays setting on the accessReviewScheduleDefinition object. 2. Cannot exceed the length of one recurrence. That is, if the review recurs weekly, the cumulative durationInDays cannot exceed 7.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInDays() {
        return this.durationInDays;
    }
    /**
     * Gets the fallbackReviewers property value. If provided, the fallback reviewers are asked to complete a review if the primary reviewers do not exist. For example, if managers are selected as reviewers and a principal under review does not have a manager in Azure AD, the fallback reviewers are asked to review that principal. NOTE: The value of this property will override the corresponding setting on the accessReviewScheduleDefinition object.
     * @return a accessReviewReviewerScope
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getFallbackReviewers() {
        return this.fallbackReviewers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("decisionsThatWillMoveToNextStage", (n) -> { this.setDecisionsThatWillMoveToNextStage(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dependsOn", (n) -> { this.setDependsOn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("durationInDays", (n) -> { this.setDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("fallbackReviewers", (n) -> { this.setFallbackReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendationInsightSettings", (n) -> { this.setRecommendationInsightSettings(n.getCollectionOfObjectValues(AccessReviewRecommendationInsightSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("recommendationsEnabled", (n) -> { this.setRecommendationsEnabled(n.getBooleanValue()); });
        deserializerMap.put("reviewers", (n) -> { this.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("stageId", (n) -> { this.setStageId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the recommendationInsightSettings property value. The recommendationInsightSettings property
     * @return a accessReviewRecommendationInsightSetting
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewRecommendationInsightSetting> getRecommendationInsightSettings() {
        return this.recommendationInsightSettings;
    }
    /**
     * Gets the recommendationsEnabled property value. Indicates whether showing recommendations to reviewers is enabled. Required. NOTE: The value of this property will override override the corresponding setting on the accessReviewScheduleDefinition object.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRecommendationsEnabled() {
        return this.recommendationsEnabled;
    }
    /**
     * Gets the reviewers property value. Defines who the reviewers are. If none are specified, the review is a self-review (users review their own access).  For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API. NOTE: The value of this property will override the corresponding setting on the accessReviewScheduleDefinition.
     * @return a accessReviewReviewerScope
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getReviewers() {
        return this.reviewers;
    }
    /**
     * Gets the stageId property value. Unique identifier of the accessReviewStageSettings object. The stageId will be used by the dependsOn property to indicate the order of the stages. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStageId() {
        return this.stageId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("decisionsThatWillMoveToNextStage", this.getDecisionsThatWillMoveToNextStage());
        writer.writeCollectionOfPrimitiveValues("dependsOn", this.getDependsOn());
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeCollectionOfObjectValues("fallbackReviewers", this.getFallbackReviewers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("recommendationInsightSettings", this.getRecommendationInsightSettings());
        writer.writeBooleanValue("recommendationsEnabled", this.getRecommendationsEnabled());
        writer.writeCollectionOfObjectValues("reviewers", this.getReviewers());
        writer.writeStringValue("stageId", this.getStageId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the decisionsThatWillMoveToNextStage property value. Indicate which decisions will go to the next stage. Can be a sub-set of Approve, Deny, Recommendation, or NotReviewed. If not provided, all decisions will go to the next stage. Optional.
     * @param value Value to set for the decisionsThatWillMoveToNextStage property.
     */
    public void setDecisionsThatWillMoveToNextStage(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.decisionsThatWillMoveToNextStage = value;
    }
    /**
     * Sets the dependsOn property value. Defines the sequential or parallel order of the stages and depends on the stageId. Only sequential stages are currently supported. For example, if stageId is 2, then dependsOn must be 1. If stageId is 1, do not specify dependsOn. Required if stageId is not 1.
     * @param value Value to set for the dependsOn property.
     */
    public void setDependsOn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.dependsOn = value;
    }
    /**
     * Sets the durationInDays property value. The duration of the stage. Required.  NOTE: The cumulative value of this property across all stages  1. Will override the instanceDurationInDays setting on the accessReviewScheduleDefinition object. 2. Cannot exceed the length of one recurrence. That is, if the review recurs weekly, the cumulative durationInDays cannot exceed 7.
     * @param value Value to set for the durationInDays property.
     */
    public void setDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.durationInDays = value;
    }
    /**
     * Sets the fallbackReviewers property value. If provided, the fallback reviewers are asked to complete a review if the primary reviewers do not exist. For example, if managers are selected as reviewers and a principal under review does not have a manager in Azure AD, the fallback reviewers are asked to review that principal. NOTE: The value of this property will override the corresponding setting on the accessReviewScheduleDefinition object.
     * @param value Value to set for the fallbackReviewers property.
     */
    public void setFallbackReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.fallbackReviewers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recommendationInsightSettings property value. The recommendationInsightSettings property
     * @param value Value to set for the recommendationInsightSettings property.
     */
    public void setRecommendationInsightSettings(@jakarta.annotation.Nullable final java.util.List<AccessReviewRecommendationInsightSetting> value) {
        this.recommendationInsightSettings = value;
    }
    /**
     * Sets the recommendationsEnabled property value. Indicates whether showing recommendations to reviewers is enabled. Required. NOTE: The value of this property will override override the corresponding setting on the accessReviewScheduleDefinition object.
     * @param value Value to set for the recommendationsEnabled property.
     */
    public void setRecommendationsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.recommendationsEnabled = value;
    }
    /**
     * Sets the reviewers property value. Defines who the reviewers are. If none are specified, the review is a self-review (users review their own access).  For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API. NOTE: The value of this property will override the corresponding setting on the accessReviewScheduleDefinition.
     * @param value Value to set for the reviewers property.
     */
    public void setReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.reviewers = value;
    }
    /**
     * Sets the stageId property value. Unique identifier of the accessReviewStageSettings object. The stageId will be used by the dependsOn property to indicate the order of the stages. Required.
     * @param value Value to set for the stageId property.
     */
    public void setStageId(@jakarta.annotation.Nullable final String value) {
        this.stageId = value;
    }
}
