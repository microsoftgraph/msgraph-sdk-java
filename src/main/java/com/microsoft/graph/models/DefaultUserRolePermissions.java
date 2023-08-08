package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DefaultUserRolePermissions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the default user role can create applications. This setting corresponds to the Users can register applications setting in the User settings menu in the Azure portal.
     */
    private Boolean allowedToCreateApps;
    /**
     * Indicates whether the default user role can create security groups. This setting corresponds to the following menus in the Azure portal:  The Users can create security groups in Azure portals, API or PowerShell setting in the Group settings menu.  Users can create security groups setting in the User settings menu.
     */
    private Boolean allowedToCreateSecurityGroups;
    /**
     * Indicates whether the default user role can create tenants. This setting corresponds to the Restrict non-admin users from creating tenants setting in the User settings menu in the Azure portal.  When this setting is false, users assigned the Tenant Creator role can still create tenants.
     */
    private Boolean allowedToCreateTenants;
    /**
     * Indicates whether the registered owners of a device can read their own BitLocker recovery keys with default user role.
     */
    private Boolean allowedToReadBitlockerKeysForOwnedDevice;
    /**
     * Indicates whether the default user role can read other users. DO NOT SET THIS VALUE TO false.
     */
    private Boolean allowedToReadOtherUsers;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Indicates if user consent to apps is allowed, and if it is, which permission to grant consent and which app consent policy (permissionGrantPolicy) govern the permission for users to grant consent. Value should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     */
    private java.util.List<String> permissionGrantPoliciesAssigned;
    /**
     * Instantiates a new defaultUserRolePermissions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DefaultUserRolePermissions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a defaultUserRolePermissions
     */
    @javax.annotation.Nonnull
    public static DefaultUserRolePermissions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DefaultUserRolePermissions();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowedToCreateApps property value. Indicates whether the default user role can create applications. This setting corresponds to the Users can register applications setting in the User settings menu in the Azure portal.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToCreateApps() {
        return this.allowedToCreateApps;
    }
    /**
     * Gets the allowedToCreateSecurityGroups property value. Indicates whether the default user role can create security groups. This setting corresponds to the following menus in the Azure portal:  The Users can create security groups in Azure portals, API or PowerShell setting in the Group settings menu.  Users can create security groups setting in the User settings menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToCreateSecurityGroups() {
        return this.allowedToCreateSecurityGroups;
    }
    /**
     * Gets the allowedToCreateTenants property value. Indicates whether the default user role can create tenants. This setting corresponds to the Restrict non-admin users from creating tenants setting in the User settings menu in the Azure portal.  When this setting is false, users assigned the Tenant Creator role can still create tenants.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToCreateTenants() {
        return this.allowedToCreateTenants;
    }
    /**
     * Gets the allowedToReadBitlockerKeysForOwnedDevice property value. Indicates whether the registered owners of a device can read their own BitLocker recovery keys with default user role.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToReadBitlockerKeysForOwnedDevice() {
        return this.allowedToReadBitlockerKeysForOwnedDevice;
    }
    /**
     * Gets the allowedToReadOtherUsers property value. Indicates whether the default user role can read other users. DO NOT SET THIS VALUE TO false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToReadOtherUsers() {
        return this.allowedToReadOtherUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("allowedToCreateApps", (n) -> { this.setAllowedToCreateApps(n.getBooleanValue()); });
        deserializerMap.put("allowedToCreateSecurityGroups", (n) -> { this.setAllowedToCreateSecurityGroups(n.getBooleanValue()); });
        deserializerMap.put("allowedToCreateTenants", (n) -> { this.setAllowedToCreateTenants(n.getBooleanValue()); });
        deserializerMap.put("allowedToReadBitlockerKeysForOwnedDevice", (n) -> { this.setAllowedToReadBitlockerKeysForOwnedDevice(n.getBooleanValue()); });
        deserializerMap.put("allowedToReadOtherUsers", (n) -> { this.setAllowedToReadOtherUsers(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permissionGrantPoliciesAssigned", (n) -> { this.setPermissionGrantPoliciesAssigned(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the permissionGrantPoliciesAssigned property value. Indicates if user consent to apps is allowed, and if it is, which permission to grant consent and which app consent policy (permissionGrantPolicy) govern the permission for users to grant consent. Value should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPermissionGrantPoliciesAssigned() {
        return this.permissionGrantPoliciesAssigned;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowedToCreateApps", this.getAllowedToCreateApps());
        writer.writeBooleanValue("allowedToCreateSecurityGroups", this.getAllowedToCreateSecurityGroups());
        writer.writeBooleanValue("allowedToCreateTenants", this.getAllowedToCreateTenants());
        writer.writeBooleanValue("allowedToReadBitlockerKeysForOwnedDevice", this.getAllowedToReadBitlockerKeysForOwnedDevice());
        writer.writeBooleanValue("allowedToReadOtherUsers", this.getAllowedToReadOtherUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("permissionGrantPoliciesAssigned", this.getPermissionGrantPoliciesAssigned());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowedToCreateApps property value. Indicates whether the default user role can create applications. This setting corresponds to the Users can register applications setting in the User settings menu in the Azure portal.
     * @param value Value to set for the allowedToCreateApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToCreateApps(@javax.annotation.Nullable final Boolean value) {
        this.allowedToCreateApps = value;
    }
    /**
     * Sets the allowedToCreateSecurityGroups property value. Indicates whether the default user role can create security groups. This setting corresponds to the following menus in the Azure portal:  The Users can create security groups in Azure portals, API or PowerShell setting in the Group settings menu.  Users can create security groups setting in the User settings menu.
     * @param value Value to set for the allowedToCreateSecurityGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToCreateSecurityGroups(@javax.annotation.Nullable final Boolean value) {
        this.allowedToCreateSecurityGroups = value;
    }
    /**
     * Sets the allowedToCreateTenants property value. Indicates whether the default user role can create tenants. This setting corresponds to the Restrict non-admin users from creating tenants setting in the User settings menu in the Azure portal.  When this setting is false, users assigned the Tenant Creator role can still create tenants.
     * @param value Value to set for the allowedToCreateTenants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToCreateTenants(@javax.annotation.Nullable final Boolean value) {
        this.allowedToCreateTenants = value;
    }
    /**
     * Sets the allowedToReadBitlockerKeysForOwnedDevice property value. Indicates whether the registered owners of a device can read their own BitLocker recovery keys with default user role.
     * @param value Value to set for the allowedToReadBitlockerKeysForOwnedDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToReadBitlockerKeysForOwnedDevice(@javax.annotation.Nullable final Boolean value) {
        this.allowedToReadBitlockerKeysForOwnedDevice = value;
    }
    /**
     * Sets the allowedToReadOtherUsers property value. Indicates whether the default user role can read other users. DO NOT SET THIS VALUE TO false.
     * @param value Value to set for the allowedToReadOtherUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToReadOtherUsers(@javax.annotation.Nullable final Boolean value) {
        this.allowedToReadOtherUsers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the permissionGrantPoliciesAssigned property value. Indicates if user consent to apps is allowed, and if it is, which permission to grant consent and which app consent policy (permissionGrantPolicy) govern the permission for users to grant consent. Value should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     * @param value Value to set for the permissionGrantPoliciesAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionGrantPoliciesAssigned(@javax.annotation.Nullable final java.util.List<String> value) {
        this.permissionGrantPoliciesAssigned = value;
    }
}
