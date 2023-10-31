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
public class OnPremisesDirectorySynchronizationFeature implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new OnPremisesDirectorySynchronizationFeature and sets the default values.
     */
    public OnPremisesDirectorySynchronizationFeature() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnPremisesDirectorySynchronizationFeature
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesDirectorySynchronizationFeature createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesDirectorySynchronizationFeature();
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
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the blockCloudObjectTakeoverThroughHardMatchEnabled property value. Used to block cloud object takeover via source anchor hard match if enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockCloudObjectTakeoverThroughHardMatchEnabled() {
        return this.getBackingStore().get("blockCloudObjectTakeoverThroughHardMatchEnabled");
    }
    /**
     * Gets the blockSoftMatchEnabled property value. Use to block soft match for all objects if enabled for the  tenant. Customers are encouraged to enable this feature and keep it enabled until soft matching is required again for their tenancy. This flag should be enabled again after any soft matching has been completed and is no longer needed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockSoftMatchEnabled() {
        return this.getBackingStore().get("blockSoftMatchEnabled");
    }
    /**
     * Gets the bypassDirSyncOverridesEnabled property value. When true, persists the values of Mobile and OtherMobile in on-premises AD during sync cycles instead of values of MobilePhone or AlternateMobilePhones in Microsoft Entra ID.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBypassDirSyncOverridesEnabled() {
        return this.getBackingStore().get("bypassDirSyncOverridesEnabled");
    }
    /**
     * Gets the cloudPasswordPolicyForPasswordSyncedUsersEnabled property value. Used to indicate that cloud password policy applies to users whose passwords are synchronized from on-premises.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCloudPasswordPolicyForPasswordSyncedUsersEnabled() {
        return this.getBackingStore().get("cloudPasswordPolicyForPasswordSyncedUsersEnabled");
    }
    /**
     * Gets the concurrentCredentialUpdateEnabled property value. Used to enable concurrent user credentials update in OrgId.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConcurrentCredentialUpdateEnabled() {
        return this.getBackingStore().get("concurrentCredentialUpdateEnabled");
    }
    /**
     * Gets the concurrentOrgIdProvisioningEnabled property value. Used to enable concurrent user creation in OrgId.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConcurrentOrgIdProvisioningEnabled() {
        return this.getBackingStore().get("concurrentOrgIdProvisioningEnabled");
    }
    /**
     * Gets the deviceWritebackEnabled property value. Used to indicate that device write-back is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceWritebackEnabled() {
        return this.getBackingStore().get("deviceWritebackEnabled");
    }
    /**
     * Gets the directoryExtensionsEnabled property value. Used to indicate that directory extensions are being synced from on-premises AD to Microsoft Entra ID.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDirectoryExtensionsEnabled() {
        return this.getBackingStore().get("directoryExtensionsEnabled");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("blockCloudObjectTakeoverThroughHardMatchEnabled", (n) -> { this.setBlockCloudObjectTakeoverThroughHardMatchEnabled(n.getBooleanValue()); });
        deserializerMap.put("blockSoftMatchEnabled", (n) -> { this.setBlockSoftMatchEnabled(n.getBooleanValue()); });
        deserializerMap.put("bypassDirSyncOverridesEnabled", (n) -> { this.setBypassDirSyncOverridesEnabled(n.getBooleanValue()); });
        deserializerMap.put("cloudPasswordPolicyForPasswordSyncedUsersEnabled", (n) -> { this.setCloudPasswordPolicyForPasswordSyncedUsersEnabled(n.getBooleanValue()); });
        deserializerMap.put("concurrentCredentialUpdateEnabled", (n) -> { this.setConcurrentCredentialUpdateEnabled(n.getBooleanValue()); });
        deserializerMap.put("concurrentOrgIdProvisioningEnabled", (n) -> { this.setConcurrentOrgIdProvisioningEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceWritebackEnabled", (n) -> { this.setDeviceWritebackEnabled(n.getBooleanValue()); });
        deserializerMap.put("directoryExtensionsEnabled", (n) -> { this.setDirectoryExtensionsEnabled(n.getBooleanValue()); });
        deserializerMap.put("fopeConflictResolutionEnabled", (n) -> { this.setFopeConflictResolutionEnabled(n.getBooleanValue()); });
        deserializerMap.put("groupWriteBackEnabled", (n) -> { this.setGroupWriteBackEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("passwordSyncEnabled", (n) -> { this.setPasswordSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("passwordWritebackEnabled", (n) -> { this.setPasswordWritebackEnabled(n.getBooleanValue()); });
        deserializerMap.put("quarantineUponProxyAddressesConflictEnabled", (n) -> { this.setQuarantineUponProxyAddressesConflictEnabled(n.getBooleanValue()); });
        deserializerMap.put("quarantineUponUpnConflictEnabled", (n) -> { this.setQuarantineUponUpnConflictEnabled(n.getBooleanValue()); });
        deserializerMap.put("softMatchOnUpnEnabled", (n) -> { this.setSoftMatchOnUpnEnabled(n.getBooleanValue()); });
        deserializerMap.put("synchronizeUpnForManagedUsersEnabled", (n) -> { this.setSynchronizeUpnForManagedUsersEnabled(n.getBooleanValue()); });
        deserializerMap.put("unifiedGroupWritebackEnabled", (n) -> { this.setUnifiedGroupWritebackEnabled(n.getBooleanValue()); });
        deserializerMap.put("userForcePasswordChangeOnLogonEnabled", (n) -> { this.setUserForcePasswordChangeOnLogonEnabled(n.getBooleanValue()); });
        deserializerMap.put("userWritebackEnabled", (n) -> { this.setUserWritebackEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fopeConflictResolutionEnabled property value. Used to indicate that for a Microsoft Forefront Online Protection for Exchange (FOPE) migrated tenant, the conflicting proxy address should be migrated over.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFopeConflictResolutionEnabled() {
        return this.getBackingStore().get("fopeConflictResolutionEnabled");
    }
    /**
     * Gets the groupWriteBackEnabled property value. Used to enable object-level group writeback feature for additional group types.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGroupWriteBackEnabled() {
        return this.getBackingStore().get("groupWriteBackEnabled");
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
     * Gets the passwordSyncEnabled property value. Used to indicate on-premise password synchronization is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordSyncEnabled() {
        return this.getBackingStore().get("passwordSyncEnabled");
    }
    /**
     * Gets the passwordWritebackEnabled property value. Used to indicate that writeback of password resets from Microsoft Entra ID to on-premises AD is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordWritebackEnabled() {
        return this.getBackingStore().get("passwordWritebackEnabled");
    }
    /**
     * Gets the quarantineUponProxyAddressesConflictEnabled property value. Used to indicate that we should quarantine objects with conflicting proxy address.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getQuarantineUponProxyAddressesConflictEnabled() {
        return this.getBackingStore().get("quarantineUponProxyAddressesConflictEnabled");
    }
    /**
     * Gets the quarantineUponUpnConflictEnabled property value. Used to indicate that we should quarantine objects conflicting with duplicate userPrincipalName.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getQuarantineUponUpnConflictEnabled() {
        return this.getBackingStore().get("quarantineUponUpnConflictEnabled");
    }
    /**
     * Gets the softMatchOnUpnEnabled property value. Used to indicate that we should soft match objects based on userPrincipalName.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSoftMatchOnUpnEnabled() {
        return this.getBackingStore().get("softMatchOnUpnEnabled");
    }
    /**
     * Gets the synchronizeUpnForManagedUsersEnabled property value. Used to indicate that we should synchronize userPrincipalName objects for managed users with licenses.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSynchronizeUpnForManagedUsersEnabled() {
        return this.getBackingStore().get("synchronizeUpnForManagedUsersEnabled");
    }
    /**
     * Gets the unifiedGroupWritebackEnabled property value. Used to indicate that Microsoft 365 Group write-back is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUnifiedGroupWritebackEnabled() {
        return this.getBackingStore().get("unifiedGroupWritebackEnabled");
    }
    /**
     * Gets the userForcePasswordChangeOnLogonEnabled property value. Used to indicate that feature to force password change for a user on logon is enabled while synchronizing on-premise credentials.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUserForcePasswordChangeOnLogonEnabled() {
        return this.getBackingStore().get("userForcePasswordChangeOnLogonEnabled");
    }
    /**
     * Gets the userWritebackEnabled property value. Used to indicate that user writeback is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUserWritebackEnabled() {
        return this.getBackingStore().get("userWritebackEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("blockCloudObjectTakeoverThroughHardMatchEnabled", this.getBlockCloudObjectTakeoverThroughHardMatchEnabled());
        writer.writeBooleanValue("blockSoftMatchEnabled", this.getBlockSoftMatchEnabled());
        writer.writeBooleanValue("bypassDirSyncOverridesEnabled", this.getBypassDirSyncOverridesEnabled());
        writer.writeBooleanValue("cloudPasswordPolicyForPasswordSyncedUsersEnabled", this.getCloudPasswordPolicyForPasswordSyncedUsersEnabled());
        writer.writeBooleanValue("concurrentCredentialUpdateEnabled", this.getConcurrentCredentialUpdateEnabled());
        writer.writeBooleanValue("concurrentOrgIdProvisioningEnabled", this.getConcurrentOrgIdProvisioningEnabled());
        writer.writeBooleanValue("deviceWritebackEnabled", this.getDeviceWritebackEnabled());
        writer.writeBooleanValue("directoryExtensionsEnabled", this.getDirectoryExtensionsEnabled());
        writer.writeBooleanValue("fopeConflictResolutionEnabled", this.getFopeConflictResolutionEnabled());
        writer.writeBooleanValue("groupWriteBackEnabled", this.getGroupWriteBackEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("passwordSyncEnabled", this.getPasswordSyncEnabled());
        writer.writeBooleanValue("passwordWritebackEnabled", this.getPasswordWritebackEnabled());
        writer.writeBooleanValue("quarantineUponProxyAddressesConflictEnabled", this.getQuarantineUponProxyAddressesConflictEnabled());
        writer.writeBooleanValue("quarantineUponUpnConflictEnabled", this.getQuarantineUponUpnConflictEnabled());
        writer.writeBooleanValue("softMatchOnUpnEnabled", this.getSoftMatchOnUpnEnabled());
        writer.writeBooleanValue("synchronizeUpnForManagedUsersEnabled", this.getSynchronizeUpnForManagedUsersEnabled());
        writer.writeBooleanValue("unifiedGroupWritebackEnabled", this.getUnifiedGroupWritebackEnabled());
        writer.writeBooleanValue("userForcePasswordChangeOnLogonEnabled", this.getUserForcePasswordChangeOnLogonEnabled());
        writer.writeBooleanValue("userWritebackEnabled", this.getUserWritebackEnabled());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.getBackingStore().set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(final BackingStore value) {
        this.getBackingStore().set("BackingStore", value);
    }
    /**
     * Sets the blockCloudObjectTakeoverThroughHardMatchEnabled property value. Used to block cloud object takeover via source anchor hard match if enabled.
     * @param value Value to set for the blockCloudObjectTakeoverThroughHardMatchEnabled property.
     */
    public void setBlockCloudObjectTakeoverThroughHardMatchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("blockCloudObjectTakeoverThroughHardMatchEnabled", value);
    }
    /**
     * Sets the blockSoftMatchEnabled property value. Use to block soft match for all objects if enabled for the  tenant. Customers are encouraged to enable this feature and keep it enabled until soft matching is required again for their tenancy. This flag should be enabled again after any soft matching has been completed and is no longer needed.
     * @param value Value to set for the blockSoftMatchEnabled property.
     */
    public void setBlockSoftMatchEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("blockSoftMatchEnabled", value);
    }
    /**
     * Sets the bypassDirSyncOverridesEnabled property value. When true, persists the values of Mobile and OtherMobile in on-premises AD during sync cycles instead of values of MobilePhone or AlternateMobilePhones in Microsoft Entra ID.
     * @param value Value to set for the bypassDirSyncOverridesEnabled property.
     */
    public void setBypassDirSyncOverridesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("bypassDirSyncOverridesEnabled", value);
    }
    /**
     * Sets the cloudPasswordPolicyForPasswordSyncedUsersEnabled property value. Used to indicate that cloud password policy applies to users whose passwords are synchronized from on-premises.
     * @param value Value to set for the cloudPasswordPolicyForPasswordSyncedUsersEnabled property.
     */
    public void setCloudPasswordPolicyForPasswordSyncedUsersEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("cloudPasswordPolicyForPasswordSyncedUsersEnabled", value);
    }
    /**
     * Sets the concurrentCredentialUpdateEnabled property value. Used to enable concurrent user credentials update in OrgId.
     * @param value Value to set for the concurrentCredentialUpdateEnabled property.
     */
    public void setConcurrentCredentialUpdateEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("concurrentCredentialUpdateEnabled", value);
    }
    /**
     * Sets the concurrentOrgIdProvisioningEnabled property value. Used to enable concurrent user creation in OrgId.
     * @param value Value to set for the concurrentOrgIdProvisioningEnabled property.
     */
    public void setConcurrentOrgIdProvisioningEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("concurrentOrgIdProvisioningEnabled", value);
    }
    /**
     * Sets the deviceWritebackEnabled property value. Used to indicate that device write-back is enabled.
     * @param value Value to set for the deviceWritebackEnabled property.
     */
    public void setDeviceWritebackEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("deviceWritebackEnabled", value);
    }
    /**
     * Sets the directoryExtensionsEnabled property value. Used to indicate that directory extensions are being synced from on-premises AD to Microsoft Entra ID.
     * @param value Value to set for the directoryExtensionsEnabled property.
     */
    public void setDirectoryExtensionsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("directoryExtensionsEnabled", value);
    }
    /**
     * Sets the fopeConflictResolutionEnabled property value. Used to indicate that for a Microsoft Forefront Online Protection for Exchange (FOPE) migrated tenant, the conflicting proxy address should be migrated over.
     * @param value Value to set for the fopeConflictResolutionEnabled property.
     */
    public void setFopeConflictResolutionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("fopeConflictResolutionEnabled", value);
    }
    /**
     * Sets the groupWriteBackEnabled property value. Used to enable object-level group writeback feature for additional group types.
     * @param value Value to set for the groupWriteBackEnabled property.
     */
    public void setGroupWriteBackEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("groupWriteBackEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the passwordSyncEnabled property value. Used to indicate on-premise password synchronization is enabled.
     * @param value Value to set for the passwordSyncEnabled property.
     */
    public void setPasswordSyncEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("passwordSyncEnabled", value);
    }
    /**
     * Sets the passwordWritebackEnabled property value. Used to indicate that writeback of password resets from Microsoft Entra ID to on-premises AD is enabled.
     * @param value Value to set for the passwordWritebackEnabled property.
     */
    public void setPasswordWritebackEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("passwordWritebackEnabled", value);
    }
    /**
     * Sets the quarantineUponProxyAddressesConflictEnabled property value. Used to indicate that we should quarantine objects with conflicting proxy address.
     * @param value Value to set for the quarantineUponProxyAddressesConflictEnabled property.
     */
    public void setQuarantineUponProxyAddressesConflictEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("quarantineUponProxyAddressesConflictEnabled", value);
    }
    /**
     * Sets the quarantineUponUpnConflictEnabled property value. Used to indicate that we should quarantine objects conflicting with duplicate userPrincipalName.
     * @param value Value to set for the quarantineUponUpnConflictEnabled property.
     */
    public void setQuarantineUponUpnConflictEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("quarantineUponUpnConflictEnabled", value);
    }
    /**
     * Sets the softMatchOnUpnEnabled property value. Used to indicate that we should soft match objects based on userPrincipalName.
     * @param value Value to set for the softMatchOnUpnEnabled property.
     */
    public void setSoftMatchOnUpnEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("softMatchOnUpnEnabled", value);
    }
    /**
     * Sets the synchronizeUpnForManagedUsersEnabled property value. Used to indicate that we should synchronize userPrincipalName objects for managed users with licenses.
     * @param value Value to set for the synchronizeUpnForManagedUsersEnabled property.
     */
    public void setSynchronizeUpnForManagedUsersEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("synchronizeUpnForManagedUsersEnabled", value);
    }
    /**
     * Sets the unifiedGroupWritebackEnabled property value. Used to indicate that Microsoft 365 Group write-back is enabled.
     * @param value Value to set for the unifiedGroupWritebackEnabled property.
     */
    public void setUnifiedGroupWritebackEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("unifiedGroupWritebackEnabled", value);
    }
    /**
     * Sets the userForcePasswordChangeOnLogonEnabled property value. Used to indicate that feature to force password change for a user on logon is enabled while synchronizing on-premise credentials.
     * @param value Value to set for the userForcePasswordChangeOnLogonEnabled property.
     */
    public void setUserForcePasswordChangeOnLogonEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("userForcePasswordChangeOnLogonEnabled", value);
    }
    /**
     * Sets the userWritebackEnabled property value. Used to indicate that user writeback is enabled.
     * @param value Value to set for the userWritebackEnabled property.
     */
    public void setUserWritebackEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("userWritebackEnabled", value);
    }
}
