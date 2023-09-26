package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VmMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cloudProvider property
     */
    private VmCloudProvider cloudProvider;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Unique identifier of the Azure resource.
     */
    private String resourceId;
    /**
     * Unique identifier of the Azure subscription the customer tenant belongs to.
     */
    private String subscriptionId;
    /**
     * Unique identifier of the virtual machine instance.
     */
    private String vmId;
    /**
     * Instantiates a new VmMetadata and sets the default values.
     */
    public VmMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VmMetadata
     */
    @jakarta.annotation.Nonnull
    public static VmMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VmMetadata();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cloudProvider property value. The cloudProvider property
     * @return a VmCloudProvider
     */
    @jakarta.annotation.Nullable
    public VmCloudProvider getCloudProvider() {
        return this.cloudProvider;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("cloudProvider", (n) -> { this.setCloudProvider(n.getEnumValue(VmCloudProvider.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("vmId", (n) -> { this.setVmId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the resourceId property value. Unique identifier of the Azure resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Gets the subscriptionId property value. Unique identifier of the Azure subscription the customer tenant belongs to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the vmId property value. Unique identifier of the virtual machine instance.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVmId() {
        return this.vmId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("cloudProvider", this.getCloudProvider());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("vmId", this.getVmId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cloudProvider property value. The cloudProvider property
     * @param value Value to set for the cloudProvider property.
     */
    public void setCloudProvider(@jakarta.annotation.Nullable final VmCloudProvider value) {
        this.cloudProvider = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the resourceId property value. Unique identifier of the Azure resource.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.resourceId = value;
    }
    /**
     * Sets the subscriptionId property value. Unique identifier of the Azure subscription the customer tenant belongs to.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the vmId property value. Unique identifier of the virtual machine instance.
     * @param value Value to set for the vmId property.
     */
    public void setVmId(@jakarta.annotation.Nullable final String value) {
        this.vmId = value;
    }
}
