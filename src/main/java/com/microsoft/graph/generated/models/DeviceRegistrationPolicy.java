package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceRegistrationPolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceRegistrationPolicy} and sets the default values.
     */
    public DeviceRegistrationPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceRegistrationPolicy}
     */
    @jakarta.annotation.Nonnull
    public static DeviceRegistrationPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceRegistrationPolicy();
    }
    /**
     * Gets the azureADJoin property value. Specifies the authorization policy for controlling registration of new devices using Microsoft Entra join within your organization. Required. For more information, see What is a device identity?.
     * @return a {@link AzureADJoinPolicy}
     */
    @jakarta.annotation.Nullable
    public AzureADJoinPolicy getAzureADJoin() {
        return this.backingStore.get("azureADJoin");
    }
    /**
     * Gets the azureADRegistration property value. Specifies the authorization policy for controlling registration of new devices using Microsoft Entra registered within your organization. Required. For more information, see What is a device identity?.
     * @return a {@link AzureADRegistrationPolicy}
     */
    @jakarta.annotation.Nullable
    public AzureADRegistrationPolicy getAzureADRegistration() {
        return this.backingStore.get("azureADRegistration");
    }
    /**
     * Gets the description property value. The description of the device registration policy. Always set to Tenant-wide policy that manages intial provisioning controls using quota restrictions, additional authentication and authorization checks. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The name of the device registration policy. Always set to Device Registration Policy. Read-only.
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
        deserializerMap.put("azureADJoin", (n) -> { this.setAzureADJoin(n.getObjectValue(AzureADJoinPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("azureADRegistration", (n) -> { this.setAzureADRegistration(n.getObjectValue(AzureADRegistrationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("localAdminPassword", (n) -> { this.setLocalAdminPassword(n.getObjectValue(LocalAdminPasswordSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("multiFactorAuthConfiguration", (n) -> { this.setMultiFactorAuthConfiguration(n.getEnumValue(MultiFactorAuthConfiguration::forValue)); });
        deserializerMap.put("userDeviceQuota", (n) -> { this.setUserDeviceQuota(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localAdminPassword property value. Specifies the setting for Local Admin Password Solution (LAPS) within your organization.
     * @return a {@link LocalAdminPasswordSettings}
     */
    @jakarta.annotation.Nullable
    public LocalAdminPasswordSettings getLocalAdminPassword() {
        return this.backingStore.get("localAdminPassword");
    }
    /**
     * Gets the multiFactorAuthConfiguration property value. The multiFactorAuthConfiguration property
     * @return a {@link MultiFactorAuthConfiguration}
     */
    @jakarta.annotation.Nullable
    public MultiFactorAuthConfiguration getMultiFactorAuthConfiguration() {
        return this.backingStore.get("multiFactorAuthConfiguration");
    }
    /**
     * Gets the userDeviceQuota property value. Specifies the maximum number of devices that a user can have within your organization before blocking new device registrations. The default value is set to 50. If this property isn&apos;t specified during the policy update operation, it&apos;s automatically reset to 0 to indicate that users aren&apos;t allowed to join any devices.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUserDeviceQuota() {
        return this.backingStore.get("userDeviceQuota");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("azureADJoin", this.getAzureADJoin());
        writer.writeObjectValue("azureADRegistration", this.getAzureADRegistration());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("localAdminPassword", this.getLocalAdminPassword());
        writer.writeEnumValue("multiFactorAuthConfiguration", this.getMultiFactorAuthConfiguration());
        writer.writeIntegerValue("userDeviceQuota", this.getUserDeviceQuota());
    }
    /**
     * Sets the azureADJoin property value. Specifies the authorization policy for controlling registration of new devices using Microsoft Entra join within your organization. Required. For more information, see What is a device identity?.
     * @param value Value to set for the azureADJoin property.
     */
    public void setAzureADJoin(@jakarta.annotation.Nullable final AzureADJoinPolicy value) {
        this.backingStore.set("azureADJoin", value);
    }
    /**
     * Sets the azureADRegistration property value. Specifies the authorization policy for controlling registration of new devices using Microsoft Entra registered within your organization. Required. For more information, see What is a device identity?.
     * @param value Value to set for the azureADRegistration property.
     */
    public void setAzureADRegistration(@jakarta.annotation.Nullable final AzureADRegistrationPolicy value) {
        this.backingStore.set("azureADRegistration", value);
    }
    /**
     * Sets the description property value. The description of the device registration policy. Always set to Tenant-wide policy that manages intial provisioning controls using quota restrictions, additional authentication and authorization checks. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the device registration policy. Always set to Device Registration Policy. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the localAdminPassword property value. Specifies the setting for Local Admin Password Solution (LAPS) within your organization.
     * @param value Value to set for the localAdminPassword property.
     */
    public void setLocalAdminPassword(@jakarta.annotation.Nullable final LocalAdminPasswordSettings value) {
        this.backingStore.set("localAdminPassword", value);
    }
    /**
     * Sets the multiFactorAuthConfiguration property value. The multiFactorAuthConfiguration property
     * @param value Value to set for the multiFactorAuthConfiguration property.
     */
    public void setMultiFactorAuthConfiguration(@jakarta.annotation.Nullable final MultiFactorAuthConfiguration value) {
        this.backingStore.set("multiFactorAuthConfiguration", value);
    }
    /**
     * Sets the userDeviceQuota property value. Specifies the maximum number of devices that a user can have within your organization before blocking new device registrations. The default value is set to 50. If this property isn&apos;t specified during the policy update operation, it&apos;s automatically reset to 0 to indicate that users aren&apos;t allowed to join any devices.
     * @param value Value to set for the userDeviceQuota property.
     */
    public void setUserDeviceQuota(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("userDeviceQuota", value);
    }
}
