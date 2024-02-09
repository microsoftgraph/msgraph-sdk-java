package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ResourceSpecificPermissionGrant extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link ResourceSpecificPermissionGrant} and sets the default values.
     */
    public ResourceSpecificPermissionGrant() {
        super();
        this.setOdataType("#microsoft.graph.resourceSpecificPermissionGrant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ResourceSpecificPermissionGrant}
     */
    @jakarta.annotation.Nonnull
    public static ResourceSpecificPermissionGrant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceSpecificPermissionGrant();
    }
    /**
     * Gets the clientAppId property value. ID of the service principal of the Microsoft Entra app that has been granted access. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientAppId() {
        return this.backingStore.get("clientAppId");
    }
    /**
     * Gets the clientId property value. ID of the Microsoft Entra app that has been granted access. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.backingStore.get("clientId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientAppId", (n) -> { this.setClientAppId(n.getStringValue()); });
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("permission", (n) -> { this.setPermission(n.getStringValue()); });
        deserializerMap.put("permissionType", (n) -> { this.setPermissionType(n.getStringValue()); });
        deserializerMap.put("resourceAppId", (n) -> { this.setResourceAppId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the permission property value. The name of the resource-specific permission. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermission() {
        return this.backingStore.get("permission");
    }
    /**
     * Gets the permissionType property value. The type of permission. Possible values are: Application, Delegated. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPermissionType() {
        return this.backingStore.get("permissionType");
    }
    /**
     * Gets the resourceAppId property value. ID of the Microsoft Entra app that is hosting the resource. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceAppId() {
        return this.backingStore.get("resourceAppId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clientAppId", this.getClientAppId());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("permission", this.getPermission());
        writer.writeStringValue("permissionType", this.getPermissionType());
        writer.writeStringValue("resourceAppId", this.getResourceAppId());
    }
    /**
     * Sets the clientAppId property value. ID of the service principal of the Microsoft Entra app that has been granted access. Read-only.
     * @param value Value to set for the clientAppId property.
     */
    public void setClientAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientAppId", value);
    }
    /**
     * Sets the clientId property value. ID of the Microsoft Entra app that has been granted access. Read-only.
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientId", value);
    }
    /**
     * Sets the permission property value. The name of the resource-specific permission. Read-only.
     * @param value Value to set for the permission property.
     */
    public void setPermission(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permission", value);
    }
    /**
     * Sets the permissionType property value. The type of permission. Possible values are: Application, Delegated. Read-only.
     * @param value Value to set for the permissionType property.
     */
    public void setPermissionType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionType", value);
    }
    /**
     * Sets the resourceAppId property value. ID of the Microsoft Entra app that is hosting the resource. Read-only.
     * @param value Value to set for the resourceAppId property.
     */
    public void setResourceAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceAppId", value);
    }
}
