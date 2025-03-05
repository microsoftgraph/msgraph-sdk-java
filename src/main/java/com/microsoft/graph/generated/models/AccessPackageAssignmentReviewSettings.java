package com.microsoft.graph.models;

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
public class AccessPackageAssignmentReviewSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AccessPackageAssignmentReviewSettings} and sets the default values.
     */
    public AccessPackageAssignmentReviewSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessPackageAssignmentReviewSettings}
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentReviewSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentReviewSettings();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the expirationBehavior property value. The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess, acceptAccessRecommendation, unknownFutureValue.
     * @return a {@link AccessReviewExpirationBehavior}
     */
    @jakarta.annotation.Nullable
    public AccessReviewExpirationBehavior getExpirationBehavior() {
        return this.backingStore.get("expirationBehavior");
    }
    /**
     * Gets the fallbackReviewers property value. This collection specifies the users who will be the fallback reviewers when the primary reviewers don&apos;t respond.
     * @return a {@link java.util.List<SubjectSet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackReviewers() {
        return this.backingStore.get("fallbackReviewers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("expirationBehavior", (n) -> { this.setExpirationBehavior(n.getEnumValue(AccessReviewExpirationBehavior::forValue)); });
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
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the isRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecommendationEnabled() {
        return this.backingStore.get("isRecommendationEnabled");
    }
    /**
     * Gets the isReviewerJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReviewerJustificationRequired() {
        return this.backingStore.get("isReviewerJustificationRequired");
    }
    /**
     * Gets the isSelfReview property value. Specifies whether the principals can review their own assignments.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSelfReview() {
        return this.backingStore.get("isSelfReview");
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
     * Gets the primaryReviewers property value. This collection specifies the users or group of users who will review the access package assignments.
     * @return a {@link java.util.List<SubjectSet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getPrimaryReviewers() {
        return this.backingStore.get("primaryReviewers");
    }
    /**
     * Gets the schedule property value. When the first review should start and how often it should recur.
     * @return a {@link EntitlementManagementSchedule}
     */
    @jakarta.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
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
     * Sets the expirationBehavior property value. The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess, acceptAccessRecommendation, unknownFutureValue.
     * @param value Value to set for the expirationBehavior property.
     */
    public void setExpirationBehavior(@jakarta.annotation.Nullable final AccessReviewExpirationBehavior value) {
        this.backingStore.set("expirationBehavior", value);
    }
    /**
     * Sets the fallbackReviewers property value. This collection specifies the users who will be the fallback reviewers when the primary reviewers don&apos;t respond.
     * @param value Value to set for the fallbackReviewers property.
     */
    public void setFallbackReviewers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("fallbackReviewers", value);
    }
    /**
     * Sets the isEnabled property value. If true, access reviews are required for assignments through this policy.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the isRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true.
     * @param value Value to set for the isRecommendationEnabled property.
     */
    public void setIsRecommendationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRecommendationEnabled", value);
    }
    /**
     * Sets the isReviewerJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @param value Value to set for the isReviewerJustificationRequired property.
     */
    public void setIsReviewerJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReviewerJustificationRequired", value);
    }
    /**
     * Sets the isSelfReview property value. Specifies whether the principals can review their own assignments.
     * @param value Value to set for the isSelfReview property.
     */
    public void setIsSelfReview(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSelfReview", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the primaryReviewers property value. This collection specifies the users or group of users who will review the access package assignments.
     * @param value Value to set for the primaryReviewers property.
     */
    public void setPrimaryReviewers(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("primaryReviewers", value);
    }
    /**
     * Sets the schedule property value. When the first review should start and how often it should recur.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final EntitlementManagementSchedule value) {
        this.backingStore.set("schedule", value);
    }
}
