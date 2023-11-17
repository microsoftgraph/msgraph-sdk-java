package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryRole extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new DirectoryRole and sets the default values.
     */
    public DirectoryRole() {
        super();
        this.setOdataType("#microsoft.graph.directoryRole");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DirectoryRole
     */
    @jakarta.annotation.Nonnull
    public static DirectoryRole createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DirectoryRole();
    }
    /**
     * Gets the description property value. The description for the directory role. Read-only. Supports $filter (eq), $search, $select.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name for the directory role. Read-only. Supports $filter (eq), $search, $select.
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
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("roleTemplateId", (n) -> { this.setRoleTemplateId(n.getStringValue()); });
        deserializerMap.put("scopedMembers", (n) -> { this.setScopedMembers(n.getCollectionOfObjectValues(ScopedRoleMembership::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable. Supports $expand.
     * @return a java.util.List<DirectoryObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the roleTemplateId property value. The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a directory role in a tenant with a POST operation. After the directory role has been activated, the property is read only. Supports $filter (eq), $select.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleTemplateId() {
        return this.backingStore.get("roleTemplateId");
    }
    /**
     * Gets the scopedMembers property value. Members of this directory role that are scoped to administrative units. Read-only. Nullable.
     * @return a java.util.List<ScopedRoleMembership>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ScopedRoleMembership> getScopedMembers() {
        return this.backingStore.get("scopedMembers");
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
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("roleTemplateId", this.getRoleTemplateId());
        writer.writeCollectionOfObjectValues("scopedMembers", this.getScopedMembers());
    }
    /**
     * Sets the description property value. The description for the directory role. Read-only. Supports $filter (eq), $search, $select.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name for the directory role. Read-only. Supports $filter (eq), $search, $select.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the members property value. Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the roleTemplateId property value. The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a directory role in a tenant with a POST operation. After the directory role has been activated, the property is read only. Supports $filter (eq), $select.
     * @param value Value to set for the roleTemplateId property.
     */
    public void setRoleTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleTemplateId", value);
    }
    /**
     * Sets the scopedMembers property value. Members of this directory role that are scoped to administrative units. Read-only. Nullable.
     * @param value Value to set for the scopedMembers property.
     */
    public void setScopedMembers(@jakarta.annotation.Nullable final java.util.List<ScopedRoleMembership> value) {
        this.backingStore.set("scopedMembers", value);
    }
}
