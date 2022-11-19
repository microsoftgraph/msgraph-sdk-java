package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentReviewSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess, acceptAccessRecommendation, unknownFutureValue. */
    private AccessReviewExpirationBehavior _expirationBehavior;
    /** This collection specifies the users who will be the fallback reviewers when the primary reviewers don't respond. */
    private java.util.List<SubjectSet> _fallbackReviewers;
    /** If true, access reviews are required for assignments through this policy. */
    private Boolean _isEnabled;
    /** Specifies whether to display recommendations to the reviewer. The default value is true. */
    private Boolean _isRecommendationEnabled;
    /** Specifies whether the reviewer must provide justification for the approval. The default value is true. */
    private Boolean _isReviewerJustificationRequired;
    /** Specifies whether the principals can review their own assignments. */
    private Boolean _isSelfReview;
    /** The OdataType property */
    private String _odataType;
    /** This collection specifies the users or group of users who will review the access package assignments. */
    private java.util.List<SubjectSet> _primaryReviewers;
    /** When the first review should start and how often it should recur. */
    private EntitlementManagementSchedule _schedule;
    /**
     * Instantiates a new accessPackageAssignmentReviewSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentReviewSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessPackageAssignmentReviewSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentReviewSettings
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentReviewSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentReviewSettings();
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
     * Gets the expirationBehavior property value. The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess, acceptAccessRecommendation, unknownFutureValue.
     * @return a accessReviewExpirationBehavior
     */
    @javax.annotation.Nullable
    public AccessReviewExpirationBehavior getExpirationBehavior() {
        return this._expirationBehavior;
    }
    /**
     * Gets the fallbackReviewers property value. This collection specifies the users who will be the fallback reviewers when the primary reviewers don't respond.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getFallbackReviewers() {
        return this._fallbackReviewers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignmentReviewSettings currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(9);
        deserializerMap.put("expirationBehavior", (n) -> { currentObject.setExpirationBehavior(n.getEnumValue(AccessReviewExpirationBehavior.class)); });
        deserializerMap.put("fallbackReviewers", (n) -> { currentObject.setFallbackReviewers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isRecommendationEnabled", (n) -> { currentObject.setIsRecommendationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isReviewerJustificationRequired", (n) -> { currentObject.setIsReviewerJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("isSelfReview", (n) -> { currentObject.setIsSelfReview(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryReviewers", (n) -> { currentObject.setPrimaryReviewers(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(EntitlementManagementSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. If true, access reviews are required for assignments through this policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the isRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRecommendationEnabled() {
        return this._isRecommendationEnabled;
    }
    /**
     * Gets the isReviewerJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReviewerJustificationRequired() {
        return this._isReviewerJustificationRequired;
    }
    /**
     * Gets the isSelfReview property value. Specifies whether the principals can review their own assignments.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSelfReview() {
        return this._isSelfReview;
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
     * Gets the primaryReviewers property value. This collection specifies the users or group of users who will review the access package assignments.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getPrimaryReviewers() {
        return this._primaryReviewers;
    }
    /**
     * Gets the schedule property value. When the first review should start and how often it should recur.
     * @return a entitlementManagementSchedule
     */
    @javax.annotation.Nullable
    public EntitlementManagementSchedule getSchedule() {
        return this._schedule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the expirationBehavior property value. The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess, acceptAccessRecommendation, unknownFutureValue.
     * @param value Value to set for the expirationBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationBehavior(@javax.annotation.Nullable final AccessReviewExpirationBehavior value) {
        this._expirationBehavior = value;
    }
    /**
     * Sets the fallbackReviewers property value. This collection specifies the users who will be the fallback reviewers when the primary reviewers don't respond.
     * @param value Value to set for the fallbackReviewers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFallbackReviewers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._fallbackReviewers = value;
    }
    /**
     * Sets the isEnabled property value. If true, access reviews are required for assignments through this policy.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the isRecommendationEnabled property value. Specifies whether to display recommendations to the reviewer. The default value is true.
     * @param value Value to set for the isRecommendationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRecommendationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isRecommendationEnabled = value;
    }
    /**
     * Sets the isReviewerJustificationRequired property value. Specifies whether the reviewer must provide justification for the approval. The default value is true.
     * @param value Value to set for the isReviewerJustificationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsReviewerJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isReviewerJustificationRequired = value;
    }
    /**
     * Sets the isSelfReview property value. Specifies whether the principals can review their own assignments.
     * @param value Value to set for the isSelfReview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSelfReview(@javax.annotation.Nullable final Boolean value) {
        this._isSelfReview = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the primaryReviewers property value. This collection specifies the users or group of users who will review the access package assignments.
     * @param value Value to set for the primaryReviewers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryReviewers(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._primaryReviewers = value;
    }
    /**
     * Sets the schedule property value. When the first review should start and how often it should recur.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedule(@javax.annotation.Nullable final EntitlementManagementSchedule value) {
        this._schedule = value;
    }
}
