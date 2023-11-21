package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * SharedPC Account Manager Policy. Only applies when the account manager is enabled.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharedPCAccountManagerPolicy implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new SharedPCAccountManagerPolicy and sets the default values.
     */
    public SharedPCAccountManagerPolicy() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharedPCAccountManagerPolicy
     */
    @jakarta.annotation.Nonnull
    public static SharedPCAccountManagerPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedPCAccountManagerPolicy();
    }
    /**
     * Gets the accountDeletionPolicy property value. Possible values for when accounts are deleted on a shared PC.
     * @return a SharedPCAccountDeletionPolicyType
     */
    @jakarta.annotation.Nullable
    public SharedPCAccountDeletionPolicyType getAccountDeletionPolicy() {
        return this.backingStore.get("accountDeletionPolicy");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cacheAccountsAboveDiskFreePercentage property value. Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCacheAccountsAboveDiskFreePercentage() {
        return this.backingStore.get("cacheAccountsAboveDiskFreePercentage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("accountDeletionPolicy", (n) -> { this.setAccountDeletionPolicy(n.getEnumValue(SharedPCAccountDeletionPolicyType.class)); });
        deserializerMap.put("cacheAccountsAboveDiskFreePercentage", (n) -> { this.setCacheAccountsAboveDiskFreePercentage(n.getIntegerValue()); });
        deserializerMap.put("inactiveThresholdDays", (n) -> { this.setInactiveThresholdDays(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeAccountsBelowDiskFreePercentage", (n) -> { this.setRemoveAccountsBelowDiskFreePercentage(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactiveThresholdDays property value. Specifies when the accounts will start being deleted when they have not been logged on during the specified period, given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInactiveThresholdDays() {
        return this.backingStore.get("inactiveThresholdDays");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the removeAccountsBelowDiskFreePercentage property value. Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemoveAccountsBelowDiskFreePercentage() {
        return this.backingStore.get("removeAccountsBelowDiskFreePercentage");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accountDeletionPolicy", this.getAccountDeletionPolicy());
        writer.writeIntegerValue("cacheAccountsAboveDiskFreePercentage", this.getCacheAccountsAboveDiskFreePercentage());
        writer.writeIntegerValue("inactiveThresholdDays", this.getInactiveThresholdDays());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("removeAccountsBelowDiskFreePercentage", this.getRemoveAccountsBelowDiskFreePercentage());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountDeletionPolicy property value. Possible values for when accounts are deleted on a shared PC.
     * @param value Value to set for the accountDeletionPolicy property.
     */
    public void setAccountDeletionPolicy(@jakarta.annotation.Nullable final SharedPCAccountDeletionPolicyType value) {
        this.backingStore.set("accountDeletionPolicy", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cacheAccountsAboveDiskFreePercentage property value. Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     * @param value Value to set for the cacheAccountsAboveDiskFreePercentage property.
     */
    public void setCacheAccountsAboveDiskFreePercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cacheAccountsAboveDiskFreePercentage", value);
    }
    /**
     * Sets the inactiveThresholdDays property value. Specifies when the accounts will start being deleted when they have not been logged on during the specified period, given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold.
     * @param value Value to set for the inactiveThresholdDays property.
     */
    public void setInactiveThresholdDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("inactiveThresholdDays", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the removeAccountsBelowDiskFreePercentage property value. Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     * @param value Value to set for the removeAccountsBelowDiskFreePercentage property.
     */
    public void setRemoveAccountsBelowDiskFreePercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("removeAccountsBelowDiskFreePercentage", value);
    }
}
