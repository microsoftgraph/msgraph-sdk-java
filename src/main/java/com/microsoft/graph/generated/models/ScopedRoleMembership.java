package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScopedRoleMembership extends Entity implements Parsable {
    /**
     * Instantiates a new ScopedRoleMembership and sets the default values.
     */
    public ScopedRoleMembership() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ScopedRoleMembership
     */
    @jakarta.annotation.Nonnull
    public static ScopedRoleMembership createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScopedRoleMembership();
    }
    /**
     * Gets the administrativeUnitId property value. Unique identifier for the administrative unit that the directory role is scoped to
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdministrativeUnitId() {
        return this.backingStore.get("administrativeUnitId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("administrativeUnitId", (n) -> { this.setAdministrativeUnitId(n.getStringValue()); });
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleMemberInfo", (n) -> { this.setRoleMemberInfo(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the roleId property value. Unique identifier for the directory role that the member is in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleId() {
        return this.backingStore.get("roleId");
    }
    /**
     * Gets the roleMemberInfo property value. The roleMemberInfo property
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getRoleMemberInfo() {
        return this.backingStore.get("roleMemberInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("administrativeUnitId", this.getAdministrativeUnitId());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeObjectValue("roleMemberInfo", this.getRoleMemberInfo());
    }
    /**
     * Sets the administrativeUnitId property value. Unique identifier for the administrative unit that the directory role is scoped to
     * @param value Value to set for the administrativeUnitId property.
     */
    public void setAdministrativeUnitId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("administrativeUnitId", value);
    }
    /**
     * Sets the roleId property value. Unique identifier for the directory role that the member is in.
     * @param value Value to set for the roleId property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleId", value);
    }
    /**
     * Sets the roleMemberInfo property value. The roleMemberInfo property
     * @param value Value to set for the roleMemberInfo property.
     */
    public void setRoleMemberInfo(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("roleMemberInfo", value);
    }
}
