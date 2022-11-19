package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServicePlanInfo implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The object the service plan can be assigned to. The possible values are:User - service plan can be assigned to individual users.Company - service plan can be assigned to the entire tenant. */
    private String _appliesTo;
    /** The OdataType property */
    private String _odataType;
    /** The provisioning status of the service plan. The possible values are:Success - Service is fully provisioned.Disabled - Service has been disabled.ErrorStatus - The service plan has not been provisioned and is in an error state.PendingInput - Service is not yet provisioned; awaiting service confirmation.PendingActivation - Service is provisioned but requires explicit activation by administrator (for example, Intune_O365 service plan)PendingProvisioning - Microsoft has added a new service to the product SKU and it has not been activated in the tenant, yet. */
    private String _provisioningStatus;
    /** The unique identifier of the service plan. */
    private String _servicePlanId;
    /** The name of the service plan. */
    private String _servicePlanName;
    /**
     * Instantiates a new servicePlanInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePlanInfo() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.servicePlanInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a servicePlanInfo
     */
    @javax.annotation.Nonnull
    public static ServicePlanInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePlanInfo();
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
     * Gets the appliesTo property value. The object the service plan can be assigned to. The possible values are:User - service plan can be assigned to individual users.Company - service plan can be assigned to the entire tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppliesTo() {
        return this._appliesTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServicePlanInfo currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("appliesTo", (n) -> { currentObject.setAppliesTo(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("provisioningStatus", (n) -> { currentObject.setProvisioningStatus(n.getStringValue()); });
        deserializerMap.put("servicePlanId", (n) -> { currentObject.setServicePlanId(n.getStringValue()); });
        deserializerMap.put("servicePlanName", (n) -> { currentObject.setServicePlanName(n.getStringValue()); });
        return deserializerMap
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
     * Gets the provisioningStatus property value. The provisioning status of the service plan. The possible values are:Success - Service is fully provisioned.Disabled - Service has been disabled.ErrorStatus - The service plan has not been provisioned and is in an error state.PendingInput - Service is not yet provisioned; awaiting service confirmation.PendingActivation - Service is provisioned but requires explicit activation by administrator (for example, Intune_O365 service plan)PendingProvisioning - Microsoft has added a new service to the product SKU and it has not been activated in the tenant, yet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningStatus() {
        return this._provisioningStatus;
    }
    /**
     * Gets the servicePlanId property value. The unique identifier of the service plan.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanId() {
        return this._servicePlanId;
    }
    /**
     * Gets the servicePlanName property value. The name of the service plan.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanName() {
        return this._servicePlanName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("provisioningStatus", this.getProvisioningStatus());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
        writer.writeStringValue("servicePlanName", this.getServicePlanName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the appliesTo property value. The object the service plan can be assigned to. The possible values are:User - service plan can be assigned to individual users.Company - service plan can be assigned to the entire tenant.
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliesTo(@javax.annotation.Nullable final String value) {
        this._appliesTo = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the provisioningStatus property value. The provisioning status of the service plan. The possible values are:Success - Service is fully provisioned.Disabled - Service has been disabled.ErrorStatus - The service plan has not been provisioned and is in an error state.PendingInput - Service is not yet provisioned; awaiting service confirmation.PendingActivation - Service is provisioned but requires explicit activation by administrator (for example, Intune_O365 service plan)PendingProvisioning - Microsoft has added a new service to the product SKU and it has not been activated in the tenant, yet.
     * @param value Value to set for the provisioningStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningStatus(@javax.annotation.Nullable final String value) {
        this._provisioningStatus = value;
    }
    /**
     * Sets the servicePlanId property value. The unique identifier of the service plan.
     * @param value Value to set for the servicePlanId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlanId(@javax.annotation.Nullable final String value) {
        this._servicePlanId = value;
    }
    /**
     * Sets the servicePlanName property value. The name of the service plan.
     * @param value Value to set for the servicePlanName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlanName(@javax.annotation.Nullable final String value) {
        this._servicePlanName = value;
    }
}
