package com.microsoft.graph.models.security;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensorSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SensorSettings} and sets the default values.
     */
    public SensorSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensorSettings}
     */
    @jakarta.annotation.Nonnull
    public static SensorSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensorSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the description property value. Description of the sensor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the domainControllerDnsNames property value. DNS names for the domain controller
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomainControllerDnsNames() {
        return this.backingStore.get("domainControllerDnsNames");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("domainControllerDnsNames", (n) -> { this.setDomainControllerDnsNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isDelayedDeploymentEnabled", (n) -> { this.setIsDelayedDeploymentEnabled(n.getBooleanValue()); });
        deserializerMap.put("networkAdapters", (n) -> { this.setNetworkAdapters(n.getCollectionOfObjectValues(NetworkAdapter::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDelayedDeploymentEnabled property value. Indicates whether to delay updates for the sensor.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDelayedDeploymentEnabled() {
        return this.backingStore.get("isDelayedDeploymentEnabled");
    }
    /**
     * Gets the networkAdapters property value. The networkAdapters property
     * @return a {@link java.util.List<NetworkAdapter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NetworkAdapter> getNetworkAdapters() {
        return this.backingStore.get("networkAdapters");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("domainControllerDnsNames", this.getDomainControllerDnsNames());
        writer.writeBooleanValue("isDelayedDeploymentEnabled", this.getIsDelayedDeploymentEnabled());
        writer.writeCollectionOfObjectValues("networkAdapters", this.getNetworkAdapters());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the description property value. Description of the sensor.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the domainControllerDnsNames property value. DNS names for the domain controller
     * @param value Value to set for the domainControllerDnsNames property.
     */
    public void setDomainControllerDnsNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("domainControllerDnsNames", value);
    }
    /**
     * Sets the isDelayedDeploymentEnabled property value. Indicates whether to delay updates for the sensor.
     * @param value Value to set for the isDelayedDeploymentEnabled property.
     */
    public void setIsDelayedDeploymentEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDelayedDeploymentEnabled", value);
    }
    /**
     * Sets the networkAdapters property value. The networkAdapters property
     * @param value Value to set for the networkAdapters property.
     */
    public void setNetworkAdapters(@jakarta.annotation.Nullable final java.util.List<NetworkAdapter> value) {
        this.backingStore.set("networkAdapters", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
