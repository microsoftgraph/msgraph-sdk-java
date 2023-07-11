package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ScopedRoleMembership extends Entity implements Parsable {
    /**
     * Unique identifier for the administrative unit that the directory role is scoped to
     */
    private String administrativeUnitId;
    /**
     * Unique identifier for the directory role that the member is in.
     */
    private String roleId;
    /**
     * The roleMemberInfo property
     */
    private Identity roleMemberInfo;
    /**
     * Instantiates a new scopedRoleMembership and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ScopedRoleMembership() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a scopedRoleMembership
     */
    @javax.annotation.Nonnull
    public static ScopedRoleMembership createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScopedRoleMembership();
    }
    /**
     * Gets the administrativeUnitId property value. Unique identifier for the administrative unit that the directory role is scoped to
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdministrativeUnitId() {
        return this.administrativeUnitId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("administrativeUnitId", (n) -> { this.setAdministrativeUnitId(n.getStringValue()); });
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleMemberInfo", (n) -> { this.setRoleMemberInfo(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the roleId property value. Unique identifier for the directory role that the member is in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the roleMemberInfo property value. The roleMemberInfo property
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getRoleMemberInfo() {
        return this.roleMemberInfo;
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
        writer.writeStringValue("administrativeUnitId", this.getAdministrativeUnitId());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeObjectValue("roleMemberInfo", this.getRoleMemberInfo());
    }
    /**
     * Sets the administrativeUnitId property value. Unique identifier for the administrative unit that the directory role is scoped to
     * @param value Value to set for the administrativeUnitId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdministrativeUnitId(@javax.annotation.Nullable final String value) {
        this.administrativeUnitId = value;
    }
    /**
     * Sets the roleId property value. Unique identifier for the directory role that the member is in.
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the roleMemberInfo property value. The roleMemberInfo property
     * @param value Value to set for the roleMemberInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleMemberInfo(@javax.annotation.Nullable final Identity value) {
        this.roleMemberInfo = value;
    }
}
