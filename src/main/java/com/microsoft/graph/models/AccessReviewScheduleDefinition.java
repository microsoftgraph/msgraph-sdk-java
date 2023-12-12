package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewScheduleDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new AccessReviewScheduleDefinition and sets the default values.
     */
    public AccessReviewScheduleDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewScheduleDefinition
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewScheduleDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewScheduleDefinition();
    }
    /**
     * Gets the additionalNotificationRecipients property value. Defines the list of additional users or group members to be notified of the access review progress.
     * @return a java.util.List<AccessReviewNotificationRecipientItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewNotificationRecipientItem> getAdditionalNotificationRecipients() {
        return this.backingStore.get("additionalNotificationRecipients");
    }
    /**
     * Gets the createdBy property value. User who created this review. Read-only.
     * @return a UserIdentity
     */
    @jakarta.annotation.Nullable
    public UserIdentity getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Timestamp when the access review series was created. Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the descriptionForAdmins property value. Description provided by review creators to provide more context of the review to admins. Supports $select.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescriptionForAdmins() {
        return this.backingStore.get("descriptionForAdmins");
    }
    /**
     * Gets the descriptionForReviewers property value. Description provided  by review creators to provide more context of the review to reviewers. Reviewers see this description in the email sent to them requesting their review. Email notifications support up to 256 characters. Supports $select.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescriptionForReviewers() {
        return this.backingStore.get("descriptionForReviewers");
    }
    /**
     * Gets the displayName property value. Name of the access review series. Supports $select and $orderby. Required on create.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers are notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner doesn't exist, or manager is specified as reviewer but a user's manager doesn't exist. See accessReviewReviewerScope. Replaces backupReviewers. Supports $select. NOTE: The value of this property will be ignored if fallback reviewers are assigned through the stageSettings property.
     * @return a java.util.List<AccessReviewReviewerScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getFallbackReviewers() {
        return this.backingStore.get("fallbackReviewers");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalNotificationRecipients", (n) -> { this.setAdditionalNotificationRecipients(n.getCollectionOfObjectValues(AccessReviewNotificationRecipientItem::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("descriptionForAdmins", (n) -> { this.setDescriptionForAdmins(n.getStringValue()); });
        deserializerMap.put("descriptionForReviewers", (n) -> { this.setDescriptionForReviewers(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("fallbackReviewers", (n) -> { this.setFallbackReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("instanceEnumerationScope", (n) -> { this.setInstanceEnumerationScope(n.getObjectValue(AccessReviewScope::createFromDiscriminatorValue)); });
        deserializerMap.put("instances", (n) -> { this.setInstances(n.getCollectionOfObjectValues(AccessReviewInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewers", (n) -> { this.setReviewers(n.getCollectionOfObjectValues(AccessReviewReviewerScope::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getObjectValue(AccessReviewScope::createFromDiscriminatorValue)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(AccessReviewScheduleSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("stageSettings", (n) -> { this.setStageSettings(n.getCollectionOfObjectValues(AccessReviewStageSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the instanceEnumerationScope property value. This property is required when scoping a review to guest users' access across all Microsoft 365 groups and determines which Microsoft 365 groups are reviewed. Each group becomes a unique accessReviewInstance of the access review series.  For supported scopes, see accessReviewScope. Supports $select. For examples of options for configuring instanceEnumerationScope, see Configure the scope of your access review definition using the Microsoft Graph API.
     * @return a AccessReviewScope
     */
    @jakarta.annotation.Nullable
    public AccessReviewScope getInstanceEnumerationScope() {
        return this.backingStore.get("instanceEnumerationScope");
    }
    /**
     * Gets the instances property value. If the accessReviewScheduleDefinition is a recurring access review, instances represent each recurrence. A review that doesn't recur will have exactly one instance. Instances also represent each unique resource under review in the accessReviewScheduleDefinition. If a review has multiple resources and multiple instances, each resource has a unique instance for each recurrence.
     * @return a java.util.List<AccessReviewInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewInstance> getInstances() {
        return this.backingStore.get("instances");
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp when the access review series was last modified. Supports $select. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the reviewers property value. This collection of access review scopes is used to define who are the reviewers. The reviewers property is only updatable if individual users are assigned as reviewers. Required on create. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API. NOTE: The value of this property will be ignored if reviewers are assigned through the stageSettings property.
     * @return a java.util.List<AccessReviewReviewerScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewReviewerScope> getReviewers() {
        return this.backingStore.get("reviewers");
    }
    /**
     * Gets the scope property value. Defines the entities whose access is reviewed. For supported scopes, see accessReviewScope. Required on create. Supports $select and $filter (contains only). For examples of options for configuring scope, see Configure the scope of your access review definition using the Microsoft Graph API.
     * @return a AccessReviewScope
     */
    @jakarta.annotation.Nullable
    public AccessReviewScope getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the settings property value. The settings for an access review series, see type definition below. Supports $select. Required on create.
     * @return a AccessReviewScheduleSettings
     */
    @jakarta.annotation.Nullable
    public AccessReviewScheduleSettings getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the stageSettings property value. Required only for a multi-stage access review to define the stages and their settings. You can break down each review instance into up to three sequential stages, where each stage can have a different set of reviewers, fallback reviewers, and settings. Stages are created sequentially based on the dependsOn property. Optional.  When this property is defined, its settings are used instead of the corresponding settings in the accessReviewScheduleDefinition object and its settings, reviewers, and fallbackReviewers properties.
     * @return a java.util.List<AccessReviewStageSettings>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessReviewStageSettings> getStageSettings() {
        return this.backingStore.get("stageSettings");
    }
    /**
     * Gets the status property value. This read-only field specifies the status of an access review. The typical states include Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.  Supports $select, $orderby, and $filter (eq only). Read-only.
     * @return a String
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
        writer.writeCollectionOfObjectValues("additionalNotificationRecipients", this.getAdditionalNotificationRecipients());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("descriptionForAdmins", this.getDescriptionForAdmins());
        writer.writeStringValue("descriptionForReviewers", this.getDescriptionForReviewers());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("fallbackReviewers", this.getFallbackReviewers());
        writer.writeObjectValue("instanceEnumerationScope", this.getInstanceEnumerationScope());
        writer.writeCollectionOfObjectValues("instances", this.getInstances());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("reviewers", this.getReviewers());
        writer.writeObjectValue("scope", this.getScope());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("stageSettings", this.getStageSettings());
        writer.writeStringValue("status", this.getStatus());
    }
    /**
     * Sets the additionalNotificationRecipients property value. Defines the list of additional users or group members to be notified of the access review progress.
     * @param value Value to set for the additionalNotificationRecipients property.
     */
    public void setAdditionalNotificationRecipients(@jakarta.annotation.Nullable final java.util.List<AccessReviewNotificationRecipientItem> value) {
        this.backingStore.set("additionalNotificationRecipients", value);
    }
    /**
     * Sets the createdBy property value. User who created this review. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp when the access review series was created. Supports $select. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the descriptionForAdmins property value. Description provided by review creators to provide more context of the review to admins. Supports $select.
     * @param value Value to set for the descriptionForAdmins property.
     */
    public void setDescriptionForAdmins(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("descriptionForAdmins", value);
    }
    /**
     * Sets the descriptionForReviewers property value. Description provided  by review creators to provide more context of the review to reviewers. Reviewers see this description in the email sent to them requesting their review. Email notifications support up to 256 characters. Supports $select.
     * @param value Value to set for the descriptionForReviewers property.
     */
    public void setDescriptionForReviewers(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("descriptionForReviewers", value);
    }
    /**
     * Sets the displayName property value. Name of the access review series. Supports $select and $orderby. Required on create.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the fallbackReviewers property value. This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers are notified to take action if no users are found from the list of reviewers specified. This could occur when either the group owner is specified as the reviewer but the group owner doesn't exist, or manager is specified as reviewer but a user's manager doesn't exist. See accessReviewReviewerScope. Replaces backupReviewers. Supports $select. NOTE: The value of this property will be ignored if fallback reviewers are assigned through the stageSettings property.
     * @param value Value to set for the fallbackReviewers property.
     */
    public void setFallbackReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.backingStore.set("fallbackReviewers", value);
    }
    /**
     * Sets the instanceEnumerationScope property value. This property is required when scoping a review to guest users' access across all Microsoft 365 groups and determines which Microsoft 365 groups are reviewed. Each group becomes a unique accessReviewInstance of the access review series.  For supported scopes, see accessReviewScope. Supports $select. For examples of options for configuring instanceEnumerationScope, see Configure the scope of your access review definition using the Microsoft Graph API.
     * @param value Value to set for the instanceEnumerationScope property.
     */
    public void setInstanceEnumerationScope(@jakarta.annotation.Nullable final AccessReviewScope value) {
        this.backingStore.set("instanceEnumerationScope", value);
    }
    /**
     * Sets the instances property value. If the accessReviewScheduleDefinition is a recurring access review, instances represent each recurrence. A review that doesn't recur will have exactly one instance. Instances also represent each unique resource under review in the accessReviewScheduleDefinition. If a review has multiple resources and multiple instances, each resource has a unique instance for each recurrence.
     * @param value Value to set for the instances property.
     */
    public void setInstances(@jakarta.annotation.Nullable final java.util.List<AccessReviewInstance> value) {
        this.backingStore.set("instances", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp when the access review series was last modified. Supports $select. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the reviewers property value. This collection of access review scopes is used to define who are the reviewers. The reviewers property is only updatable if individual users are assigned as reviewers. Required on create. Supports $select. For examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API. NOTE: The value of this property will be ignored if reviewers are assigned through the stageSettings property.
     * @param value Value to set for the reviewers property.
     */
    public void setReviewers(@jakarta.annotation.Nullable final java.util.List<AccessReviewReviewerScope> value) {
        this.backingStore.set("reviewers", value);
    }
    /**
     * Sets the scope property value. Defines the entities whose access is reviewed. For supported scopes, see accessReviewScope. Required on create. Supports $select and $filter (contains only). For examples of options for configuring scope, see Configure the scope of your access review definition using the Microsoft Graph API.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final AccessReviewScope value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the settings property value. The settings for an access review series, see type definition below. Supports $select. Required on create.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final AccessReviewScheduleSettings value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the stageSettings property value. Required only for a multi-stage access review to define the stages and their settings. You can break down each review instance into up to three sequential stages, where each stage can have a different set of reviewers, fallback reviewers, and settings. Stages are created sequentially based on the dependsOn property. Optional.  When this property is defined, its settings are used instead of the corresponding settings in the accessReviewScheduleDefinition object and its settings, reviewers, and fallbackReviewers properties.
     * @param value Value to set for the stageSettings property.
     */
    public void setStageSettings(@jakarta.annotation.Nullable final java.util.List<AccessReviewStageSettings> value) {
        this.backingStore.set("stageSettings", value);
    }
    /**
     * Sets the status property value. This read-only field specifies the status of an access review. The typical states include Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.  Supports $select, $orderby, and $filter (eq only). Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
}
