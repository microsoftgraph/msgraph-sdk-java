package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** configuration Manager client enabled features */
public class ConfigurationManagerClientEnabledFeatures implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Whether compliance policy is managed by Intune */
    private Boolean _compliancePolicy;
    /** Whether device configuration is managed by Intune */
    private Boolean _deviceConfiguration;
    /** Whether inventory is managed by Intune */
    private Boolean _inventory;
    /** Whether modern application is managed by Intune */
    private Boolean _modernApps;
    /** The OdataType property */
    private String _odataType;
    /** Whether resource access is managed by Intune */
    private Boolean _resourceAccess;
    /** Whether Windows Update for Business is managed by Intune */
    private Boolean _windowsUpdateForBusiness;
    /**
     * Instantiates a new configurationManagerClientEnabledFeatures and sets the default values.
     * @return a void
     */
    public ConfigurationManagerClientEnabledFeatures() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.configurationManagerClientEnabledFeatures");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a configurationManagerClientEnabledFeatures
     */
    @javax.annotation.Nonnull
    public static ConfigurationManagerClientEnabledFeatures createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerClientEnabledFeatures();
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
     * Gets the compliancePolicy property value. Whether compliance policy is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCompliancePolicy() {
        return this._compliancePolicy;
    }
    /**
     * Gets the deviceConfiguration property value. Whether device configuration is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceConfiguration() {
        return this._deviceConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConfigurationManagerClientEnabledFeatures currentObject = this;
        return new HashMap<>(7) {{
            this.put("compliancePolicy", (n) -> { currentObject.setCompliancePolicy(n.getBooleanValue()); });
            this.put("deviceConfiguration", (n) -> { currentObject.setDeviceConfiguration(n.getBooleanValue()); });
            this.put("inventory", (n) -> { currentObject.setInventory(n.getBooleanValue()); });
            this.put("modernApps", (n) -> { currentObject.setModernApps(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("resourceAccess", (n) -> { currentObject.setResourceAccess(n.getBooleanValue()); });
            this.put("windowsUpdateForBusiness", (n) -> { currentObject.setWindowsUpdateForBusiness(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the inventory property value. Whether inventory is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInventory() {
        return this._inventory;
    }
    /**
     * Gets the modernApps property value. Whether modern application is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getModernApps() {
        return this._modernApps;
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
     * Gets the resourceAccess property value. Whether resource access is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResourceAccess() {
        return this._resourceAccess;
    }
    /**
     * Gets the windowsUpdateForBusiness property value. Whether Windows Update for Business is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsUpdateForBusiness() {
        return this._windowsUpdateForBusiness;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("compliancePolicy", this.getCompliancePolicy());
        writer.writeBooleanValue("deviceConfiguration", this.getDeviceConfiguration());
        writer.writeBooleanValue("inventory", this.getInventory());
        writer.writeBooleanValue("modernApps", this.getModernApps());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("resourceAccess", this.getResourceAccess());
        writer.writeBooleanValue("windowsUpdateForBusiness", this.getWindowsUpdateForBusiness());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the compliancePolicy property value. Whether compliance policy is managed by Intune
     * @param value Value to set for the compliancePolicy property.
     * @return a void
     */
    public void setCompliancePolicy(@javax.annotation.Nullable final Boolean value) {
        this._compliancePolicy = value;
    }
    /**
     * Sets the deviceConfiguration property value. Whether device configuration is managed by Intune
     * @param value Value to set for the deviceConfiguration property.
     * @return a void
     */
    public void setDeviceConfiguration(@javax.annotation.Nullable final Boolean value) {
        this._deviceConfiguration = value;
    }
    /**
     * Sets the inventory property value. Whether inventory is managed by Intune
     * @param value Value to set for the inventory property.
     * @return a void
     */
    public void setInventory(@javax.annotation.Nullable final Boolean value) {
        this._inventory = value;
    }
    /**
     * Sets the modernApps property value. Whether modern application is managed by Intune
     * @param value Value to set for the modernApps property.
     * @return a void
     */
    public void setModernApps(@javax.annotation.Nullable final Boolean value) {
        this._modernApps = value;
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
     * Sets the resourceAccess property value. Whether resource access is managed by Intune
     * @param value Value to set for the resourceAccess property.
     * @return a void
     */
    public void setResourceAccess(@javax.annotation.Nullable final Boolean value) {
        this._resourceAccess = value;
    }
    /**
     * Sets the windowsUpdateForBusiness property value. Whether Windows Update for Business is managed by Intune
     * @param value Value to set for the windowsUpdateForBusiness property.
     * @return a void
     */
    public void setWindowsUpdateForBusiness(@javax.annotation.Nullable final Boolean value) {
        this._windowsUpdateForBusiness = value;
    }
}
