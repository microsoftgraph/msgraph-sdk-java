package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class AccessPackageAssignmentPolicy extends Entity implements Parsable {
    /** Access package containing this policy. Read-only. */
    private AccessPackage _accessPackage;
    /** Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue. */
    private AllowedTargetScope _allowedTargetScope;
    /** This property is only present for an auto assignment policy; if absent, this is a request-based policy. */
    private AccessPackageAutomaticRequestSettings _automaticRequestSettings;
    /** Catalog of the access package containing this policy. Read-only. */
    private AccessPackageCatalog _catalog;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _createdDateTime;
    /** The description of the policy. */
    private String _description;
    /** The display name of the policy. */
    private String _displayName;
    /** The expiration date for assignments created in this policy. */
    private ExpirationPattern _expiration;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _modifiedDateTime;
    /** Specifies the settings for approval of requests for an access package assignment through this policy. For example, if approval is required for new requests. */
    private AccessPackageAssignmentApprovalSettings _requestApprovalSettings;
    /** Provides additional settings to select who can create a request for an access package assignment through this policy, and what they can include in their request. */
    private AccessPackageAssignmentRequestorSettings _requestorSettings;
    /** Settings for access reviews of assignments through this policy. */
    private AccessPackageAssignmentReviewSettings _reviewSettings;
    /** The principals that can be assigned access from an access package through this policy. */
    private java.util.List<SubjectSet> _specificAllowedTargets;
    /**
     * Instantiates a new accessPackageAssignmentPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentPolicy() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageAssignmentPolicy");
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
        return this._accessPackage;
    }
    /**
     * Gets the allowedTargetScope property value. Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue.
     * @return a allowedTargetScope
     */
    @javax.annotation.Nullable
    public AllowedTargetScope getAllowedTargetScope() {
        return this._allowedTargetScope;
    }
    /**
     * Gets the automaticRequestSettings property value. This property is only present for an auto assignment policy; if absent, this is a request-based policy.
     * @return a accessPackageAutomaticRequestSettings
     */
    @javax.annotation.Nullable
    public AccessPackageAutomaticRequestSettings getAutomaticRequestSettings() {
        return this._automaticRequestSettings;
    }
    /**
     * Gets the catalog property value. Catalog of the access package containing this policy. Read-only.
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nullable
    public AccessPackageCatalog getCatalog() {
        return this._catalog;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the expiration property value. The expiration date for assignments created in this policy.
     * @return a expirationPattern
     */
    @javax.annotation.Nullable
    public ExpirationPattern getExpiration() {
        return this._expiration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackageAssignmentPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackage", (n) -> { currentObject.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
            this.put("allowedTargetScope", (n) -> { currentObject.setAllowedTargetScope(n.getEnumValue(AllowedTargetScope.class)); });
            this.put("automaticRequestSettings", (n) -> { currentObject.setAutomaticRequestSettings(n.getObjectValue(AccessPackageAutomaticRequestSettings::createFromDiscriminatorValue)); });
            this.put("catalog", (n) -> { currentObject.setCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("expiration", (n) -> { currentObject.setExpiration(n.getObjectValue(ExpirationPattern::createFromDiscriminatorValue)); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("requestApprovalSettings", (n) -> { currentObject.setRequestApprovalSettings(n.getObjectValue(AccessPackageAssignmentApprovalSettings::createFromDiscriminatorValue)); });
            this.put("requestorSettings", (n) -> { currentObject.setRequestorSettings(n.getObjectValue(AccessPackageAssignmentRequestorSettings::createFromDiscriminatorValue)); });
            this.put("reviewSettings", (n) -> { currentObject.setReviewSettings(n.getObjectValue(AccessPackageAssignmentReviewSettings::createFromDiscriminatorValue)); });
            this.put("specificAllowedTargets", (n) -> { currentObject.setSpecificAllowedTargets(n.getCollectionOfObjectValues(SubjectSet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Gets the requestApprovalSettings property value. Specifies the settings for approval of requests for an access package assignment through this policy. For example, if approval is required for new requests.
     * @return a accessPackageAssignmentApprovalSettings
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentApprovalSettings getRequestApprovalSettings() {
        return this._requestApprovalSettings;
    }
    /**
     * Gets the requestorSettings property value. Provides additional settings to select who can create a request for an access package assignment through this policy, and what they can include in their request.
     * @return a accessPackageAssignmentRequestorSettings
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentRequestorSettings getRequestorSettings() {
        return this._requestorSettings;
    }
    /**
     * Gets the reviewSettings property value. Settings for access reviews of assignments through this policy.
     * @return a accessPackageAssignmentReviewSettings
     */
    @javax.annotation.Nullable
    public AccessPackageAssignmentReviewSettings getReviewSettings() {
        return this._reviewSettings;
    }
    /**
     * Gets the specificAllowedTargets property value. The principals that can be assigned access from an access package through this policy.
     * @return a subjectSet
     */
    @javax.annotation.Nullable
    public java.util.List<SubjectSet> getSpecificAllowedTargets() {
        return this._specificAllowedTargets;
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
        this._accessPackage = value;
    }
    /**
     * Sets the allowedTargetScope property value. Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue.
     * @param value Value to set for the allowedTargetScope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedTargetScope(@javax.annotation.Nullable final AllowedTargetScope value) {
        this._allowedTargetScope = value;
    }
    /**
     * Sets the automaticRequestSettings property value. This property is only present for an auto assignment policy; if absent, this is a request-based policy.
     * @param value Value to set for the automaticRequestSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutomaticRequestSettings(@javax.annotation.Nullable final AccessPackageAutomaticRequestSettings value) {
        this._automaticRequestSettings = value;
    }
    /**
     * Sets the catalog property value. Catalog of the access package containing this policy. Read-only.
     * @param value Value to set for the catalog property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalog(@javax.annotation.Nullable final AccessPackageCatalog value) {
        this._catalog = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the policy.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the expiration property value. The expiration date for assignments created in this policy.
     * @param value Value to set for the expiration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiration(@javax.annotation.Nullable final ExpirationPattern value) {
        this._expiration = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
    /**
     * Sets the requestApprovalSettings property value. Specifies the settings for approval of requests for an access package assignment through this policy. For example, if approval is required for new requests.
     * @param value Value to set for the requestApprovalSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestApprovalSettings(@javax.annotation.Nullable final AccessPackageAssignmentApprovalSettings value) {
        this._requestApprovalSettings = value;
    }
    /**
     * Sets the requestorSettings property value. Provides additional settings to select who can create a request for an access package assignment through this policy, and what they can include in their request.
     * @param value Value to set for the requestorSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestorSettings(@javax.annotation.Nullable final AccessPackageAssignmentRequestorSettings value) {
        this._requestorSettings = value;
    }
    /**
     * Sets the reviewSettings property value. Settings for access reviews of assignments through this policy.
     * @param value Value to set for the reviewSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReviewSettings(@javax.annotation.Nullable final AccessPackageAssignmentReviewSettings value) {
        this._reviewSettings = value;
    }
    /**
     * Sets the specificAllowedTargets property value. The principals that can be assigned access from an access package through this policy.
     * @param value Value to set for the specificAllowedTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecificAllowedTargets(@javax.annotation.Nullable final java.util.List<SubjectSet> value) {
        this._specificAllowedTargets = value;
    }
}
