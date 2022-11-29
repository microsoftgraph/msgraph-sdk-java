package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceAndAppManagementRoleAssignment;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The Role Assignment resource. Role assignments tie together a role definition with members and scopes. There can be one or more role assignments per role. This applies to custom and built-in roles. */
public class RoleAssignment extends Entity implements Parsable {
    /** Description of the Role Assignment. */
    private String _description;
    /** The display or friendly name of the role Assignment. */
    private String _displayName;
    /** List of ids of role scope member security groups.  These are IDs from Azure Active Directory. */
    private java.util.List<String> _resourceScopes;
    /** Role definition this assignment is part of. */
    private RoleDefinition _roleDefinition;
    /**
     * Instantiates a new roleAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a roleAssignment
     */
    @javax.annotation.Nonnull
    public static RoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceAndAppManagementRoleAssignment": return new DeviceAndAppManagementRoleAssignment();
            }
        }
        return new RoleAssignment();
    }
    /**
     * Gets the description property value. Description of the Role Assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display or friendly name of the role Assignment.
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
        final RoleAssignment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("resourceScopes", (n) -> { currentObject.setResourceScopes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(RoleDefinition::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the resourceScopes property value. List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResourceScopes() {
        return this._resourceScopes;
    }
    /**
     * Gets the roleDefinition property value. Role definition this assignment is part of.
     * @return a roleDefinition
     */
    @javax.annotation.Nullable
    public RoleDefinition getRoleDefinition() {
        return this._roleDefinition;
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
        writer.writeCollectionOfPrimitiveValues("resourceScopes", this.getResourceScopes());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
    }
    /**
     * Sets the description property value. Description of the Role Assignment.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display or friendly name of the role Assignment.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the resourceScopes property value. List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     * @param value Value to set for the resourceScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceScopes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._resourceScopes = value;
    }
    /**
     * Sets the roleDefinition property value. Role definition this assignment is part of.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinition(@javax.annotation.Nullable final RoleDefinition value) {
        this._roleDefinition = value;
    }
}
