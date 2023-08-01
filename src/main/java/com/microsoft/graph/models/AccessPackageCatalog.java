package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageCatalog extends Entity implements Parsable {
    /**
     * The access packages in this catalog. Read-only. Nullable.
     */
    private java.util.List<AccessPackage> accessPackages;
    /**
     * Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue.
     */
    private AccessPackageCatalogType catalogType;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime createdDateTime;
    /**
     * The customWorkflowExtensions property
     */
    private java.util.List<CustomCalloutExtension> customWorkflowExtensions;
    /**
     * The description of the access package catalog.
     */
    private String description;
    /**
     * The display name of the access package catalog.
     */
    private String displayName;
    /**
     * Whether the access packages in this catalog can be requested by users outside of the tenant.
     */
    private Boolean isExternallyVisible;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * The resourceRoles property
     */
    private java.util.List<AccessPackageResourceRole> resourceRoles;
    /**
     * Access package resources in this catalog.
     */
    private java.util.List<AccessPackageResource> resources;
    /**
     * The resourceScopes property
     */
    private java.util.List<AccessPackageResourceScope> resourceScopes;
    /**
     * Has the value published if the access packages are available for management. The possible values are: unpublished, published, unknownFutureValue.
     */
    private AccessPackageCatalogState state;
    /**
     * Instantiates a new accessPackageCatalog and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageCatalog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessPackageCatalog
     */
    @javax.annotation.Nonnull
    public static AccessPackageCatalog createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageCatalog();
    }
    /**
     * Gets the accessPackages property value. The access packages in this catalog. Read-only. Nullable.
     * @return a accessPackage
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this.accessPackages;
    }
    /**
     * Gets the catalogType property value. Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue.
     * @return a accessPackageCatalogType
     */
    @javax.annotation.Nullable
    public AccessPackageCatalogType getCatalogType() {
        return this.catalogType;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the customWorkflowExtensions property value. The customWorkflowExtensions property
     * @return a customCalloutExtension
     */
    @javax.annotation.Nullable
    public java.util.List<CustomCalloutExtension> getCustomWorkflowExtensions() {
        return this.customWorkflowExtensions;
    }
    /**
     * Gets the description property value. The description of the access package catalog.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the access package catalog.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackages", (n) -> { this.setAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogType", (n) -> { this.setCatalogType(n.getEnumValue(AccessPackageCatalogType.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customWorkflowExtensions", (n) -> { this.setCustomWorkflowExtensions(n.getCollectionOfObjectValues(CustomCalloutExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isExternallyVisible", (n) -> { this.setIsExternallyVisible(n.getBooleanValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceRoles", (n) -> { this.setResourceRoles(n.getCollectionOfObjectValues(AccessPackageResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceScopes", (n) -> { this.setResourceScopes(n.getCollectionOfObjectValues(AccessPackageResourceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AccessPackageCatalogState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExternallyVisible() {
        return this.isExternallyVisible;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the resourceRoles property value. The resourceRoles property
     * @return a accessPackageResourceRole
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceRole> getResourceRoles() {
        return this.resourceRoles;
    }
    /**
     * Gets the resources property value. Access package resources in this catalog.
     * @return a accessPackageResource
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResource> getResources() {
        return this.resources;
    }
    /**
     * Gets the resourceScopes property value. The resourceScopes property
     * @return a accessPackageResourceScope
     */
    @javax.annotation.Nullable
    public java.util.List<AccessPackageResourceScope> getResourceScopes() {
        return this.resourceScopes;
    }
    /**
     * Gets the state property value. Has the value published if the access packages are available for management. The possible values are: unpublished, published, unknownFutureValue.
     * @return a accessPackageCatalogState
     */
    @javax.annotation.Nullable
    public AccessPackageCatalogState getState() {
        return this.state;
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
        writer.writeCollectionOfObjectValues("accessPackages", this.getAccessPackages());
        writer.writeEnumValue("catalogType", this.getCatalogType());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customWorkflowExtensions", this.getCustomWorkflowExtensions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isExternallyVisible", this.getIsExternallyVisible());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeCollectionOfObjectValues("resourceRoles", this.getResourceRoles());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfObjectValues("resourceScopes", this.getResourceScopes());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the accessPackages property value. The access packages in this catalog. Read-only. Nullable.
     * @param value Value to set for the accessPackages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackages(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.accessPackages = value;
    }
    /**
     * Sets the catalogType property value. Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue.
     * @param value Value to set for the catalogType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalogType(@javax.annotation.Nullable final AccessPackageCatalogType value) {
        this.catalogType = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the customWorkflowExtensions property value. The customWorkflowExtensions property
     * @param value Value to set for the customWorkflowExtensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomWorkflowExtensions(@javax.annotation.Nullable final java.util.List<CustomCalloutExtension> value) {
        this.customWorkflowExtensions = value;
    }
    /**
     * Sets the description property value. The description of the access package catalog.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the access package catalog.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @param value Value to set for the isExternallyVisible property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExternallyVisible(@javax.annotation.Nullable final Boolean value) {
        this.isExternallyVisible = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the resourceRoles property value. The resourceRoles property
     * @param value Value to set for the resourceRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceRoles(@javax.annotation.Nullable final java.util.List<AccessPackageResourceRole> value) {
        this.resourceRoles = value;
    }
    /**
     * Sets the resources property value. Access package resources in this catalog.
     * @param value Value to set for the resources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResources(@javax.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.resources = value;
    }
    /**
     * Sets the resourceScopes property value. The resourceScopes property
     * @param value Value to set for the resourceScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceScopes(@javax.annotation.Nullable final java.util.List<AccessPackageResourceScope> value) {
        this.resourceScopes = value;
    }
    /**
     * Sets the state property value. Has the value published if the access packages are available for management. The possible values are: unpublished, published, unknownFutureValue.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AccessPackageCatalogState value) {
        this.state = value;
    }
}
