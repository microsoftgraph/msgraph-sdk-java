package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcOnPremisesConnection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcOnPremisesConnection} and sets the default values.
     */
    public CloudPcOnPremisesConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcOnPremisesConnection}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcOnPremisesConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOnPremisesConnection();
    }
    /**
     * Gets the adDomainName property value. The adDomainName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdDomainName() {
        return this.backingStore.get("adDomainName");
    }
    /**
     * Gets the adDomainPassword property value. The adDomainPassword property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdDomainPassword() {
        return this.backingStore.get("adDomainPassword");
    }
    /**
     * Gets the adDomainUsername property value. The adDomainUsername property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdDomainUsername() {
        return this.backingStore.get("adDomainUsername");
    }
    /**
     * Gets the alternateResourceUrl property value. The alternateResourceUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlternateResourceUrl() {
        return this.backingStore.get("alternateResourceUrl");
    }
    /**
     * Gets the connectionType property value. The connectionType property
     * @return a {@link CloudPcOnPremisesConnectionType}
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionType getConnectionType() {
        return this.backingStore.get("connectionType");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adDomainName", (n) -> { this.setAdDomainName(n.getStringValue()); });
        deserializerMap.put("adDomainPassword", (n) -> { this.setAdDomainPassword(n.getStringValue()); });
        deserializerMap.put("adDomainUsername", (n) -> { this.setAdDomainUsername(n.getStringValue()); });
        deserializerMap.put("alternateResourceUrl", (n) -> { this.setAlternateResourceUrl(n.getStringValue()); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(CloudPcOnPremisesConnectionType::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("healthCheckStatus", (n) -> { this.setHealthCheckStatus(n.getEnumValue(CloudPcOnPremisesConnectionStatus::forValue)); });
        deserializerMap.put("healthCheckStatusDetail", (n) -> { this.setHealthCheckStatusDetail(n.getObjectValue(CloudPcOnPremisesConnectionStatusDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("inUse", (n) -> { this.setInUse(n.getBooleanValue()); });
        deserializerMap.put("organizationalUnit", (n) -> { this.setOrganizationalUnit(n.getStringValue()); });
        deserializerMap.put("resourceGroupId", (n) -> { this.setResourceGroupId(n.getStringValue()); });
        deserializerMap.put("subnetId", (n) -> { this.setSubnetId(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("subscriptionName", (n) -> { this.setSubscriptionName(n.getStringValue()); });
        deserializerMap.put("virtualNetworkId", (n) -> { this.setVirtualNetworkId(n.getStringValue()); });
        deserializerMap.put("virtualNetworkLocation", (n) -> { this.setVirtualNetworkLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthCheckStatus property value. The healthCheckStatus property
     * @return a {@link CloudPcOnPremisesConnectionStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionStatus getHealthCheckStatus() {
        return this.backingStore.get("healthCheckStatus");
    }
    /**
     * Gets the healthCheckStatusDetail property value. The healthCheckStatusDetail property
     * @return a {@link CloudPcOnPremisesConnectionStatusDetail}
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionStatusDetail getHealthCheckStatusDetail() {
        return this.backingStore.get("healthCheckStatusDetail");
    }
    /**
     * Gets the inUse property value. The inUse property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInUse() {
        return this.backingStore.get("inUse");
    }
    /**
     * Gets the organizationalUnit property value. The organizationalUnit property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationalUnit() {
        return this.backingStore.get("organizationalUnit");
    }
    /**
     * Gets the resourceGroupId property value. The resourceGroupId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceGroupId() {
        return this.backingStore.get("resourceGroupId");
    }
    /**
     * Gets the subnetId property value. The subnetId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubnetId() {
        return this.backingStore.get("subnetId");
    }
    /**
     * Gets the subscriptionId property value. The subscriptionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Gets the subscriptionName property value. The subscriptionName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionName() {
        return this.backingStore.get("subscriptionName");
    }
    /**
     * Gets the virtualNetworkId property value. The virtualNetworkId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVirtualNetworkId() {
        return this.backingStore.get("virtualNetworkId");
    }
    /**
     * Gets the virtualNetworkLocation property value. The virtualNetworkLocation property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVirtualNetworkLocation() {
        return this.backingStore.get("virtualNetworkLocation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("adDomainName", this.getAdDomainName());
        writer.writeStringValue("adDomainPassword", this.getAdDomainPassword());
        writer.writeStringValue("adDomainUsername", this.getAdDomainUsername());
        writer.writeStringValue("alternateResourceUrl", this.getAlternateResourceUrl());
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("healthCheckStatus", this.getHealthCheckStatus());
        writer.writeObjectValue("healthCheckStatusDetail", this.getHealthCheckStatusDetail());
        writer.writeBooleanValue("inUse", this.getInUse());
        writer.writeStringValue("organizationalUnit", this.getOrganizationalUnit());
        writer.writeStringValue("resourceGroupId", this.getResourceGroupId());
        writer.writeStringValue("subnetId", this.getSubnetId());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("subscriptionName", this.getSubscriptionName());
        writer.writeStringValue("virtualNetworkId", this.getVirtualNetworkId());
        writer.writeStringValue("virtualNetworkLocation", this.getVirtualNetworkLocation());
    }
    /**
     * Sets the adDomainName property value. The adDomainName property
     * @param value Value to set for the adDomainName property.
     */
    public void setAdDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("adDomainName", value);
    }
    /**
     * Sets the adDomainPassword property value. The adDomainPassword property
     * @param value Value to set for the adDomainPassword property.
     */
    public void setAdDomainPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("adDomainPassword", value);
    }
    /**
     * Sets the adDomainUsername property value. The adDomainUsername property
     * @param value Value to set for the adDomainUsername property.
     */
    public void setAdDomainUsername(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("adDomainUsername", value);
    }
    /**
     * Sets the alternateResourceUrl property value. The alternateResourceUrl property
     * @param value Value to set for the alternateResourceUrl property.
     */
    public void setAlternateResourceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alternateResourceUrl", value);
    }
    /**
     * Sets the connectionType property value. The connectionType property
     * @param value Value to set for the connectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionType value) {
        this.backingStore.set("connectionType", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the healthCheckStatus property value. The healthCheckStatus property
     * @param value Value to set for the healthCheckStatus property.
     */
    public void setHealthCheckStatus(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionStatus value) {
        this.backingStore.set("healthCheckStatus", value);
    }
    /**
     * Sets the healthCheckStatusDetail property value. The healthCheckStatusDetail property
     * @param value Value to set for the healthCheckStatusDetail property.
     */
    public void setHealthCheckStatusDetail(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionStatusDetail value) {
        this.backingStore.set("healthCheckStatusDetail", value);
    }
    /**
     * Sets the inUse property value. The inUse property
     * @param value Value to set for the inUse property.
     */
    public void setInUse(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inUse", value);
    }
    /**
     * Sets the organizationalUnit property value. The organizationalUnit property
     * @param value Value to set for the organizationalUnit property.
     */
    public void setOrganizationalUnit(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationalUnit", value);
    }
    /**
     * Sets the resourceGroupId property value. The resourceGroupId property
     * @param value Value to set for the resourceGroupId property.
     */
    public void setResourceGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceGroupId", value);
    }
    /**
     * Sets the subnetId property value. The subnetId property
     * @param value Value to set for the subnetId property.
     */
    public void setSubnetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subnetId", value);
    }
    /**
     * Sets the subscriptionId property value. The subscriptionId property
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
    /**
     * Sets the subscriptionName property value. The subscriptionName property
     * @param value Value to set for the subscriptionName property.
     */
    public void setSubscriptionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionName", value);
    }
    /**
     * Sets the virtualNetworkId property value. The virtualNetworkId property
     * @param value Value to set for the virtualNetworkId property.
     */
    public void setVirtualNetworkId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("virtualNetworkId", value);
    }
    /**
     * Sets the virtualNetworkLocation property value. The virtualNetworkLocation property
     * @param value Value to set for the virtualNetworkLocation property.
     */
    public void setVirtualNetworkLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("virtualNetworkLocation", value);
    }
}
