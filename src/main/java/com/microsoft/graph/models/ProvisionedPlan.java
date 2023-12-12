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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvisionedPlan implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ProvisionedPlan and sets the default values.
     */
    public ProvisionedPlan() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProvisionedPlan
     */
    @jakarta.annotation.Nonnull
    public static ProvisionedPlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisionedPlan();
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
     * Gets the capabilityStatus property value. For example, 'Enabled'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCapabilityStatus() {
        return this.backingStore.get("capabilityStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("capabilityStatus", (n) -> { this.setCapabilityStatus(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("provisioningStatus", (n) -> { this.setProvisioningStatus(n.getStringValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the provisioningStatus property value. For example, 'Success'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvisioningStatus() {
        return this.backingStore.get("provisioningStatus");
    }
    /**
     * Gets the service property value. The name of the service; for example, 'AccessControlS2S'
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.backingStore.get("service");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("capabilityStatus", this.getCapabilityStatus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("provisioningStatus", this.getProvisioningStatus());
        writer.writeStringValue("service", this.getService());
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
     * Sets the capabilityStatus property value. For example, 'Enabled'.
     * @param value Value to set for the capabilityStatus property.
     */
    public void setCapabilityStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("capabilityStatus", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the provisioningStatus property value. For example, 'Success'.
     * @param value Value to set for the provisioningStatus property.
     */
    public void setProvisioningStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisioningStatus", value);
    }
    /**
     * Sets the service property value. The name of the service; for example, 'AccessControlS2S'
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("service", value);
    }
}
