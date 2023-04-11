package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceSpecificPermissionGrant extends DirectoryObject implements Parsable {
    /** ID of the service principal of the Azure AD app that has been granted access. Read-only. */
    private String clientAppId;
    /** ID of the Azure AD app that has been granted access. Read-only. */
    private String clientId;
    /** The name of the resource-specific permission. Read-only. */
    private String permission;
    /** The type of permission. Possible values are: Application, Delegated. Read-only. */
    private String permissionType;
    /** ID of the Azure AD app that is hosting the resource. Read-only. */
    private String resourceAppId;
    /**
     * Instantiates a new resourceSpecificPermissionGrant and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResourceSpecificPermissionGrant() {
        super();
        this.setOdataType("#microsoft.graph.resourceSpecificPermissionGrant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resourceSpecificPermissionGrant
     */
    @javax.annotation.Nonnull
    public static ResourceSpecificPermissionGrant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceSpecificPermissionGrant();
    }
    /**
     * Gets the clientAppId property value. ID of the service principal of the Azure AD app that has been granted access. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientAppId() {
        return this.clientAppId;
    }
    /**
     * Gets the clientId property value. ID of the Azure AD app that has been granted access. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermission() {
        return this.permission;
    }
    /**
     * Gets the permissionType property value. The type of permission. Possible values are: Application, Delegated. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermissionType() {
        return this.permissionType;
    }
    /**
     * Gets the resourceAppId property value. ID of the Azure AD app that is hosting the resource. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceAppId() {
        return this.resourceAppId;
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
        writer.writeStringValue("clientAppId", this.getClientAppId());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("permission", this.getPermission());
        writer.writeStringValue("permissionType", this.getPermissionType());
        writer.writeStringValue("resourceAppId", this.getResourceAppId());
    }
    /**
     * Sets the clientAppId property value. ID of the service principal of the Azure AD app that has been granted access. Read-only.
     * @param value Value to set for the clientAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientAppId(@javax.annotation.Nullable final String value) {
        this.clientAppId = value;
    }
    /**
     * Sets the clientId property value. ID of the Azure AD app that has been granted access. Read-only.
     * @param value Value to set for the clientId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientId(@javax.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the permission property value. The name of the resource-specific permission. Read-only.
     * @param value Value to set for the permission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermission(@javax.annotation.Nullable final String value) {
        this.permission = value;
    }
    /**
     * Sets the permissionType property value. The type of permission. Possible values are: Application, Delegated. Read-only.
     * @param value Value to set for the permissionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionType(@javax.annotation.Nullable final String value) {
        this.permissionType = value;
    }
    /**
     * Sets the resourceAppId property value. ID of the Azure AD app that is hosting the resource. Read-only.
     * @param value Value to set for the resourceAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceAppId(@javax.annotation.Nullable final String value) {
        this.resourceAppId = value;
    }
}
