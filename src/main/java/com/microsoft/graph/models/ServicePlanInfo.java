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
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePlanInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ServicePlanInfo and sets the default values.
     */
    public ServicePlanInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServicePlanInfo
     */
    @jakarta.annotation.Nonnull
    public static ServicePlanInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePlanInfo();
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
     * Gets the appliesTo property value. The object the service plan can be assigned to. The possible values are:User - service plan can be assigned to individual users.Company - service plan can be assigned to the entire tenant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppliesTo() {
        return this.backingStore.get("appliesTo");
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("provisioningStatus", (n) -> { this.setProvisioningStatus(n.getStringValue()); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getUUIDValue()); });
        deserializerMap.put("servicePlanName", (n) -> { this.setServicePlanName(n.getStringValue()); });
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
     * Gets the provisioningStatus property value. The provisioning status of the service plan. The possible values are:Success - Service is fully provisioned.Disabled - Service has been disabled.ErrorStatus - The service plan has not been provisioned and is in an error state.PendingInput - Service is not yet provisioned; awaiting service confirmation.PendingActivation - Service is provisioned but requires explicit activation by administrator (for example, Intune_O365 service plan)PendingProvisioning - Microsoft has added a new service to the product SKU and it has not been activated in the tenant, yet.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvisioningStatus() {
        return this.backingStore.get("provisioningStatus");
    }
    /**
     * Gets the servicePlanId property value. The unique identifier of the service plan.
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getServicePlanId() {
        return this.backingStore.get("servicePlanId");
    }
    /**
     * Gets the servicePlanName property value. The name of the service plan.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePlanName() {
        return this.backingStore.get("servicePlanName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("provisioningStatus", this.getProvisioningStatus());
        writer.writeUUIDValue("servicePlanId", this.getServicePlanId());
        writer.writeStringValue("servicePlanName", this.getServicePlanName());
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
     * Sets the appliesTo property value. The object the service plan can be assigned to. The possible values are:User - service plan can be assigned to individual users.Company - service plan can be assigned to the entire tenant.
     * @param value Value to set for the appliesTo property.
     */
    public void setAppliesTo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appliesTo", value);
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the provisioningStatus property value. The provisioning status of the service plan. The possible values are:Success - Service is fully provisioned.Disabled - Service has been disabled.ErrorStatus - The service plan has not been provisioned and is in an error state.PendingInput - Service is not yet provisioned; awaiting service confirmation.PendingActivation - Service is provisioned but requires explicit activation by administrator (for example, Intune_O365 service plan)PendingProvisioning - Microsoft has added a new service to the product SKU and it has not been activated in the tenant, yet.
     * @param value Value to set for the provisioningStatus property.
     */
    public void setProvisioningStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisioningStatus", value);
    }
    /**
     * Sets the servicePlanId property value. The unique identifier of the service plan.
     * @param value Value to set for the servicePlanId property.
     */
    public void setServicePlanId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("servicePlanId", value);
    }
    /**
     * Sets the servicePlanName property value. The name of the service plan.
     * @param value Value to set for the servicePlanName property.
     */
    public void setServicePlanName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePlanName", value);
    }
}
