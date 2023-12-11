package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Role Assignment resource. Role assignments tie together a role definition with members and scopes. There can be one or more role assignments per role. This applies to custom and built-in roles.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new RoleAssignment and sets the default values.
     */
    public RoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleAssignment
     */
    @jakarta.annotation.Nonnull
    public static RoleAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display or friendly name of the role Assignment.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("resourceScopes", (n) -> { this.setResourceScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(RoleDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resourceScopes property value. List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResourceScopes() {
        return this.backingStore.get("resourceScopes");
    }
    /**
     * Gets the roleDefinition property value. Role definition this assignment is part of.
     * @return a RoleDefinition
     */
    @jakarta.annotation.Nullable
    public RoleDefinition getRoleDefinition() {
        return this.backingStore.get("roleDefinition");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display or friendly name of the role Assignment.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the resourceScopes property value. List of ids of role scope member security groups.  These are IDs from Azure Active Directory.
     * @param value Value to set for the resourceScopes property.
     */
    public void setResourceScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("resourceScopes", value);
    }
    /**
     * Sets the roleDefinition property value. Role definition this assignment is part of.
     * @param value Value to set for the roleDefinition property.
     */
    public void setRoleDefinition(@jakarta.annotation.Nullable final RoleDefinition value) {
        this.backingStore.set("roleDefinition", value);
    }
}
