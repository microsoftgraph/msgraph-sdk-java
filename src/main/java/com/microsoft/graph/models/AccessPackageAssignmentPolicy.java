package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageAssignmentPolicy extends Entity implements Parsable {
    /**
     * Access package containing this policy. Read-only.
     */
    private AccessPackage accessPackage;
    /**
     * Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue.
     */
    private AllowedTargetScope allowedTargetScope;
    /**
     * This property is only present for an auto assignment policy; if absent, this is a request-based policy.
     */
    private AccessPackageAutomaticRequestSettings automaticRequestSettings;
    /**
     * Catalog of the access package containing this policy. Read-only.
     */
    private AccessPackageCatalog catalog;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description of the policy.
     */
    private String description;
    /**
     * The display name of the policy.
     */
    private String displayName;
    /**
     * The expiration date for assignments created in this policy.
     */
    private ExpirationPattern expiration;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * Questions that are posed to the  requestor.
     */
    private java.util.List<AccessPackageQuestion> questions;
    /**
     * Specifies the settings for approval of requests for an access package assignment through this policy. For example, if approval is required for new requests.
     */
    private AccessPackageAssignmentApprovalSettings requestApprovalSettings;
    /**
     * Provides additional settings to select who can create a request for an access package assignment through this policy, and what they can include in their request.
     */
    private AccessPackageAssignmentRequestorSettings requestorSettings;
    /**
     * Settings for access reviews of assignments through this policy.
     */
    private AccessPackageAssignmentReviewSettings reviewSettings;
    /**
     * The principals that can be assigned access from an access package through this policy.
     */
    private java.util.List<SubjectSet> specificAllowedTargets;
    /**
     * Instantiates a new accessPackageAssignmentPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageAssignmentPolicy
     */
    @javax.annotation.Nonnull
    public static AccessPackageAssignmentPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentPolicy();
    }
    /**
     * Gets the accessPackage property value. Access package containing this policy. Read-only.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this.accessPackage;
    }
    /**
     * Gets the allowedTargetScope property value. Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue.
     * @return a allowedTargetScope
     */
    @javax.annotation.Nullable
    public AllowedTargetScope getAllowedTargetScope() {
        return this.allowedTargetScope;
    }
    /**
     * Gets the automaticRequestSettings property value. This property is only present for an auto assignment policy; if absent, this is a request-based policy.
     * @return a accessPackageAutomaticRequestSettings
     */
    @javax.annotation.Nullable
    public AccessPackageAutomaticRequestSettings getAutomaticRequestSettings() {
        return this.automaticRequestSettings;
    }
    /**
     * Gets the catalog property value. Catalog of the access package containing this policy. Read-only.
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nullable
    public AccessPackageCatalog getCatalog() {
        return this.catalog;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the expiration property value. The expiration date for assignments created in this policy.
     * @return a expirationPattern
     */
    @javax.annotation.Nullable
    public ExpirationPattern getExpiration() {
        return this.expiration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("allowedTargetScope", (n) -> { this.setAllowedTargetScope(n.getEnumValue(AllowedTargetScope.class)); });
        deserializerMap.put("automaticRequestSettings", (n) -> { this.setAutomaticRequestSettings(n.getObjectValue(AccessPackageAutomaticRequestSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("catalog", (n) -> { this.setCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
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
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the questions property value. Questions that are posed to the  requestor.
     * @return a accessPackageQuestion
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this.questions;
    }
    /**
     * Gets the requestApprovalSettings property value. Specifies the settings for approval of requests for an access package assignment through this policy. For example, if approval is required for new requests.
     * @return a accessPackageAssignmentApprovalSettings
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentApprovalSettings getRequestApprovalSettings() {
        return this.requestApprovalSettings;
    }
    /**
     * Gets the requestorSettings property value. Provides additional settings to select who can create a request for an access package assignment through this policy, and what they can include in their request.
     * @return a accessPackageAssignmentRequestorSettings
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentRequestorSettings getRequestorSettings() {
        return this.requestorSettings;
    }
    /**
     * Gets the reviewSettings property value. Settings for access reviews of assignments through this policy.
     * @return a accessPackageAssignmentReviewSettings
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentReviewSettings getReviewSettings() {
        return this.reviewSettings;
    }
    /**
     * Gets the specificAllowedTargets property value. The principals that can be assigned access from an access package through this policy.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getSpecificAllowedTargets() {
        return this.specificAllowedTargets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeEnumValue("allowedTargetScope", this.getAllowedTargetScope());
        writer.writeObjectValue("automaticRequestSettings", this.getAutomaticRequestSettings());
        writer.writeObjectValue("catalog", this.getCatalog());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
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
     * Sets the accessPackage property value. Access package containing this policy. Read-only.
     * @param value Value to set for the accessPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackage(@javax.annotation.Nullable final AccessPackage value) {
        this.accessPackage = value;
    }
    /**
     * Sets the allowedTargetScope property value. Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue.
     * @param value Value to set for the allowedTargetScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedTargetScope(@javax.annotation.Nullable final AllowedTargetScope value) {
        this.allowedTargetScope = value;
    }
    /**
     * Sets the automaticRequestSettings property value. This property is only present for an auto assignment policy; if absent, this is a request-based policy.
     * @param value Value to set for the automaticRequestSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomaticRequestSettings(@javax.annotation.Nullable final AccessPackageAutomaticRequestSettings value) {
        this.automaticRequestSettings = value;
    }
    /**
     * Sets the catalog property value. Catalog of the access package containing this policy. Read-only.
     * @param value Value to set for the catalog property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalog(@javax.annotation.Nullable final AccessPackageCatalog value) {
        this.catalog = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the expiration property value. The expiration date for assignments created in this policy.
     * @param value Value to set for the expiration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiration(@javax.annotation.Nullable final ExpirationPattern value) {
        this.expiration = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the questions property value. Questions that are posed to the  requestor.
     * @param value Value to set for the questions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuestions(@javax.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this.questions = value;
    }
    /**
     * Sets the requestApprovalSettings property value. Specifies the settings for approval of requests for an access package assignment through this policy. For example, if approval is required for new requests.
     * @param value Value to set for the requestApprovalSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestApprovalSettings(@javax.annotation.Nullable final AccessPackageAssignmentApprovalSettings value) {
        this.requestApprovalSettings = value;
    }
    /**
     * Sets the requestorSettings property value. Provides additional settings to select who can create a request for an access package assignment through this policy, and what they can include in their request.
     * @param value Value to set for the requestorSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestorSettings(@javax.annotation.Nullable final AccessPackageAssignmentRequestorSettings value) {
        this.requestorSettings = value;
    }
    /**
     * Sets the reviewSettings property value. Settings for access reviews of assignments through this policy.
     * @param value Value to set for the reviewSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewSettings(@javax.annotation.Nullable final AccessPackageAssignmentReviewSettings value) {
        this.reviewSettings = value;
    }
    /**
     * Sets the specificAllowedTargets property value. The principals that can be assigned access from an access package through this policy.
     * @param value Value to set for the specificAllowedTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecificAllowedTargets(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this.specificAllowedTargets = value;
    }
}
