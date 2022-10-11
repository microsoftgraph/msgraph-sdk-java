package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessPackageCatalog extends Entity implements Parsable {
    /** The access packages in this catalog. Read-only. Nullable. */
    private java.util.List<AccessPackage> _accessPackages;
    /** Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue. */
    private AccessPackageCatalogType _catalogType;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The description of the access package catalog. */
    private String _description;
    /** The display name of the access package catalog. */
    private String _displayName;
    /** Whether the access packages in this catalog can be requested by users outside of the tenant. */
    private Boolean _isExternallyVisible;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _modifiedDateTime;
    /** Has the value published if the access packages are available for management. The possible values are: unpublished, published, unknownFutureValue. */
    private AccessPackageCatalogState _state;
    /**
     * Instantiates a new accessPackageCatalog and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessPackageCatalog() {
        super();
        this.setOdataType("#microsoft.graph.accessPackageCatalog");
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
        return this._accessPackages;
    }
    /**
     * Gets the catalogType property value. Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue.
     * @return a accessPackageCatalogType
     */
    @javax.annotation.Nullable
    public AccessPackageCatalogType getCatalogType() {
        return this._catalogType;
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
     * Gets the description property value. The description of the access package catalog.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name of the access package catalog.
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
        final AccessPackageCatalog currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("accessPackages", (n) -> { currentObject.setAccessPackages(n.getCollectionOfObjectValues(AccessPackage::createFromDiscriminatorValue)); });
            this.put("catalogType", (n) -> { currentObject.setCatalogType(n.getEnumValue(AccessPackageCatalogType.class)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isExternallyVisible", (n) -> { currentObject.setIsExternallyVisible(n.getBooleanValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(AccessPackageCatalogState.class)); });
        }};
    }
    /**
     * Gets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsExternallyVisible() {
        return this._isExternallyVisible;
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
     * Gets the state property value. Has the value published if the access packages are available for management. The possible values are: unpublished, published, unknownFutureValue.
     * @return a accessPackageCatalogState
     */
    @javax.annotation.Nullable
    public AccessPackageCatalogState getState() {
        return this._state;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isExternallyVisible", this.getIsExternallyVisible());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the accessPackages property value. The access packages in this catalog. Read-only. Nullable.
     * @param value Value to set for the accessPackages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccessPackages(@javax.annotation.Nullable final java.util.List<AccessPackage> value) {
        this._accessPackages = value;
    }
    /**
     * Sets the catalogType property value. Whether the catalog is created by a user or entitlement management. The possible values are: userManaged, serviceDefault, serviceManaged, unknownFutureValue.
     * @param value Value to set for the catalogType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalogType(@javax.annotation.Nullable final AccessPackageCatalogType value) {
        this._catalogType = value;
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
     * Sets the description property value. The description of the access package catalog.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name of the access package catalog.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isExternallyVisible property value. Whether the access packages in this catalog can be requested by users outside of the tenant.
     * @param value Value to set for the isExternallyVisible property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsExternallyVisible(@javax.annotation.Nullable final Boolean value) {
        this._isExternallyVisible = value;
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
    /**
     * Sets the state property value. Has the value published if the access packages are available for management. The possible values are: unpublished, published, unknownFutureValue.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AccessPackageCatalogState value) {
        this._state = value;
    }
}
