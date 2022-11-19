package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackage extends Entity implements Parsable {
    /** The access packages that are incompatible with this package. Read-only. */
    private java.util.List<AccessPackage> _accessPackagesIncompatibleWith;
    /** The assignmentPolicies property */
    private java.util.List<AccessPackageAssignmentPolicy> _assignmentPolicies;
    /** The catalog property */
    private AccessPackageCatalog _catalog;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The description of the access package. */
    private String _description;
    /** The display name of the access package. Supports $filter (eq, contains). */
    private String _displayName;
    /** The access packages whose assigned users are ineligible to be assigned this access package. */
    private java.util.List<AccessPackage> _incompatibleAccessPackages;
    /** The groups whose members are ineligible to be assigned this access package. */
    private java.util.List<Group> _incompatibleGroups;
    /** Whether the access package is hidden from the requestor. */
    private Boolean _isHidden;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _modifiedDateTime;
    /**
     * Instantiates a new accessPackage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackage() {
        super();
        this.setOdataType("#microsoft.graph.accessPackage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackage
     */
    @javax.annotation.Nonnull
    public static AccessPackage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackage();
    }
    /**
     * Gets the accessPackagesIncompatibleWith property value. The access packages that are incompatible with this package. Read-only.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackagesIncompatibleWith() {
        return this._accessPackagesIncompatibleWith;
    }
    /**
     * Gets the assignmentPolicies property value. The assignmentPolicies property
     * @return a accessPackageAssignmentPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageAssignmentPolicy> getAssignmentPolicies() {
        return this._assignmentPolicies;
    }
    /**
     * Gets the catalog property value. The catalog property
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nullable
    public AccessPackageCatalog getCatalog() {
        return this._catalog;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of the access package.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the access package. Supports $filter (eq, contains).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessPackage currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackagesIncompatibleWith", (n) -> { currentObject.setAccessPackagesIncompatibleWith(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("assignmentPolicies", (n) -> { currentObject.setAssignmentPolicies(n.getCollectionOfObjectValues(AccessPackageAssignmentPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("catalog", (n) -> { currentObject.setCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("incompatibleAccessPackages", (n) -> { currentObject.setIncompatibleAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("incompatibleGroups", (n) -> { currentObject.setIncompatibleGroups(n.getCollectionOfObjectValues(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("isHidden", (n) -> { currentObject.setIsHidden(n.getBooleanValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap
    }
    /**
     * Gets the incompatibleAccessPackages property value. The access packages whose assigned users are ineligible to be assigned this access package.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackage> getIncompatibleAccessPackages() {
        return this._incompatibleAccessPackages;
    }
    /**
     * Gets the incompatibleGroups property value. The groups whose members are ineligible to be assigned this access package.
     * @return a group
     */
    @javax.annotation.Nullable
    public java.util.List<Group> getIncompatibleGroups() {
        return this._incompatibleGroups;
    }
    /**
     * Gets the isHidden property value. Whether the access package is hidden from the requestor.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHidden() {
        return this._isHidden;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
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
    }
    /**
     * Sets the accessPackagesIncompatibleWith property value. The access packages that are incompatible with this package. Read-only.
     * @param value Value to set for the accessPackagesIncompatibleWith property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackagesIncompatibleWith(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this._accessPackagesIncompatibleWith = value;
    }
    /**
     * Sets the assignmentPolicies property value. The assignmentPolicies property
     * @param value Value to set for the assignmentPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentPolicies(@javax.annotation.Nullable final java.util.List<AccessPackageAssignmentPolicy> value) {
        this._assignmentPolicies = value;
    }
    /**
     * Sets the catalog property value. The catalog property
     * @param value Value to set for the catalog property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalog(@javax.annotation.Nullable final AccessPackageCatalog value) {
        this._catalog = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the access package.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the access package. Supports $filter (eq, contains).
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the incompatibleAccessPackages property value. The access packages whose assigned users are ineligible to be assigned this access package.
     * @param value Value to set for the incompatibleAccessPackages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncompatibleAccessPackages(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this._incompatibleAccessPackages = value;
    }
    /**
     * Sets the incompatibleGroups property value. The groups whose members are ineligible to be assigned this access package.
     * @param value Value to set for the incompatibleGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncompatibleGroups(@javax.annotation.Nullable final java.util.List<Group> value) {
        this._incompatibleGroups = value;
    }
    /**
     * Sets the isHidden property value. Whether the access package is hidden from the requestor.
     * @param value Value to set for the isHidden property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHidden(@javax.annotation.Nullable final Boolean value) {
        this._isHidden = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
}
