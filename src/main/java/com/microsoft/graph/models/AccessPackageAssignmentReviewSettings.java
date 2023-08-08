package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentReviewSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess, acceptAccessRecommendation, unknownFutureValue.
     */
    private AccessReviewExpirationBehavior expirationBehavior;
    /**
     * This collection specifies the users who will be the fallback reviewers when the primary reviewers don't respond.
     */
    private java.util.List<SubjectSet> fallbackReviewers;
    /**
     * If true, access reviews are required for assignments through this policy.
     */
    private Boolean isEnabled;
    /**
     * Specifies whether to display recommendations to the reviewer. The default value is true.
     */
    private Boolean isRecommendationEnabled;
    /**
     * Specifies whether the reviewer must provide justification for the approval. The default value is true.
     */
    private Boolean isReviewerJustificationRequired;
    /**
     * Specifies whether the principals can review their own assignments.
     */
    private Boolean isSelfReview;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * This collection specifies the users or group of users who will review the access package assignments.
     */
    private java.util.List<SubjectSet> primaryReviewers;
    /**
     * When the first review should start and how often it should recur.
     */
    private EntitlementManagementSchedule schedule;
    /**
     * Instantiates a new accessPackageAssignmentReviewSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentReviewSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentReviewSettings
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentReviewSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentReviewSettings();
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
     * Gets the expirationBehavior property value. The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess, acceptAccessRecommendation, unknownFutureValue.
     * @return a accessReviewExpirationBehavior
     */
    @jakarta.annotation.Nullable
    public AccessReviewExpirationBehavior getExpirationBehavior() {
        return this.expirationBehavior;
    }
    /**
     * Gets the fallbackReviewers property value. This collection specifies the users who will be the fallback reviewers when the primary reviewers don't respond.
     * @return a subjectSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackReviewers() {
        return this.fallbackReviewers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("expirationBehavior", (n) -> { this.setExpirationBehavior(n.getEnumValue(AccessReviewExpirationBehavior.class)); });
        deserializerMap.put("fallbackReviewers", (n) -> { this.setFallbackReviewers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isRecommendationEnabled", (n) -> { this.setIsRecommendationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isReviewerJustificationRequired", (n) -> { this.setIsReviewerJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("isSelfReview", (n) -> { this.setIsSelfReview(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryReviewers", (n) -> { this.setPrimaryReviewers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(EntitlementManagementSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. If true, access reviews are required for assignments through this policy.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the isRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecommendationEnabled() {
        return this.isRecommendationEnabled;
    }
    /**
     * Gets the isReviewerJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReviewerJustificationRequired() {
        return this.isReviewerJustificationRequired;
    }
    /**
     * Gets the isSelfReview property value. Specifies whether the principals can review their own assignments.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSelfReview() {
        return this.isSelfReview;
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
     * Gets the primaryReviewers property value. This collection specifies the users or group of users who will review the access package assignments.
     * @return a subjectSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getPrimaryReviewers() {
        return this.primaryReviewers;
    }
    /**
     * Gets the schedule property value. When the first review should start and how often it should recur.
     * @return a entitlementManagementSchedule
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("expirationBehavior", this.getExpirationBehavior());
        writer.writeCollectionOfObjectValues("fallbackReviewers", this.getFallbackReviewers());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isRecommendationEnabled", this.getIsRecommendationEnabled());
        writer.writeBooleanValue("isReviewerJustificationRequired", this.getIsReviewerJustificationRequired());
        writer.writeBooleanValue("isSelfReview", this.getIsSelfReview());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("primaryReviewers", this.getPrimaryReviewers());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the expirationBehavior property value. The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess, acceptAccessRecommendation, unknownFutureValue.
     * @param value Value to set for the expirationBehavior property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExpirationBehavior(@jakarta.annotation.Nullable final AccessReviewExpirationBehavior value) {
        this.expirationBehavior = value;
    }
    /**
     * Sets the fallbackReviewers property value. This collection specifies the users who will be the fallback reviewers when the primary reviewers don't respond.
     * @param value Value to set for the fallbackReviewers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFallbackReviewers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.fallbackReviewers = value;
    }
    /**
     * Sets the isEnabled property value. If true, access reviews are required for assignments through this policy.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the isRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true.
     * @param value Value to set for the isRecommendationEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsRecommendationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isRecommendationEnabled = value;
    }
    /**
     * Sets the isReviewerJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @param value Value to set for the isReviewerJustificationRequired property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsReviewerJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isReviewerJustificationRequired = value;
    }
    /**
     * Sets the isSelfReview property value. Specifies whether the principals can review their own assignments.
     * @param value Value to set for the isSelfReview property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsSelfReview(@jakarta.annotation.Nullable final Boolean value) {
        this.isSelfReview = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the primaryReviewers property value. This collection specifies the users or group of users who will review the access package assignments.
     * @param value Value to set for the primaryReviewers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrimaryReviewers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.primaryReviewers = value;
    }
    /**
     * Sets the schedule property value. When the first review should start and how often it should recur.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSchedule(@jakarta.annotation.Nullable final EntitlementManagementSchedule value) {
        this.schedule = value;
    }
}
