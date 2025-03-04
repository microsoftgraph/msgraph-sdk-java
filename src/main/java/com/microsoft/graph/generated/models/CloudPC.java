package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPC extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPC} and sets the default values.
     */
    public CloudPC() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPC}
     */
    @jakarta.annotation.Nonnull
    public static CloudPC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPC();
    }
    /**
     * Gets the aadDeviceId property value. The Microsoft Entra device ID for the Cloud PC, also known as the Azure Active Directory (Azure AD) device ID, that consists of 32 characters in a GUID format. Generated on a VM joined to Microsoft Entra ID. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAadDeviceId() {
        return this.backingStore.get("aadDeviceId");
    }
    /**
     * Gets the displayName property value. The display name for the Cloud PC. Maximum length is 64 characters. Read-only. You can use the cloudPC: rename API to modify the Cloud PC name.
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
        deserializerMap.put("aadDeviceId", (n) -> { this.setAadDeviceId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("gracePeriodEndDateTime", (n) -> { this.setGracePeriodEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("imageDisplayName", (n) -> { this.setImageDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("onPremisesConnectionName", (n) -> { this.setOnPremisesConnectionName(n.getStringValue()); });
        deserializerMap.put("provisioningPolicyId", (n) -> { this.setProvisioningPolicyId(n.getStringValue()); });
        deserializerMap.put("provisioningPolicyName", (n) -> { this.setProvisioningPolicyName(n.getStringValue()); });
        deserializerMap.put("provisioningType", (n) -> { this.setProvisioningType(n.getEnumValue(CloudPcProvisioningType::forValue)); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getStringValue()); });
        deserializerMap.put("servicePlanName", (n) -> { this.setServicePlanName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning or deprovisioning happen. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGracePeriodEndDateTime() {
        return this.backingStore.get("gracePeriodEndDateTime");
    }
    /**
     * Gets the imageDisplayName property value. The name of the operating system image used for the Cloud PC. Maximum length is 50 characters. Only letters (A-Z, a-z), numbers (0-9), and special characters (-,,.) are allowed for this property. The property value can&apos;t begin or end with an underscore. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageDisplayName() {
        return this.backingStore.get("imageDisplayName");
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the managedDeviceId property value. The Intune enrolled device ID for the Cloud PC that consists of 32 characters in a GUID format. The managedDeviceId property of Windows 365 Business Cloud PCs is always null as Windows 365 Business Cloud PCs aren&apos;t Intune-enrolled automatically by Windows 365. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the managedDeviceName property value. The Intune enrolled device name for the Cloud PC. The managedDeviceName property of Windows 365 Business Cloud PCs is always null as Windows 365 Business Cloud PCs aren&apos;t Intune-enrolled automatically by Windows 365. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.backingStore.get("managedDeviceName");
    }
    /**
     * Gets the onPremisesConnectionName property value. The on-premises connection that applied during the provisioning of Cloud PCs. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesConnectionName() {
        return this.backingStore.get("onPremisesConnectionName");
    }
    /**
     * Gets the provisioningPolicyId property value. The provisioning policy ID for the Cloud PC that consists of 32 characters in a GUID format. A policy defines the type of Cloud PC the user wants to create. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvisioningPolicyId() {
        return this.backingStore.get("provisioningPolicyId");
    }
    /**
     * Gets the provisioningPolicyName property value. The provisioning policy that applied during the provisioning of Cloud PCs. Maximum length is 120 characters. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvisioningPolicyName() {
        return this.backingStore.get("provisioningPolicyName");
    }
    /**
     * Gets the provisioningType property value. The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue. The default value is dedicated.
     * @return a {@link CloudPcProvisioningType}
     */
    @jakarta.annotation.Nullable
    public CloudPcProvisioningType getProvisioningType() {
        return this.backingStore.get("provisioningType");
    }
    /**
     * Gets the servicePlanId property value. The service plan ID for the Cloud PC that consists of 32 characters in a GUID format. For more information about service plans, see Product names and service plan identifiers for licensing. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePlanId() {
        return this.backingStore.get("servicePlanId");
    }
    /**
     * Gets the servicePlanName property value. The service plan name for the customer-facing Cloud PC entity. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePlanName() {
        return this.backingStore.get("servicePlanName");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC. Maximum length is 113 characters. For more information on username policies, see Password policies and account restrictions in Microsoft Entra ID. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("aadDeviceId", this.getAadDeviceId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("gracePeriodEndDateTime", this.getGracePeriodEndDateTime());
        writer.writeStringValue("imageDisplayName", this.getImageDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeStringValue("onPremisesConnectionName", this.getOnPremisesConnectionName());
        writer.writeStringValue("provisioningPolicyId", this.getProvisioningPolicyId());
        writer.writeStringValue("provisioningPolicyName", this.getProvisioningPolicyName());
        writer.writeEnumValue("provisioningType", this.getProvisioningType());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
        writer.writeStringValue("servicePlanName", this.getServicePlanName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the aadDeviceId property value. The Microsoft Entra device ID for the Cloud PC, also known as the Azure Active Directory (Azure AD) device ID, that consists of 32 characters in a GUID format. Generated on a VM joined to Microsoft Entra ID. Read-only.
     * @param value Value to set for the aadDeviceId property.
     */
    public void setAadDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("aadDeviceId", value);
    }
    /**
     * Sets the displayName property value. The display name for the Cloud PC. Maximum length is 64 characters. Read-only. You can use the cloudPC: rename API to modify the Cloud PC name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning or deprovisioning happen. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the gracePeriodEndDateTime property.
     */
    public void setGracePeriodEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("gracePeriodEndDateTime", value);
    }
    /**
     * Sets the imageDisplayName property value. The name of the operating system image used for the Cloud PC. Maximum length is 50 characters. Only letters (A-Z, a-z), numbers (0-9), and special characters (-,,.) are allowed for this property. The property value can&apos;t begin or end with an underscore. Read-only.
     * @param value Value to set for the imageDisplayName property.
     */
    public void setImageDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageDisplayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the managedDeviceId property value. The Intune enrolled device ID for the Cloud PC that consists of 32 characters in a GUID format. The managedDeviceId property of Windows 365 Business Cloud PCs is always null as Windows 365 Business Cloud PCs aren&apos;t Intune-enrolled automatically by Windows 365. Read-only.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the managedDeviceName property value. The Intune enrolled device name for the Cloud PC. The managedDeviceName property of Windows 365 Business Cloud PCs is always null as Windows 365 Business Cloud PCs aren&apos;t Intune-enrolled automatically by Windows 365. Read-only.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceName", value);
    }
    /**
     * Sets the onPremisesConnectionName property value. The on-premises connection that applied during the provisioning of Cloud PCs. Read-only.
     * @param value Value to set for the onPremisesConnectionName property.
     */
    public void setOnPremisesConnectionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesConnectionName", value);
    }
    /**
     * Sets the provisioningPolicyId property value. The provisioning policy ID for the Cloud PC that consists of 32 characters in a GUID format. A policy defines the type of Cloud PC the user wants to create. Read-only.
     * @param value Value to set for the provisioningPolicyId property.
     */
    public void setProvisioningPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisioningPolicyId", value);
    }
    /**
     * Sets the provisioningPolicyName property value. The provisioning policy that applied during the provisioning of Cloud PCs. Maximum length is 120 characters. Read-only.
     * @param value Value to set for the provisioningPolicyName property.
     */
    public void setProvisioningPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisioningPolicyName", value);
    }
    /**
     * Sets the provisioningType property value. The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue. The default value is dedicated.
     * @param value Value to set for the provisioningType property.
     */
    public void setProvisioningType(@jakarta.annotation.Nullable final CloudPcProvisioningType value) {
        this.backingStore.set("provisioningType", value);
    }
    /**
     * Sets the servicePlanId property value. The service plan ID for the Cloud PC that consists of 32 characters in a GUID format. For more information about service plans, see Product names and service plan identifiers for licensing. Read-only.
     * @param value Value to set for the servicePlanId property.
     */
    public void setServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePlanId", value);
    }
    /**
     * Sets the servicePlanName property value. The service plan name for the customer-facing Cloud PC entity. Read-only.
     * @param value Value to set for the servicePlanName property.
     */
    public void setServicePlanName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePlanName", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC. Maximum length is 113 characters. For more information on username policies, see Password policies and account restrictions in Microsoft Entra ID. Read-only.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
