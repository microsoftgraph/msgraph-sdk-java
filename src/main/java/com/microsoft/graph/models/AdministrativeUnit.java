package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AdministrativeUnit extends DirectoryObject implements Parsable {
    /** An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search. */
    private String _description;
    /** Display name for the administrative unit. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy. */
    private String _displayName;
    /** The collection of open extensions defined for this administrative unit. Nullable. */
    private java.util.List<Extension> _extensions;
    /** Users and groups that are members of this administrative unit. Supports $expand. */
    private java.util.List<DirectoryObject> _members;
    /** Scoped-role members of this administrative unit. */
    private java.util.List<ScopedRoleMembership> _scopedRoleMembers;
    /** Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set (value is null), the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit. */
    private String _visibility;
    /**
     * Instantiates a new AdministrativeUnit and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AdministrativeUnit() {
        super();
        this.setOdataType("#microsoft.graph.administrativeUnit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AdministrativeUnit
     */
    @javax.annotation.Nonnull
    public static AdministrativeUnit createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdministrativeUnit();
    }
    /**
     * Gets the description property value. An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name for the administrative unit. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for this administrative unit. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AdministrativeUnit currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("scopedRoleMembers", (n) -> { currentObject.setScopedRoleMembers(n.getCollectionOfObjectValues(ScopedRoleMembership::createFromDiscriminatorValue)); });
            this.put("visibility", (n) -> { currentObject.setVisibility(n.getStringValue()); });
        }};
    }
    /**
     * Gets the members property value. Users and groups that are members of this administrative unit. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMembers() {
        return this._members;
    }
    /**
     * Gets the scopedRoleMembers property value. Scoped-role members of this administrative unit.
     * @return a scopedRoleMembership
     */
    @javax.annotation.Nullable
    public java.util.List<ScopedRoleMembership> getScopedRoleMembers() {
        return this._scopedRoleMembers;
    }
    /**
     * Gets the visibility property value. Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set (value is null), the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVisibility() {
        return this._visibility;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeCollectionOfObjectValues("scopedRoleMembers", this.getScopedRoleMembers());
        writer.writeStringValue("visibility", this.getVisibility());
    }
    /**
     * Sets the description property value. An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name for the administrative unit. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for this administrative unit. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the members property value. Users and groups that are members of this administrative unit. Supports $expand.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._members = value;
    }
    /**
     * Sets the scopedRoleMembers property value. Scoped-role members of this administrative unit.
     * @param value Value to set for the scopedRoleMembers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopedRoleMembers(@javax.annotation.Nullable final java.util.List<ScopedRoleMembership> value) {
        this._scopedRoleMembers = value;
    }
    /**
     * Sets the visibility property value. Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set (value is null), the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit.
     * @param value Value to set for the visibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisibility(@javax.annotation.Nullable final String value) {
        this._visibility = value;
    }
}
