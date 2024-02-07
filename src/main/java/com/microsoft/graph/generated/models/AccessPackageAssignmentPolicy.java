package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new AccessPackageAssignmentPolicy and sets the default values.
     */
    public AccessPackageAssignmentPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentPolicy();
    }
    /**
     * Gets the accessPackage property value. Access package containing this policy. Read-only.  Supports $expand.
     * @return a AccessPackage
     */
    @jakarta.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this.backingStore.get("accessPackage");
    }
    /**
     * Gets the allowedTargetScope property value. Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue.
     * @return a AllowedTargetScope
     */
    @jakarta.annotation.Nullable
    public AllowedTargetScope getAllowedTargetScope() {
        return this.backingStore.get("allowedTargetScope");
    }
    /**
     * Gets the automaticRequestSettings property value. This property is only present for an auto assignment policy; if absent, this is a request-based policy.
     * @return a AccessPackageAutomaticRequestSettings
     */
    @jakarta.annotation.Nullable
    public AccessPackageAutomaticRequestSettings getAutomaticRequestSettings() {
        return this.backingStore.get("automaticRequestSettings");
    }
    /**
     * Gets the catalog property value. Catalog of the access package containing this policy. Read-only.
     * @return a AccessPackageCatalog
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalog getCatalog() {
        return this.backingStore.get("catalog");
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customExtensionStageSettings property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @return a java.util.List<CustomExtensionStageSetting>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionStageSetting> getCustomExtensionStageSettings() {
        return this.backingStore.get("customExtensionStageSettings");
    }
    /**
     * Gets the description property value. The description of the policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the expiration property value. The expiration date for assignments created in this policy.
     * @return a ExpirationPattern
     */
    @jakarta.annotation.Nullable
    public ExpirationPattern getExpiration() {
        return this.backingStore.get("expiration");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("allowedTargetScope", (n) -> { this.setAllowedTargetScope(n.getEnumValue(AllowedTargetScope::forValue)); });
        deserializerMap.put("automaticRequestSettings", (n) -> { this.setAutomaticRequestSettings(n.getObjectValue(AccessPackageAutomaticRequestSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("catalog", (n) -> { this.setCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customExtensionStageSettings", (n) -> { this.setCustomExtensionStageSettings(n.getCollectionOfObjectValues(CustomExtensionStageSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("expiration", (n) -> { this.setExpiration(n.getObjectValue(ExpirationPattern::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("questions", (n) -> { this.setQuestions(n.getCollectionOfObjectValues(AccessPackageQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("requestApprovalSettings", (n) -> { this.setRequestApprovalSettings(n.getObjectValue(AccessPackageAssignmentApprovalSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("requestorSettings", (n) -> { this.setRequestorSettings(n.getObjectValue(AccessPackageAssignmentRequestorSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("reviewSettings", (n) -> { this.setReviewSettings(n.getObjectValue(AccessPackageAssignmentReviewSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("specificAllowedTargets", (n) -> { this.setSpecificAllowedTargets(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the questions property value. Questions that are posed to the  requestor.
     * @return a java.util.List<AccessPackageQuestion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this.backingStore.get("questions");
    }
    /**
     * Gets the requestApprovalSettings property value. Specifies the settings for approval of requests for an access package assignment through this policy. For example, if approval is required for new requests.
     * @return a AccessPackageAssignmentApprovalSettings
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentApprovalSettings getRequestApprovalSettings() {
        return this.backingStore.get("requestApprovalSettings");
    }
    /**
     * Gets the requestorSettings property value. Provides additional settings to select who can create a request for an access package assignment through this policy, and what they can include in their request.
     * @return a AccessPackageAssignmentRequestorSettings
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentRequestorSettings getRequestorSettings() {
        return this.backingStore.get("requestorSettings");
    }
    /**
     * Gets the reviewSettings property value. Settings for access reviews of assignments through this policy.
     * @return a AccessPackageAssignmentReviewSettings
     */
    @jakarta.annotation.Nullable
    public AccessPackageAssignmentReviewSettings getReviewSettings() {
        return this.backingStore.get("reviewSettings");
    }
    /**
     * Gets the specificAllowedTargets property value. The principals that can be assigned access from an access package through this policy.
     * @return a java.util.List<SubjectSet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubjectSet> getSpecificAllowedTargets() {
        return this.backingStore.get("specificAllowedTargets");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeEnumValue("allowedTargetScope", this.getAllowedTargetScope());
        writer.writeObjectValue("automaticRequestSettings", this.getAutomaticRequestSettings());
        writer.writeObjectValue("catalog", this.getCatalog());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customExtensionStageSettings", this.getCustomExtensionStageSettings());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("expiration", this.getExpiration());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeObjectValue("requestApprovalSettings", this.getRequestApprovalSettings());
        writer.writeObjectValue("requestorSettings", this.getRequestorSettings());
        writer.writeObjectValue("reviewSettings", this.getReviewSettings());
        writer.writeCollectionOfObjectValues("specificAllowedTargets", this.getSpecificAllowedTargets());
    }
    /**
     * Sets the accessPackage property value. Access package containing this policy. Read-only.  Supports $expand.
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final AccessPackage value) {
        this.backingStore.set("accessPackage", value);
    }
    /**
     * Sets the allowedTargetScope property value. Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue.
     * @param value Value to set for the allowedTargetScope property.
     */
    public void setAllowedTargetScope(@jakarta.annotation.Nullable final AllowedTargetScope value) {
        this.backingStore.set("allowedTargetScope", value);
    }
    /**
     * Sets the automaticRequestSettings property value. This property is only present for an auto assignment policy; if absent, this is a request-based policy.
     * @param value Value to set for the automaticRequestSettings property.
     */
    public void setAutomaticRequestSettings(@jakarta.annotation.Nullable final AccessPackageAutomaticRequestSettings value) {
        this.backingStore.set("automaticRequestSettings", value);
    }
    /**
     * Sets the catalog property value. Catalog of the access package containing this policy. Read-only.
     * @param value Value to set for the catalog property.
     */
    public void setCatalog(@jakarta.annotation.Nullable final AccessPackageCatalog value) {
        this.backingStore.set("catalog", value);
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customExtensionStageSettings property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @param value Value to set for the customExtensionStageSettings property.
     */
    public void setCustomExtensionStageSettings(@jakarta.annotation.Nullable final java.util.List<CustomExtensionStageSetting> value) {
        this.backingStore.set("customExtensionStageSettings", value);
    }
    /**
     * Sets the description property value. The description of the policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the expiration property value. The expiration date for assignments created in this policy.
     * @param value Value to set for the expiration property.
     */
    public void setExpiration(@jakarta.annotation.Nullable final ExpirationPattern value) {
        this.backingStore.set("expiration", value);
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the questions property value. Questions that are posed to the  requestor.
     * @param value Value to set for the questions property.
     */
    public void setQuestions(@jakarta.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this.backingStore.set("questions", value);
    }
    /**
     * Sets the requestApprovalSettings property value. Specifies the settings for approval of requests for an access package assignment through this policy. For example, if approval is required for new requests.
     * @param value Value to set for the requestApprovalSettings property.
     */
    public void setRequestApprovalSettings(@jakarta.annotation.Nullable final AccessPackageAssignmentApprovalSettings value) {
        this.backingStore.set("requestApprovalSettings", value);
    }
    /**
     * Sets the requestorSettings property value. Provides additional settings to select who can create a request for an access package assignment through this policy, and what they can include in their request.
     * @param value Value to set for the requestorSettings property.
     */
    public void setRequestorSettings(@jakarta.annotation.Nullable final AccessPackageAssignmentRequestorSettings value) {
        this.backingStore.set("requestorSettings", value);
    }
    /**
     * Sets the reviewSettings property value. Settings for access reviews of assignments through this policy.
     * @param value Value to set for the reviewSettings property.
     */
    public void setReviewSettings(@jakarta.annotation.Nullable final AccessPackageAssignmentReviewSettings value) {
        this.backingStore.set("reviewSettings", value);
    }
    /**
     * Sets the specificAllowedTargets property value. The principals that can be assigned access from an access package through this policy.
     * @param value Value to set for the specificAllowedTargets property.
     */
    public void setSpecificAllowedTargets(@jakarta.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.backingStore.set("specificAllowedTargets", value);
    }
}
