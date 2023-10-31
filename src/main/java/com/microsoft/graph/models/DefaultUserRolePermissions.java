package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DefaultUserRolePermissions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new DefaultUserRolePermissions and sets the default values.
     */
    public DefaultUserRolePermissions() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DefaultUserRolePermissions
     */
    @jakarta.annotation.Nonnull
    public static DefaultUserRolePermissions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DefaultUserRolePermissions();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the allowedToCreateApps property value. Indicates whether the default user role can create applications. This setting corresponds to the Users can register applications setting in the User settings menu in the Microsoft Entra admin center.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToCreateApps() {
        return this.getBackingStore().get("allowedToCreateApps");
    }
    /**
     * Gets the allowedToCreateSecurityGroups property value. Indicates whether the default user role can create security groups. This setting corresponds to the following menus in the Microsoft Entra admin center:  The Users can create security groups in Microsoft Entra admin centers, API or PowerShell setting in the Group settings menu.  Users can create security groups setting in the User settings menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToCreateSecurityGroups() {
        return this.getBackingStore().get("allowedToCreateSecurityGroups");
    }
    /**
     * Gets the allowedToCreateTenants property value. Indicates whether the default user role can create tenants. This setting corresponds to the Restrict non-admin users from creating tenants setting in the User settings menu in the Microsoft Entra admin center.  When this setting is false, users assigned the Tenant Creator role can still create tenants.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToCreateTenants() {
        return this.getBackingStore().get("allowedToCreateTenants");
    }
    /**
     * Gets the allowedToReadBitlockerKeysForOwnedDevice property value. Indicates whether the registered owners of a device can read their own BitLocker recovery keys with default user role.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToReadBitlockerKeysForOwnedDevice() {
        return this.getBackingStore().get("allowedToReadBitlockerKeysForOwnedDevice");
    }
    /**
     * Gets the allowedToReadOtherUsers property value. Indicates whether the default user role can read other users. DO NOT SET THIS VALUE TO false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToReadOtherUsers() {
        return this.getBackingStore().get("allowedToReadOtherUsers");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.getBackingStore().get("odataType");
    }
    /**
     * Gets the permissionGrantPoliciesAssigned property value. Indicates if user consent to apps is allowed, and if it is, which permission to grant consent and which app consent policy (permissionGrantPolicy) govern the permission for users to grant consent. Value should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissionGrantPoliciesAssigned() {
        return this.getBackingStore().get("permissionGrantPoliciesAssigned");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowedToCreateApps", this.getAllowedToCreateApps());
        writer.writeBooleanValue("allowedToCreateSecurityGroups", this.getAllowedToCreateSecurityGroups());
        writer.writeBooleanValue("allowedToCreateTenants", this.getAllowedToCreateTenants());
        writer.writeBooleanValue("allowedToReadBitlockerKeysForOwnedDevice", this.getAllowedToReadBitlockerKeysForOwnedDevice());
        writer.writeBooleanValue("allowedToReadOtherUsers", this.getAllowedToReadOtherUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("permissionGrantPoliciesAssigned", this.getPermissionGrantPoliciesAssigned());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the allowedToCreateApps property value. Indicates whether the default user role can create applications. This setting corresponds to the Users can register applications setting in the User settings menu in the Microsoft Entra admin center.
     * @param value Value to set for the allowedToCreateApps property.
     */
    public void setAllowedToCreateApps(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowedToCreateApps", value);
    }
    /**
     * Sets the allowedToCreateSecurityGroups property value. Indicates whether the default user role can create security groups. This setting corresponds to the following menus in the Microsoft Entra admin center:  The Users can create security groups in Microsoft Entra admin centers, API or PowerShell setting in the Group settings menu.  Users can create security groups setting in the User settings menu.
     * @param value Value to set for the allowedToCreateSecurityGroups property.
     */
    public void setAllowedToCreateSecurityGroups(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowedToCreateSecurityGroups", value);
    }
    /**
     * Sets the allowedToCreateTenants property value. Indicates whether the default user role can create tenants. This setting corresponds to the Restrict non-admin users from creating tenants setting in the User settings menu in the Microsoft Entra admin center.  When this setting is false, users assigned the Tenant Creator role can still create tenants.
     * @param value Value to set for the allowedToCreateTenants property.
     */
    public void setAllowedToCreateTenants(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowedToCreateTenants", value);
    }
    /**
     * Sets the allowedToReadBitlockerKeysForOwnedDevice property value. Indicates whether the registered owners of a device can read their own BitLocker recovery keys with default user role.
     * @param value Value to set for the allowedToReadBitlockerKeysForOwnedDevice property.
     */
    public void setAllowedToReadBitlockerKeysForOwnedDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowedToReadBitlockerKeysForOwnedDevice", value);
    }
    /**
     * Sets the allowedToReadOtherUsers property value. Indicates whether the default user role can read other users. DO NOT SET THIS VALUE TO false.
     * @param value Value to set for the allowedToReadOtherUsers property.
     */
    public void setAllowedToReadOtherUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("allowedToReadOtherUsers", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the permissionGrantPoliciesAssigned property value. Indicates if user consent to apps is allowed, and if it is, which permission to grant consent and which app consent policy (permissionGrantPolicy) govern the permission for users to grant consent. Value should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     * @param value Value to set for the permissionGrantPoliciesAssigned property.
     */
    public void setPermissionGrantPoliciesAssigned(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.getBackingStore().set("permissionGrantPoliciesAssigned", value);
    }
}
