package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** SharedPC Account Manager Policy. Only applies when the account manager is enabled. */
public class SharedPCAccountManagerPolicy implements AdditionalDataHolder, Parsable {
    /** Possible values for when accounts are deleted on a shared PC. */
    private SharedPCAccountDeletionPolicyType _accountDeletionPolicy;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100 */
    private Integer _cacheAccountsAboveDiskFreePercentage;
    /** Specifies when the accounts will start being deleted when they have not been logged on during the specified period, given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. */
    private Integer _inactiveThresholdDays;
    /** The OdataType property */
    private String _odataType;
    /** Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100 */
    private Integer _removeAccountsBelowDiskFreePercentage;
    /**
     * Instantiates a new sharedPCAccountManagerPolicy and sets the default values.
     * @return a void
     */
    public SharedPCAccountManagerPolicy() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.sharedPCAccountManagerPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sharedPCAccountManagerPolicy
     */
    @javax.annotation.Nonnull
    public static SharedPCAccountManagerPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharedPCAccountManagerPolicy();
    }
    /**
     * Gets the accountDeletionPolicy property value. Possible values for when accounts are deleted on a shared PC.
     * @return a sharedPCAccountDeletionPolicyType
     */
    @javax.annotation.Nullable
    public SharedPCAccountDeletionPolicyType getAccountDeletionPolicy() {
        return this._accountDeletionPolicy;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the cacheAccountsAboveDiskFreePercentage property value. Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCacheAccountsAboveDiskFreePercentage() {
        return this._cacheAccountsAboveDiskFreePercentage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharedPCAccountManagerPolicy currentObject = this;
        return new HashMap<>(5) {{
            this.put("accountDeletionPolicy", (n) -> { currentObject.setAccountDeletionPolicy(n.getEnumValue(SharedPCAccountDeletionPolicyType.class)); });
            this.put("cacheAccountsAboveDiskFreePercentage", (n) -> { currentObject.setCacheAccountsAboveDiskFreePercentage(n.getIntegerValue()); });
            this.put("inactiveThresholdDays", (n) -> { currentObject.setInactiveThresholdDays(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("removeAccountsBelowDiskFreePercentage", (n) -> { currentObject.setRemoveAccountsBelowDiskFreePercentage(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the inactiveThresholdDays property value. Specifies when the accounts will start being deleted when they have not been logged on during the specified period, given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInactiveThresholdDays() {
        return this._inactiveThresholdDays;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the removeAccountsBelowDiskFreePercentage property value. Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRemoveAccountsBelowDiskFreePercentage() {
        return this._removeAccountsBelowDiskFreePercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAccountDeletionPolicy(@javax.annotation.Nullable final SharedPCAccountDeletionPolicyType value) {
        this._accountDeletionPolicy = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the cacheAccountsAboveDiskFreePercentage property value. Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     * @param value Value to set for the cacheAccountsAboveDiskFreePercentage property.
     * @return a void
     */
    public void setCacheAccountsAboveDiskFreePercentage(@javax.annotation.Nullable final Integer value) {
        this._cacheAccountsAboveDiskFreePercentage = value;
    }
    /**
     * Sets the inactiveThresholdDays property value. Specifies when the accounts will start being deleted when they have not been logged on during the specified period, given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold.
     * @param value Value to set for the inactiveThresholdDays property.
     * @return a void
     */
    public void setInactiveThresholdDays(@javax.annotation.Nullable final Integer value) {
        this._inactiveThresholdDays = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the removeAccountsBelowDiskFreePercentage property value. Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     * @param value Value to set for the removeAccountsBelowDiskFreePercentage property.
     * @return a void
     */
    public void setRemoveAccountsBelowDiskFreePercentage(@javax.annotation.Nullable final Integer value) {
        this._removeAccountsBelowDiskFreePercentage = value;
    }
}
