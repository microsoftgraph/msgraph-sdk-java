package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackage extends Entity implements Parsable {
    /**
     * The access packages that are incompatible with this package. Read-only.
     */
    private java.util.List<AccessPackage> accessPackagesIncompatibleWith;
    /**
     * Read-only. Nullable. Supports $expand.
     */
    private java.util.List<AccessPackageAssignmentPolicy> assignmentPolicies;
    /**
     * Required when creating the access package. Read-only. Nullable.
     */
    private AccessPackageCatalog catalog;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The description of the access package.
     */
    private String description;
    /**
     * Required. The display name of the access package. Supports $filter (eq, contains).
     */
    private String displayName;
    /**
     * The access packages whose assigned users are ineligible to be assigned this access package.
     */
    private java.util.List<AccessPackage> incompatibleAccessPackages;
    /**
     * The groups whose members are ineligible to be assigned this access package.
     */
    private java.util.List<Group> incompatibleGroups;
    /**
     * Whether the access package is hidden from the requestor.
     */
    private Boolean isHidden;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * The resource roles and scopes in this access package.
     */
    private java.util.List<AccessPackageResourceRoleScope> resourceRoleScopes;
    /**
     * Instantiates a new accessPackage and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AccessPackage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackage
     */
    @jakarta.annotation.Nonnull
    public static AccessPackage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackage();
    }
    /**
     * Gets the accessPackagesIncompatibleWith property value. The access packages that are incompatible with this package. Read-only.
     * @return a accessPackage
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackagesIncompatibleWith() {
        return this.accessPackagesIncompatibleWith;
    }
    /**
     * Gets the assignmentPolicies property value. Read-only. Nullable. Supports $expand.
     * @return a accessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageAssignmentPolicy> getAssignmentPolicies() {
        return this.assignmentPolicies;
    }
    /**
     * Gets the catalog property value. Required when creating the access package. Read-only. Nullable.
     * @return a accessPackageCatalog
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalog getCatalog() {
        return this.catalog;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. The description of the access package.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Required. The display name of the access package. Supports $filter (eq, contains).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackagesIncompatibleWith", (n) -> { this.setAccessPackagesIncompatibleWith(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentPolicies", (n) -> { this.setAssignmentPolicies(n.getCollectionOfObjectValues(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("catalog", (n) -> { this.setCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("incompatibleAccessPackages", (n) -> { this.setIncompatibleAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("incompatibleGroups", (n) -> { this.setIncompatibleGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("isHidden", (n) -> { this.setIsHidden(n.getBooleanValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceRoleScopes", (n) -> { this.setResourceRoleScopes(n.getCollectionOfObjectValues(AccessPackageResourceRoleScope::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incompatibleAccessPackages property value. The access packages whose assigned users are ineligible to be assigned this access package.
     * @return a accessPackage
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getIncompatibleAccessPackages() {
        return this.incompatibleAccessPackages;
    }
    /**
     * Gets the incompatibleGroups property value. The groups whose members are ineligible to be assigned this access package.
     * @return a group
     */
    @jakarta.annotation.Nullable
    public java.util.List<Group> getIncompatibleGroups() {
        return this.incompatibleGroups;
    }
    /**
     * Gets the isHidden property value. Whether the access package is hidden from the requestor.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHidden() {
        return this.isHidden;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the resourceRoleScopes property value. The resource roles and scopes in this access package.
     * @return a accessPackageResourceRoleScope
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRoleScope> getResourceRoleScopes() {
        return this.resourceRoleScopes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("accessPackagesIncompatibleWith", this.getAccessPackagesIncompatibleWith());
        writer.writeCollectionOfObjectValues("assignmentPolicies", this.getAssignmentPolicies());
        writer.writeObjectValue("catalog", this.getCatalog());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("incompatibleAccessPackages", this.getIncompatibleAccessPackages());
        writer.writeCollectionOfObjectValues("incompatibleGroups", this.getIncompatibleGroups());
        writer.writeBooleanValue("isHidden", this.getIsHidden());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeCollectionOfObjectValues("resourceRoleScopes", this.getResourceRoleScopes());
    }
    /**
     * Sets the accessPackagesIncompatibleWith property value. The access packages that are incompatible with this package. Read-only.
     * @param value Value to set for the accessPackagesIncompatibleWith property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAccessPackagesIncompatibleWith(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.accessPackagesIncompatibleWith = value;
    }
    /**
     * Sets the assignmentPolicies property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the assignmentPolicies property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAssignmentPolicies(@jakarta.annotation.Nullable final java.util.List<AccessPackageAssignmentPolicy> value) {
        this.assignmentPolicies = value;
    }
    /**
     * Sets the catalog property value. Required when creating the access package. Read-only. Nullable.
     * @param value Value to set for the catalog property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCatalog(@jakarta.annotation.Nullable final AccessPackageCatalog value) {
        this.catalog = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the access package.
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Required. The display name of the access package. Supports $filter (eq, contains).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the incompatibleAccessPackages property value. The access packages whose assigned users are ineligible to be assigned this access package.
     * @param value Value to set for the incompatibleAccessPackages property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIncompatibleAccessPackages(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.incompatibleAccessPackages = value;
    }
    /**
     * Sets the incompatibleGroups property value. The groups whose members are ineligible to be assigned this access package.
     * @param value Value to set for the incompatibleGroups property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIncompatibleGroups(@jakarta.annotation.Nullable final java.util.List<Group> value) {
        this.incompatibleGroups = value;
    }
    /**
     * Sets the isHidden property value. Whether the access package is hidden from the requestor.
     * @param value Value to set for the isHidden property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.isHidden = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the resourceRoleScopes property value. The resource roles and scopes in this access package.
     * @param value Value to set for the resourceRoleScopes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setResourceRoleScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRoleScope> value) {
        this.resourceRoleScopes = value;
    }
}
