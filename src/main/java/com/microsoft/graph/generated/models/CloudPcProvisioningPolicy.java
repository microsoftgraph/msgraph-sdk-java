package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcProvisioningPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcProvisioningPolicy} and sets the default values.
     */
    public CloudPcProvisioningPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcProvisioningPolicy}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcProvisioningPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcProvisioningPolicy();
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
     * Gets the assignments property value. The assignments property
     * @return a {@link java.util.List<CloudPcProvisioningPolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcProvisioningPolicyAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the cloudPcGroupDisplayName property value. The cloudPcGroupDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudPcGroupDisplayName() {
        return this.backingStore.get("cloudPcGroupDisplayName");
    }
    /**
     * Gets the cloudPcNamingTemplate property value. The cloudPcNamingTemplate property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCloudPcNamingTemplate() {
        return this.backingStore.get("cloudPcNamingTemplate");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
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
     * Gets the domainJoinConfigurations property value. The domainJoinConfigurations property
     * @return a {@link java.util.List<CloudPcDomainJoinConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcDomainJoinConfiguration> getDomainJoinConfigurations() {
        return this.backingStore.get("domainJoinConfigurations");
    }
    /**
     * Gets the enableSingleSignOn property value. The enableSingleSignOn property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSingleSignOn() {
        return this.backingStore.get("enableSingleSignOn");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alternateResourceUrl", (n) -> { this.setAlternateResourceUrl(n.getStringValue()); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(CloudPcProvisioningPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcGroupDisplayName", (n) -> { this.setCloudPcGroupDisplayName(n.getStringValue()); });
        deserializerMap.put("cloudPcNamingTemplate", (n) -> { this.setCloudPcNamingTemplate(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainJoinConfigurations", (n) -> { this.setDomainJoinConfigurations(n.getCollectionOfObjectValues(CloudPcDomainJoinConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("enableSingleSignOn", (n) -> { this.setEnableSingleSignOn(n.getBooleanValue()); });
        deserializerMap.put("gracePeriodInHours", (n) -> { this.setGracePeriodInHours(n.getIntegerValue()); });
        deserializerMap.put("imageDisplayName", (n) -> { this.setImageDisplayName(n.getStringValue()); });
        deserializerMap.put("imageId", (n) -> { this.setImageId(n.getStringValue()); });
        deserializerMap.put("imageType", (n) -> { this.setImageType(n.getEnumValue(CloudPcProvisioningPolicyImageType::forValue)); });
        deserializerMap.put("localAdminEnabled", (n) -> { this.setLocalAdminEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftManagedDesktop", (n) -> { this.setMicrosoftManagedDesktop(n.getObjectValue(MicrosoftManagedDesktop::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioningType", (n) -> { this.setProvisioningType(n.getEnumValue(CloudPcProvisioningType::forValue)); });
        deserializerMap.put("windowsSetting", (n) -> { this.setWindowsSetting(n.getObjectValue(CloudPcWindowsSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodInHours property value. The gracePeriodInHours property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGracePeriodInHours() {
        return this.backingStore.get("gracePeriodInHours");
    }
    /**
     * Gets the imageDisplayName property value. The imageDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageDisplayName() {
        return this.backingStore.get("imageDisplayName");
    }
    /**
     * Gets the imageId property value. The imageId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageId() {
        return this.backingStore.get("imageId");
    }
    /**
     * Gets the imageType property value. The imageType property
     * @return a {@link CloudPcProvisioningPolicyImageType}
     */
    @jakarta.annotation.Nullable
    public CloudPcProvisioningPolicyImageType getImageType() {
        return this.backingStore.get("imageType");
    }
    /**
     * Gets the localAdminEnabled property value. The localAdminEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalAdminEnabled() {
        return this.backingStore.get("localAdminEnabled");
    }
    /**
     * Gets the microsoftManagedDesktop property value. The microsoftManagedDesktop property
     * @return a {@link MicrosoftManagedDesktop}
     */
    @jakarta.annotation.Nullable
    public MicrosoftManagedDesktop getMicrosoftManagedDesktop() {
        return this.backingStore.get("microsoftManagedDesktop");
    }
    /**
     * Gets the provisioningType property value. The provisioningType property
     * @return a {@link CloudPcProvisioningType}
     */
    @jakarta.annotation.Nullable
    public CloudPcProvisioningType getProvisioningType() {
        return this.backingStore.get("provisioningType");
    }
    /**
     * Gets the windowsSetting property value. The windowsSetting property
     * @return a {@link CloudPcWindowsSetting}
     */
    @jakarta.annotation.Nullable
    public CloudPcWindowsSetting getWindowsSetting() {
        return this.backingStore.get("windowsSetting");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("alternateResourceUrl", this.getAlternateResourceUrl());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("cloudPcGroupDisplayName", this.getCloudPcGroupDisplayName());
        writer.writeStringValue("cloudPcNamingTemplate", this.getCloudPcNamingTemplate());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("domainJoinConfigurations", this.getDomainJoinConfigurations());
        writer.writeBooleanValue("enableSingleSignOn", this.getEnableSingleSignOn());
        writer.writeIntegerValue("gracePeriodInHours", this.getGracePeriodInHours());
        writer.writeStringValue("imageDisplayName", this.getImageDisplayName());
        writer.writeStringValue("imageId", this.getImageId());
        writer.writeEnumValue("imageType", this.getImageType());
        writer.writeBooleanValue("localAdminEnabled", this.getLocalAdminEnabled());
        writer.writeObjectValue("microsoftManagedDesktop", this.getMicrosoftManagedDesktop());
        writer.writeEnumValue("provisioningType", this.getProvisioningType());
        writer.writeObjectValue("windowsSetting", this.getWindowsSetting());
    }
    /**
     * Sets the alternateResourceUrl property value. The alternateResourceUrl property
     * @param value Value to set for the alternateResourceUrl property.
     */
    public void setAlternateResourceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alternateResourceUrl", value);
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<CloudPcProvisioningPolicyAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the cloudPcGroupDisplayName property value. The cloudPcGroupDisplayName property
     * @param value Value to set for the cloudPcGroupDisplayName property.
     */
    public void setCloudPcGroupDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudPcGroupDisplayName", value);
    }
    /**
     * Sets the cloudPcNamingTemplate property value. The cloudPcNamingTemplate property
     * @param value Value to set for the cloudPcNamingTemplate property.
     */
    public void setCloudPcNamingTemplate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudPcNamingTemplate", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the domainJoinConfigurations property value. The domainJoinConfigurations property
     * @param value Value to set for the domainJoinConfigurations property.
     */
    public void setDomainJoinConfigurations(@jakarta.annotation.Nullable final java.util.List<CloudPcDomainJoinConfiguration> value) {
        this.backingStore.set("domainJoinConfigurations", value);
    }
    /**
     * Sets the enableSingleSignOn property value. The enableSingleSignOn property
     * @param value Value to set for the enableSingleSignOn property.
     */
    public void setEnableSingleSignOn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSingleSignOn", value);
    }
    /**
     * Sets the gracePeriodInHours property value. The gracePeriodInHours property
     * @param value Value to set for the gracePeriodInHours property.
     */
    public void setGracePeriodInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("gracePeriodInHours", value);
    }
    /**
     * Sets the imageDisplayName property value. The imageDisplayName property
     * @param value Value to set for the imageDisplayName property.
     */
    public void setImageDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageDisplayName", value);
    }
    /**
     * Sets the imageId property value. The imageId property
     * @param value Value to set for the imageId property.
     */
    public void setImageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageId", value);
    }
    /**
     * Sets the imageType property value. The imageType property
     * @param value Value to set for the imageType property.
     */
    public void setImageType(@jakarta.annotation.Nullable final CloudPcProvisioningPolicyImageType value) {
        this.backingStore.set("imageType", value);
    }
    /**
     * Sets the localAdminEnabled property value. The localAdminEnabled property
     * @param value Value to set for the localAdminEnabled property.
     */
    public void setLocalAdminEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localAdminEnabled", value);
    }
    /**
     * Sets the microsoftManagedDesktop property value. The microsoftManagedDesktop property
     * @param value Value to set for the microsoftManagedDesktop property.
     */
    public void setMicrosoftManagedDesktop(@jakarta.annotation.Nullable final MicrosoftManagedDesktop value) {
        this.backingStore.set("microsoftManagedDesktop", value);
    }
    /**
     * Sets the provisioningType property value. The provisioningType property
     * @param value Value to set for the provisioningType property.
     */
    public void setProvisioningType(@jakarta.annotation.Nullable final CloudPcProvisioningType value) {
        this.backingStore.set("provisioningType", value);
    }
    /**
     * Sets the windowsSetting property value. The windowsSetting property
     * @param value Value to set for the windowsSetting property.
     */
    public void setWindowsSetting(@jakarta.annotation.Nullable final CloudPcWindowsSetting value) {
        this.backingStore.set("windowsSetting", value);
    }
}
