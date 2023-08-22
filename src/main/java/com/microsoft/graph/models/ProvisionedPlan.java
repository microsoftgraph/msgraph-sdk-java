package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvisionedPlan implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * For example, 'Enabled'.
     */
    private String capabilityStatus;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * For example, 'Success'.
     */
    private String provisioningStatus;
    /**
     * The name of the service; for example, 'AccessControlS2S'
     */
    private String service;
    /**
     * Instantiates a new provisionedPlan and sets the default values.
     */
    public ProvisionedPlan() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a provisionedPlan
     */
    @jakarta.annotation.Nonnull
    public static ProvisionedPlan createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisionedPlan();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the capabilityStatus property value. For example, 'Enabled'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCapabilityStatus() {
        return this.capabilityStatus;
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the provisioningStatus property value. For example, 'Success'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }
    /**
     * Gets the service property value. The name of the service; for example, 'AccessControlS2S'
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.service;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the capabilityStatus property value. For example, 'Enabled'.
     * @param value Value to set for the capabilityStatus property.
     */
    public void setCapabilityStatus(@jakarta.annotation.Nullable final String value) {
        this.capabilityStatus = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the provisioningStatus property value. For example, 'Success'.
     * @param value Value to set for the provisioningStatus property.
     */
    public void setProvisioningStatus(@jakarta.annotation.Nullable final String value) {
        this.provisioningStatus = value;
    }
    /**
     * Sets the service property value. The name of the service; for example, 'AccessControlS2S'
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.service = value;
    }
}
