package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetentionLabel extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RetentionLabel} and sets the default values.
     */
    public RetentionLabel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RetentionLabel}
     */
    @jakarta.annotation.Nonnull
    public static RetentionLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionLabel();
    }
    /**
     * Gets the actionAfterRetentionPeriod property value. Specifies the action to take on the labeled document after the period specified by the retentionDuration property expires. The possible values are: none, delete, startDispositionReview, unknownFutureValue.
     * @return a {@link ActionAfterRetentionPeriod}
     */
    @jakarta.annotation.Nullable
    public ActionAfterRetentionPeriod getActionAfterRetentionPeriod() {
        return this.backingStore.get("actionAfterRetentionPeriod");
    }
    /**
     * Gets the behaviorDuringRetentionPeriod property value. Specifies how the behavior of a document with this label should be during the retention period. The possible values are: doNotRetain, retain, retainAsRecord, retainAsRegulatoryRecord, unknownFutureValue.
     * @return a {@link BehaviorDuringRetentionPeriod}
     */
    @jakarta.annotation.Nullable
    public BehaviorDuringRetentionPeriod getBehaviorDuringRetentionPeriod() {
        return this.backingStore.get("behaviorDuringRetentionPeriod");
    }
    /**
     * Gets the createdBy property value. Represents the user who created the retentionLabel.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Represents the date and time in which the retentionLabel is created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the defaultRecordBehavior property value. Specifies the locked or unlocked state of a record label when it is created.The possible values are: startLocked, startUnlocked, unknownFutureValue.
     * @return a {@link DefaultRecordBehavior}
     */
    @jakarta.annotation.Nullable
    public DefaultRecordBehavior getDefaultRecordBehavior() {
        return this.backingStore.get("defaultRecordBehavior");
    }
    /**
     * Gets the descriptionForAdmins property value. Provides label information for the admin. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescriptionForAdmins() {
        return this.backingStore.get("descriptionForAdmins");
    }
    /**
     * Gets the descriptionForUsers property value. Provides the label information for the user. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescriptionForUsers() {
        return this.backingStore.get("descriptionForUsers");
    }
    /**
     * Gets the descriptors property value. Represents out-of-the-box values that provide more options to improve the manageability and organization of the content you need to label.
     * @return a {@link FilePlanDescriptor}
     */
    @jakarta.annotation.Nullable
    public FilePlanDescriptor getDescriptors() {
        return this.backingStore.get("descriptors");
    }
    /**
     * Gets the displayName property value. Unique string that defines a label name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the dispositionReviewStages property value. When action at the end of retention is chosen as 'dispositionReview', dispositionReviewStages specifies a sequential set of stages with at least one reviewer in each stage.
     * @return a {@link java.util.List<DispositionReviewStage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DispositionReviewStage> getDispositionReviewStages() {
        return this.backingStore.get("dispositionReviewStages");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionAfterRetentionPeriod", (n) -> { this.setActionAfterRetentionPeriod(n.getEnumValue(ActionAfterRetentionPeriod::forValue)); });
        deserializerMap.put("behaviorDuringRetentionPeriod", (n) -> { this.setBehaviorDuringRetentionPeriod(n.getEnumValue(BehaviorDuringRetentionPeriod::forValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("defaultRecordBehavior", (n) -> { this.setDefaultRecordBehavior(n.getEnumValue(DefaultRecordBehavior::forValue)); });
        deserializerMap.put("descriptionForAdmins", (n) -> { this.setDescriptionForAdmins(n.getStringValue()); });
        deserializerMap.put("descriptionForUsers", (n) -> { this.setDescriptionForUsers(n.getStringValue()); });
        deserializerMap.put("descriptors", (n) -> { this.setDescriptors(n.getObjectValue(FilePlanDescriptor::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dispositionReviewStages", (n) -> { this.setDispositionReviewStages(n.getCollectionOfObjectValues(DispositionReviewStage::createFromDiscriminatorValue)); });
        deserializerMap.put("isInUse", (n) -> { this.setIsInUse(n.getBooleanValue()); });
        deserializerMap.put("labelToBeApplied", (n) -> { this.setLabelToBeApplied(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("retentionDuration", (n) -> { this.setRetentionDuration(n.getObjectValue(RetentionDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("retentionEventType", (n) -> { this.setRetentionEventType(n.getObjectValue(RetentionEventType::createFromDiscriminatorValue)); });
        deserializerMap.put("retentionTrigger", (n) -> { this.setRetentionTrigger(n.getEnumValue(RetentionTrigger::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isInUse property value. Specifies whether the label is currently being used.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInUse() {
        return this.backingStore.get("isInUse");
    }
    /**
     * Gets the labelToBeApplied property value. Specifies the replacement label to be applied automatically after the retention period of the current label ends.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabelToBeApplied() {
        return this.backingStore.get("labelToBeApplied");
    }
    /**
     * Gets the lastModifiedBy property value. The user who last modified the retentionLabel.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The latest date time when the retentionLabel was modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the retentionDuration property value. Specifies the number of days to retain the content.
     * @return a {@link RetentionDuration}
     */
    @jakarta.annotation.Nullable
    public RetentionDuration getRetentionDuration() {
        return this.backingStore.get("retentionDuration");
    }
    /**
     * Gets the retentionEventType property value. Represents the type associated with a retention event.
     * @return a {@link RetentionEventType}
     */
    @jakarta.annotation.Nullable
    public RetentionEventType getRetentionEventType() {
        return this.backingStore.get("retentionEventType");
    }
    /**
     * Gets the retentionTrigger property value. Specifies whether the retention duration is calculated from the content creation date, labeled date, or last modification date. The possible values are: dateLabeled, dateCreated, dateModified, dateOfEvent, unknownFutureValue.
     * @return a {@link RetentionTrigger}
     */
    @jakarta.annotation.Nullable
    public RetentionTrigger getRetentionTrigger() {
        return this.backingStore.get("retentionTrigger");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionAfterRetentionPeriod", this.getActionAfterRetentionPeriod());
        writer.writeEnumValue("behaviorDuringRetentionPeriod", this.getBehaviorDuringRetentionPeriod());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("defaultRecordBehavior", this.getDefaultRecordBehavior());
        writer.writeStringValue("descriptionForAdmins", this.getDescriptionForAdmins());
        writer.writeStringValue("descriptionForUsers", this.getDescriptionForUsers());
        writer.writeObjectValue("descriptors", this.getDescriptors());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("dispositionReviewStages", this.getDispositionReviewStages());
        writer.writeBooleanValue("isInUse", this.getIsInUse());
        writer.writeStringValue("labelToBeApplied", this.getLabelToBeApplied());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("retentionDuration", this.getRetentionDuration());
        writer.writeObjectValue("retentionEventType", this.getRetentionEventType());
        writer.writeEnumValue("retentionTrigger", this.getRetentionTrigger());
    }
    /**
     * Sets the actionAfterRetentionPeriod property value. Specifies the action to take on the labeled document after the period specified by the retentionDuration property expires. The possible values are: none, delete, startDispositionReview, unknownFutureValue.
     * @param value Value to set for the actionAfterRetentionPeriod property.
     */
    public void setActionAfterRetentionPeriod(@jakarta.annotation.Nullable final ActionAfterRetentionPeriod value) {
        this.backingStore.set("actionAfterRetentionPeriod", value);
    }
    /**
     * Sets the behaviorDuringRetentionPeriod property value. Specifies how the behavior of a document with this label should be during the retention period. The possible values are: doNotRetain, retain, retainAsRecord, retainAsRegulatoryRecord, unknownFutureValue.
     * @param value Value to set for the behaviorDuringRetentionPeriod property.
     */
    public void setBehaviorDuringRetentionPeriod(@jakarta.annotation.Nullable final BehaviorDuringRetentionPeriod value) {
        this.backingStore.set("behaviorDuringRetentionPeriod", value);
    }
    /**
     * Sets the createdBy property value. Represents the user who created the retentionLabel.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Represents the date and time in which the retentionLabel is created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the defaultRecordBehavior property value. Specifies the locked or unlocked state of a record label when it is created.The possible values are: startLocked, startUnlocked, unknownFutureValue.
     * @param value Value to set for the defaultRecordBehavior property.
     */
    public void setDefaultRecordBehavior(@jakarta.annotation.Nullable final DefaultRecordBehavior value) {
        this.backingStore.set("defaultRecordBehavior", value);
    }
    /**
     * Sets the descriptionForAdmins property value. Provides label information for the admin. Optional.
     * @param value Value to set for the descriptionForAdmins property.
     */
    public void setDescriptionForAdmins(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("descriptionForAdmins", value);
    }
    /**
     * Sets the descriptionForUsers property value. Provides the label information for the user. Optional.
     * @param value Value to set for the descriptionForUsers property.
     */
    public void setDescriptionForUsers(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("descriptionForUsers", value);
    }
    /**
     * Sets the descriptors property value. Represents out-of-the-box values that provide more options to improve the manageability and organization of the content you need to label.
     * @param value Value to set for the descriptors property.
     */
    public void setDescriptors(@jakarta.annotation.Nullable final FilePlanDescriptor value) {
        this.backingStore.set("descriptors", value);
    }
    /**
     * Sets the displayName property value. Unique string that defines a label name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the dispositionReviewStages property value. When action at the end of retention is chosen as 'dispositionReview', dispositionReviewStages specifies a sequential set of stages with at least one reviewer in each stage.
     * @param value Value to set for the dispositionReviewStages property.
     */
    public void setDispositionReviewStages(@jakarta.annotation.Nullable final java.util.List<DispositionReviewStage> value) {
        this.backingStore.set("dispositionReviewStages", value);
    }
    /**
     * Sets the isInUse property value. Specifies whether the label is currently being used.
     * @param value Value to set for the isInUse property.
     */
    public void setIsInUse(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isInUse", value);
    }
    /**
     * Sets the labelToBeApplied property value. Specifies the replacement label to be applied automatically after the retention period of the current label ends.
     * @param value Value to set for the labelToBeApplied property.
     */
    public void setLabelToBeApplied(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("labelToBeApplied", value);
    }
    /**
     * Sets the lastModifiedBy property value. The user who last modified the retentionLabel.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The latest date time when the retentionLabel was modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the retentionDuration property value. Specifies the number of days to retain the content.
     * @param value Value to set for the retentionDuration property.
     */
    public void setRetentionDuration(@jakarta.annotation.Nullable final RetentionDuration value) {
        this.backingStore.set("retentionDuration", value);
    }
    /**
     * Sets the retentionEventType property value. Represents the type associated with a retention event.
     * @param value Value to set for the retentionEventType property.
     */
    public void setRetentionEventType(@jakarta.annotation.Nullable final RetentionEventType value) {
        this.backingStore.set("retentionEventType", value);
    }
    /**
     * Sets the retentionTrigger property value. Specifies whether the retention duration is calculated from the content creation date, labeled date, or last modification date. The possible values are: dateLabeled, dateCreated, dateModified, dateOfEvent, unknownFutureValue.
     * @param value Value to set for the retentionTrigger property.
     */
    public void setRetentionTrigger(@jakarta.annotation.Nullable final RetentionTrigger value) {
        this.backingStore.set("retentionTrigger", value);
    }
}
