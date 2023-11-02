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
 * configuration Manager client enabled features
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfigurationManagerClientEnabledFeatures implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new ConfigurationManagerClientEnabledFeatures and sets the default values.
     */
    public ConfigurationManagerClientEnabledFeatures() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConfigurationManagerClientEnabledFeatures
     */
    @jakarta.annotation.Nonnull
    public static ConfigurationManagerClientEnabledFeatures createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerClientEnabledFeatures();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
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
     * Gets the compliancePolicy property value. Whether compliance policy is managed by Intune
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCompliancePolicy() {
        return this.getBackingStore().get("compliancePolicy");
    }
    /**
     * Gets the deviceConfiguration property value. Whether device configuration is managed by Intune
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceConfiguration() {
        return this.getBackingStore().get("deviceConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("compliancePolicy", (n) -> { this.setCompliancePolicy(n.getBooleanValue()); });
        deserializerMap.put("deviceConfiguration", (n) -> { this.setDeviceConfiguration(n.getBooleanValue()); });
        deserializerMap.put("inventory", (n) -> { this.setInventory(n.getBooleanValue()); });
        deserializerMap.put("modernApps", (n) -> { this.setModernApps(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceAccess", (n) -> { this.setResourceAccess(n.getBooleanValue()); });
        deserializerMap.put("windowsUpdateForBusiness", (n) -> { this.setWindowsUpdateForBusiness(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventory property value. Whether inventory is managed by Intune
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInventory() {
        return this.getBackingStore().get("inventory");
    }
    /**
     * Gets the modernApps property value. Whether modern application is managed by Intune
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getModernApps() {
        return this.getBackingStore().get("modernApps");
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
     * Gets the resourceAccess property value. Whether resource access is managed by Intune
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getResourceAccess() {
        return this.getBackingStore().get("resourceAccess");
    }
    /**
     * Gets the windowsUpdateForBusiness property value. Whether Windows Update for Business is managed by Intune
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsUpdateForBusiness() {
        return this.getBackingStore().get("windowsUpdateForBusiness");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("compliancePolicy", this.getCompliancePolicy());
        writer.writeBooleanValue("deviceConfiguration", this.getDeviceConfiguration());
        writer.writeBooleanValue("inventory", this.getInventory());
        writer.writeBooleanValue("modernApps", this.getModernApps());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("resourceAccess", this.getResourceAccess());
        writer.writeBooleanValue("windowsUpdateForBusiness", this.getWindowsUpdateForBusiness());
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
     * Sets the compliancePolicy property value. Whether compliance policy is managed by Intune
     * @param value Value to set for the compliancePolicy property.
     */
    public void setCompliancePolicy(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("compliancePolicy", value);
    }
    /**
     * Sets the deviceConfiguration property value. Whether device configuration is managed by Intune
     * @param value Value to set for the deviceConfiguration property.
     */
    public void setDeviceConfiguration(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("deviceConfiguration", value);
    }
    /**
     * Sets the inventory property value. Whether inventory is managed by Intune
     * @param value Value to set for the inventory property.
     */
    public void setInventory(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("inventory", value);
    }
    /**
     * Sets the modernApps property value. Whether modern application is managed by Intune
     * @param value Value to set for the modernApps property.
     */
    public void setModernApps(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("modernApps", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.getBackingStore().set("odataType", value);
    }
    /**
     * Sets the resourceAccess property value. Whether resource access is managed by Intune
     * @param value Value to set for the resourceAccess property.
     */
    public void setResourceAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("resourceAccess", value);
    }
    /**
     * Sets the windowsUpdateForBusiness property value. Whether Windows Update for Business is managed by Intune
     * @param value Value to set for the windowsUpdateForBusiness property.
     */
    public void setWindowsUpdateForBusiness(@jakarta.annotation.Nullable final Boolean value) {
        this.getBackingStore().set("windowsUpdateForBusiness", value);
    }
}
