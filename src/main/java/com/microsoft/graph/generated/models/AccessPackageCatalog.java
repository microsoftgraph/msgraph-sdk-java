package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageCatalog extends Entity implements Parsable {
    /**
     * Instantiates a new AccessPackageCatalog and sets the default values.
     */
    public AccessPackageCatalog() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageCatalog
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageCatalog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageCatalog();
    }
    /**
     * Gets the accessPackages property value. The access packages in this catalog. Read-only. Nullable.
     * @return a java.util.List<AccessPackage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackage> getAccessPackages() {
        return this.backingStore.get("accessPackages");
    }
    /**
     * Gets the catalogType property value. Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue.
     * @return a AccessPackageCatalogCatalogType
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalogCatalogType getCatalogType() {
        return this.backingStore.get("catalogType");
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customWorkflowExtensions property value. The customWorkflowExtensions property
     * @return a java.util.List<CustomCalloutExtension>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomCalloutExtension> getCustomWorkflowExtensions() {
        return this.backingStore.get("customWorkflowExtensions");
    }
    /**
     * Gets the description property value. The description of the access package catalog.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name of the access package catalog.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackages", (n) -> { this.setAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("catalogType", (n) -> { this.setCatalogType(n.getEnumValue(AccessPackageCatalogCatalogType::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customWorkflowExtensions", (n) -> { this.setCustomWorkflowExtensions(n.getCollectionOfObjectValues(CustomCalloutExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isExternallyVisible", (n) -> { this.setIsExternallyVisible(n.getBooleanValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceRoles", (n) -> { this.setResourceRoles(n.getCollectionOfObjectValues(AccessPackageResourceRole::createFromDiscriminatorValue)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AccessPackageResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceScopes", (n) -> { this.setResourceScopes(n.getCollectionOfObjectValues(AccessPackageResourceScope::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AccessPackageCatalogState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsExternallyVisible() {
        return this.backingStore.get("isExternallyVisible");
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the resourceRoles property value. The resourceRoles property
     * @return a java.util.List<AccessPackageResourceRole>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceRole> getResourceRoles() {
        return this.backingStore.get("resourceRoles");
    }
    /**
     * Gets the resources property value. Access package resources in this catalog.
     * @return a java.util.List<AccessPackageResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResource> getResources() {
        return this.backingStore.get("resources");
    }
    /**
     * Gets the resourceScopes property value. The resourceScopes property
     * @return a java.util.List<AccessPackageResourceScope>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageResourceScope> getResourceScopes() {
        return this.backingStore.get("resourceScopes");
    }
    /**
     * Gets the state property value. Has the value published if the access packages are available for management. The possible values are: unpublished, published, unknownFutureValue.
     * @return a AccessPackageCatalogState
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalogState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAccessPackages(@jakarta.annotation.Nullable final java.util.List<AccessPackage> value) {
        this.backingStore.set("accessPackages", value);
    }
    /**
     * Sets the catalogType property value. Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue.
     * @param value Value to set for the catalogType property.
     */
    public void setCatalogType(@jakarta.annotation.Nullable final AccessPackageCatalogCatalogType value) {
        this.backingStore.set("catalogType", value);
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customWorkflowExtensions property value. The customWorkflowExtensions property
     * @param value Value to set for the customWorkflowExtensions property.
     */
    public void setCustomWorkflowExtensions(@jakarta.annotation.Nullable final java.util.List<CustomCalloutExtension> value) {
        this.backingStore.set("customWorkflowExtensions", value);
    }
    /**
     * Sets the description property value. The description of the access package catalog.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name of the access package catalog.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @param value Value to set for the isExternallyVisible property.
     */
    public void setIsExternallyVisible(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isExternallyVisible", value);
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the resourceRoles property value. The resourceRoles property
     * @param value Value to set for the resourceRoles property.
     */
    public void setResourceRoles(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceRole> value) {
        this.backingStore.set("resourceRoles", value);
    }
    /**
     * Sets the resources property value. Access package resources in this catalog.
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AccessPackageResource> value) {
        this.backingStore.set("resources", value);
    }
    /**
     * Sets the resourceScopes property value. The resourceScopes property
     * @param value Value to set for the resourceScopes property.
     */
    public void setResourceScopes(@jakarta.annotation.Nullable final java.util.List<AccessPackageResourceScope> value) {
        this.backingStore.set("resourceScopes", value);
    }
    /**
     * Sets the state property value. Has the value published if the access packages are available for management. The possible values are: unpublished, published, unknownFutureValue.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AccessPackageCatalogState value) {
        this.backingStore.set("state", value);
    }
}
